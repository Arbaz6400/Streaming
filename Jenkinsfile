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

    // Load and run your pipeline from RTS repo
    load('test.groovy') // ✅ Fixed: direct path to file
}
