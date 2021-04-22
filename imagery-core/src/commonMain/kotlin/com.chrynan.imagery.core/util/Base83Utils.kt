@file:Suppress("unused")

package com.chrynan.imagery.core.util

private val base83CharList = listOf(
    '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
    'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
    'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '#', '$', '%', '*', '+', ',',
    '-', '.', ':', ';', '=', '?', '@', '[', ']', '^', '_', '{', '|', '}', '~'
)

private val base83CharMap =
    base83CharList
        .mapIndexed { i, c -> c to i }
        .toMap()

internal fun Int.encodeBase83(length: Int, buffer: CharArray = CharArray(length), offset: Int = 0): CharArray {
    var exp = 1
    var i = 1

    while (i <= length) {
        val digit = (this / exp % 83)
        buffer[offset + length - i] = base83CharList[digit]
        i++
        exp *= 83
    }

    return buffer
}

internal fun String.decodeBase83(from: Int = 0, to: Int = this.length): Int {
    var result = 0

    for (i in from until to) {
        val index = base83CharMap[this[i]] ?: -1

        if (index != -1) {
            result = result * 83 + index
        }
    }

    return result
}
