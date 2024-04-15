#!/usr/bin/env groovy

def call(String name = 'human') {
    // In here default value is set to 'human'
    // echo "Hello, ${name}."
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
