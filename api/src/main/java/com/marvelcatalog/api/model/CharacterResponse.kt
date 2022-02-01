package com.marvelcatalog.api.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CharacterDataWrapper (
    @SerialName("data")
    val data: CharacterDataContainerResponse
)

@Serializable
data class CharacterDataContainerResponse (
    @SerialName("offset")
    val offset: Int,
    @SerialName("limit")
    val limit: Int,
    @SerialName("total")
    val total: Int,
    @SerialName("count")
    val count: Int,
    @SerialName("results")
    val results: List<CharacterResponse>
)

@Serializable
data class CharacterResponse (
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String?,
    @SerialName("description")
    val description: String?,
    @SerialName("thumbnail")
    val thumbnail: String?,
)