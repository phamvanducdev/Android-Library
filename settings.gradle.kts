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
        maven {
            url = uri("https://maven.pkg.github.com/phamvanducdev/android-library/")
            credentials {
                username = System.getenv("GITHUB_PACKAGE_USERNAME") ?: "phamvanducdev"
                password = System.getenv("GITHUB_PACKAGE_TOKEN") ?: "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"
            }
        }
    }
}

rootProject.name = "Android Library"
include(":app")
include(":library")
