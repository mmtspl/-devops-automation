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
        stage('Build docker image'){
            steps{
                bat 'docker build -t mmtspl/devops-automation .'
            }
        }
        stage('Push to DockerHub'){
            steps{
                withCredentials([string(credentialsId: 'dockerhubpwd', variable: 'dockerhubpwd')]) {
                bat 'docker login -u mmtspldockerhub' -p ${dockerhubpwd}
                }
                bat 'docker push mmtspl/devops-automation'
            }
        }
    }
}