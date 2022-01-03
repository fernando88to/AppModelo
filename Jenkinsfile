#!/usr/bin/env groovy
node {
        //jdk = tool name: 'jdk-11.0.12+7', type: 'jdk'
        //env.JAVA_HOME = "${jdk}"

        stage("git"){
            git branch: 'main', url: 'https://github.com/fernando88to/AppModelo.git'
        }

        stage("first"){
                    jdk "jdk-11.0.12+7"
                    sh './grailsw --version '

        }
        stage ("analysis static code"){
                    sh "./gradlew codenarcMain codenarcTest"
        }

        stage ("automation test"){
            sh "./grailsw test-app  -Dgeb.env=remote"
        }
        stage ("war"){
            sh "./grailsw war"
        }
}