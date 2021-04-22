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
