FROM eclipse-temurin:21-jre

WORKDIR /app

COPY build/libs/*.jar ./

ENTRYPOINT ["java", "-jar", "app.jar"]