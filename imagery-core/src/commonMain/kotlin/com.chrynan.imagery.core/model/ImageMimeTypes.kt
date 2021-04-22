@file:Suppress("unused")

package com.chrynan.imagery.core.model

/**
 * An object containing common Image MIME Types. If you would like to add more that aren't already supported, simply
 * create an extension property on this [ImageMimeTypes] object.
 */
object ImageMimeTypes {

    const val BMP = "image/bmp"
    const val GIF = "image/gif"
    const val MICROSOFT_ICON = "image/vnd.microsoft.icon"
    const val JPEG = "image/jpeg"
    const val PNG = "image/png"
    const val SVG = "image/svg+xml"
    const val TIFF = "image/tiff"
    const val WEBP = "image/webp"
    const val WBMP = "image/wbmp"
    const val ANDROID_VECTOR = "image/android+vector+xml"
}
