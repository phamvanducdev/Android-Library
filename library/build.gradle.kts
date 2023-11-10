@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.com.android.library)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.nexus.plugin)
}

mavenPublishing {
    coordinates(
        groupId = "com.github.ducpv",
        artifactId = "android-library",
        version = "1.0.0-SNAPSHOT",
    )
    pom {
        name.set("android-Library")
        description.set("Android Library by DucPV")
    }
}

android {
    namespace = "com.ducpv.android.library"
    compileSdk = 33

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
//
//
//afterEvaluate {
//    publishBuildArtifacts()
//    publishing {
//        publications {
//            release(MavenPublication) {
//                from components.release
//                groupId "com.github.ducpv"
//                artifactId "android-library"
//                version = System.getenv("GRADLE_PUBLISH_VERSION") ?: "1.0-SNAPSHOT"
//            }
//        }
//        repositories {
//            maven {
//                name = "GitHubPackages"
//                url = uri("https://maven.pkg.github.com/com.github.ducpv/android-library/")
//                credentials {
//                    username = System.getenv("GITHUB_PACKAGE_USERNAME")
//                    password = System.getenv("GITHUB_PACKAGE_TOKEN")
//                }
//            }
//        }
//    }
//}
