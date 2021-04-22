package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LocalizedText(
    @SerialName(value = "language_code") val languageCode: String = "en",
    @SerialName(value = "value") val value: String
) {

    companion object
}
