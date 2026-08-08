pipeline {
    agent any
    stages {
        stage('java-version'){

            steps{
                echo "Java --versions"
                sh 'java --version'
            }

        }

        stage('Docker-version'){

            steps{
                echo "Docker --version"
                sh 'docker --version'
            }
        }
    }
}