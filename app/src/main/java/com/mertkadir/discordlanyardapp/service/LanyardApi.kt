package com.mertkadir.discordlanyardapp.service

import com.mertkadir.discordlanyardapp.models.DiscordModel
import io.reactivex.Observable
import retrofit2.http.GET

interface LanyardApi {


    //https://api.lanyard.rest/v1/users/440239378158059532
    @GET("94490510688792576")
    fun getApi() : Observable<DiscordModel>

}