#!/bin/sh
./mvnw clean -f pom.xml
./mvnw install -f pom.xml
./mvnw package -f pom.xml

# ./mvnw spring-boot:run -f pom.xml

java -jar ./target/abctechapi-0.0.6-SNAPSHOT.war

# ./mvnw clean install

# # ./mvnw spring-boot:run && ./mvnw package
# ./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-DDB_HOSTNAME=db_mysql -DDB_PORT=3306 -DDB_NAME=abc_tech -DDB_USERNAME=root -DDB_PASSWORD=Fiap1234