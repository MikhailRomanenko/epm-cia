pipeline {
    agent {
        docker 'gradle:jre8'
    }
    stages {
        stage('Test') {
            steps {
                sh 'gradle --version'
            }
        }
    }
}