package com.marvelcatalog.domain.useCase

import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.repository.CharacterRepository
import com.marvelcatalog.domain.exception.InvalidParameterException

class GetCharacterUseCase(private val characterRepository: CharacterRepository) {

    suspend operator fun invoke(page: Int): Result<List<Character>> {
        if (page <= 0) {
            return Result.Error(
                InvalidParameterException("A página tem que ser maior que 0")
            )
        }

        return characterRepository.getCharacters(page)
    }
}