# Use uma imagem base do Java 11
FROM openjdk:11-jdk-slim

# Copie o jar da sua aplicação para a imagem
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Exponha a porta que a sua aplicação usa
EXPOSE 8080

# O comando para iniciar a sua aplicação
ENTRYPOINT ["java","-jar","/app.jar"]
