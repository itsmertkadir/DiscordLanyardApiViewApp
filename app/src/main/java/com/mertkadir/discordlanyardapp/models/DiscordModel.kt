package com.mertkadir.discordlanyardapp.models

import com.google.gson.annotations.SerializedName

data class DiscordModel(

    @SerializedName("success") val success : Boolean?,
    @SerializedName("data") val data : Data?

)
