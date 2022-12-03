package com.ssh.projects.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class WeatherApplication :Application() {
    companion object{
        const val TOKEN = "dEfVVxt2S5HR7yME"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}