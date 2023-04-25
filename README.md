## Iniciando projeto me spring boot

### [mvnrepository](https://mvnrepository.com/)


## Possiveis erros

Validar erro de './mvnw: not found' ou  './commands.sh: not found' 

````
sudo dos2unix mvnw && chmod +x mvnw
sudo dos2unix commands.sh && chmod +x commands.sh
````
### Comando para entrar no container do app
````
docker exec -it api bash
````
### Comando para reiniciar os containers
````
sudo docker compose -f "docker-compose.yml" down && docker compose -f "docker-compose.yml" up -d --build
````
### ENV
````
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-DDB_HOSTNAME=db_mysql -DDB_PORT=3306 -DDB_NAME=abc_tech -DDB_USERNAME=root -DDB_PASSWORD=Fiap1234"
````
