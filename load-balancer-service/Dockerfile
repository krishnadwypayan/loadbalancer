FROM openjdk:17-alpine as build
USER root
WORKDIR /builder
ADD . /builder
RUN ./gradlew clean build

FROM openjdk:17-alpine
WORKDIR /app
EXPOSE 8080
EXPOSE 9000
COPY --from=builder /builder/build/libs/load-balancer-service-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "load-balancer-service-0.0.1-SNAPSHOT.jar"]