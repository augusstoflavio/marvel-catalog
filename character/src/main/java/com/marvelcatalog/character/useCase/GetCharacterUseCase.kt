package com.marvelcatalog.character.useCase

import com.marvelcatalog.character.data.repository.CharacterRepository
import com.marvelcatalog.character.data.commom.Result
import com.marvelcatalog.character.data.model.Character

class GetCharacterUseCase(private val characterRepository: CharacterRepository) {

    suspend operator fun invoke(page: Int): Result<List<Character>> {
        if (page <= 0) {
            return Result.Error(
                InvalidPageNumberException()
            )
        }

        return characterRepository.getCharacters(page)
    }
}