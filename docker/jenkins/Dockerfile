FROM jenkins/jenkins:lts

USER root
ADD https://github.com/adoptium/temurin11-binaries/releases/download/jdk-11.0.12%2B7/OpenJDK11U-jdk_x64_linux_hotspot_11.0.12_7.tar.gz /opt
RUN tar -xzf /opt/OpenJDK11U-jdk_x64_linux_hotspot_11.0.12_7.tar.gz -C /opt && rm /opt/OpenJDK11U-jdk_x64_linux_hotspot_11.0.12_7.tar.gz
USER jenkins

