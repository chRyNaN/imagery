@file:Suppress("unused")

package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Representation of an image that can be accessed via a [uri].
 *
 * @property [uri] The [String] used to access the image resource.
 * @property [name] The optional name of the image.
 * @property [mimeType] The MIME Type of this image. This should take the form of a full MIME Type, for example:
 * `image/png`, however, there is no guarantee that this is the case.
 * @property [isStatic] Whether this image is a static non-animating image. For instance, an
 * animated GIF is a non-static image, so this would return false.
 * @property [labels] A [List] of [LocalizedText]s representing a localized label, or description, of
 * this image.
 * @property [accessibilityDescriptions] A [List] of [LocalizedText]s representing useful
 * descriptions of this image that can be used for accessibility means, such as screen readers.
 * @property [blurHash] A blur hash [String] value used as a placeholder while the image is being
 * loaded.
 * @property [focalPoint] The [FocalPoint], or area of importance, in the image.
 * @property [size] The size of this image.
 * @property [density] The original or desired pixels per inch (PPI) density for the image. Note
 * that the rendered image may not have a matching density value because it depends on the device
 * it is being rendered to and the size of the view that is displaying the image.
 * @property [orientation] The [ImageOrientation] of this image. This should represent the
 * [ImageOrientation] of this [Image] when the image was taken. See [displayOrientation] for a more
 * detailed explanation of the differences between this [orientation] property and the
 * [displayOrientation] property.
 * @property [colorPalette] The color palette extracted from this image.
 */
@Serializable
data class Image(
    @SerialName(value = "uri") val uri: String,
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "mime_type") val mimeType: String? = null,
    @SerialName(value = "is_static") val isStatic: Boolean = true,
    @SerialName(value = "labels") val labels: List<LocalizedText>? = null,
    @SerialName(value = "accessibility_descriptions") val accessibilityDescriptions: List<LocalizedText>? = null,
    @SerialName(value = "blur_hash") val blurHash: String? = null,
    @SerialName(value = "focal_point") val focalPoint: FocalPoint? = null,
    @SerialName(value = "size") val size: Size? = null,
    @SerialName(value = "density") val density: Float? = null,
    @SerialName(value = "orientation") val orientation: ImageOrientation? = null,
    @SerialName(value = "color_palette") val colorPalette: Palette? = null,
    @SerialName(value = "metadata") val metadata: Metadata? = null
) {

    /**
     * The aspect ratio of the image. This value should always be the width of the image divided by
     * the height of the image regardless of which side is larger or what orientation the image is
     * in. This value should match the [size] width divided by the [size] height, and is provided
     * for convenience.
     */
    val aspectRatio: Float?
        get() {
            if (size == null) return null

            return size.width / size.height
        }

    /**
     * The [ImageOrientation] calculated from the dimensions of this [Image].
     *
     * Note that this is different from the [orientation] property. The [orientation] property
     * refers to the [ImageOrientation] when the [Image] was taken, this refers to the
     * [ImageOrientation] when the [Image] is displayed. These can be the same or different values.
     * For instance, an [Image] that was taken in portrait mode might have pixels added to the
     * sides of the [Image] so that the width equals the height. In this case, the
     * [displayOrientation] property would return [ImageOrientation.SQUARE] but the [orientation]
     * property would return [ImageOrientation.PORTRAIT].
     *
     * @return null if the [size] property is null, [ImageOrientation.LANDSCAPE] if the [size]
     * width is greater than the [size] height, [ImageOrientation.PORTRAIT] if the [size] width is
     * less than the [size] height, [ImageOrientation.SQUARE] if the [size] width equals the [size]
     * height, [ImageOrientation.UNDEFINED] otherwise.
     */
    @Suppress("MemberVisibilityCanBePrivate")
    val displayOrientation: ImageOrientation?
        get() {
            if (size == null) return null

            return when {
                size.width > size.height -> ImageOrientation.LANDSCAPE
                size.height > size.width -> ImageOrientation.PORTRAIT
                size.width == size.height -> ImageOrientation.SQUARE
                else -> ImageOrientation.UNDEFINED
            }
        }

    companion object
}
