pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "myapp-war"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/udongmandu/final_project.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    sh 'docker build -t myapp-war .'
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    sh 'docker stop myapp || true && docker rm myapp || true'
                    sh 'docker run -d --name myapp -p 8081:8080 myapp-war'
                }
            }
        }
    }
}
