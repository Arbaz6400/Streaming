
pipeline {
    agent any

    parameters {
        choice(
            name: 'PIPELINE_NAME',
            choices: ['build.groovy', 'deploy.groovy', 'utils.groovy'],
            description: 'Select which Groovy script to run'
        )
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Dispatcher') {
            steps {
                script {
                    load('dispatcher.groovy').runPipeline(params.PIPELINE_NAME)
                }
            }
        }
    }
}
