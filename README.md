# About

Ini adalah proyek latihan yang mengimplementasikan fitur online dan offline untuk membaca berita terbaru dari [NewsAPI](https://newsapi.org/v2/).

## Fitur

- **Lihat Berita Terbaru**: Pengguna dapat melihat daftar berita terbaru yang tersedia.
- **Lihat Berita Secara Offline**: Pengguna dapat melihat berita yang telah diunduh secara otomatis oleh app ke database local (harus online sebelumnya).
- **Bookmark Berita**: Pengguna dapat mem-bookmark berita.

## Instalasi

1. Clone repositori ini:
    ```bash
    git clone https://github.com/muhmuslimabdulj/newsapp-online-offline.git
    ```
2. Buka proyek di Android Studio.
3. Jalankan aplikasi di emulator atau perangkat fisik.


## Dependency dan Plugins

Proyek ini menggunakan beberapa dependency dan plugins yang didefinisikan dalam file `build.gradle.kts` di level proyek dan modul.

### Dependency

Dependency utama yang digunakan dalam proyek ini meliputi:

- **AndroidX Core**: `implementation("androidx.core:core-ktx:1.13.1")`
- **AppCompat**: `implementation("androidx.appcompat:appcompat:1.6.1")`
- **Material Design**: `implementation("com.google.android.material:material:1.12.0")`
- **ConstraintLayout**: `implementation("androidx.constraintlayout:constraintlayout:2.1.4")`
- **Lifecycle ViewModel KTX**: `implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")`
- **LiveData KTX**: `implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")`
- **Room**: `implementation("androidx.room:room-runtime:2.5.2")`
- **Glide**: `implementation("com.github.bumptech.glide:glide:4.13.2")`
- **Retrofit**: `implementation("com.squareup.retrofit2:retrofit:2.9.0")`
- **Gson Converter**: `implementation("com.squareup.retrofit2:converter-gson:2.9.0")`
- **Logging Interceptor**: `implementation("com.squareup.okhttp3:logging-interceptor:4.9.0")`
- **JUnit**: `testImplementation("junit:junit:4.13.2")`
- **AndroidX Test**: 
  - `androidTestImplementation("androidx.test.ext:junit:1.1.5")`
  - `androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")`

### Plugins

Plugins yang digunakan dalam proyek ini meliputi:

- **Android Application Plugin**: `id("com.android.application") version "8.4.0"`
- **Kotlin Android Plugin**: `id("org.jetbrains.kotlin.android") version "1.9.0"`
- **KSP Plugin**: `id("com.google.devtools.ksp") version "1.9.0-1.0.11"`

### Konfigurasi Build

Konfigurasi build didefinisikan dalam file `build.gradle.kts` di modul `app`:

- **Namespace**: `namespace = "com.mmuslimabdulj.newsapp"`
- **Compile SDK**: `compileSdk = 34`
- **Default Config**:
  - `applicationId = "com.mmuslimabdulj.newsapp"`
  - `minSdk = 21`
  - `targetSdk = 34`
  - `versionCode = 1`
  - `versionName = "1.0"`
- **Build Types**: Konfigurasi untuk build type `release`.
- **Build Features**: Mengaktifkan `viewBinding` dan `buildConfig`.
- **Compile Options**: Mengatur kompatibilitas Java.
- **Kotlin Options**: Mengatur target JVM untuk Kotlin.