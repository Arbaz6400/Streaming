import groovy.xml.*

def pomFile = new File("pom-default.xml")
def pom_content = pomFile.getText("UTF-8")

// Mock env variable (like Jenkins would provide)
def env = [APP_VERSION: "2.3.4-SNAPSHOT"]

// Parse XML
def pom = new XmlParser().parseText(pom_content)

// Replace only <project><version>
if (pom.version) {
    pom.version[0].value = env.APP_VERSION
}

// Save updated POM
def writer = new StringWriter()
def nodePrinter = new XmlNodePrinter(new PrintWriter(writer))
nodePrinter.preserveWhitespace = true
nodePrinter.print(pom)

new File("pom-temp.xml").write(writer.toString(), "UTF-8")

// Print outputs
println "===== Original POM ====="
println pom_content
println "===== Updated POM ====="
println writer.toString()

// Extract project version safely
def extractedVersion = pom.version?.text()
println "Extracted Project Version: ${extractedVersion ?: 'Not found'}"
