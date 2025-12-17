FROM eclipse-temurin:11-jre
WORKDIR /app
COPY target/maven-project-1.1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]
