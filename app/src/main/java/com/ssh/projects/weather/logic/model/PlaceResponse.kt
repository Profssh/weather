package com.ssh.projects.weather.logic.model

<<<<<<< HEAD
import com.google.gson.annotations.SerializedName

class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)
=======
import androidx.core.app.NotificationCompat
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String,val places:List<Place>)


data class Place(val name:String,val location:Location, @SerializedName("formatted_address") val address:String)

data class Location(val lng:String,val lat:String)
>>>>>>> 0606f019201e781e038d462162a1fd694c4bc4a2
