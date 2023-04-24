#!/bin/sh

./mvnw clean install

# ./mvnw spring-boot:run && ./mvnw package
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-DDB_HOSTNAME=db_mysql -DDB_PORT=3306 -DDB_NAME=abc_tech -DDB_USERNAME=root -DDB_PASSWORD=Fiap1234