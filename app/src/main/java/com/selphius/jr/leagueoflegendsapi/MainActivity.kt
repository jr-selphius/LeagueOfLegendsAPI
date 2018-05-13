package com.selphius.jr.leagueoflegendsapi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.selphius.jr.lol_api_wrapper.LeagueApi

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val leagueApi = LeagueApi(BuildConfig.API_KEY, LeagueApi.Regions.EUW)

        Thread {
            val execute = leagueApi.leagueService.getChampions().execute()
            val champions = execute.body()?.champions
        }.start()
    }
}
