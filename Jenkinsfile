pipeline {
    agent any

    parameters {
        choice(
            name: 'AWS_REGION',
            choices: [
                'ap-south-1',
                'us-east-1',
                'us-east-2',
                'eu-west-1'
            ],
            description: 'Select AWS Region'
        )
    }

    stages {
        stage('Test Parameter') {
            steps {
                echo "Selected Region: ${params.AWS_REGION}"
            }
        }
    }
}