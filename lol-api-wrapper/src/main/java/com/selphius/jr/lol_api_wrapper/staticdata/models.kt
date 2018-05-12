package com.selphius.jr.lol_api_wrapper.staticdata

import com.selphius.jr.lol_api_wrapper.*

data class ChampionListDto(val keys: Map<String, String>,
                           val data: Map<String, ChampionDto>,
                           val version: String,
                           val type: String,
                           val format: String)

data class ChampionDto(val info: InfoDto,
                       val enemyTips: List<String>,
                       val stats: StatsDto,
                       val name: String,
                       val title: String,
                       val image: ImageDto,
                       val tags: List<String>,
                       val partype: String,
                       val skins: List<SkinDto>,
                       val passive: PassiveDto,
                       val recommended: RecommendedDto,
                       val allytips: List<String>,
                       val key: String,
                       val lore: String,
                       val id: Int,
                       val blurb: String,
                       val spells: List<ChampionSpellDto>)