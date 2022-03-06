package com.marvelcatalog.character.useCase

import com.marvelcatalog.character.api.Character
import com.marvelcatalog.character.data.repository.CharacterRepository
import com.marvelcatalog.character.core.model.Result
import com.marvelcatalog.character.domain.exception.InvalidPageNumberException

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