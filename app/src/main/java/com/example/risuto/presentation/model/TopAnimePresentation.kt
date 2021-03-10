package com.example.risuto.presentation.model

data class TopAnimePresentation(
    val mal_id: Int,
    val rank: Int,
    val title: String,
    val url: String,
    val image_url: String,
    val type: String,
    val episodes: Int,
    val start_date: String,
    val end_date: String,
    val members: Int,
    val score: Float
)