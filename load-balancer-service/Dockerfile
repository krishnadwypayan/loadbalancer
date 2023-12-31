# Start with a base image containing Java runtime
FROM openjdk:17-alpine

# Create a directory
WORKDIR /app

# Copy all the files from the current directory to the image
COPY . .

# build the project avoiding tests
RUN ./gradlew clean build

COPY ./build/libs/load-balancer-service-0.0.1-SNAPSHOT.jar .

# Expose ports
EXPOSE 8080
EXPOSE 9000

# Run the jar file
CMD ["java", "-jar", "load-balancer-service-0.0.1-SNAPSHOT.jar"]