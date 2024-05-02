# Use the official OpenJDK image as a base image
FROM maven:3.8.4-openjdk-17-slim

# Set the working directory in the container
WORKDIR /app
EXPOSE 5050

# Copy the entire project into the container
COPY . .

# Update Maven dependencies
COPY pom.xml .
RUN mvn clean install -DskipTests

# Build the project inside the container
RUN mvn clean package

# Specify the command to run your application
CMD ["java", "-jar", "target/sample_test.jar"]
