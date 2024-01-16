/*
 * This file was generated by the Gradle 'init' task.
 */

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("com.github.johnrengelman.shadow") version "7.1.2"
    java
    application
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("io.netty:netty-all:4.1.72.Final")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("commons-lang:commons-lang:2.6")
    implementation("com.password4j:password4j:1.6.0")
    implementation("software.amazon.awssdk:dynamodb:2.17.237")
    implementation("software.amazon.awssdk:dynamodb-enhanced:2.17.237")

    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.10.0"))
    // define any required OkHttp artifacts without version
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")

}

application {
    mainClass.set("com.elvarg.Server")
}

tasks.withType<ShadowJar> {
    archiveFileName.set("app.jar")
}

group = "Elvarg"
version = "1.0-SNAPSHOT"
description = "Elvarg-Game-Server"
java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17