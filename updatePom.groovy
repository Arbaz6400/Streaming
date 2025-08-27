// Load the POM file
def pom_content = new File("pom-default.xml").getText("UTF-8")

// Mock env variable (like Jenkins would provide)
def env = [APP_VERSION: "2.3.4-SNAPSHOT"]

// Replace version (with DOTALL in case of newlines)
def updatedPom = pom_content.replaceFirst(
    /(?s)<version>.*?<\/version>/,
    "<version>${env.APP_VERSION}</version>"
)

// Save to temp file
new File("pom-temp.xml").write(updatedPom, "UTF-8")

// Print outputs
println "===== Original POM ====="
println pom_content
println "===== Updated POM ====="
println updatedPom

// ✅ Extract version without matcher
def extractedVersion = updatedPom.find(/<version>(.+)<\/version>/) { full, v -> v }

if (extractedVersion) {
    println "Extracted Version: $extractedVersion"
} else {
    println "No version found!"
}
