package com.marvelcatalog.domain.useCase

import com.marvelcatalog.data.repository.CharacterRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.model.Character
import com.marvelcatalog.domain.exception.InvalidParameterException
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.mockito.Mockito

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
                Assert.assertTrue((it as Result.Error).exception is InvalidParameterException)
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