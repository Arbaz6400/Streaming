package org.enbd.common

class NexusRest {
    def uploadReleaseProdNexus(String pomLocation, String repository, Boolean shadowJarPlugin) {
        println "Simulating upload of POM at ${pomLocation} to repository ${repository}, shadowJar=${shadowJarPlugin}"
    }
}
