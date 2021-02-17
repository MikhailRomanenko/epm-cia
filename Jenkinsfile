pipeline {
    agent {
        docker { image 'openjdk:8' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'java -version'
            }
        }
    }
}