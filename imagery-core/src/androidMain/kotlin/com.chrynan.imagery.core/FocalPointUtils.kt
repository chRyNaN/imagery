@file:Suppress("unused")

package com.chrynan.imagery.core

import android.graphics.Matrix
import com.chrynan.imagery.core.model.FocalPoint

fun Matrix.setToFocalPointResult(result: FocalPointResolver.Result) {
    reset()
    preScale(result.scale, result.scale)
    postTranslate(result.dx, result.dy)
}

fun FocalPointResolver.Result.toMatrix(): Matrix {
    val matrix = Matrix()
    matrix.setToFocalPointResult(this)
    return matrix
}

suspend fun FocalPointResolver.resolveToMatrix(
    viewWidth: Float,
    viewHeight: Float,
    imageWidth: Float,
    imageHeight: Float,
    focalPoint: FocalPoint
): Matrix = resolve(
    viewWidth = viewWidth,
    viewHeight = viewHeight,
    imageWidth = imageWidth,
    imageHeight = imageHeight,
    focalPoint = focalPoint
).toMatrix()
