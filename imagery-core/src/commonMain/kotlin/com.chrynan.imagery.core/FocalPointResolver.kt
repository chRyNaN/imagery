package com.chrynan.imagery.core

interface FocalPointResolver {

    suspend fun resolve(
        viewWidth: Float,
        viewHeight: Float,
        imageWidth: Float,
        imageHeight: Float,
        focalPoint: FocalPoint
    ): Result

    data class Result(
        val scale: Float,
        val dx: Float,
        val dy: Float,
        val viewWidth: Float,
        val viewHeight: Float,
        val imageWidth: Float,
        val imageHeight: Float,
        val focalPoint: FocalPoint
    )

    companion object
}
