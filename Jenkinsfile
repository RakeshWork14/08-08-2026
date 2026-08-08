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
                        echo "Testing AWS authentication..."
                        aws sts get-caller-identity
                    '''
                }
            }
        }

        stage('Test Python and Boto3') {
            steps {
                sh '''
                    echo "Testing Python..."
                    python3 --version

                    echo "Testing Boto3..."
                    python3 -c "import boto3; print('Boto3 version:', boto3.__version__)"
                '''
            }
        }
    }
}