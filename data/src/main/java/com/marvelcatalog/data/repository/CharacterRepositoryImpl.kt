package com.marvelcatalog.data.repository

import com.marvelcatalog.data.dataSource.CharacterDataSource
import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.common.Result

class CharacterRepositoryImpl(
    private val characterDataSource: CharacterDataSource
): CharacterRepository {

    override suspend fun getCharacters(page: Int): Result<List<Character>> {
        return characterDataSource.getCharacters(page)
    }

    override suspend fun getCharacter(characterId: Int): Result<Character> {
        return characterDataSource.getCharacter(characterId)
    }
}