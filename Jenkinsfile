pipeline {
    agent any

    tools {
         maven 'Maven-3.9.9'  // Updated to use the available Maven version
        jdk 'Java-21'        // Replace with your Jenkins JDK tool name
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Divyanshijoshi3/SimpleJavaApp.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
