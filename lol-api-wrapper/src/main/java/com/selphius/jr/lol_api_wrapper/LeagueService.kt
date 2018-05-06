package com.selphius.jr.lol_api_wrapper

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LeagueService {

    /**
     * Get all champions mastery entries sorted by number of champion points descending
     *
     */
    @GET("/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}")
    fun getMasteries(@Path("summonerId") summonerId: Int): Call<List<ChampionMasteryDTO>>


    /**
     * Get a champion mastery by player ID and champion ID.
     *
     */
    @GET("/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}/by-champion/{championId}")
    fun getMasteries(
            @Path("summonerId") summonerId: Int,
            @Path("summonerId") championId: Int)
            : Call<ChampionMasteryDTO>


    /**
     * Get a player's total champion mastery score, which is the sum of individual champion mastery levels
     *
     */
    @GET("/champion-mastery/v3/scores/by-summoner/{summonerId}")
    fun getChampionMasteryScore(@Path("summonerId") summonerId: Int): Call<Int>

}