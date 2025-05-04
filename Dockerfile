FROM openjdk:8-jre-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the correct Spring Boot JAR into the container
COPY target/devops-standalone-app-1.0.0.jar app.jar

# Expose port 8080 (optional, for Spring Boot web apps)
EXPOSE 8080

# Run the JAR
ENTRYPOINT ["java", "-Xmx256m", "-jar", "app.jar"]


