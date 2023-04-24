FROM adoptopenjdk/openjdk11:alpine-slim 

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

COPY commands.sh /scripts/commands.sh
RUN ["chmod", "+x", "/scripts/commands.sh"]
ENTRYPOINT ["/scripts/commands.sh"]

# ENTRYPOINT ["./mvnw", "spring-boot:run", "&&", "./mvnw", "package"]