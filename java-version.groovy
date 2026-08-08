pipeline {
    agent any
    stages {
        stage('java-version'){

            steps{
                echo "Java --version"
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