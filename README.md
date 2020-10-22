# limage
Linguagem desenvolvida para facilitar o uso de algumas técnicas de processamento digital de imagens.

Para compilar o programa, é necessário ter uma IDE que tenha suporte para a linguagem JAVA. A
recomendação do grupo é o uso do Apache Netbeans, preferencialmente, em uma de suas versões mais atuais.
O JDK utilizado no desenvolvimento e testes se trata da versão 14.0.2. Com a IDE é possível criar um projeto Maven e compilar o programa. 

Com a pasta limage, é possível importar o projeto na IDE e compilar. Um arquivo executável ".jar" será gerado na pasta "Targets" do projeto.
A partir do arquivo ".jar" é possível executar o programa no terminal.
Para executá-lo, devem ser passados dois argumentos, o primeiro é o caminho para o arquivo de entrada, o segundo é o caminho para o
arquivo de saída.

A entrada deve ser um arquivo com o código na linguagem limage. 
A saída gerada será um script em python.

Para execução do script, é necessário ter instalado previamente as seguintes bibliotecas do python:
- numpy
- cv2
- matplotlib.pyplot
- os.path
- skimage.util

Um exemplo de linha de comando para execução do analisador semântico e gerador de código é "java -jar
C:\compilador\compilador.jar C:\arquivoEntrada\entrada.li C:\arquivoSaida\saida.py".
