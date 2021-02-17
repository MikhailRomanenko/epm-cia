pipeline {
    agent {
        docker { image 'openjdk:8' }
    }
    tools {
        dockerTool 'docker'
    }
    stages {
        stage('Test1') {
            steps {
                sh 'java -version'
            }
        }
    }
}