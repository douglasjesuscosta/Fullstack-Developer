## Instruções para instalação e execução do sistema:

O projeto é dividido em duas pastas principais: "Front-end" e Back-end". A pasta "Front-end" contém o projeto em Angular denominado "ecommerceproeject". A pasta "Back-end" contém os projetos:
   - ApiGateway: Responsável pelo balanceamento de carga e por receber as requisições do front e as encaminhando para as instâncias de                    serviço solicitadas.
   - DiscoveryService: Responsável pelo registro dos serviços sendo utilizado pelo ApiGateway para obtenção dos serviços registrados.
   - FreteService: Serviço responsável pelo cálculo do frete.
   - ServicePedidos: Serviço responsável pela criação e obtenção de pedidos.
   
Deverão ser seguidos os passos para instalação e execução do sistema:

## Execução dos serviços

1. Torna-se necessário a instalação dos seguintes softwares: Java JDK 11, Maven, PostgreSQL e Nodejs
2. Após instalar os programas listados, deve ser criado um banco de dados com o nome: "pedidodatabase";
3. O usuário e senha configurados para o banco deverão ser "postgres" e "postgres" respectivamente (usuário e senha padrão)
   Caso o usuário e senha configurados sejam diferentes, também pode ser feita a mudança dos mesmo no arquivo "application.properties"
   do serviço de pedidos.
4. Os serviços podem ser executados através do comando "mvn spring-boot:run" ou em uma IDE como Eclipse, IntelliJIdea, entre outras.
   Para execução via comando, torna-se necessário configurar a variável de ambiente no sistema refetente ao Maven.
5. Após efetuar a configuração do banco, os serviços deverão ser executados. O primeiro serviço a ser executado é o "DiscoveryService"
   que fará o registro dos outros serviços. O serviço tem como porta padrão a porta 8010. Caso a porta esteja em uso, pode ser              configurada uma nova porta no arquivo "application.properties", porém, com a mudança na porta, deve ser também modificados todos os a
   arquivos "application.properties" presentes nos outros serviços, que necessitam da porta desse serviço para efetuar o registro ou        consumir suas informações como no caso do serviço ApiGateway.
6. Feita a execução do DiscoveryService, o próximo serviço a ser inicializado é o "ApiGateway". Assim como o DiscoveryService esse          serviço tem sua porta fixa, sendo essa a porta 8011. Caso seja necessário a mudança da porta, deverá ser modificado também, no          projeto do front, o arquivo enviroments.ts na pasta enviroments, que contém o link para esse serviço com essa porta.  











