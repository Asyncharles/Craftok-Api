pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK 8'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                success {
                  archiveArtifacts(artifacts: '**/target/*.jar', allowEmptyArchive: true)
                }
             }
        }
    }
}
