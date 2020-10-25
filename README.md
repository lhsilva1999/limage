# limage
A Linguagem limage tem como objetivo facilitar o uso de operações e técnicas de processamento digital de imagens, gerando um script em python que as implementam. Para tal, é possível realizar desde a adição de ruídos até a aplicação de filtros com diversas finalidades. As funções da linguagem estão descritas [aqui](https://github.com/lhsilva1999/limage/blob/main/Documenta%C3%A7%C3%A3o%20das%20fun%C3%A7%C3%B5es%20da%20linguagem.md).

Por vezes, na área de aplicação especificada, se faz necessário que um fator seja aplicado sobre uma imagem através de uma operação aritmética simples, na qual esse valor é replicado de acordo com a operação em cada pixel da imagem. Portanto, as operações de adição, subtração, produto e divisão (realizadas pixel a pixel) são outra possibilidade para o programador em Linguagem limage,  as quais podem ser utilizadas tanto entre imagens quanto entre uma imagem e um valor inteiro. Então, ao precisar de uma ferramenta que facilite o seu processamento de imagens, é com a Linguagem limage que você encontrará maior facilidade e sem precisar decorar nomes de bibliotecas ou funções para tal. O vídeo de apresentação da linguagem se encontra em: [https://youtu.be/d2vf4buk9WE](https://youtu.be/d2vf4buk9WE)


## Importando e compilando o projeto do compilador da linguagem limage no NetBeans
Para compilar o programa, é necessário ter uma IDE que tenha suporte para a linguagem JAVA. A recomendação do grupo é o uso do [Apache NetBeans](https://netbeans.apache.org/download/index.html), preferencialmente, em uma de suas versões mais atuais. O [JDK](https://www.oracle.com/br/java/technologies/javase-downloads.html) utilizado no desenvolvimento e testes se trata da versão 14.0.2. 

Primeiro, clone ou baixe a pasta [limage](limage/) para o seu computador.
Em seguida, no Apache NetBeans clique em "File -> Open Project..." e selecione a pasta limage baixada anteriormente.
Com isso, caso queira, podem ser feitas alterações no compilador.
Por fim, compilando o projeto um arquivo executável ".jar" do compilador será gerado na pasta "Targets".

## Execução do compilador da linguagem limage
A partir do arquivo ".jar", gerado na pasta "Target" ou disponível em [Compilador](limage/target/limage-1.0-SNAPSHOT-jar-with-dependencies.jar), é possível executar o programa no terminal.

Para executá-lo, devem ser passados dois argumentos, o primeiro é o caminho para o arquivo de entrada referente ao **código desenvolvido na linguagem limage** e o segundo é o caminho para o **arquivo python (.py)** de saída.

Um exemplo de linha de comando para execução do compilador da Linguagem limage é "java -jar C:\compilador\compilador.jar C:\arquivoEntrada\entrada.li C:\arquivoSaida\saida.py".

A entrada deve ser um arquivo com o código na linguagem limage. 
A saída gerada será um script em python.

## Execução do script em python

### Requisitos
Na execução do script, é necessário ter instalado previamente o python na versão [3.7](https://www.python.org/downloads/) ou superior, além das bibliotecas a seguir:
- [NumPy](https://numpy.org/install/) 
- [OpenCV](https://opencv.org/releases/) (cv2)
- [Matplotlib](https://matplotlib.org/users/installing.html) (matplotlib.pyplot)
- OS (os.path)
- [Scikit-image](https://scikit-image.org/docs/dev/install.html) (skimage.util)

### Executando
Para executar o script, basta executar o seguinte comando no terminal: "python3 NomeDoScriptGerado.py". Dependendo da configuração do sistema operacional Windows, o comando a ser executado é: "python NomeDoScriptGerado.py".

## Exemplos
Os exemplos de códigos em limage podem ser encontrados em: [Exemplos](https://github.com/lhsilva1999/limage/tree/main/Testes%20Linguagem%20limage/).
