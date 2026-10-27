plugins {
    alias(libs.plugins.android.library)
}

// Typed Kotlin configuration DSL over the JSON the runtime page accepts. Everything under
// src/main/kotlin/com/anychart/dsl/generated is written by the generator in AnyChart/Wrappers-Generator
// (branch INTEG-1-generator-2.0) and is not edited by hand; the rest of the module is.
android {
    namespace = "com.anychart.dsl"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        aarMetadata { minCompileSdk = 35 }
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        // The conformance configs are the oracle for the DSL twins: same JSON, built from Kotlin.
        getByName("test").resources.srcDir("../conformance/configs")
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    publishing {
        singleVariant("release") { withSourcesJar() }
    }
}

kotlin {
    compilerOptions { jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17) }
}

dependencies {
    // The chart roots implement anychart-core's ChartDocument, so a view loads them directly.
    api(project(":anychart-core"))
    testImplementation(libs.junit)
    testImplementation(libs.org.json)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.core)
    androidTestImplementation(libs.androidx.test.ext.junit)
}

