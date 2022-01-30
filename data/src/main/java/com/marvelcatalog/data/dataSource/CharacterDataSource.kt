package com.marvelcatalog.data.dataSource

import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.common.Result

interface CharacterDataSource {

    suspend fun getCharacters(page: Int): Result<List<Character>>
    suspend fun getCharacterDetail(characterId: Int): Result<Character>
}