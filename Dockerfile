FROM openjdk:8-jdk-alpine
EXPOSE 2346
ARG JAR_FILE=target/ws_randomizer_Address-1.2.jar
COPY ${JAR_FILE} ws_randomizer_Address-1.2.jar
ENTRYPOINT ["java","-jar","/ws_randomizer_Address-1.2.jar"]