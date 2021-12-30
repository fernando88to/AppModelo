FROM eclipse-temurin:11.0.13_8-jdk

RUN addgroup  spring
#RUN adduser spring
#USER spring:spring
RUN useradd -rm -d /home/spring -s /bin/bash -g spring -G sudo -u 1000 spring
USER spring

WORKDIR /AppModelo