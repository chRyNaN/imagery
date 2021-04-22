@file:Suppress("unused")

package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An enum class that indicates the orientation of an image.
 *
 * Possible values are [PORTRAIT], [LANDSCAPE], [SQUARE], and [UNDEFINED].
 */
@Serializable
enum class ImageOrientation(val typeName: String) {

    @SerialName(value = "portrait")
    PORTRAIT(typeName = "portrait"),

    @SerialName(value = "landscape")
    LANDSCAPE(typeName = "landscape"),

    @SerialName(value = "square")
    SQUARE(typeName = "square"),

    @SerialName(value = "undefined")
    UNDEFINED(typeName = "undefined");

    companion object {

        fun getByTypeName(typeName: String, ignoreCase: Boolean = true): ImageOrientation? =
            values().firstOrNull { it.typeName.equals(typeName, ignoreCase) }
    }
}
