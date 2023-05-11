package com.mertkadir.discordlanyardapp.models

import com.google.gson.annotations.SerializedName

data class Data(


    @SerializedName("spotify") val spotify : String?,
    @SerializedName("listening_to_spotify") val listening_to_spotify : Boolean?,
    @SerializedName("kv") val kv : Kv?,
    @SerializedName("discord_user") val discord_user : DiscordUser?,
    @SerializedName("discord_status") val discord_status : String?,
    @SerializedName("activities") val activities : List<Activities>?,
    @SerializedName("active_on_discord_web") val active_on_discord_web : Boolean?,
    @SerializedName("active_on_discord_mobile") val active_on_discord_mobile : Boolean?,
    @SerializedName("active_on_discord_desktop") val active_on_discord_desktop : Boolean?

)
