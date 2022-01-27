package com.marvelcatalog.data.repository

import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.common.Result

interface CharacterRepository {

    suspend fun getCharacters(page: Int): Result<List<Character>>
}