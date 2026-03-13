package no.erlenste.namage

import kotlinx.coroutines.runBlocking
import no.erlenste.namage.data.datasource.AgeDataSource
import org.junit.Assert.assertEquals
import org.junit.Test

class AgeDataSourceTest {

    @Test
    fun testGetAgeReturnsExpectedValue() {
        val dataSource = AgeDataSource()
        runBlocking {
            val result = dataSource.getAgeResponse("John")
            assertEquals("John", result.name)
            assertEquals(75, result.age)
        }
    }
}