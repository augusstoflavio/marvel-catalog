package com.marvelcatalog.domain.useCase

import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.repository.CharacterRepository
import com.marvelcatalog.domain.exception.InvalidPageNumberException

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