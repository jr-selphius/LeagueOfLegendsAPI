package com.selphius.jr.lol_api_wrapper

import android.os.Message

data class ChampionMasteryDTO(val chestGranted: Boolean,
                              val championLevel: Int,
                              val championPoints: Int,
                              val championId: Long,
                              val playerId: Long,
                              val championPointsUntilNextLevel: Long,
                              val tokensEarned: Int,
                              val championPointsSinceLastLevel: Int,
                              val lastPlayTime: Int)

data class ChampionListDto(val champions: List<ChampionDto>)

data class ChampionDto(val rankedPlayEnabled: Boolean,
                       val botEnabled: Boolean,
                       val botMmenabled: Boolean,
                       val active: Boolean,
                       val freeToPlay: Boolean,
                       val id: Long)

data class LeagueListDTO(val leagueId: String,
                         val tier: String,
                         val entries: List<LeagueItemDTO>,
                         val queue: String,
                         val name: String)

data class LeagueItemDTO(val rank: String,
                         val hotStreak: Boolean,
                         val miniSeries: MiniSeriesDTO,
                         val wins: Int,
                         val veteran: Boolean,
                         val losses: Int,
                         val freshBlood: Boolean,
                         val playerOrTeamName: String,
                         val inactive: Boolean,
                         val playerOrTeamId: String,
                         val leaguePoints: Int)

data class MiniSeriesDTO(val wins: Int,
                         val losses: Int,
                         val target: Int,
                         val progress: String)

data class InfoDTO(val difficulty: Int,
                   val attack: Int,
                   val deffense: Int,
                   val magic: Int)

data class StatsDTO(val armorperlevel: Double,
                    val hpperlevel: Double,
                    val attackdamage: Double,
                    val mpperlevel: Double,
                    val attackspeedoffset: Double,
                    val armor: Double,
                    val hp: Double,
                    val hpregenperlevel: Double,
                    val spellblock: Double,
                    val attackrange: Double,
                    val movespeed: Double,
                    val attackdamageperlevel: Double,
                    val mpregenperlevel: Double,
                    val mp: Double,
                    val spellblockperlevel: Double,
                    val crit: Double,
                    val mpregen: Double,
                    val attackspeedperlevel: Double,
                    val hpregen: Double,
                    val critperlevel: Double)

data class ImageDTO(val full: String,
                    val group: String,
                    val sprite: String,
                    val h: Int,
                    val w: Int,
                    val y: Int,
                    val x: Int)

data class SkinDTO(val num: Int,
                   val name: String,
                   val id: Int)

data class PassiveDTO(val image: ImageDTO,
                      val sanitizedDescription: String,
                      val name: String,
                      val description: String)

data class RecommendedDTO(val map: String,
                          val blocks: List<BlockDTO>,
                          val champion: String,
                          val title: String,
                          val priority: Boolean,
                          val mode: String,
                          val type: String)

data class BlockDTO(val items: List<BlockItemDTO>,
                    val recMath: Boolean,
                    val type: String)

data class BlockItemDTO(val count: Int,
                        val id: Int)

data class ChampionSpellDTO(val cooldownBurn: String,
                            val resource: String,
                            val leveltip: LevelTipDTO,
                            val vars: List<SpellVarsDTO>,
                            val costType: String,
                            val image: ImageDTO,
                            val sanitizedDescription: String,
                            val sanitizedTooltip: String,
                            val effect: List<List<Double>>,
                            val tooltip: String,
                            val maxrank: Int,
                            val costBurn: String,
                            val rangeBurn: String,
                            val range: List<Object>,
                            val cooldown: List<Double>,
                            val cost: List<Int>,
                            val key: String,
                            val description: String,
                            val effectBurn: List<String>,
                            val altimages: List<ImageDTO>,
                            val name: String)

data class LevelTipDTO(val effects: List<String>,
                       val label: List<String>)

data class SpellVarsDTO(val ranksWith: String,
                        val dyn: String,
                        val link: String,
                        val coeff: List<Double>,
                        val key: String)

data class ShardStatus(val name: String,
                       val region_tag: String,
                       val hostname: String,
                       val services: List<Service>,
                       val slug: String,
                       val locales: List<String>)

data class Service(val status: String,
                   val incident: List<Incident>,
                   val name: String,
                   val slug: String)

data class Incident(val active: Boolean,
                    val created_at: String,
                    val id: Long,
                    val updates: List<Message>)

data class Message(val severity: String,
                   val author: String,
                   val created_at: String,
                   val translation: List<Translation>,
                   val updated_at: String,
                   val content: String,
                   val id: String)

data class Translation(val locale: String,
                       val content: String,
                       val created_at: String)

data class MatchDTO(val seasonId: Int,
                    val queue: Int,
                    val gameId: Long,
                    val participantIdentities: List<ParticipantIdentityDTO>,
                    val gameVersion: String,
                    val platformId: String,
                    val gameMode: String,
                    val mapId: Int,
                    val gameType: String,
                    val teams: List<TeamStatsDto>,
                    val participants: List<ParticipantDto>,
                    val gameDuration: Long,
                    val gameCreation: Long)

data class ParticipantIdentityDTO(val player: PlayerDto,
                                  val participantId: Int)

data class PlayerDto(val currentPlatformId: String,
                     val summonerName: String,
                     val matchHistoryUri: String,
                     val platformId: String,
                     val currentAccountId: Long,
                     val profileIcon: Int,
                     val summonerId: Long,
                     val accountId: Long)

data class TeamStatsDto(val firstDragon: Boolean,
                        val firstInhibitor: Boolean,
                        val bans: List<TeamBansDto>,
                        val baronKills: Int,
                        val firstRifthHerald: Boolean,
                        val firstBaron: Boolean,
                        val firstHeraldKills: Int,
                        val firstBlood: Boolean,
                        val teamId: Int,
                        val firstTower: Boolean,
                        val vilemawKills: Int,
                        val inhibitorKills: Int,
                        val towerKills: Int,
                        val dominionVictoryScore: Int,
                        val win: String,
                        val dragonKills: Int)

data class TeamBansDto(val pickTurn: Int,
                       val championId: Int)

data class ParticipantDto(val stats: ParticipantStatsDto,
                          val participantId: Int,
                          val runes: List<RuneDto>,
                          val timeline: ParticipantTimelineDto,
                          val teamId: Int,
                          val spell2Id: Int,
                          val masteries: List<MasteryDto>,
                          val highestAchievedSeasonTier: String,
                          val spell1Id: Int,
                          val championId: Int)

data class ParticipantStatsDto(val physicalDamageDealt: Long,
                               val neutralMinionsKilledTeamJungle: Int,
                               val magicDamageDealt: Long,
                               val totalPlayerScore: Int,
                               val deaths: Int,
                               val win: Boolean,
                               val neutralMinionsKilledEnemyJungle: Int,
                               val altarsCaptured: Int,
                               val largestCriticalStrike: Int,
                               val totalDamageDelt: Int,
                               val magicDamageDealtToChampions: Long,
                               val visionWardsBoughtInGame: Int,
                               val damageDealtToObjectives: Long,
                               val largestKillingSpree: Int,
                               val item1: Int,
                               val quadraKills: Int,
                               val teamObjective: Int,
                               val totalTimeCrowdControlDealt: Int,
                               val longestTimeSpentLiving: Int,
                               val wardsKilled: Int,
                               val firstTowerAssist: Boolean,
                               val firstTowerKill: Boolean,
                               val item2: Int,
                               val item3: Int,
                               val item0: Int,
                               val firstBloodAssist: Boolean,
                               val visionScore: Long,
                               val wardsPlaced: Int,
                               val item4: Int,
                               val item5: Int,
                               val item6: Int,
                               val turretKills: Int,
                               val tripleKills: Int,
                               val damageSelfMitigated: Long,
                               val champLevel: Int,
                               val nodeNeutralizeAssist: Int,
                               val firstInhibitorKill: Boolean,
                               val goldEarned: Int,
                               val magicalDamageTaken: Long,
                               val kills: Int,
                               val doubleKills: Int,
                               val nodeCaptureAssist: Int,
                               val trueDamageTaken: Long,
                               val nodeNeutralize: Int,
                               val firstInhibitorAssist: Boolean,
                               val assist: Int,
                               val unrealKills: Int,
                               val neutralMinionsKilled: Int,
                               val objectivePlayerScore: Int,
                               val combatPlayerScore: Int,
                               val damageDealtToTurrets: Long,
                               val altarsNeutralized: Int,
                               val physicalDamageDealtToChampions: Long,
                               val goldSpent: Int,
                               val trueDamageDealt: Long,
                               val trueDamageDealtToChampions: Long,
                               val participantId: Int,
                               val pentaKills: Int,
                               val totalHeal: Long,
                               val totalMinionsKilled: Int,
                               val firstBloodKill: Boolean,
                               val nodeCapture: Int,
                               val largestMultiKill: Int,
                               val sightWardsBoughtInGame: Int,
                               val totalDamageDealtToChampions: Long,
                               val totalUnitsHealed: Int,
                               val inhibitorKills: Int,
                               val totalScoreRank: Int,
                               val totalDamageTaken: Long,
                               val killingSprees: Int,
                               val timeCCingOthers: Long,
                               val physicalDamageTaken: Long)

data class RuneDto(val runeId: Int,
                   val rank: Int)

data class ParticipantTimelineDto(val lane: String,
                                  val participantId: Int,
                                  val csDiffPerMinDeltas: Map<String, Double>,
                                  val goldPerMinDeltas: Map<String, Double>,
                                  val xpDiffPerMinDeltas: Map<String, Double>,
                                  val creepsPerMinDeltas: Map<String, Double>,
                                  val xpPerMinDeltas: Map<String, Double>,
                                  val role: String,
                                  val damageTakenDiffPerMinDeltas: Map<String, Double>,
                                  val damageTakenPerMinDeltas: Map<String, Double>)

data class MasteryDto(val masteryId: Int,
                      val rank: Int)

