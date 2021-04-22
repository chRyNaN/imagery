package com.chrynan.imagery.core

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
