FROM eclipse-temurin:17-jdk-alpine
RUN echo ${PWD} && ls -lR
EXPOSE 8080
EXPOSE 9000
VOLUME /tmp
COPY ../build/libs/load-balancer-service-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]