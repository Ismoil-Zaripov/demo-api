FROM openjdk:17-jdk

WORKDIR /app

COPY target/*.jar /app/springdemo.jar

EXPOSE 8080

CMD ["java", "-jar", "springdemo.jar"]