#!/usr/bin/env groovy
node {
        jdk = tool name: 'jdk-11.0.12+7', type: 'jdk'
        env.JAVA_HOME = "${jdk}"

        stage("git"){
            git branch: 'main', url: 'https://github.com/fernando88to/AppModelo.git'
        }

        stage ("check version java"){
            sh "./gradlew check  -Dgeb.env=remote"
        }
}