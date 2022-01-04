pipeline {
    agent any
    //set the version of the jdk

    //env.JAVA_HOME="${tool 'jdk-11.0.12+7'}"
    //env.PATH="${env.JAVA_HOME}/bin:${env.PATH}"



    stages {

        stage("git checkout"){
            steps {
                git branch: 'main', url: 'https://github.com/fernando88to/AppModelo.git'
            }
        }

        stage ("clean build"){
            steps {
                /* sh 'rm -rf build' */
                dir('build') {
                    deleteDir()
                }
            }
        }

        stage("version"){
                    steps {
                        //jdk "jdk-11.0.12+7"
                        sh './grailsw --version '
                    }
        }




        stage ("analysis static code"){
            steps {
                sh "./gradlew codenarcMain codenarcTest"
            }
        }
        stage ("automation test && coverage"){
            steps {
                sh "./gradlew cloverGenerateReport -Dgeb.env=remote"
            }
        }

        stage ("war"){
            steps {
                sh "./grailsw war"
            }
        }
    }
}

