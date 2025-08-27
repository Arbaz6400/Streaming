import groovy.xml.XmlSlurper
import org.enbd.common.NexusRest

// Dummy Jenkins steps simulation
class DummySteps {
    def echo(msg) { println msg }
    def readMavenPom(Map args) {
        def file = new File(args.file)
        def xml = new XmlSlurper().parse(file)
        return [
            groupId: xml.groupId.toString(),
            artifactId: xml.artifactId.toString(),
            version: xml.version.toString()
        ]
    }
    def nexusPublisher(Map args) {
        println "Simulating Nexus upload to ${args.nexusRepositoryId}"
        args.packages.each { pkg ->
            println "Package: ${pkg.mavenCoordinate.artifactId}-${pkg.mavenCoordinate.version}.jar"
        }
    }
}

// Initialize NexusRest with dummy steps
def steps = new DummySteps()
def nexusRest = new NexusRest(steps)

// Test upload
def pom_location = "build/publications/mavenJava/pom-default.xml"
def nexusRepository = "edp-local-release-bld"
def shadowJar = false

nexusRest.uploadReleaseProdNexus(pom_location, nexusRepository, shadowJar)
