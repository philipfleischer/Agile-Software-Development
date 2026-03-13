package no.erlenste.namage.data.datasource

import io.ktor.client.call.body
import io.ktor.client.request.get
import no.erlenste.namage.data.models.AgeResponse
import no.erlenste.namage.data.network.KtorClient

class AgeDataSource {

    //https://agify.io/documentation#overview

    //https://api.agify.io/?name=erlend


    suspend fun getAgeResponse(name: String): AgeResponse {
        val httpResponse = KtorClient.client.get("https://api.agify.io/?name=$name")

        return httpResponse.body<AgeResponse>()
    }
}