package com.ssh.projects.weather.logic.network

<<<<<<< HEAD
import com.ssh.projects.weather.WeatherApplication
import com.ssh.projects.weather.logic.model.PlaceResponse
import retrofit2.Call
=======

import com.ssh.projects.weather.WeatherApplication
import com.ssh.projects.weather.logic.model.PlaceResponse
import retrofit2.Call

>>>>>>> 0606f019201e781e038d462162a1fd694c4bc4a2
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
<<<<<<< HEAD

    @GET("v2/place?token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

=======
    @GET("v2/place?&token=${WeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlace(@Query("query") query:String): Call<PlaceResponse>
>>>>>>> 0606f019201e781e038d462162a1fd694c4bc4a2
}