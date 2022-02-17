package com.marvelcatalog.character.data.model

data class Character(
    val id: Int,
    val name: String,
    val description: String? = null,
    val thumbnail: String? = null
)
