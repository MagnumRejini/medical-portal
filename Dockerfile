FROM adoptopenjdk:16-jdk as builder
COPY . .
RUN ./mvnw clean package -DskipTests

FROM adoptopenjdk:16-jre-hotspot
ARG JAR_FILE=target/*.jar
COPY --from=builder ${JAR_FILE} app.jar
EXPOSE 8080
ENV ACTIVE_PROFILE=local-complete
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "/app.jar"]