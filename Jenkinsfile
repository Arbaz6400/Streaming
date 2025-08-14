pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // This checks out the repo containing Jenkinsfile and Groovy scripts
                checkout scm
            }
        }

        stage('Load and Run Scripts') {
            steps {
                script {
                    def buildScript  = load 'build.groovy'
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
