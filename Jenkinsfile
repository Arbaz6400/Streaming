// Checkout RTS repo
checkout([
    $class: 'GitSCM',
    branches: [[name: '*/main']],
    userRemoteConfigs: [[url: 'git@github.com:your-org/rts-repo.git']]
])

// Run the Groovy pipeline from RTS repo
load('pipelines/build.groovy')
