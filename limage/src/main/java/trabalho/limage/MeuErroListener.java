package trabalho.limage;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class MeuErroListener extends BaseErrorListener {

    String saida;
    String tokenName;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Atribuindo o Token onde foi detectado erro para a variavel tokenName
        tokenName = ((Token) offendingSymbol).getText();

        // Se for erro no Final do programa, tirar o <> formatado para o Analisador Lexico
        if (tokenName.equals("<EOF>")) {
            tokenName = "EOF";
        }
        // Formatando mensagem de erro a ser gerada
        saida = "Linha " + line + ": " + "erro sintatico proximo a "
                + tokenName;

        // Lança a exceção de erro
        throw new RuntimeException(saida);
    }
}
