@file:Suppress("unused")

package com.chrynan.imagery.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsName

/**
 * A utility that can decode a BlurHash [String] into a [Result] object that contains information
 * on how to render the BlurHash image to the screen.
 */
interface BlurHashDecoder {

    suspend fun decode(
        blurHash: String?,
        width: Int,
        height: Int,
        punch: Float = 1f
    ): Result?

    /**
     * A class that is returned as a result of the [decode] function. This class contains
     * everything necessary for rendering a BlurHash to the screen as an image.
     */
    @Serializable
    data class Result(
        @SerialName(value = "blur_hash") val blurHash: String,
        @SerialName(value = "width") val width: Int,
        @SerialName(value = "height") val height: Int,
        @SerialName(value = "punch") val punch: Float,
        @SerialName(value = "pixels") val pixels: IntArray,
        @SerialName(value = "component_x") val componentX: Int,
        @SerialName(value = "component_y") val componentY: Int
    ) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Result) return false

            if (blurHash != other.blurHash) return false
            if (width != other.width) return false
            if (height != other.height) return false
            if (punch != other.punch) return false
            if (!pixels.contentEquals(other.pixels)) return false
            if (componentX != other.componentX) return false
            if (componentY != other.componentY) return false

            return true
        }

        override fun hashCode(): Int {
            var result = blurHash.hashCode()
            result = 31 * result + width.hashCode()
            result = 31 * result + height.hashCode()
            result = 31 * result + punch.hashCode()
            result = 31 * result + pixels.contentHashCode()
            result = 31 * result + componentX
            result = 31 * result + componentY
            return result
        }
    }

    companion object
}

suspend operator fun BlurHashDecoder.invoke(
    blurHash: String?,
    width: Int,
    height: Int,
    punch: Float = 1f
): BlurHashDecoder.Result? = decode(
    blurHash = blurHash,
    width = width,
    height = height,
    punch = punch
)

/**
 * Creates an instance of a [BlurHashDecoder].
 */
@JsName("createBlurHashDecoder")
fun BlurHashDecoder(): BlurHashDecoder = BaseBlurHashDecoder()
