package com.chrynan.imagery.core

interface BlurHashDecoder {

    suspend fun decode(
        blurHash: String,
        width: Float,
        height: Float,
        punch: Float = 1f
    ): Result

    data class Result(
        val blurHash: String,
        val width: Float,
        val height: Float,
        val punch: Float,
        val pixels: IntArray,
        val componentX: Int,
        val componentY: Int
    ) {

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other !is Result) return false

            if (blurHash != other.blurHash) return false
            if (width != other.width) return false
            if (height != other.height) return false
            if (punch != other.punch) return false
            if (!pixels.contentEquals(other.pixels)) return false
            if (componentX != other.componentX) return false
            if (componentY != other.componentY) return false

            return true
        }

        override fun hashCode(): Int {
            var result = blurHash.hashCode()
            result = 31 * result + width.hashCode()
            result = 31 * result + height.hashCode()
            result = 31 * result + punch.hashCode()
            result = 31 * result + pixels.contentHashCode()
            result = 31 * result + componentX
            result = 31 * result + componentY
            return result
        }
    }

    companion object
}
