#!/usr/bin/env groovy
node {
        //set a version of the jdk
        env.JAVA_HOME="${tool 'jdk-11.0.12+7'}"
        env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"

        stage("version"){
                            jdk "jdk-11.0.12+7"
                            sh './grailsw --version '

        }

        stage("git checkout"){
            git branch: 'main', url: 'https://github.com/fernando88to/AppModelo.git'
        }

        stage ("clean build"){
                    sh './grailsw clean'
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