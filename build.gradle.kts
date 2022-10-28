plugins {
    id("org.sonarqube") version 3.5.0.2730
    detekt
    id("com.github.ben-manes.versions") version app.web.drjackycv.buildsrc.Depends.Versions.checkDependencyVersionsVersion
    //id("com.osacky.doctor") version app.web.drjackycv.buildsrc.Depends.Versions.gradleDoctorVersion //https://issuetracker.google.com/issues/216364005#comment3
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(app.web.drjackycv.buildsrc.Depends.ClassPaths.gradle)
        classpath(
            kotlin(
                app.web.drjackycv.buildsrc.Depends.ClassPaths.kotlin_gradle_plugin,
                version = app.web.drjackycv.buildsrc.Depends.Versions.kotlinVersion
            )
        )
        classpath(app.web.drjackycv.buildsrc.Depends.ClassPaths.navigation_safe_args_gradle_plugin)
        classpath(app.web.drjackycv.buildsrc.Depends.ClassPaths.hilt_android_gradle_plugin)
        classpath(app.web.drjackycv.buildsrc.Depends.ClassPaths.sonarqube_gradle_plugin)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.google.com/")
        maven("https://jitpack.io")
        maven("https://plugins.gradle.org/m2/")
    }
}
