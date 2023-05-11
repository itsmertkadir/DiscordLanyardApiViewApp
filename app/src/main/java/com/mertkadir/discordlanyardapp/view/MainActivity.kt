package com.mertkadir.discordlanyardapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mertkadir.discordlanyardapp.R
import com.mertkadir.discordlanyardapp.models.DiscordModel
import com.mertkadir.discordlanyardapp.service.LanyardApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private val BASE_URL = "https://api.lanyard.rest/v1/users/"
    private var compositeDisposable : CompositeDisposable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //https://api.lanyard.rest/v1/users/440239378158059532


        compositeDisposable = CompositeDisposable()

        getApi()

    }


    private fun getApi() {

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build().create(LanyardApi::class.java)


        compositeDisposable?.add(retrofit.getApi()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::handleResponse)
        )


    }

    private fun handleResponse(model :DiscordModel) {

        println(model.data!!.discord_user!!.username)
        println(model.data.discord_status)

    }
}