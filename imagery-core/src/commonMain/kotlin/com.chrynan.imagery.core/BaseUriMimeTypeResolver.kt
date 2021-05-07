package com.chrynan.imagery.core

abstract class BaseUriMimeTypeResolver : UriMimeTypeResolver {

    private val supportedVideoTypes = listOf(".3gp", ".mkv", ".mp4", ".ts", ".webm", ".gifv")
    private val supportedImageTypes = listOf(".png", ".webp", ".jpg", ".jpeg", ".bmp", ".gif")
    private val supportedAudioTypes = listOf(".flav", ".flv", ".mp3")

    private fun createImageMimeType(fileSuffix: String) =
        "$PREFIX_IMAGE/${formatFileSuffix(fileSuffix)}"

    private fun createVideoMimeType(fileSuffix: String) =
        "$PREFIX_VIDEO/${formatFileSuffix(fileSuffix)}"

    private fun createAudioMimeType(fileSuffix: String) =
        "$PREFIX_AUDIO/${formatFileSuffix(fileSuffix)}"

    private fun formatFileSuffix(fileSuffix: String) =
        if (fileSuffix.startsWith('.')) fileSuffix.substring(1) else fileSuffix

    protected fun getMimeTypeFromUriPath(uri: String): String? {
        val decimalIndex = uri.lastIndexOf('.')

        return if (decimalIndex != -1 && decimalIndex != uri.lastIndex) {
            getMimeTypeFromFileSuffix(fileSuffix = uri.substring(decimalIndex))
        } else {
            null
        }
    }

    private fun getMimeTypeFromFileSuffix(fileSuffix: String): String? {
        val audioType = supportedAudioTypes.firstOrNull { it == fileSuffix }
        val imageType = supportedImageTypes.firstOrNull { it == fileSuffix }
        val videoType = supportedVideoTypes.firstOrNull { it == fileSuffix }

        return when {
            audioType != null -> createAudioMimeType(audioType)
            imageType != null -> createImageMimeType(imageType)
            videoType != null -> createVideoMimeType(videoType)
            else -> null
        }
    }

    companion object {

        private const val PREFIX_IMAGE = "image"
        private const val PREFIX_VIDEO = "video"
        private const val PREFIX_AUDIO = "audio"
    }
}
