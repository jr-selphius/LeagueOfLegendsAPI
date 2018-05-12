package com.selphius.jr.lol_api_wrapper

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface LeagueService {

    /**
     * Get all champions mastery entries sorted by number of champion points descending
     *
     */
    @GET("/lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}")
    fun getMasteries(@Path("summonerId") summonerId: Int): Call<List<ChampionMasteryDTO>>


    /**
     * Get a champion mastery by player ID and champion ID.
     *
     */
    @GET("/lol/champion-mastery/v3/champion-masteries/by-summoner/{summonerId}/by-champion/{championId}")
    fun getMasteries(
            @Path("summonerId") summonerId: Int,
            @Path("summonerId") championId: Int)
            : Call<ChampionMasteryDTO>


    /**
     * Get a player's total champion mastery score, which is the sum of individual champion mastery levels
     *
     */
    @GET("/lol/champion-mastery/v3/scores/by-summoner/{summonerId}")
    fun getChampionMasteryScore(@Path("summonerId") summonerId: Int): Call<Int>


    /**
     * Retrieve all champions
     *
     */
    @GET("/lol/platform/v3/champions")
    fun getChampions() : Call <ChampionListDto>


    /**
     * Retrieve champion by ID
     *
     */
    @GET("/lol/platform/v3/champions/{id}")
    fun getChampion(@Path("id") championId: Int) : Call<ChampionListDto>


    /**
     * Get the challenger league for given queue
     *
     */
    @GET("/lol/league/v3/challengerleagues/by-queue/{queue}")
    fun getChallengerLeagues(@Path("queue") queue: String) : Call<LeagueListDTO>


    /**
     * Get league with given ID, including inactive entries
     *
     */
    @GET("/lol/league/v3/leagues/{leagueId}")
    fun getLeague(@Path("leagueId") leagueId: String) : Call<LeagueListDTO>

    /**
     * Get the master league for given queue.
     *
     */
    @GET("/lol/league/v3/masterleagues/by-queue/{queue}")
    fun getMasterLeague(@Path("queue") queue: String) : Call<LeagueListDTO>

    /**
     * Get league positions in all queues for a given summoner ID.
     *
     */
    @GET("/lol/league/v3/positions/by-summoner/{summonerId}")
    fun getLeaguePositions(@Path("summonerId") summonerId: Long) : Call<Set<LeaguePositionDTO>>




}