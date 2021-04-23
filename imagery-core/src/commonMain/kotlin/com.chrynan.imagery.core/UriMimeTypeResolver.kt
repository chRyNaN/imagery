@file:Suppress("unused")

package com.chrynan.imagery.core

/**
 * A Utility interface that can resolve Mime Type information about a provided [String] URI path.
 */
interface UriMimeTypeResolver {

    /**
     * Retrieves the full Mime Type (ex: "image/png") from the provided [uri] or null if no Mime
     * Type could be resolved.
     */
    suspend fun resolve(uri: String): String?
}

suspend operator fun UriMimeTypeResolver.invoke(uri: String): String? = resolve(uri = uri)
