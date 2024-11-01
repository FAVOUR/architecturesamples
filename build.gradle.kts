// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
//
//}


plugins {
    id("org.sonarqube") version "5.1.0.4882"
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

sonar {
    properties {
        property("sonar.projectKey", "FAVOUR_architecturesamples")
        property("sonar.organization", "favour")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}