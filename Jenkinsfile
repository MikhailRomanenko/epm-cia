pipeline {
    agent {
        docker { image 'openjdk:8' }
    }
    stages {
        stage('Test1') {
            steps {
                sh 'java -version'
            }
        }
    }
}