@file:Suppress("unused")

package com.chrynan.imagery.core.util

import kotlin.math.floor
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.max

internal fun linearToSrgb(value: Float): Int {
    val v = value.coerceIn(0f, 1f)

    return if (v <= 0.0031308f) {
        (v * 12.92f * 255f + 0.5f).toInt()
    } else {
        ((1.055f * v.pow(1 / 2.4f) - 0.055f) * 255 + 0.5f).toInt()
    }
}

internal fun srgbToLinear(colorEnc: Int): Float {
    val v = colorEnc / 255f

    return if (v <= 0.04045f) {
        (v / 12.92f)
    } else {
        ((v + 0.055f) / 1.055f).pow(2.4f)
    }
}

internal fun decodeDc(colorEnc: Int): FloatArray {
    val r = colorEnc shr 16
    val g = (colorEnc shr 8) and 255
    val b = colorEnc and 255

    return floatArrayOf(srgbToLinear(r), srgbToLinear(g), srgbToLinear(b))
}

internal fun decodeAc(value: Int, maxAc: Float): FloatArray {
    val r = value / (19 * 19)
    val g = (value / 19) % 19
    val b = value % 19

    return floatArrayOf(
        signedPow2((r - 9) / 9.0f) * maxAc,
        signedPow2((g - 9) / 9.0f) * maxAc,
        signedPow2((b - 9) / 9.0f) * maxAc
    )
}

internal fun encodeDC(value: FloatArray): Int {
    val r = linearToSrgb(value[0])
    val g = linearToSrgb(value[1])
    val b = linearToSrgb(value[2])

    return (r shl 16) + (g shl 8) + b
}

internal fun encodeAC(value: FloatArray, maximumValue: Float): Int {
    val quantR = floor(
        max(
            0f,
            min(18f, floor(signedPow(value[0] / maximumValue, 0.5f) * 9 + 9.5f))
        )
    )
    val quantG = floor(
        max(
            0f,
            min(18f, floor(signedPow(value[1] / maximumValue, 0.5f) * 9 + 9.5f))
        )
    )
    val quantB = floor(
        max(
            0f,
            min(18f, floor(signedPow(value[2] / maximumValue, 0.5f) * 9 + 9.5f))
        )
    )

    return round(quantR * 19 * 19 + quantG * 19 + quantB).toInt()
}
