pipeline {
    agent {
        docker { image 'openjdk:8' }
    }
    tools {
        docker 'docker'
    }
    stages {
        stage('Test1') {
            steps {
                sh 'java -version'
            }
        }
    }
}