node {
    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/main']],
        userRemoteConfigs: [[url: 'git@github.com:your-org/rts-repo.git']]
    ])

    load('pipelines/build.groovy')  // Change to your Groovy file
}
