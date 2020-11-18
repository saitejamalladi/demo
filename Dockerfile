FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo.jar
CMD java -Xmx4g -jar demo.jar
