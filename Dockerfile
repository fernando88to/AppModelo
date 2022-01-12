FROM adoptopenjdk/openjdk11:x86_64-ubuntu-jdk-11.0.13_8

COPY build/libs/AppModelo-0.1.war /app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]


#docker build -t app:0.1 .

#docker run -it --rm -p 8888:8080 app:0.1