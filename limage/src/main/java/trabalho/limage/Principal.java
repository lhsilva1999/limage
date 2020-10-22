package trabalho.limage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/*
 Linguagem limage
 Desenvolvido por:
    Italo Antonio Duarte de Oliveira
    Leonardo Henrique Fernandes da Silva
    Ricardo Szram Filho
 */
public class Principal {

    public static void main(String args[]) throws IOException {

        // Criando uma Cadeia de char com o programa de entrada
        CharStream cs = CharStreams.fromFileName(args[0]);
        // Instanciando a classe do analisador Lexico
        limageLexer lex = new limageLexer(cs);

        limageParser.ProgramaContext arvore = null;
        
        boolean erroSintatico = false;
        
        try {
            // Instanciando a classe que recebe os tokens gerados pelo analisador lexico
            CommonTokenStream tokens = new CommonTokenStream(lex);
            // Instanciando o parser de analise sintatica
            limageParser parser = new limageParser(tokens);

            // Iniciando a analise sintatica pela Regra inicial
            arvore = parser.programa();
        } catch (RuntimeException e) {
            // Imprime as mensagens de exceções
            System.out.println("Oi Léo");
            erroSintatico = true;
            e.printStackTrace();
        }

        // Iniciando a analise semantica por meio da classe AnalisadorSemantico
        AnalisadorSemantico as = new AnalisadorSemantico();
        as.visitPrograma(arvore);

        // Escrevendo as mensagens de erro no terminal
        AnalisadorSemanticoUtils.errosSemanticos.forEach((s) -> {
            System.out.println(s);
        });

        if (AnalisadorSemanticoUtils.errosSemanticos.isEmpty() && !erroSintatico) {
            // Iniciando o gerador de codigos por meio da classe limageGeradorPy caso não haja erros
            limageGeradorPy lgp = new limageGeradorPy();
            lgp.visitPrograma(arvore);

            try ( PrintWriter pw = new PrintWriter(args[1])) {
                // Escrevendo o código gerado no arquivo de saída
                pw.print(lgp.saida.toString());
            }
            // Gerando um comando para abrir um novo terminal que executa o script Python no Windows
            String command = "cmd /c start python " + args[1];
            Process p = Runtime.getRuntime().exec(command);
            try {
                p.waitFor();
            } catch (InterruptedException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
