FROM openjdk:8-jdk-alpine

#install git
RUN apk add --no-cache git

RUN git clone https://github.com/l0r5/kicker_app_server.git

WORKDIR "/kicker_app_server/"
RUN ./gradlew build bootJar
# check if kicker_app_server_$version.jar is available
RUN ls build/libs

# copy build jar and run webserver
RUN cp build/libs/*.jar ./app.jar
ENTRYPOINT ["java","-jar","app.jar"]