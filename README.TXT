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
Editar o arquivo = sudo leafpad /etc/environment
e inserir o seguinte texto =
CLASSPATH=".:/home/pi/Dev/Java/Jpx:/home/pi/Dev/Java/Jpx/mariadb-java-client-2.4.4.jar"
export CLASSPATH
editar o arquivo = sudo leafpad ~/.bashrc 
inserir este texto ao final do arquivo
CLASSPATH=".:/home/pi/Dev/Java/Jpx:/home/pi/Dev/Java/Jpx/mariadb-java-client-2.4.4.jar"
export CLASSPATH

