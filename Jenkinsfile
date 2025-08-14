pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the repo containing Jenkinsfile and Groovy scripts
                checkout scm
            }
        }

        stage('Load and Run Scripts') {
            steps {
                script {
                    // Define default script for this repo
                    def DEFAULT_PIPELINE = 'build.groovy'

                    // Load dispatcher.groovy and pass default
                    def dispatcher = load('dispatcher.groovy')
                    dispatcher.runPipeline(DEFAULT_PIPELINE)

                    // Optionally, if you still want to call deploy.groovy separately
                    def deployScript = load 'deploy.groovy'
                    deployScript.runDeploy()
                }
            }
        }
    }
}
