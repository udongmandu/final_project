pipeline {
    agent any
    environment {
        DOCKER_IMAGE = "myapp-war"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-ssh-jenkins', url: 'git@github.com:udongmandu/final_project.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'docker run --rm -v "$PWD":/app -w /app maven:4.0.0-alpha-7 mvn clean package -DskipTests'
                }
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
                    sh '''
                    docker stop myapp || true
                    docker rm myapp || true
                    docker build --no-cache -t myapp-war .
                    '''
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    sh 'docker run -d --name myapp -p 8081:8080 myapp-war'
                }
            }
        }
    }
}
