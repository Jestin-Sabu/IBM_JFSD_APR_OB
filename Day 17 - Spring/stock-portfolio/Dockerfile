FROM openjdk:17
ARG JAR_FILE=target/player-app.jar
COPY ${JAR_FILE} player-app.jar
EXPOSE 9092
ENTRYPOINT ["java","-jar","/team-app.jar"]