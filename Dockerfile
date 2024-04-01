FROM openjdk:17-jdk-alpine

LABEL authors="niiad"

MAINTAINER samuelbrownai@gmail.com

COPY build/libs/juha-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]