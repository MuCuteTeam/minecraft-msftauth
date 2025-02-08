@file:Suppress("VulnerableLibrariesLocal")

plugins {
    id("java-library")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    api(libs.guava)
    api(libs.gson)
    api(libs.http.client)
    api(libs.bcprov)
}