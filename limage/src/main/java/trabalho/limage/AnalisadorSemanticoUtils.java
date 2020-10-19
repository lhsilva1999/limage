package trabalho.limage;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class AnalisadorSemanticoUtils {
    
    public static List<String> errosSemanticos = new ArrayList<>();
    
    
    //Função que adiciona os erros semânticos
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
}
