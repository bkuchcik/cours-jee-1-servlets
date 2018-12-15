rootProject.name = "cours-jee-1-servlets"

include("cours-servlets-java", "cours-servlets-kotlin")
includeIfExists("tp-fizz-buzz-java")
includeIfExists("tp-fizz-buzz-kotlin")

fun includeIfExists(projectName: String) {
    if (file(projectName).exists()) {
        include(projectName)
    }
}