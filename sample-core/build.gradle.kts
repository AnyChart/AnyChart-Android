plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.anychart.samplecore"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.anychart.samplecore"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "0.1.0"
    }

    buildFeatures { compose = true }

    buildTypes {
        release { isMinifyEnabled = false }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

kotlin {
    compilerOptions { jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17) }
}

dependencies {
    implementation(project(":anychart-core"))
    implementation(project(":anychart-dsl"))
    implementation(project(":anychart")) // 1.x, for the side-by-side benchmark only
    implementation(project(":anychart-compose"))
    val bom = platform(libs.compose.bom)
    implementation(bom)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.recyclerview)
    implementation(libs.compose.ui)
    implementation(libs.compose.foundation)
    implementation(libs.compose.material3)
    implementation(libs.compose.ui.tooling.preview)
    debugImplementation(libs.compose.ui.tooling)
}

// INTEG-9 rule: the sample is DSL code only. No JSON config literal, no config file read, no org.json.
val noJsonConfigs by tasks.registering {
    val sources = layout.projectDirectory.dir("src/main/kotlin")
    inputs.dir(sources)
    doLast {
        val rule = Regex("""\{\s*\\?"(chart|gauge|map|gantt)\\?"|\.json"|import org\.json""")
        val hits = sources.asFileTree.matching { include("**/*.kt") }.files.sorted().flatMap { f ->
            f.readLines().mapIndexedNotNull { i, line -> if (rule.containsMatchIn(line)) "${f.name}:${i + 1}: ${line.trim()}" else null }
        }
        if (hits.isNotEmpty()) throw GradleException("JSON config in sample-core; write it in the DSL:\n" + hits.joinToString("\n"))
    }
}
tasks.named("preBuild") { dependsOn(noJsonConfigs) }
