//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[FocalPoint](index.md)

# FocalPoint

[common]\
data class [FocalPoint](index.md)(**x**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **y**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

Represents a coordinate, or a point of focus, in a two-dimensional plane. This is usually used with images to indicate the important part of the image so that it is still shown when cropping is applied.

Note that the value of a coordinate ([x](x.md), [y](y.md)) can be a float anywhere between -1.0f and +1.0f, where 0.0f is the center. An [x](x.md) value of -1.0f indicates the left edge of the image, and an [x](x.md) value of 1.0f indicates the right edge. For the y axis, a [y](y.md) value of 1.0f indicates the top edge of the image, and a [y](y.md) value of -1.0f indicates the bottom edge.

Note that this is useful dependent on the scale type used on a platforms image view. For instance, Android's ImageView component, provides a scaleType property that allows specifying how the image should be scaled and displayed. This allows the image to scaled down to fit in the view bounds. However, we can choose to crop the image using the scaleType property, in this case, using a focal point would be useful so that the cropped image still displays the important part of the image. For this case, we would use the Android ImageView's matrix scaleType and convert this [FocalPoint](index.md) to a Matrix.

## See also

common

| | |
|---|---|
|  | [Android ImageView ScaleType](https://developer.android.com/reference/android/widget/ImageView.ScaleType) |

## Constructors

| | |
|---|---|
| [FocalPoint](-focal-point.md) | [common]<br>fun [FocalPoint](-focal-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [viewX](view-x.md) | [common]<br>val [viewX](view-x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The [x](x.md) coordinate value in a traditional view coordinate plane, where the origin is in the top left (0, 0) and the right edge is considered 1.0f. |
| [viewY](view-y.md) | [common]<br>val [viewY](view-y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The [y](y.md) coordinate value in a traditional view coordinate plane, where the origin is in the top left (0, 0) and the bottom edge is considered 1.0f. |
| [x](x.md) | [common]<br>val [x](x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The coordinate value on the horizontal axis in the two-dimensional plane. |
| [y](y.md) | [common]<br>val [y](y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The coordinate value on the vertical axis in the two-dimensional plane. |
