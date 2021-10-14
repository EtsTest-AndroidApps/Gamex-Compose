package com.vickikbt.domain.models


data class GameDetailsResponse(
    val achievementsCount: Int?,
    val added: Int?,
    val additionsCount: Int?,
    val backgroundImage: String?,
    val backgroundImageAdditional: String?,
    val clip: String?,
    val creatorsCount: Int?,
    val description: String?,
    val descriptionRaw: String?,
    val developers: List<Developer>?,
    val dominantColor: String?,
    val esrbRating: Int?,
    val gameSeriesCount: Int?,
    val genres: List<Genre>?,
    val id: Int,
    val metacritic: Int?,
    val moviesCount: Int?,
    val name: String?,
    val nameOriginal: String?,
    val parentAchievementsCount: Int?,
    val platforms: List<Platforms>?,
    val playtime: Int?,
    val publishers: List<Publisher>?,
    val rating: Double?,
    val ratingTop: Int?,
    val ratings: List<Rating>?,
    val released: String?,
    val screenshotsCount: Int?,
    val slug: String?,
    val suggestionsCount: Int?,
    val tags: List<Tag>?,
    val tba: Boolean?,
    val updated: String?,
    //val userGame: Any?,
    val website: String?
)
