pipeline {
    agent any
    parameters {
        choice(name: 'SCRIPT_NAME', choices: ['build.groovy', 'deploy.groovy'], description: 'Select RTS pipeline script')
    }
    stages {
        stage('Run RTS Pipeline') {
            steps {
                script {
                    // Load the script from RTS repo
                    def rtsScript = load(SCRIPT_NAME)
                    rtsScript.run()
                }
            }
        }
    }
}
