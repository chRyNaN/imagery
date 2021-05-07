@file:Suppress("unused")

package com.chrynan.imagery.android

import android.content.Context
import android.media.MediaMetadataRetriever
import android.net.Uri
import com.chrynan.imagery.core.BaseUriMimeTypeResolver
import com.chrynan.imagery.core.UriMimeTypeResolver

/**
 * An Android specific implementation of [UriMimeTypeResolver].
 */
internal class AndroidUriMimeTypeResolver(
    private val context: Context
) : BaseUriMimeTypeResolver() {

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
            type = getMimeTypeFromUriPath(uri = uri)
        }

        if (type.isNullOrBlank()) {
            type = null
        }

        return type
    }
}

/**
 * Creates an instance of a [UriMimeTypeResolver] using the provided [context].
 */
fun UriMimeTypeResolver(context: Context): UriMimeTypeResolver = AndroidUriMimeTypeResolver(context)
