package trabalho.limage;

public class limageGeradorPy extends limageBaseVisitor<Void> {

    // saida contém o código gerado em linguagem Python
    StringBuilder saida;
    // Tabela de símbolos para guardar as variaveis e imagens
    TabelaDeSimbolos tabela = new TabelaDeSimbolos();

    // Construtor para a classe
    public limageGeradorPy() {
        // Instanciando o construtor de String
        saida = new StringBuilder();
    }

    // Gera o código em Linguagem Python para importar as bibliotecas necessárias
    // Essas bibliotecas devem estar instaladas previamente no notebook que utiliza a Linguagem limage
    @Override
    public Void visitPrograma(limageParser.ProgramaContext ctx) {
        saida.append("import numpy as np\n");
        saida.append("import cv2 as cv\n");
        saida.append("import matplotlib.pyplot as plt\n");
        saida.append("import os.path as os\n");
        saida.append("import skimage.util as sk\n");
        saida.append("\n");
        return super.visitPrograma(ctx);
    }

    // Adiciona a imagem declarada na tabela de símbolos
    @Override
    public Void visitDecl_imagem(limageParser.Decl_imagemContext ctx) {
        tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.Tipolimage.IMAGEM);
        return null;
    }

    // Adiciona a variável do tipo inteiro declarada na tabela de símbolos
    @Override
    public Void visitDecl_inteiro(limageParser.Decl_inteiroContext ctx) {
        tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.Tipolimage.INTEIRO);
        return null;
    }

    // Gera um código Python para realizar as entradas para o programa 
    @Override
    public Void visitCmdLeia(limageParser.CmdLeiaContext ctx) {
        // Se a declaração for de uma imagem, recebe o caminho dela e carrega em um numpy array com o mesmo nome que no programa em Linguagem limage
        if (tabela.verificarTipo(ctx.IDENT().getText()) == TabelaDeSimbolos.Tipolimage.IMAGEM) {
            // É imagem
            saida.append(ctx.IDENT().getText() + "_path = str(input(\"Digite o caminho para sua imagem: \"))\n");
            saida.append("while not (os.isfile(" + ctx.IDENT().getText() + "_path)):\n");
            saida.append("    " + ctx.IDENT().getText() + "_path = str(input(\"Digite o caminho para sua imagem: \"))\n");
            saida.append(ctx.IDENT().getText() + " = cv.imread(" + ctx.IDENT().getText() + "_path)\n");
            saida.append(ctx.IDENT().getText() + " = cv.cvtColor(" + ctx.IDENT().getText() + ", cv.COLOR_BGR2GRAY)\n");
        } else {
            // É inteiro
            saida.append(ctx.IDENT().getText() + " = int(input(\"Digite o valor inteiro do seu parametro: \"))\n");
        }
        return null;
    }

    // Gera um código Python para realizar as operações sobre uma imagem
    @Override
    public Void visitCmdOperacoes(limageParser.CmdOperacoesContext ctx) {
        // recupera-se qual operação é a desejada 
        String operacao;
        if (ctx.filtro != null) {
            operacao = ctx.filtro.getText();
        } else {
            operacao = ctx.operacao.getText();
        }

        // Gera o código para cada operação
        switch (operacao) {
            case "filtroMedia":
                saida.append(ctx.IDENT(0).getText() + " = cv.blur");
                saida.append("(" + ctx.IDENT(0).getText());
                // Verifica se há um segundo parâmetro e estabelece um valor padrão
                if (ctx.param2 != null) {
                    saida.append(", (" + ctx.param2.getText() + ", " + ctx.param2.getText() + ")");
                } else {
                    saida.append(", (5,5)");
                }

                saida.append(")\n");
                break;
            case "filtroMediana":
                String param2;
                // Verifica se há um segundo parâmetro e estabelece um valor padrão caso o mesmo não tenha sido determinado pelo programador em limage
                if (ctx.param2 != null) {
                    param2 = ctx.param2.getText();
                    // Garante que o parâmetro não será par

                    if (ctx.IDENT(1) != null) {
                        saida.append("if " + param2 + " % 2 == 0:\n");
                        saida.append("    " + param2 + " += 1\n");
                    } else {
                        saida.append("param2 = " + param2 + "\n");
                        saida.append("if param2 % 2 == 0:\n");
                        saida.append("    param2 = " + param2 + " + 1\n");
                        param2 = "param2";
                    }

                } else {
                    param2 = "5";
                }
                saida.append(ctx.IDENT(0).getText() + " = cv.medianBlur");
                saida.append("(" + ctx.IDENT(0).getText());
                saida.append(", " + param2);
                saida.append(")\n");
                break;

            case "adicionarRuido":
                saida.append(ctx.IDENT(0).getText() + " = sk.random_noise(" + ctx.IDENT(0).getText() + ", mode='s&p', seed=None, clip=True)\n");
                saida.append(ctx.IDENT(0).getText() + " = sk.img_as_ubyte(" + ctx.IDENT(0).getText() + ")\n");
                break;
            case "limiarOtsu":
                saida.append("limiarValor, " + ctx.IDENT(0).getText() + " = cv.threshold(" + ctx.IDENT(0).getText() + ", 0, 255, cv.THRESH_BINARY+cv.THRESH_OTSU)\n");
                break;
            case "realceBordas":
                saida.append(ctx.IDENT(0).getText() + " = cv.Laplacian(" + ctx.IDENT(0).getText() + ",cv.CV_8U)\n");
            default:

                break;
        }

        return null;
    }

    // Gera um código Python para realizar as operações aritméticas sobre uma imagem
    @Override
    public Void visitCmd_aritmetico(limageParser.Cmd_aritmeticoContext ctx) {
        // A atribuição é feita para o operando à esquerda que deve ser uma imagem
        saida.append(ctx.IDENT(0).getText() + " = " + ctx.IDENT(0).getText() + " "
                + ctx.OP_ARIT().getText() + " ");
        // Verifica o tipo do segundo operando, pois este pode ser também um inteiro, faz-se então uma conversão de seu valor para real
        if (ctx.IDENT(1) != null) {
            if (tabela.verificarTipo(ctx.valor.getText()) == TabelaDeSimbolos.Tipolimage.INTEIRO) {
                saida.append("float(");
                saida.append(ctx.valor.getText() + ")\n");
            } else {
                saida.append(ctx.valor.getText() + "\n");
            }
        } else if (ctx.NUM_INT() != null) {
            saida.append("float(");
            saida.append(ctx.valor.getText() + ")\n");
        } else {
            saida.append(ctx.valor.getText() + "\n");
        }

        return null;
    }

    // Gera um código Python para realizar um plot de uma imagem
    @Override
    public Void visitCmdMostrar(limageParser.CmdMostrarContext ctx) {
        saida.append("plt.imshow(" + ctx.IDENT().getText() + ", 'gray')\n");
        saida.append("plt.title(\" Imagem: " + ctx.IDENT().getText() + "\")\n");
        saida.append("plt.axis('off')\n");
        saida.append("plt.show()\n");
        return null;
    }

    // Gera um código Python para salvar uma imagem
    @Override
    public Void visitCmdSalvar(limageParser.CmdSalvarContext ctx) {
        saida.append("cv.imwrite(os.splitext(" + ctx.IDENT().getText() + "_path)[0]+\"_edited\" + os.splitext(" + ctx.IDENT().getText() + "_path)[1], " + ctx.IDENT().getText() + ")\n");
        return null;
    }
}
