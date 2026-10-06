pipeline {
    agent { label 'built-in' }

    stages {
        stage('Checkout/Prepare') {
            steps {
                checkout scm
                sh 'java -version'
                sh 'mvn -version'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }
        stage('Automated Tests') {
            steps {
                sh 'mvn -B test'
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Result') {
            steps {
                echo 'All JUnit tests passed. Build is SUCCESSFUL.'
            }
        }
    }
}
