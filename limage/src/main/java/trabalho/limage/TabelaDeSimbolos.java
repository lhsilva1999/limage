package trabalho.limage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabelaDeSimbolos {

    // Tipos correspondentes para a linguagem limage
    public enum Tipolimage {
        INTEIRO,
        IMAGEM
    }

    // Criando uma classe para a entrada da nossa tabela de símbolos
    class EntradaTabelaDeSimbolos {

        String nome;
        Tipolimage tipo;

        // Construtor de uma EntradaTabelaDeSimbolos somente com o seu nome e o seu tipo
        private EntradaTabelaDeSimbolos(String nome, Tipolimage tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

    }

    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    // Construtor de uma TabelaDeSimbolos 
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    // Método para adicionar uma imagem ou uma variavel simples na tabela de simbolos
    public void adicionar(String nome, Tipolimage tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    // Método para verificar a existência de um identificador na Tabela de Símbolos
    public EntradaTabelaDeSimbolos verificar(String nome) {
        return tabela.get(nome);
    }
    
    // Método para verificar o tipo de um identificador na Tabela de Símbolos
    public Tipolimage verificarTipo(String nome) {
        return tabela.get(nome).tipo;
    }

}
