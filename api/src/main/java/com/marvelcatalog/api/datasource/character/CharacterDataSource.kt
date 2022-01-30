package com.marvelcatalog.api.datasource.character

import com.marvelcatalog.api.mapper.character.CharacterMapper
import com.marvelcatalog.api.Network
import com.marvelcatalog.data.dataSource.CharacterDataSource

class CharacterDataSource(
    private val characterApi: CharacterApi,
    private val network: Network
): CharacterDataSource {

    override suspend fun getCharacters(page: Int) = network.request {
        characterApi.getCharacters(page).data.results.map {
            CharacterMapper.responseToModel(it)
        }
    }

    override suspend fun getCharacterDetail(characterId: Int) = network.request {
        characterApi.getCharacterDetail(characterId).data.results.map {
            CharacterMapper.responseToModel(it)
        }.first()
    }
}