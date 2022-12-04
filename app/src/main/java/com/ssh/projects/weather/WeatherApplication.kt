package com.ssh.projects.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

<<<<<<< HEAD
class WeatherApplication : Application() {

    companion object {

        const val TOKEN = "dEfVVxt2S5HR7yME" // 填入你申请到的令牌值

=======
class WeatherApplication :Application() {
    companion object{
        const val TOKEN = "dEfVVxt2S5HR7yME"
>>>>>>> 0606f019201e781e038d462162a1fd694c4bc4a2
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
<<<<<<< HEAD
        context = applicationContext
    }

=======
        context=applicationContext
    }
>>>>>>> 0606f019201e781e038d462162a1fd694c4bc4a2
}