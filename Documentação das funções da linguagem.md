# Documentação dos comandos da linguagem limage

Este arquivo é destinado para descrição dos comandos utilizados na linguagem Limage.

## Declarações
- tipo : nome_variavel - Este é o formato para declarar uma imagem ou um valor inteiro.
- leia(nome_variavel) - Este comando deve estar logo abaixo da declaração da variável. Caso a variável seja uma imagem, o comando solicita o caminho onde ela se encontra. Caso seja um valor inteiro, o comando solicita que o usuário informe o seu valor.

## Operações básicas (+,-,*,/)
As operações básicas são permitidas e as atribuições são para o termo à esquerda, ou seja, se desejar realizar uma operação entre imagem e um valor inteiro, o programador deve colocar o identificador da imagem à esquerda.
- Im + A: A imagem Im recebe a soma entre Im e A.
- Im - A: A imagem Im recebe a subtração entre Im e A.
- Im * A: A imagem Im recebe a multiplicação entre Im e A.
- Im / A: A imagem Im recebe a divisão entre Im e A.

## Operações
- filtroMedia(Im, A) - Aplica um filtro de média na imagem de entrada Im. A filtragem é feita por meio da convolução da imagem com um kernel de tamanho AxA.
- filtroMediana(Im, A) - Aplica um filtro de mediana na imagem de entrada Im. A filtragem é feita de forma não linear com um kernel AxA que atribui a mediana do kernel no pixel central.
- adicionarRuido(Im) - Aplica um ruído randômico do tipo sal e pimenta na imagem de entrada Im.
- limiarOtsu(Im) - Aplica a binarização da imagem de entrada Im por meio da técnica de limiarização utilizando o algoritmo de Otsu.
- realceBordas(Im) - Detecta as bordas da imagem de entrada Im por meio do filtro Laplaciano que corresponde à operação de derivada segunda.
- filtroGaussiano(Im, A, B) - Aplica um filtro Gaussiano que suaviza a imagem de entrada Im.  A filtragem é feita por meio da convolução da imagem com um kernel de tamanho AxA e sigma B.

- salvar(Im): Este comando salva a imagem resultante.
- mostrar(Im): Este comando mostra a imagem resultante na tela.
