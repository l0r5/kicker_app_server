FROM openjdk:8-jdk-alpine
#

#RUN wget -q https://services.gradle.org/distributions/gradle-5.4.1-bin.zip \
#    && unzip gradle-5.4.1-bin.zip -d /opt \
#    && rm gradle-5.4.1-bin.zip
#
#ENV GRADLE_HOME /opt/gradle-5.4.1
#ENV PATH $PATH:/opt/gradle-5.4.1/bin

COPY quickstart.sh /
CMD ["/quickstart.sh"]
#
#VOLUME /tmp
#ARG JAR_FILE
#WORKDIR /kicker_app_server
#COPY build/libs/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]