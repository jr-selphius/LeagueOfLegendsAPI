package com.selphius.jr.lol_api_wrapper.staticdata

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LeagueStaticDataService {

    /**
     * Retrieves champion list
     *
     */
    @GET("/lol/static-data/v3/champions")
    fun getChampions(@Query("tags") tags: Set<String>,
                     @Query("locale") locale: String,
                     @Query("version") version: String,
                     @Query("runeData") runeData: Set<String>)
            : Call<ChampionListDto>

    /**
     * Retrieve champion by ID
     *
     */
    @GET("/lol/static-data/v3/champions/{id}")
    fun getChampions(@Path("id") id: Long,
                     @Query("tags") tags: Set<String>,
                     @Query("locale") locale: String,
                     @Query("version") version: String,
                     @Query("runeData") runeData: Set<String>) : Call<ChampionDto>



}