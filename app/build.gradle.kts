plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.dagger.hilt)
    alias(libs.plugins.google.services)

    alias(libs.plugins.ksp)
    id ("io.realm.kotlin")
}

android {
    namespace = "com.example.dairyapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.dairyapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // Compose Navigation
    implementation (libs.androidx.navigation.compose)

    // Firebase
    implementation (libs.firebase.auth.ktx)
    implementation (libs.firebase.storage.ktx)

    // Room components
    implementation (libs.androidx.room.runtime)
    ksp (libs.androidx.room.compiler)
    implementation (libs.androidx.room.ktx)

    // Runtime Compose
    implementation (libs.androidx.lifecycle.runtime.compose)

    // Splash API
    implementation (libs.androidx.core.splashscreen)

    // Mongo DB Realm
    implementation (libs.kotlinx.coroutines.core)
    implementation (libs.library.sync)

    // Dagger Hilt
    implementation (libs.hilt.android)
    //implementation (libs.hilt.android.compiler)
    ksp (libs.hilt.compiler)
    implementation (libs.androidx.hilt.navigation.compose)




    // Coil
    implementation (libs.coil.compose)

    // Pager - Accompanist [DEPRECATED]
    //implementation "com.google.accompanist:accompanist-pager:0.27.0"

    // Date-Time Picker
    implementation (libs.core)

    // CALENDAR
    implementation (libs.calendar)

    // CLOCK
    implementation (libs.clock)

    // Message Bar Compose
    implementation (libs.messagebarcompose)

    // One-Tap Compose
    implementation (libs.onetapcompose)

    // Desugar JDK
    coreLibraryDesugaring (libs.desugar.jdk.libs)

}
