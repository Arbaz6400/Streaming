
pipeline {
    agent any
    parameters {
        string(name: 'SCRIPT_NAME', defaultValue: 'build.groovy', description: 'Which RTS Groovy to run')
    }
    stages {
        stage('Checkout RTS') {
            steps {
                checkout([$class: 'GitSCM',
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/YourOrg/rts.git']]
                ])
            }
        }
        stage('Run RTS Script') {
            steps {
                script {
                    def scriptRunner = load("${params.SCRIPT_NAME}")
                    scriptRunner.run()
                }
            }
        }
    }
}
