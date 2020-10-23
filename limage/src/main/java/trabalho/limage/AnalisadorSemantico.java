package trabalho.limage;

public class AnalisadorSemantico extends limageBaseVisitor<Void> {

    TabelaDeSimbolos tabela;

    @Override
    public Void visitPrograma(limageParser.ProgramaContext ctx) {
        // Instancia uma tabela de Simbolos para guardar as imagens e variáveis utilizadas
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitDecl_imagem(limageParser.Decl_imagemContext ctx) {
        // Adiciona erro se uma imagem já existe na tabela
        if (tabela.verificar(ctx.IDENT().getText()) != null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Imagem " + ctx.IDENT().getText() + " ja declarada anteriormente");
            return null;
        }

        // Adiciona a imagem na tabela
        tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.Tipolimage.IMAGEM);
        return null;
    }

    @Override
    public Void visitDecl_inteiro(limageParser.Decl_inteiroContext ctx) {
        // Adiciona erro se uma variável do tipo inteiro já existe na tabela
        if (tabela.verificar(ctx.IDENT().getText()) != null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Variavel " + ctx.IDENT().getText() + " ja declarada anteriormente");
            return null;
        }

        // Adiciona a variável na tabela
        tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.Tipolimage.INTEIRO);
        return null;
    }

    @Override
    public Void visitCmdLeia(limageParser.CmdLeiaContext ctx) {

        // Adiciona erro se uma imagem ou variável com o identificador desejado não está na tabela
        if (tabela.verificar(ctx.IDENT().getText()) == null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), ctx.IDENT().getText() + " nao declarada anteriormente");
        }

        return null;
    }

    @Override
    public Void visitCmdOperacoes(limageParser.CmdOperacoesContext ctx) {

        // Adiciona erro se o primeiro parâmetro não existe na tabela
        if (tabela.verificar(ctx.IDENT(0).getText()) == null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(0).getSymbol(), "Imagem " + ctx.IDENT(0).getText() + " nao declarada anteriormente");
        } // Adiciona erro se o primeiro parâmetro não é uma imagem
        else if (tabela.verificarTipo(ctx.IDENT(0).getText()) != TabelaDeSimbolos.Tipolimage.IMAGEM) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(0).getSymbol(), ctx.IDENT(0).getText() + " possui tipo incompativel com imagem");
        }

        // Verifica se há um segundo parâmetro passado pelo programador em linguagem limage
        if (ctx.IDENT(1) != null) {
            // Adiciona erro se o segundo parâmetro não existe na tabela
            if (tabela.verificar(ctx.IDENT(1).getText()) == null) {
                AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(1).getSymbol(), "Variavel " + ctx.IDENT(1).getText() + " nao declarada anteriormente");
            } // Adiciona erro se o segundo parâmetro não é do tipo inteiro
            else if (tabela.verificarTipo(ctx.IDENT(1).getText()) != TabelaDeSimbolos.Tipolimage.INTEIRO) {
                AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(1).getSymbol(), ctx.IDENT(1).getText() + " possui tipo incompativel com inteiro");
            }
        }

        // Verifica se há um terceiro parâmetro passado pelo programador em linguagem limage
        if (ctx.IDENT(2) != null) {
            // Adiciona erro se o segundo parâmetro não existe na tabela
            if (tabela.verificar(ctx.IDENT(2).getText()) == null) {
                AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(2).getSymbol(), "Variavel " + ctx.IDENT(2).getText() + " nao declarada anteriormente");
            } // Adiciona erro se o segundo parâmetro não é do tipo inteiro
            else if (tabela.verificarTipo(ctx.IDENT(2).getText()) != TabelaDeSimbolos.Tipolimage.INTEIRO) {
                AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(2).getSymbol(), ctx.IDENT(2).getText() + " possui tipo incompativel com inteiro");
            }
        }

        return null;
    }

    @Override
    public Void visitCmd_aritmetico(limageParser.Cmd_aritmeticoContext ctx) {
        // Adiciona erro se o operando à esquerda não existe na tabela
        if (tabela.verificar(ctx.IDENT(0).getText()) == null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(0).getSymbol(), "Imagem " + ctx.IDENT(0).getText() + " nao declarada anteriormente");
        } // Adiciona erro se o operando à esquerda não é uma imagem 
        else if (tabela.verificarTipo(ctx.IDENT(0).getText()) != TabelaDeSimbolos.Tipolimage.IMAGEM) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(0).getSymbol(), ctx.IDENT(0).getText() + " possui tipo incompativel com imagem");
        }

        // Adiciona erro se o operando à direita não existe na tabela 
        if (ctx.IDENT(1) != null) {
            if (tabela.verificar(ctx.IDENT(1).getText()) == null) {
                AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT(1).getSymbol(), "Imagem " + ctx.IDENT(1).getText() + " nao declarada anteriormente");
            }
        }
        return null;
    }

    @Override
    public Void visitCmdMostrar(limageParser.CmdMostrarContext ctx) {

        // Adiciona erro se a imagem desejada não existe na tabela
        if (tabela.verificar(ctx.IDENT().getText()) == null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Imagem " + ctx.IDENT().getText() + " nao declarada anteriormente");
        } // Adiciona erro se o parâmetro não é uma imagem
        else if (tabela.verificarTipo(ctx.IDENT().getText()) != TabelaDeSimbolos.Tipolimage.IMAGEM) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), ctx.IDENT().getText() + " possui tipo incompativel com imagem");
        }

        return null;
    }

    @Override
    public Void visitCmdSalvar(limageParser.CmdSalvarContext ctx) {

        // Adiciona erro se a imagem desejada não existe na tabela
        if (tabela.verificar(ctx.IDENT().getText()) == null) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "Imagem " + ctx.IDENT().getText() + " nao declarada anteriormente");
        } // Adiciona erro se o parâmetro não é uma imagem
        else if (tabela.verificarTipo(ctx.IDENT().getText()) != TabelaDeSimbolos.Tipolimage.IMAGEM) {
            AnalisadorSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), ctx.IDENT().getText() + " possui tipo incompativel com imagem");
        }
        return null;
    }
}
