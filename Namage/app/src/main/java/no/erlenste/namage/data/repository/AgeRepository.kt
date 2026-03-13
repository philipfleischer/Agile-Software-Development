package no.erlenste.namage.data.repository

import no.erlenste.namage.data.datasource.AgeDataSource
import no.erlenste.namage.data.models.AgeResponse

class AgeRepository {

    private val ageDatasource = AgeDataSource()

    suspend fun getAge(name: String): AgeResponse {
        return ageDatasource.getAgeResponse(name)
    }
}