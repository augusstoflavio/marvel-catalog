package com.marvelcatalog.domain.useCase

import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.model.Character
import com.marvelcatalog.data.repository.CharacterRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito

@ExperimentalCoroutinesApi
@RunWith(org.mockito.junit.MockitoJUnitRunner::class)
class GetCharacterDetailUseCaseTest {

    @Mock
    private lateinit var mockRepository: CharacterRepository

    @Test
    fun `when get character detail return Success`() {
        runBlocking {

            val result: Result<Character> = Result.Success(
                Character(
                    id = 1,
                    name = "Iron man"
                )
            )

            Mockito.`when`(
                mockRepository.getCharacter(1)
            ).thenReturn(result)

            val useCase = GetCharacterDetailUseCase(mockRepository)
            useCase.invoke(1).let {
                Assert.assertEquals(result, it)
            }
        }
    }
}