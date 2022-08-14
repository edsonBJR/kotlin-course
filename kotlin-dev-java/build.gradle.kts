import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
}

group = "br.com.edson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url="https://jcenter.bintray.com")
}

dependencies {
    implementation("org.funktionale:funktionale-all:1.2")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.6.10")

    testImplementation(kotlin("test"))
    testImplementation ("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation ("org.amshove.kluent:kluent:1.68")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}