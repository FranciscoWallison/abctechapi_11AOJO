## Iniciando projeto me spring boot

### [mvnrepository](https://mvnrepository.com/)


## Possiveis erros

Validar erro de './mvnw: not found '
````
sudo dos2unix mvnw && chmod +x mvnw
````
### Comando para entrar no container do app
````
docker exec -it api bash
````
### Comando para reiniciar os containers
sudo docker compose -f "docker-compose.yml" down && docker compose -f "docker-compose.yml" up -d --build

````
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-DDB_HOSTNAME=db_mysql -DDB_PORT=3306 -DDB_NAME=abc_tech -DDB_USERNAME=root -DDB_PASSWORD=Fiap1234"
````
https://github.com/mgonzaga1990/fxRatesWidget/blob/aa05a2464ecc63fd5fad6e9325752c1e38dce188/fxWidget/Dockerfile
https://mbafullcycle.s3.us-east-1.amazonaws.com/system-design/Design%20Docs.pdf