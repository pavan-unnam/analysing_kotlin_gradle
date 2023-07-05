plugins {
    id("org.sonarqube") version "4.2.1.3168"
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}

sonar {
    properties {
        property("sonar.projectKey", "pavan-unnam_analysing_kotlin_gradle_AYkh1X8KqJDZhZ59osQq")
        property("sonar.projectName", "analysing_kotlin_gradle")
    }
}