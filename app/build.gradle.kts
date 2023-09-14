plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hphuc5453.dji_sdk_example"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.hphuc5453.dji_sdk_example"
        minSdk = 24
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
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
    packaging {
        packaging.jniLibs.keepDebugSymbols.add("**/libdjivideo.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libSDKRelativeJNI.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libFlyForbid.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libduml_vision_bokeh.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libyuv2.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libGroudStation.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libFRCorkscrew.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libUpgradeVerify.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libFR.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libDJIFlySafeCore.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libdjifs_jni.so")
        packaging.jniLibs.keepDebugSymbols.add("**/libsfjni.so")
        packaging.resources.excludes.add("META-INF/rxjava.properties")

        resources.pickFirsts.add("lib/*/libstlport_shared.so")
        resources.pickFirsts.add("lib/*/libRoadLineRebuildAPI.so")
        resources.pickFirsts.add("lib/*/libGNaviUtils.so")
        resources.pickFirsts.add("lib/*/libGNaviMapex.so")
        resources.pickFirsts.add("lib/*/libGNaviData.so")
        resources.pickFirsts.add("lib/*/libGNaviMap.so")
        resources.pickFirsts.add("lib/*/libGNaviSearch.so")
        resources.pickFirsts.add("lib/*/libDJIFlySafeCore.so")
        resources.pickFirsts.add("lib/*/libdjifs_jni.so")
        resources.pickFirsts.add("lib/*/libsfjni.so")
        resources.pickFirsts.add("lib/*/libDJIFlySafeCore.so")

        packaging.resources.excludes.add("ETA-INF/proguard/okhttp3.pro")
        packaging.resources.excludes.add("META-INF/rxjava.properties")
        packaging.resources.excludes.add("assets/location_map_gps_locked.png")
        packaging.resources.excludes.add("assets/location_map_gps_3d.png")
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    //DJI
    implementation("com.dji:dji-sdk:4.16.4")
    implementation("com.dji:dji-uxsdk:4.16.2")
    compileOnly("com.dji:dji-sdk-provided:4.16.4")
    implementation("androidx.multidex:multidex:2.0.1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("androidx.fragment:fragment-ktx:1.6.1")

//Mapbox
    implementation ("com.mapbox.mapboxsdk:mapbox-android-sdk:9.6.1")
}