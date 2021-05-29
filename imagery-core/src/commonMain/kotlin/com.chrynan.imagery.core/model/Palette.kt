package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Palette internal constructor(
    @SerialName(value = "vibrant_swatch") val vibrantSwatch: Swatch? = null,
    @SerialName(value = "vibrant_dark_swatch") val vibrantDarkSwatch: Swatch? = null,
    @SerialName(value = "vibrant_light_swatch") val vibrantLightSwatch: Swatch? = null,
    @SerialName(value = "muted_swatch") val mutedSwatch: Swatch? = null,
    @SerialName(value = "muted_dark_swatch") val mutedDarkSwatch: Swatch? = null,
    @SerialName(value = "muted_light_swatch") val mutedLightSwatch: Swatch? = null
) {

    companion object
}
