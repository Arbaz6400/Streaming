// Checkout RTS repo
checkout([
    $class: 'GitSCM',
    branches: [[name: '*/main']],
    userRemoteConfigs: [[url: 'https://github.com/Arbaz6400/rts.git']]
])

// Run the Groovy pipeline from RTS repo
load('pipelines/build.groovy')
