FROM amazoncorretto:21
LABEL maintainer="Learning@docker"
WORKDIR /app
COPY target/Learning-Docker-0.0.1-SNAPSHOT.jar /app/test_docker.jar
ENTRYPOINT ["java", "-jar", "test_docker.jar"]