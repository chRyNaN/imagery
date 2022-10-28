import com.chrynan.imagery.buildSrc.LibraryConstants
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.dokka")
    kotlin("plugin.serialization")
}

group = LibraryConstants.group
version = LibraryConstants.versionName

kotlin {
    android {
        publishAllLibraryVariants()
        publishLibraryVariantsGroupedByFlavor = true
    }
    targets {
        android()
        jvm()
        js(BOTH) {
            browser()
            nodejs()
        }
        ios()
        iosSimulatorArm64()
    }
    sourceSets {
        all {
            languageSettings {
                languageSettings.enableLanguageFeature("InlineClasses")
            }
        }
        val commonMain by getting {
            dependencies {
                // Kotlinx Serialization
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.0")

                // Kotlinx Coroutines
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

                // Colors
                api("com.chrynan.colors:colors-core:0.8.1")
                api("com.chrynan.colors:colors-palette:0.8.1")
                implementation("com.chrynan.colors:colors-serialization:0.8.1")
            }
        }
        val iosMain by sourceSets.getting
        val iosSimulatorArm64Main by sourceSets.getting
        iosSimulatorArm64Main.dependsOn(iosMain)
    }
}

android {
    compileSdk = LibraryConstants.Android.compileSdkVersion

    defaultConfig {
        minSdk = LibraryConstants.Android.minSdkVersion
        targetSdk = LibraryConstants.Android.targetSdkVersion
        versionCode = LibraryConstants.versionCode
        versionName = LibraryConstants.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].java.srcDirs("src/androidMain/kotlin")
    sourceSets["main"].res.srcDirs("src/androidMain/res")

    sourceSets["test"].java.srcDirs("src/androidTest/kotlin")
    sourceSets["test"].res.srcDirs("src/androidTest/res")
}

// Android Main Dependencies
dependencies {
    implementation("androidx.exifinterface:exifinterface:1.3.5")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

afterEvaluate {
    publishing {
        repositories {
            maven {
                url = uri("https://repo.repsy.io/mvn/chrynan/public")

                credentials {
                    username = (project.findProperty("repsyUsername")
                            ?: System.getenv("repsyUsername")) as? String
                    password = (project.findProperty("repsyToken")
                            ?: System.getenv("repsyToken")) as? String
                }
            }
        }
    }
}
