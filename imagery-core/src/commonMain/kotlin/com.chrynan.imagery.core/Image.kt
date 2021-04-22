package com.chrynan.imagery.core

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Representation of an image that can be accessed via a [uri].
 *
 * @property [uri] The [String] used to access the image resource.
 * @property [mimeType] The MIME Type of this image. For example: `image/png`.
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
 * @property [aspectRatio] The aspect ratio of the image. This value should always be the width of
 * the image divided by the height of the image regardless of which side is larger or what
 * orientation the image is in. This value should match the [size] width divided by the [size]
 * height, and is provided for convenience.
 * @property [density] The original or desired pixels per inch (PPI) density for the image. Note
 * that the rendered image may not have a matching density value because it depends on the device
 * it is being rendered to and the size of the view that is displaying the image.
 * @property [orientation] The [ImageOrientation] of this image. This should typically correspond
 * to the [size] property.
 * @property [colorPalette] The color palette extracted from this image.
 */
@Serializable
data class Image(
    @SerialName(value = "uri") val uri: String,
    @SerialName(value = "mime_type") val mimeType: String? = null,
    @SerialName(value = "is_static") val isStatic: Boolean = true,
    @SerialName(value = "labels") val labels: List<LocalizedText>? = null,
    @SerialName(value = "accessibility_descriptions") val accessibilityDescriptions: List<LocalizedText>? = null,
    @SerialName(value = "blur_hash") val blurHash: String? = null,
    @SerialName(value = "focal_point") val focalPoint: FocalPoint? = null,
    @SerialName(value = "size") val size: Size? = null,
    @SerialName(value = "aspect_ratio") val aspectRatio: Float? = null,
    @SerialName(value = "density") val density: Float? = null,
    @SerialName(value = "orientation") val orientation: ImageOrientation? = null
    // @SerialName(value = "color_palette") val colorPalette: String? = null TODO bring in colors-palette library and add the Palette class here
) {

    companion object
}
