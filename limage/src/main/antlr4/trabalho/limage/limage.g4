grammar limage;

// Criando a exceção de Erros identificados, possibilitando que uma mensagem de erro seja passada
@members {
void erro(int linha, String msg) {
throw new RuntimeException("Linha "+linha+": "+msg);
}
}

// Agrupamento de todas as Palavras-Chave, sendo esta o Padrão
PALAVRA_CHAVE 
	:	'ALG' | 'FIM' | 'imagem' | 'leia' | 'salvar' | 'mostrar' | 'inteiro' 
        | 'filtroMedia' | 'filtroMediana' | 'adicionarRuido' | 'realceBordas' 
        | 'limiarOtsu' | 'filtroGaussiano'
	; 

// Padrão para números inteiros
NUM_INT	: '-'?('0'..'9')+
	;

// Padrão para identificadores
IDENT   : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
        ;

// Padrão para comentários, os quais são ignorados
COMENTARIO :   '#' ~('\n'|'\r'|'#')* '\r'? '#' {skip();}
    ;

// Padrão para identificar um comentario não fechado, seguido de uma mensagem de erro apropriada
COMENTARIOERRADO1 :   '#' .*? '\n'? {erro(getLine(), "comentario nao fechado");}
    ;

// Padrão para espaços em branco, tabulações, quebra de linha e afins, os quais são ignorados
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;

// Padrão para Operadores Aritméticos
OP_ARIT	:	'+' | '-' | '*' | '/'
	;

// Padrão para virgulas
VIRGULA: ','
        ;

// Padrão para abre parentesis
ABREPAR :	'('
	;

// Padrão para fecha parentesis
FECHAPAR:	')'
	;

// Padrão que identifica tudo que não se encaixa nas regras anteriores como erros e manda uma mensagem adequada
ERROR
    : . { erro(getLine(), getText()+" - simbolo nao identificado"); }
        ;

// Inicio da Gramatica da Linguagem limage
// Estrutura sintatica de um programa, esperando o 'End of File' para prevenir erros
programa
    :   'ALG' declaracoes cmd* cmdFinal 'FIM' EOF
    ;

// Estrutura que define as declarações para a Linguagem limage, utilizando-se a notação simplificada EBNF
declaracoes
    :   (decl_imagem cmdLeia)+ ((decl_inteiro cmdLeia) | (decl_imagem cmdLeia))*
    ;

// Estrutura que define uma declaração de imagem na Linguagem limage
decl_imagem
    :   'imagem' ':' IDENT
    ;

// Estrutura que define uma declaração de variável do tipo inteiro na Linguagem limage
decl_inteiro
    :   'inteiro' ':' IDENT
    ;


// Estrutura que define os possíveis comandos na Linguagem limage
cmd
    :   cmdOperacoes | cmd_aritmetico
    ;

// Estrutura que define um comando aritmético na Linguagem limage
cmd_aritmetico
    :   IDENT OP_ARIT valor=(NUM_INT | IDENT)
    ;

// Estrutura que define um comando de leitura
cmdLeia
    :   'leia' ABREPAR IDENT FECHAPAR
    ;

// Estrutura que define as operações em Linguagem limage
cmdOperacoes
    :  filtro=('filtroMedia' | 'filtroMediana') ABREPAR IDENT (VIRGULA param2=(IDENT | NUM_INT) )? FECHAPAR
       | operacao=('adicionarRuido' | 'limiarOtsu' | 'realceBordas') ABREPAR IDENT FECHAPAR
       | gaussiano='filtroGaussiano' ABREPAR IDENT (VIRGULA p2=(IDENT | NUM_INT) )? (VIRGULA p3=(IDENT | NUM_INT) )? FECHAPAR
    ;

// Estrutura que define um comando mostrar para uma imagem em Linguagem limage
cmdMostrar
    :   'mostrar' ABREPAR IDENT FECHAPAR
    ;

// Estrutura que define quais comandos são obrigatórios no final do programa
cmdFinal
    : cmdSalvar | cmdMostrar | cmdSalvar cmdMostrar
    ;

// Estrutura que define um comando salvar para uma imagem em Linguagem limage
cmdSalvar
    :   'salvar' ABREPAR IDENT FECHAPAR
    ;

