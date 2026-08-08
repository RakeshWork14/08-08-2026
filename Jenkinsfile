pipeline {
    agent any

    stages {
        stage('Test AWS Authentication') {
            steps {
                withCredentials([
                    [$class: 'AmazonWebServicesCredentialsBinding',
                     credentialsId: 'AWS']
                ]) {
                    sh '''
                        aws sts get-caller-identity
                    '''
                }
            }
        }
    }
}