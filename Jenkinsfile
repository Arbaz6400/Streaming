node {
    deleteDir()
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],
        userRemoteConfigs: [[url: 'https://github.com/Arbaz6400/rts.git']]
    ])
    sh 'ls -R'

    def scriptContent = readFile(file: 'test.groovy', encoding: 'UTF-8')
    evaluate(scriptContent)
}
