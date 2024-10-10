FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/springboot-image.jar springboot-image.jar
EXPOSE 8081
CMD ["java", "-jar", "springboot-image.jar"]
