pipeline {
    agent any
    tools{
        maven 'maven3.6.3'
    }
    stages{
        stage('SCM Checkout'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'd8a7d834-0955-4bfe-a691-25bbca4ab26b', url: 'https://github.com/mmtspl/devops-automation.git']]])
            }
        }
        stage('Maven Build'){
            steps{
                bat 'mvn clean install'
            }
        }
    }
}