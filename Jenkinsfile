pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the same repo where Jenkinsfile & groovies are stored
                checkout scm
            }
        }

        stage('Load and Run Scripts') {
            steps {
                script {
                    def buildScript = load 'build.groovy'
                    def deployScript = load 'deploy.groovy'
                    def utilsScript  = load 'utils.groovy'

                    buildScript.runBuild()
                    deployScript.runDeploy()
                    utilsScript.runUtils()
                }
            }
        }
    }
}
