//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[FocalPointResolver](index.md)

# FocalPointResolver

[common]\
interface [FocalPointResolver](index.md)

A utility that can calculate a [Result](-result/index.md) from a [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md), which is used to determine the portion of the image to display.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |
| [Result](-result/index.md) | [common]<br>data class [Result](-result/index.md)(**scale**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **dx**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **dy**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **viewWidth**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **viewHeight**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **imageWidth**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **imageHeight**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **focalPoint**: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [resolve](resolve.md) | [common]<br>abstract suspend fun [resolve](resolve.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)): [FocalPointResolver.Result](-result/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [invoke](../invoke.md) | [common]<br>suspend operator fun [FocalPointResolver](index.md).[invoke](../invoke.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)): [FocalPointResolver.Result](-result/index.md) |
| [resolveToMatrix](../resolve-to-matrix.md) | [android]<br>suspend fun [FocalPointResolver](index.md#1325895848%2FExtensions%2F-264708746).[resolveToMatrix](../resolve-to-matrix.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)): [Matrix](https://developer.android.com/reference/kotlin/android/graphics/Matrix.html) |
