FROM openjdk:22-jdk-alpine
EXPOSE 8080
ADD target/demo1-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]