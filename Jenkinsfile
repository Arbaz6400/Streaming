node {
    // Clean workspace
    deleteDir()

    // Checkout RTS repo into current workspace
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],  // change if your RTS repo branch is different
        userRemoteConfigs: [[url: 'https://github.com/Arbaz6400/rts.git']]
    ])

    // Verify files (for debugging)
    sh 'ls -R'

    // UTF-8 safe load
    def groovyCode = readFile(file: 'test.groovy', encoding: 'UTF-8')
    evaluate(groovyCode)
}
