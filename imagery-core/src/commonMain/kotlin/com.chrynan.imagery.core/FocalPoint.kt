package com.chrynan.imagery.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a coordinate, or a point of focus, in a two-dimensional plane. This is usually used
 * with images to indicate the important part of the image so that it is still shown when cropping
 * is applied.
 *
 * Note that the value of a coordinate ([x], [y]) can be a float anywhere between -1.0f and +1.0f,
 * where 0.0f is the center. An [x] value of -1.0f indicates the left edge of the image, and an [x]
 * value of 1.0f indicates the right edge. For the y axis, a [y] value of 1.0f indicates the top
 * edge of the image, and a [y] value of -1.0f indicates the bottom edge.
 *
 * Note that this is useful dependent on the scale type used on a platforms image view. For
 * instance, Android's ImageView component, provides a scaleType property that allows specifying
 * how the image should be scaled and displayed. This allows the image to scaled down to fit in the
 * view bounds. However, we can choose to crop the image using the scaleType property, in this
 * case, using a focal point would be useful so that the cropped image still displays the important
 * part of the image. For this case, we would use the Android ImageView's matrix scaleType and
 * convert this [FocalPoint] to a [Matrix].
 *
 * @property [x] The coordinate value on the horizontal axis in the two-dimensional plane. This
 * value should be between -1.0f and 1.0f.
 * @property [y] The coordinate value on the vertical axis in the two-dimensional plane. This
 * value should be between -1.0f and 1.0f.
 *
 * @see [jquery-focuspoint](https://github.com/jonom/jquery-focuspoint#1-calculate-your-images-focus-point)
 * @see [Android ImageView ScaleType](https://developer.android.com/reference/android/widget/ImageView.ScaleType)
 */
@Serializable
data class FocalPoint(
    @SerialName(value = "x") val x: Float,
    @SerialName(value = "y") val y: Float
) {

    init {
        require(x in -1.0f..1.0f)
        require(y in -1.0f..1.0f)
    }

    /**
     * The [x] coordinate value in a traditional view coordinate plane, where the origin is in the
     * top left (0, 0) and the right edge is considered 1.0f.
     *
     * This value should be between 0.0f and 1.0f, where a value of 0.0f would be the left edge of
     * the image and a value of 1.0f would be the right edge.
     */
    val viewX: Float
        get() = (x + 1) / 2

    /**
     * The [y] coordinate value in a traditional view coordinate plane, where the origin is in the
     * top left (0, 0) and the bottom edge is considered 1.0f.
     *
     * This value should be between 0.0f and 1.0f, where a value of 0.0f would be the top edge of
     * the image and a value of 1.0f would be the bottom edge.
     */
    val viewY: Float
        get() = (-y + 1) / 2

    companion object
}

/**
 * Creates a [FocalPoint] from the provided parameters.
 *
 * Note that an exception will be thrown if the [imageX] and [imageY] values are not within their
 * ranges, 0 to [imageWidth], and 0 to [imageHeight], respectively.
 *
 * @param [imageX] The x-coordinate in the image of the focal point. Note that the left side of the
 * image is 0.0f and the right side of the image is equal to [imageWidth].
 * @param [imageY] The y-coordinate in the image of the focal point. Note that the top side of the
 * image is 0.0f and the bottom side of the image is equal to [imageHeight].
 * @param [imageWidth] The width of the image.
 * @param [imageHeight] The height of the image.
 *
 * @return The resulting [FocalPoint].
 */
@Suppress("FunctionName")
fun FocalPoint(
    imageX: Float,
    imageY: Float,
    imageWidth: Float,
    imageHeight: Float
): FocalPoint {
    require(imageX in 0.0f..imageWidth)
    require(imageY in 0.0f..imageHeight)

    val x = ((imageX * 2) / imageWidth) - 1
    val y = (((imageY * 2) / imageHeight) - 1) * -1

    return FocalPoint(x = x, y = y)
}
