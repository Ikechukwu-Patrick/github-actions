FROM openjdk:17-jdk-slim
COPY target/springboot-image.jar springboot-image.jar
ENTRYPOINT ["java", "-jar", "springboot-image.jar"]
