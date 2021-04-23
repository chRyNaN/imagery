@file:Suppress("unused")

package com.chrynan.imagery.core

import kotlin.js.JsName

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

@JsName("createBlurHashEncoder")
fun BlurHashEncoder(): BlurHashEncoder = BaseBlurHashEncoder()
