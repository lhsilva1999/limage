# limage
A Linguagem limage foi desenvolvida para facilitar o uso de operações e técnicas de processamento digital em imagens, gerando um script em python que as implementam. Para tal, é possível realizar desde a adição de ruídos até a aplicação de filtros com finalidades de suavizar uma imagem, sendo estes o filtro da Média e o filtro da Mediana. 

Além da filtragem linear, operações entre imagens de adição, subtração, produto e divisão (realizadas pixel a pixel) são outra possibilidade para o programador em Linguagem limage. Para finalizar, por vezes, na área de aplicação especificada, se faz necessário que um parâmetro seja aplicado sobre uma imagem através de uma operação aritmética simples, na qual esse valor replica a operação em cada pixel da imagem. Portanto, ao precisar de uma ferramenta que facilite o seu processamento de imagens, é com a Linguagem limage que você encontrará maior facilidade e sem precisar decorar nomes de bibliotecas ou funções para tal. 


## Como compilar
Para compilar o programa, é necessário ter uma IDE que tenha suporte para a linguagem JAVA. A recomendação do grupo é o uso do [Apache Netbeans](https://netbeans.apache.org/download/index.html), preferencialmente, em uma de suas versões mais atuais. O [JDK](https://www.oracle.com/br/java/technologies/javase-downloads.html) utilizado no desenvolvimento e testes se trata da versão 14.0.2. 

Utilizando a IDE é possível criar ou importar um projeto Maven e compilar o programa. Com a pasta [limage](limage/), é possível importar o projeto na IDE e compilar. Um arquivo executável ".jar" do compilador será gerado na pasta "Targets" do projeto.


## Execução do compilador
A partir do arquivo ".jar", disponível em [Compilador](limage/target/limage-1.0-SNAPSHOT-jar-with-dependencies.jar), é possível executar o programa no terminal.

Para executá-lo, devem ser passados dois argumentos, o primeiro é o caminho para o arquivo de entrada, o segundo é o caminho para o arquivo de saída.

Um exemplo de linha de comando para execução do analisador semântico e gerador de código é "java -jar C:\compilador\compilador.jar C:\arquivoEntrada\entrada.li C:\arquivoSaida\saida.py".

A entrada deve ser um arquivo com o código na linguagem limage. 
A saída gerada será um script em python.

## Requisitos

Na execução do script, é necessário ter instalado previamente o python na versão [3.7](https://www.python.org/downloads/) ou superior, além das bibliotecas a seguir:
- [NumPy](https://numpy.org/install/) 
- [OpenCV](https://opencv.org/releases/) (cv2)
- [Matplotlib](https://matplotlib.org/users/installing.html) (matplotlib.pyplot)
- OS (os.path)
- [Scikit-image](https://scikit-image.org/docs/dev/install.html) (skimage.util)

## Exemplos
Exemplos de códigos em limage podem ser encontrados em: [Exemplos](https://github.com/lhsilva1999/limage/tree/main/Testes%20Linguagem%20limage/).
