plugins { id("com.android.application") }
android {
 namespace = "quebec.culture.donnees"
 compileSdk = 35
 defaultConfig { applicationId = "quebec.culture.donnees"; minSdk = 26; targetSdk = 35; versionCode = 28; versionName = "3.6.1" }
 buildTypes { release { isMinifyEnabled = false; proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") } }
 compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
dependencies {
 testImplementation("junit:junit:4.13.2")
 testImplementation("xpp3:xpp3:1.1.4c")
}
