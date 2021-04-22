package com.chrynan.imagery.core

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * Represents a two-dimensional size of a component. Typically used to denote the size of an image.
 *
 * @property [width] The width of the image in pixels.
 * @property [height] The height of the image in pixels.
 */
@Serializable
data class Size(
    @SerialName(value = "width") val width: Float,
    @SerialName(value = "height") val height: Float
) {

    companion object
}
