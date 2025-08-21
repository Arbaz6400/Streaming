@Library('quality-lib') _



pipeline {
    agent any
    stages {
        stage('Sonar + QualityGate') {
            steps {
                // Call your pipeline from the library
                Sonar(
                    token: credentials('sonar-token-id'), // Jenkins Credentials
                    project: 'my-app',                    // projectKey in SonarQube
                    branch: 'main'                        // branch name
                )
            }
        }
    }
}
