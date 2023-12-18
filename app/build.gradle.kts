
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.pokedex"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.pokedex"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        buildFeatures {
            dataBinding = true
        }
        buildFeatures {
            viewBinding = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.fragment:fragment-ktx:1.3.6")



    implementation ("com.squareup.picasso:picasso:2.71828")

    implementation ("com.google.code.gson:gson:2.8.6")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.9.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.5.1")
    implementation ("com.google.android.material:material:1.7.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

    // Fragment (para facilitar la creacion de viewmodel)
    implementation ("androidx.fragment:fragment-ktx:1.5.4")
    // Activity
    implementation ("androidx.activity:activity-ktx:1.6.0")
    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    // Retrofit & Gson
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    // Picasso
    implementation ("com.squareup.picasso:picasso:2.71828")
    // LottieFiles
    implementation ("com.airbnb.android:lottie:3.4.0")
    // shimmer
    implementation ("com.facebook.shimmer:shimmer:0.5.0")

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.4")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.0")
}







