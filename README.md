# limage
A Linguagem limage foi desenvolvida para facilitar o uso de operações e técnicas de processamento digital em imagens, gerando um script em python que as implementam.


## Como compilar
Para compilar o programa, é necessário ter uma IDE que tenha suporte para a linguagem JAVA. A
recomendação do grupo é o uso do Apache Netbeans, preferencialmente, em uma de suas versões mais atuais.
O JDK utilizado no desenvolvimento e testes se trata da versão 14.0.2. Com a IDE é possível criar ou importar um projeto Maven e compilar o programa. 

Com a pasta [limage](limage/), é possível importar o projeto na IDE e compilar. Um arquivo executável ".jar" do compilador será gerado na pasta "Targets" do projeto.


## Execução do compilador
A partir do arquivo ".jar", disponível em [Compilador](limage/target/limage-1.0-SNAPSHOT-jar-with-dependencies.jar), é possível executar o programa no terminal.

Para executá-lo, devem ser passados dois argumentos, o primeiro é o caminho para o arquivo de entrada, o segundo é o caminho para o
arquivo de saída.

Um exemplo de linha de comando para execução do analisador semântico e gerador de código é "java -jar
C:\compilador\compilador.jar C:\arquivoEntrada\entrada.li C:\arquivoSaida\saida.py".

A entrada deve ser um arquivo com o código na linguagem limage. 
A saída gerada será um script em python.

## Requisitos

Na execução do script, é necessário ter instalado previamente o python na versão 3.7 ou superior, além das bibliotecas a seguir:
- NumPy 
- OpenCV (cv2)
- Matplotlib (matplotlib.pyplot)
- OS (os.path)
- Scikit-image (skimage.util)

## Exemplos
Exemplos de códigos em limage podem ser encontrados em: [Exemplos](https://github.com/lhsilva1999/limage/tree/main/Testes%20Linguagem%20limage/).
