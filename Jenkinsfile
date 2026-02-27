pipeline {
    agent any

    environment {
        GITHUB_TOKEN = credentials('GITHUB_TOKEN')  // The Jenkins credential ID
        REPO = 'Leap-stream/Leap2'
        PR_ID = "${env.CHANGE_ID}"                 // Jenkins automatically sets this for PRs
    }

    stages {
        stage('Build') {
            steps {
                echo "Running simple build..."
                // Replace with your actual build commands
                sh 'echo Hello from PR build!'
            }
        }

        stage('Comment on PR') {
            steps {
                script {
                    def statusMessage = "✅ Build successful for PR #${PR_ID}"
                    sh """
                    curl -s -H "Authorization: token ${GITHUB_TOKEN}" \
                         -H "Content-Type: application/json" \
                         -X POST \
                         -d '{ "body": "${statusMessage}" }' \
                         https://api.github.com/repos/${REPO}/issues/${PR_ID}/comments
                    """
                }
            }
        }
    }

    post {
        failure {
            script {
                def statusMessage = "❌ Build failed for PR #${env.CHANGE_ID}"
                sh """
                curl -s -H "Authorization: token ${GITHUB_TOKEN}" \
                     -H "Content-Type: application/json" \
                     -X POST \
                     -d '{ "body": "${statusMessage}" }' \
                     https://api.github.com/repos/${REPO}/issues/${env.CHANGE_ID}/comments
                """
            }
        }
    }
}
