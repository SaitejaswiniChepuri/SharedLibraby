#!/usr/bin/env groovy

def call(){
    node('python 3.8'){
        def date = new Date.parse("MMM dd HH:mm:ss yyyy zzz", "Oct  5 09:16L54 2023 GMT")
        print(date)
    }
}
// def call(String name = 'human') {
//     // In here default value is set to 'human'
//     // echo "Hello, ${name}."

//     echo "Job '${env.JOB_BASE_NAME}' , '${env.BUILD_NUMBER}' , '${env.BUILD_URL}'"
//     pipeline {
//     agent any
//     stages {
//         stage('Greetings') {
//             steps {
//                 echo 'Hello World'
//             }
//         }
//         stage('Speaking') {
//             steps {
//                 echo 'How are you....!'
//                 // input message: 'Do you want to approve the deployment?', ok: 'Yes'
//                  emailext mimeType: 'text/html',
//                  subject: "APPROVAL RQD[JENKINS] ${currentBuild.fullDisplayName}",
//                  to: "chepurisaitejaswini@gmail.com",
//                  body: '''<a href="${BUILD_URL}input">click to approve</a>'''
//             }
        
//         }
//         stage('Send off') {
//             steps {
//                 echo 'Bye....!'
//             }
//         }
//     }
// }
// }

def check(){
    return true
}
