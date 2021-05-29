@file:Suppress("unused")

package com.chrynan.imagery.core

import android.content.Context

/**
 * Creates an Android specific default [ImageCreator] with the provided [context].
 */
fun ImageCreator(
    context: Context
): ImageCreator = BaseImageCreator(
    blurHashEncoder = BlurHashEncoder(),
    uriMimeTypeResolver = AndroidUriMimeTypeResolver(context = context),
    metadataResolver = AndroidMetadataResolver()
)
