FROM openjdk:8-jdk-alpine
#
COPY quickstart.sh /
CMD ["/quickstart.sh"]
#
#VOLUME /tmp
#ARG JAR_FILE
#WORKDIR /kicker_app_server
#CMD ["./gradlew build"]
#COPY build/libs/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]