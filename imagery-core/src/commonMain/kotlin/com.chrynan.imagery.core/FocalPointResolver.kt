package com.chrynan.imagery.core

import com.chrynan.imagery.core.model.FocalPoint
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.js.JsName

/**
 * A utility that can calculate a [Result] from a [FocalPoint], which is used to determine the
 * portion of the image to display.
 */
interface FocalPointResolver {

    suspend fun resolve(
        viewWidth: Float,
        viewHeight: Float,
        imageWidth: Float,
        imageHeight: Float,
        focalPoint: FocalPoint
    ): Result

    @Serializable
    data class Result(
        @SerialName(value = "scale") val scale: Float,
        @SerialName(value = "dx") val dx: Float,
        @SerialName(value = "dy") val dy: Float,
        @SerialName(value = "view_width") val viewWidth: Float,
        @SerialName(value = "view_height") val viewHeight: Float,
        @SerialName(value = "image_width") val imageWidth: Float,
        @SerialName(value = "image_height") val imageHeight: Float,
        @SerialName(value = "focal_point") val focalPoint: FocalPoint
    )

    companion object
}

suspend operator fun FocalPointResolver.invoke(
    viewWidth: Float,
    viewHeight: Float,
    imageWidth: Float,
    imageHeight: Float,
    focalPoint: FocalPoint
): FocalPointResolver.Result = resolve(
    viewWidth = viewWidth,
    viewHeight = viewHeight,
    imageWidth = imageWidth,
    imageHeight = imageHeight,
    focalPoint = focalPoint
)

/**
 * Creates an instance of a [FocalPointResolver].
 */
@JsName("createFocalPointResolver")
fun FocalPointResolver(): FocalPointResolver = BaseFocalPointResolver()
