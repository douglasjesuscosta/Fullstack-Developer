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
4. Após efetuar a configuração do banco, os serviços deverão ser executados. O primeir











