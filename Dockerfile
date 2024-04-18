# Use a base image with Java installed
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/demo1-maven-0.0.1-SNAPSHOT.jar /app/myapp.jar

# Expose the port the app runs on
EXPOSE 8081

# Define the command to run your application
CMD ["java", "-jar", "myapp.jar"]
