@Library('quality-lib@test') _

// streamingPipeline('pom.xml', 'prod-repo')
// myPipeline()
buildStreaming(
    branchName: env.BRANCH_NAME,
    gradleHome: "/home/nonroot/.gradle",
    nexusUsername: credentials('nexus-username'),
    nexusPassword: credentials('nexus-password')
