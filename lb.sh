./gradlew clean bootJar
docker build -t krishnadwypayan/lb .
docker run -p 80:8080 krishnadwypayan/lb