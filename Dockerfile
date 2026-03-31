FROM eclipse-temurin:18-jdk
WORKDIR /app
COPY ./target/payroll-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "payroll-0.0.1-SNAPSHOT.jar"]
