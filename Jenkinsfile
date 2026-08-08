pipeline {
    agent any

    stages {

        stage('AWS Authentication') {
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

        stage('Install Boto3') {
            steps {
                sh '''
                    python3 -m pip install --user boto3
                    python3 -c "import boto3; print('Boto3 version:', boto3.__version__)"
                '''
            }
        }
        stage('list AWS regions'){
            steps{
                sh '''
                   export AWS_REGION=eu-north-1
                   python3 python/list_regions.py
                '''
            }
        }
    }
}