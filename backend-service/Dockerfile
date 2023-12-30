FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8090
EXPOSE 9001
VOLUME /tmp
COPY build/libs/backend-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]