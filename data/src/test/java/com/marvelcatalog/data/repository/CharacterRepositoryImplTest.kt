package com.marvelcatalog.data.repository

import com.marvelcatalog.data.common.Result
import com.marvelcatalog.data.dataSource.CharacterDataSource
import com.marvelcatalog.data.model.Character
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito

@ExperimentalCoroutinesApi
@RunWith(org.mockito.junit.MockitoJUnitRunner::class)
class CharacterRepositoryImplTest {

    @Mock
    private lateinit var mockDataSource: CharacterDataSource

    private val listCharacter = listOf(
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

    @Test
    fun `when get characters return Success`() {
        runBlocking {
            val result: Result<List<Character>> = Result.Success(listCharacter)

            Mockito.`when`(
                mockDataSource.getCharacters(1)
            ).thenReturn(result)


            val repository = CharacterRepositoryImpl(mockDataSource)
            repository.getCharacters(1).let {
                Assert.assertEquals(result, it)
            }
        }
    }

    @Test
    fun `when get character detail return Success`() {
        runBlocking {
            val result: Result<Character> = Result.Success(listCharacter.first())

            Mockito.`when`(
                mockDataSource.getCharacter(1)
            ).thenReturn(result)


            val repository = CharacterRepositoryImpl(mockDataSource)
            repository.getCharacter(1).let {
                Assert.assertEquals(result, it)
            }
        }
    }
}