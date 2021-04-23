@file:Suppress("unused")

package com.chrynan.imagery.android

import android.content.Context
import android.media.MediaMetadataRetriever
import android.net.Uri
import com.chrynan.imagery.core.UriMimeTypeResolver

/**
 * An Android specific implementation of [UriMimeTypeResolver].
 */
internal class AndroidUriMimeTypeResolver(
    private val context: Context
) : UriMimeTypeResolver {

    private val supportedVideoTypes = listOf(".3gp", ".mkv", ".mp4", ".ts", ".webm", ".gifv")
    private val supportedImageTypes = listOf(".png", ".webp", ".jpg", ".jpeg", ".bmp", ".gif")
    private val supportedAudioTypes = listOf(".flav", ".flv", ".mp3")

    override suspend fun resolve(uri: String): String? {
        val androidUri = Uri.parse(uri)

        var type = context.contentResolver.getType(androidUri)

        if (type == null) {
            type = try {
                val retriever = MediaMetadataRetriever().apply {
                    setDataSource(context, androidUri)
                }

                retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_MIMETYPE)
            } catch (throwable: Throwable) {
                null
            }
        }

        if (type == null) {
            val decimalIndex = uri.lastIndexOf('.')

            if (decimalIndex != -1 && decimalIndex != uri.lastIndex) {
                val fileSuffix = uri.substring(decimalIndex)

                val audioType = supportedAudioTypes.firstOrNull { it == fileSuffix }
                val imageType = supportedImageTypes.firstOrNull { it == fileSuffix }
                val videoType = supportedVideoTypes.firstOrNull { it == fileSuffix }

                type = when {
                    audioType != null -> createAudioMimeType(audioType)
                    imageType != null -> createImageMimeType(imageType)
                    videoType != null -> createVideoMimeType(videoType)
                    else -> null
                }
            }
        }

        if (type.isNullOrBlank()) {
            type = null
        }

        return type
    }

    private fun createImageMimeType(fileSuffix: String) =
        "$PREFIX_IMAGE/${formatFileSuffix(fileSuffix)}"

    private fun createVideoMimeType(fileSuffix: String) =
        "$PREFIX_VIDEO/${formatFileSuffix(fileSuffix)}"

    private fun createAudioMimeType(fileSuffix: String) =
        "$PREFIX_AUDIO/${formatFileSuffix(fileSuffix)}"

    private fun formatFileSuffix(fileSuffix: String) =
        if (fileSuffix.startsWith('.')) fileSuffix.substring(1) else fileSuffix

    companion object {

        private const val PREFIX_IMAGE = "image"
        private const val PREFIX_VIDEO = "video"
        private const val PREFIX_AUDIO = "audio"
    }
}

/**
 * Creates an instance of a [UriMimeTypeResolver] using the provided [context].
 */
fun UriMimeTypeResolver(context: Context): UriMimeTypeResolver = AndroidUriMimeTypeResolver(context)
