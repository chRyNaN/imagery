@file:Suppress("unused")

package com.chrynan.imagery.core

import android.graphics.Bitmap

fun createBitmap(result: BlurHashDecoder.Result): Bitmap =
    Bitmap.createBitmap(result.pixels, result.width, result.height, Bitmap.Config.ARGB_8888)

fun BlurHashDecoder.Result.toBitmap(): Bitmap = createBitmap(this)

suspend fun BlurHashDecoder.decodeToBitmap(
    blurHash: String?,
    width: Int,
    height: Int,
    punch: Float = 1f
): Bitmap? = decode(
    blurHash = blurHash,
    width = width,
    height = height,
    punch = punch
)?.toBitmap()

suspend fun BlurHashEncoder.encode(bitmap: Bitmap, componentX: Int, componentY: Int): String {
    val width = bitmap.width
    val height = bitmap.height
    val pixels = IntArray(width * height)
    bitmap.getPixels(pixels, 0, width, 0, 0, width, height)

    return encode(
        pixels = pixels,
        width = width,
        height = height,
        componentX = componentX,
        componentY = componentY
    )
}
