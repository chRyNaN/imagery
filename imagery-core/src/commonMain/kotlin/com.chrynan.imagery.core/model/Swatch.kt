package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a color swatch which contains a [color] and the related [primaryOnColor] and
 * [secondaryOnColor] which can be used to overlap the [color] with enough contrast. A color
 * [Swatch] is typically extracted from an image by looking at it's pixel data.
 *
 * @property [color] The primary [Color] for this swatch.
 * @property [primaryOnColor] The primary color that can be used on top of the [color] value. For
 * instance, when displaying text over the [color] value, this value can be used.
 * @property [secondaryOnColor] The secondary color that can be used on top of the [color] value.
 * For instance, when displaying text over the [color] value, this value can be used.
 * @property [population] The number of pixels represented by this swatch in an underlying image.
 */
@Serializable
data class Swatch(
    @SerialName(value = "color") val color: Int,
    @SerialName(value = "primary_on_color") val primaryOnColor: Int,
    @SerialName(value = "secondary_on_color") val secondaryOnColor: Int,
    @SerialName(value = "population") val population: Int? = null
) {

    companion object
}
