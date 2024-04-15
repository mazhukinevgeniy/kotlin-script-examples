
plugins {
    kotlin("jvm") version "1.8.21"
}

repositories {
    maven { url = uri("https://repo.gradle.org/gradle/libs-releases") }
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:kotlin-build-benchmarks:1.0-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

val kotlinVersion: String by extra("1.8.21")
val kotlinCoroutinesVersion: String by extra("1.7.0-RC")

allprojects {
    repositories {
        mavenCentral()
    }
}

