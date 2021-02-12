FROM openjdk:8-jdk-alpine
RUN addgroup -S epm && adduser -S app -G epm
USER app:epm
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]