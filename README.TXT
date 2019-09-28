----------------------------------------------------------------------------
Este é o arquivo README do projeto. Você deve descrever aqui o seu projeto.
Informe ao usuário (alguém que não sabe nada sobre este projeto!) tudo que
ele/ela precisa saber. Os comentários devem incluir, pelo menos:
------------------------------------------------------------------------

TITULO DO PROJETO: JPX
OBJETIVO DO PROJETO: Projeto de ERP com java, postgreSQL e Linux
VERSÃO ou DATA: 1.0.1
COMO INICIAR O PROJETO: java Principal
AUTORES: Leandro Spanghero
INSTRUÇÕES PARA O USUÁRIO: 
- v1.0 Ainda é o início do desenvolvimento portanto não há nenhuma instrução, há apenas 2 classes a principal que executa o projeto e gero o objeto da tela de testes e a tela de testes.
- v1.0.1 Colocar a pasta e o driver JDBC no classpath com o seguinte turorial:
LINUX (testado no raspbian)
Editar o arquivo = sudo leafpad /etc/environment
e inserir o seguinte texto =
CLASSPATH=".:/home/pi/Dev/Java/Jpx:/home/pi/Dev/Java/Jpx/mariadb-java-client-2.4.4.jar"
export CLASSPATH
editar o arquivo = sudo leafpad ~/.bashrc 
inserir este texto ao final do arquivo
CLASSPATH=".:/home/pi/Dev/Java/Jpx:/home/pi/Dev/Java/Jpx/mariadb-java-client-2.4.4.jar"
export CLASSPATH
WINDOWS (testado no windows 10)
Colocar nas variáveis de ambiente uma nova variável chamada CLASSPATH e como parâmetro colocar:
.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tools.jar;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\htmlconverter.jar;%JAVA_HOME%\jre\lib;%JAVA_HOME%\jre\lib\rt.jar;c:\java\jpx;c:\java\jpx\mysql-connector-java-5.1.48.jar;
ESTRUTURA DE BANCO DE DADOS
NOME DO BANCO: jpxbd
TABELA:
clientes(codigo INTEGER PRIMARY KEY AUTO_INCREMENT, nome VARCHAR(250));

