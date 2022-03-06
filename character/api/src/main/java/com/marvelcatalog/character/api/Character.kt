package com.marvelcatalog.character.api

data class Character(
    val id: Int,
    val name: String,
    val description: String? = null,
    val thumbnail: String? = null
)