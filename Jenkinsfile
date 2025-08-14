pipeline {
    agent any
    parameters {
        choice(
            name: 'PIPELINE_NAME',
            choices: ['build.groovy', 'deploy.groovy'],
            description: 'Select which RTS pipeline to run'
        )
    }
    stages {
        stage('Run RTS Pipeline') {
            steps {
                script {
                    // Remote Jenkinsfile Provider fetches RTS repo into @script dir
                    def scriptPath = "${env.WORKSPACE}@script/${params.PIPELINE_NAME}"
                    echo "Loading RTS pipeline: ${scriptPath}"
                    load(scriptPath)
                }
            }
        }
    }
}
