package com.chrynan.imagery.core

import com.chrynan.imagery.core.util.*
import com.chrynan.imagery.core.util.encodeAC
import com.chrynan.imagery.core.util.encodeBase83
import com.chrynan.imagery.core.util.encodeDC
import com.chrynan.imagery.core.util.max
import kotlin.math.*

internal class BaseBlurHashEncoder : BlurHashEncoder {

    override suspend fun encode(pixels: IntArray, width: Int, height: Int, componentX: Int, componentY: Int): String {
        require(!(componentX < 1 || componentX > 9 || componentY < 1 || componentY > 9)) { "Blur hash must have between 1 and 9 components." }
        require(width * height == pixels.size) { "Width and height must match the pixels array." }

        val factors = Array(componentX * componentY) { FloatArray(3) }

        for (j in 0 until componentY) {
            for (i in 0 until componentX) {
                val normalisation = if (i == 0 && j == 0) 1f else 2f
                applyBasisFunction(
                    pixels, width, height, normalisation, i, j, factors,
                    j * componentX + i
                )
            }
        }

        val hash = CharArray(1 + 1 + 4 + 2 * (factors.size - 1)) // size flag + max AC + DC + 2 * AC components
        val sizeFlag = componentX - 1 + (componentY - 1) * 9
        sizeFlag.encodeBase83(1, hash, 0)

        val maximumValue: Float
        if (factors.size > 1) {
            val actualMaximumValue = max(factors, 1, factors.size)
            val quantisedMaximumValue = floor(max(0f, min(82f, floor(actualMaximumValue * 166 - 0.5f))))

            maximumValue = (quantisedMaximumValue + 1) / 166

            round(quantisedMaximumValue).toInt().encodeBase83(1, hash, 1)
        } else {
            maximumValue = 1f

            0.encodeBase83(1, hash, 1)
        }

        val dc = factors[0]
        encodeDC(dc).encodeBase83(4, hash, 2)

        for (i in 1 until factors.size) {
            encodeAC(factors[i], maximumValue).encodeBase83(2, hash, 6 + 2 * (i - 1))
        }

        return hash.concatToString()
    }

    private fun applyBasisFunction(
        pixels: IntArray,
        width: Int,
        height: Int,
        normalisation: Float,
        i: Int,
        j: Int,
        factors: Array<FloatArray>,
        index: Int
    ) {
        var r = 0f
        var g = 0f
        var b = 0f

        for (x in 0 until width) for (y in 0 until height) {
            val basis = (normalisation * cos(PI * i * x / width) * cos(PI * j * y / height)).toFloat()
            val pixel = pixels[y * width + x]

            r += basis * srgbToLinear((pixel shr 16) and 255)
            g += basis * srgbToLinear((pixel shr 8) and 255)
            b += basis * srgbToLinear(pixel and 255)
        }

        val scale = 1f / (width * height)

        factors[index][0] = r * scale
        factors[index][1] = g * scale
        factors[index][2] = b * scale
    }
}
