@file:Suppress("unused")

package com.chrynan.imagery.core.util

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.withSign

internal fun signedPow2(value: Float) = value.pow(2f).withSign(value)

internal fun signedPow(value: Float, exp: Float) = abs(value).pow(exp).withSign(value)

internal fun max(values: Array<FloatArray>, from: Int, endExclusive: Int): Float {
    var result = Float.NEGATIVE_INFINITY

    for (i in from until endExclusive) {
        for (value in values[i]) {
            if (value > result) {
                result = value
            }
        }
    }

    return result
}
