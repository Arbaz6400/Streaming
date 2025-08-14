
pipeline {
    agent any
    parameters {
        string(name: 'SCRIPT_NAME', defaultValue: 'build.groovy', description: 'Which RTS Groovy to run')
    }
    stages {
        
        stage('Run RTS Script') {
            steps {
                script {
                    def scriptRunner = load("${params.build.groovy}")
                    scriptRunner.run()
                }
            }
        }
    }
}
