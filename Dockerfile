# Use a lightweight JDK image
FROM openjdk:8-jre-alpine

# Set working directory inside the container
WORKDIR /app

# Copy the fat JAR into the container
COPY target/devops-standalone-app-1.0.0-jar-with-dependencies.jar app.jar

# Expose any ports (if needed, e.g., 8080); we skip this for CLI app

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
