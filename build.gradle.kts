// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}
buildscript {
    repositories {
        google()

    }
    dependencies {
        classpath("com.google.gms:google-services:4.3.15")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
    }
}