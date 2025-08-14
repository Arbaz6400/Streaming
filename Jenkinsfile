pipeline {
    agent any
    stages {
        stage('Run RTS Groovy') {
            steps {
                script {
                    def scriptName = params.PIPELINE_NAME ?: 'build.groovy'
                    load("${env.WORKSPACE}@script/${scriptName}")
                }
            }
        }
    }
}
