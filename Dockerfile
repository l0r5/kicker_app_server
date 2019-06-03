FROM openjdk:8-jdk-alpine

COPY quickstart.sh /
CMD ["/quickstart.sh"]

VOLUME /tmp
ARG JAR_FILE
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]