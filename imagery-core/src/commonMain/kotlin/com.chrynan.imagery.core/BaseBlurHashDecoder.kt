package com.chrynan.imagery.core

import com.chrynan.imagery.core.util.decodeAc
import com.chrynan.imagery.core.util.decodeBase83
import com.chrynan.imagery.core.util.decodeDc
import com.chrynan.imagery.core.util.linearToSrgb
import kotlin.math.PI
import kotlin.math.cos

internal class BaseBlurHashDecoder : BlurHashDecoder {

    override suspend fun decode(blurHash: String?, width: Int, height: Int, punch: Float): BlurHashDecoder.Result? {
        require(width > 0) { "Width must be greater than zero." }
        require(height > 0) { "Height must be greater than zero." }

        if (blurHash == null || blurHash.length < 6) return null

        val numCompEnc = blurHash.decodeBase83(0, 1)
        val componentX = (numCompEnc % 9) + 1
        val componentY = (numCompEnc / 9) + 1

        if (blurHash.length != 4 + 2 * componentX * componentY) return null

        val maxAcEnc = blurHash.decodeBase83(1, 2)
        val maxAc = (maxAcEnc + 1) / 166f
        val colors = Array(componentX * componentY) { i ->
            if (i == 0) {
                val colorEnc = blurHash.decodeBase83(2, 6)
                decodeDc(colorEnc)
            } else {
                val from = 4 + i * 2
                val colorEnc = blurHash.decodeBase83(from, from + 2)
                decodeAc(colorEnc, maxAc * punch)
            }
        }
        val imageArray = convertColorsToImageArray(
            colorsArray = colors,
            width = width,
            height = height,
            componentX = componentX,
            componentY = componentY
        )

        return BlurHashDecoder.Result(
            blurHash = blurHash,
            width = width,
            height = height,
            punch = punch,
            pixels = imageArray,
            componentX = componentX,
            componentY = componentY
        )
    }

    private fun convertColorsToImageArray(
        colorsArray: Array<FloatArray>,
        width: Int,
        height: Int,
        componentX: Int,
        componentY: Int
    ): IntArray {
        val imageArray = IntArray(width * height)

        for (y in 0 until height) {
            for (x in 0 until width) {
                var r = 0f
                var g = 0f
                var b = 0f

                for (j in 0 until componentY) {
                    for (i in 0 until componentX) {
                        val basis = (cos(PI * x * i / width) * cos(PI * y * j / height)).toFloat()
                        val color = colorsArray[j * componentX + i]
                        r += color[0] * basis
                        g += color[1] * basis
                        b += color[2] * basis
                    }
                }

                val colorInt = (255 shl 24) or // Alpha
                        (linearToSrgb(r) shl 16) or // Red
                        (linearToSrgb(g) shl 8) or // Green
                        linearToSrgb(b) // Blue

                imageArray[x + width * y] = colorInt
            }
        }

        return imageArray
    }
}
