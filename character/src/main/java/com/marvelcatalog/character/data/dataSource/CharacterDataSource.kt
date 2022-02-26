package com.marvelcatalog.character.data.dataSource

import com.marvelcatalog.character.api.Character
import com.marvelcatalog.character.core.model.Result

interface CharacterDataSource {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacterDetail(characterId: Int): Result<Character>
}