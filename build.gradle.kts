buildscript {
    val kotlin_version by extra("1.8.0")
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.6")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.0")
    }
    repositories {
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "8.0.2" apply false
    id("com.android.library") version "8.0.2" apply false
    id("org.jetbrains.kotlin.android") version Versions.KOTLIN apply false
}

tasks.register("clean") {
    delete(rootProject.buildDir)
}
