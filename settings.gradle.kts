pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AnyChart-Android"

// 1.x, untouched, kept building as a check on the toolchain upgrade.
include(":anychart", ":sample")

// A9-970 proof of concept.
include(":anychart-core", ":anychart-compose", ":sample-core")
