pipeline {
    agent any
    parameters {
        string(name: 'SCRIPT_NAME', defaultValue: 'build.groovy', description: 'Groovy file in RTS to run')
    }
    stages {
        stage('Run RTS Pipeline') {
            steps {
                script {
                    // Load the chosen Groovy file from RTS workspace
                    def rtsPipeline = load(SCRIPT_NAME)
                    rtsPipeline.run()
                }
            }
        }
    }
}
