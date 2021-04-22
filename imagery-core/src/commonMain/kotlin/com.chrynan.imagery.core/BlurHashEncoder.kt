package com.chrynan.imagery.core

interface BlurHashEncoder {

    suspend fun encode(
        pixels: IntArray,
        componentX: Int,
        componentY: Int,
        width: Int,
        height: Int
    ): String

    companion object
}

suspend operator fun BlurHashEncoder.invoke(
    pixels: IntArray,
    componentX: Int,
    componentY: Int,
    width: Int,
    height: Int
): String = encode(
    pixels = pixels,
    componentX = componentX,
    componentY = componentY,
    width = width,
    height = height
)
