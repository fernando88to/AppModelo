#!/usr/bin/env groovy
node {
        jdk = tool name: 'jdk-11.0.12+7', type: 'jdk'
        env.JAVA_HOME = "${jdk}"
        stage ("check version java"){

            sh "${jdk}/bin/java -version"
        }
}