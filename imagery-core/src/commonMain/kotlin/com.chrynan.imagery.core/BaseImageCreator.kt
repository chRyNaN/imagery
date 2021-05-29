package com.chrynan.imagery.core

import com.chrynan.imagery.core.model.*
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope

internal class BaseImageCreator(
    private val blurHashEncoder: BlurHashEncoder = BlurHashEncoder(),
    private val uriMimeTypeResolver: UriMimeTypeResolver,
    private val metadataResolver: MetadataResolver? = null
) : ImageCreator {

    override suspend fun create(
        uri: String,
        name: String?,
        mimeType: String?,
        isStatic: Boolean,
        labels: List<LocalizedText>?,
        accessibilityDescriptions: List<LocalizedText>?,
        orientation: ImageOrientation?,
        density: Float?,
        width: Float,
        height: Float,
        pixels: IntArray,
        blurHashComponentX: Int,
        blurHashComponentY: Int,
        focalPointX: Float,
        focalPointY: Float
    ): Image = coroutineScope {
        val deferredBlurHash = async {
            blurHashEncoder.encode(
                pixels = pixels,
                width = width.toInt(),
                height = height.toInt(),
                componentX = blurHashComponentX,
                componentY = blurHashComponentY
            )
        }

        val focalPoint = FocalPoint(
            imageWidth = width,
            imageHeight = height,
            imageX = focalPointX,
            imageY = focalPointY
        )

        // TODO calculate the Color Palette

        val resolvedMimeType = mimeType ?: uriMimeTypeResolver.resolve(uri = uri)

        val metadata = metadataResolver?.resolve(uri = uri, mimeType = resolvedMimeType)

        Image(
            uri = uri,
            name = name,
            mimeType = resolvedMimeType,
            isStatic = isStatic,
            labels = labels,
            accessibilityDescriptions = accessibilityDescriptions,
            orientation = orientation,
            density = density,
            size = Size(width = width, height = height),
            focalPoint = focalPoint,
            blurHash = deferredBlurHash.await(),
            metadata = metadata
        )
    }
}
