# Stage 1: Build
FROM maven:3.8.8-eclipse-temurin-21 AS build
WORKDIR /app

# Copy all project files to the container
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Runtime
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copy the built jar file from the build stage
COPY --from=build /app/target/KAM-0.0.1-SNAPSHOT.jar KAM.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "KAM.jar"]
