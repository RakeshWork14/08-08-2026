pipeline {
    agent any

    stages {
        stage('Test AWS Authentication') {
            steps {
                withCredentials([
                    [$class: 'AmazonWebServicesCredentialsBinding',
                     credentialsId: 'aws-jenkins-lab']
                ]) {
                    sh '''
                        aws sts get-caller-identity
                    '''
                }
            }
        }
    }
}