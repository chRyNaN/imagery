package com.chrynan.imagery.core

import com.chrynan.imagery.core.model.Metadata
import com.chrynan.imagery.core.model.Image

/**
 * A utility that retrieves [Metadata] from an [Image].
 */
interface MetadataResolver {

    /**
     * Retrieves [Metadata] from an [Image] defined by the provided [uri] and [mimeType]. If the
     * [Metadata] cannot be obtained, then null is returned.
     */
    suspend fun resolve(uri: String, mimeType: String? = null): Metadata?

    companion object
}

suspend operator fun MetadataResolver.invoke(uri: String, mimeType: String? = null): Metadata? =
    resolve(uri = uri, mimeType = mimeType)
