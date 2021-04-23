@file:Suppress("unused")

package com.chrynan.imagery.core

import kotlin.js.JsName

/**
 * A utility that converts an array of pixel data to a BlurHash [String].
 */
interface BlurHashEncoder {

    suspend fun encode(
        pixels: IntArray,
        width: Int,
        height: Int,
        componentX: Int,
        componentY: Int
    ): String

    companion object
}

suspend operator fun BlurHashEncoder.invoke(
    pixels: IntArray,
    width: Int,
    height: Int,
    componentX: Int,
    componentY: Int
): String = encode(
    pixels = pixels,
    componentX = componentX,
    componentY = componentY,
    width = width,
    height = height
)

/**
 * Creates an instance of a [BlurHashEncoder].
 */
@JsName("createBlurHashEncoder")
fun BlurHashEncoder(): BlurHashEncoder = BaseBlurHashEncoder()
