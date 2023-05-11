package com.mertkadir.discordlanyardapp.models

import com.google.gson.annotations.SerializedName

data class Activities(

    @SerializedName("type") val type : Int?,
    @SerializedName("state") val state : String?,
    @SerializedName("name") val name : String?,
    @SerializedName("id") val id : String?,
    @SerializedName("created_at") val created_at : Long?

)