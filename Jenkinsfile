stage('Test Python and Boto3') {
    steps {
        withCredentials([
            [$class: 'AmazonWebServicesCredentialsBinding',
             credentialsId: 'AWS']
        ]) {
            sh '''
                python3 --version
                python3 -c "import boto3; print('Boto3 version:', boto3.__version__)"
            '''
        }
    }
}