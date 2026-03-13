package no.erlenste.namage.data.models

import kotlinx.serialization.Serializable

@Serializable
data class AgeResponse(val count: String, val name: String, val age: Int)