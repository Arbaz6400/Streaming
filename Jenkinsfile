node {
    def pipelineName = params.PIPELINE_NAME ?: 'build.groovy'
    
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],
        userRemoteConfigs: [[url: 'https://github.com/Arbaz6400/rts.git']]
    ])

    load("pipelines/${pipelineName}")
}
