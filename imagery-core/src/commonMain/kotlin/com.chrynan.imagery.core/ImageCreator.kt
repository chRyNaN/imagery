@file:Suppress("unused")

package com.chrynan.imagery.core

import com.chrynan.imagery.core.model.*

/**
 * An interface representing a utility that can create [Image]s by calculating and deriving its
 * data, such as the Blur Hash and the Focal Point.
 */
interface ImageCreator {

    /**
     * Creates an image from the provided values, calculating necessary data, such as the Blur Hash
     * and the Focal Point.
     */
    suspend fun create(
        uri: String,
        name: String? = null,
        mimeType: String? = null,
        isStatic: Boolean = true,
        labels: List<LocalizedText>? = null,
        accessibilityDescriptions: List<LocalizedText>? = null,
        orientation: ImageOrientation? = null,
        density: Float? = null,
        width: Float,
        height: Float,
        pixels: IntArray,
        blurHashComponentX: Int,
        blurHashComponentY: Int,
        focalPointX: Float,
        focalPointY: Float
    ): Image

    companion object
}

/**
 * A convenience function that delegates to the [ImageCreator.create] function.
 */
suspend fun ImageCreator.create(
    uri: String,
    name: String? = null,
    mimeType: String? = null,
    isStatic: Boolean = true,
    labels: List<LocalizedText>? = null,
    accessibilityDescriptions: List<LocalizedText>? = null,
    orientation: ImageOrientation? = null,
    density: Float? = null,
    width: Int,
    height: Int,
    pixels: IntArray,
    blurHashComponentX: Int,
    blurHashComponentY: Int,
    focalPointX: Int,
    focalPointY: Int
) = create(
    uri = uri,
    name = name,
    mimeType = mimeType,
    isStatic = isStatic,
    labels = labels,
    accessibilityDescriptions = accessibilityDescriptions,
    orientation = orientation,
    density = density,
    width = width.toFloat(),
    height = height.toFloat(),
    pixels = pixels,
    blurHashComponentX = blurHashComponentX,
    blurHashComponentY = blurHashComponentY,
    focalPointX = focalPointX.toFloat(),
    focalPointY = focalPointY.toFloat()
)

/**
 * A convenience function that creates an [Image] by delegating to the [Image] constructor.
 */
fun ImageCreator.create(
    uri: String,
    name: String? = null,
    mimeType: String? = null,
    isStatic: Boolean = true,
    labels: List<LocalizedText>? = null,
    accessibilityDescriptions: List<LocalizedText>? = null,
    blurHash: String? = null,
    focalPoint: FocalPoint? = null,
    size: Size? = null,
    density: Float? = null,
    orientation: ImageOrientation? = null
    // @SerialName(value = "color_palette") val colorPalette: String? = null TODO bring in colors-palette library and add the Palette class here
): Image = Image(
    uri = uri,
    name = name,
    mimeType = mimeType,
    isStatic = isStatic,
    labels = labels,
    accessibilityDescriptions = accessibilityDescriptions,
    blurHash = blurHash,
    focalPoint = focalPoint,
    size = size,
    density = density,
    orientation = orientation
)

suspend operator fun ImageCreator.invoke(
    uri: String,
    name: String? = null,
    mimeType: String? = null,
    isStatic: Boolean = true,
    labels: List<LocalizedText>? = null,
    accessibilityDescriptions: List<LocalizedText>? = null,
    orientation: ImageOrientation? = null,
    density: Float? = null,
    width: Float,
    height: Float,
    pixels: IntArray,
    blurHashComponentX: Int,
    blurHashComponentY: Int,
    focalPointX: Float,
    focalPointY: Float
): Image = create(
    uri = uri,
    name = name,
    mimeType = mimeType,
    isStatic = isStatic,
    labels = labels,
    accessibilityDescriptions = accessibilityDescriptions,
    orientation = orientation,
    density = density,
    width = width,
    height = height,
    pixels = pixels,
    blurHashComponentX = blurHashComponentX,
    blurHashComponentY = blurHashComponentY,
    focalPointX = focalPointX,
    focalPointY = focalPointY
)

/**
 * Creates an [ImageCreator] implementation using the provided values.
 */
fun ImageCreator(
    blurHashEncoder: BlurHashEncoder = BlurHashEncoder(),
    uriMimeTypeResolver: UriMimeTypeResolver,
    metadataResolver: MetadataResolver? = null
): ImageCreator = BaseImageCreator(
    blurHashEncoder = blurHashEncoder,
    uriMimeTypeResolver = uriMimeTypeResolver,
    metadataResolver = metadataResolver
)
