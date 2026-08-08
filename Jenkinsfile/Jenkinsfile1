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

        stage('Setup Python Environment') {
            steps {
                sh '''
                    rm -rf .venv

                    python3 -m venv .venv

                    .venv/bin/python --version

                    .venv/bin/pip install --upgrade pip

                    .venv/bin/pip install boto3

                    .venv/bin/python -c "import boto3; print('Boto3 version:', boto3.__version__)"
                '''
            }
        }
    }
}