#!/usr/bin/env groovy

def call(String name = 'human') {
    // In here default value is set to 'human'
    // echo "Hello, ${name}."

    echo "Job '${env.JOB_BASE_NAME}' , '${env.BUILD_NUMBER}' , '${env.BUILD_URL}'"
    pipeline {
    agent any
    stages {
        stage('Greetings') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Speaking') {
            steps {
                echo 'How are you....!'
                input message: 'Do you want to approve the deployment?', ok: 'Yes'
            }
        }
        stage('Send off') {
            steps {
                echo 'Bye....!'
            }
        }
    }
}
}

def check(){
    return true
}
