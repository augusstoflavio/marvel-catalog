package com.marvelcatalog.character.useCase

import com.marvelcatalog.character.data.repository.CharacterRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import com.marvelcatalog.character.data.commom.Result
import com.marvelcatalog.character.data.model.Character
import com.marvelcatalog.character.useCase.exception.InvalidPageNumberException

@ExperimentalCoroutinesApi
@RunWith(org.mockito.junit.MockitoJUnitRunner::class)
class GetCharacterUseCaseTest {

    @Mock
    private lateinit var mockRepository: CharacterRepository

    @Test
    fun `when get character with invalid page return Error`() {
        runBlocking {
            val useCase = GetCharacterUseCase(mockRepository)
            useCase.invoke(0).let {
                Assert.assertTrue(it is Result.Error)
                Assert.assertTrue((it as Result.Error).exception is InvalidPageNumberException)
            }
        }
    }

    @Test
    fun `when get character with page return Success`() {
        runBlocking {

            val result: Result<List<Character>> = Result.Success(
                listOf(
                    Character(
                        id = 1,
                        name = "Iron man"
                    ),
                    Character(
                        id = 2,
                        name = "Thor"
                    ),
                    Character(
                        id = 3,
                        name = "Spider man"
                    ),
                )
            )

            Mockito.`when`(
                mockRepository.getCharacters(1)
            ).thenReturn(result)

            val useCase = GetCharacterUseCase(mockRepository)
            useCase.invoke(1).let {
                Assert.assertEquals(result, it)
            }
        }
    }
}