package com.mertkadir.discordlanyardapp.models

import com.google.gson.annotations.SerializedName

data class DiscordUser(

    @SerializedName("username") val username : String?,
    @SerializedName("public_flags") val public_flags : Int?,
    @SerializedName("id") val id : Long?,
    @SerializedName("global_name") val global_name : String?,
    @SerializedName("display_name") val display_name : String?,
    @SerializedName("discriminator") val discriminator : Int?,
    @SerializedName("bot") val bot : Boolean?,
    @SerializedName("avatar_decoration") val avatar_decoration : String?,
    @SerializedName("avatar") val avatar : String?
)