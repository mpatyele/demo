FROM maven:3.6-jdk-11-slim as build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/*.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/*.jar"]