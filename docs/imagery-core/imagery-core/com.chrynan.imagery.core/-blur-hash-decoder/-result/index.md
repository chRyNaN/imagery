//[imagery-core](../../../../index.md)/[com.chrynan.imagery.core](../../index.md)/[BlurHashDecoder](../index.md)/[Result](index.md)

# Result

[common]\
data class [Result](index.md)(**blurHash**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **width**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **height**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **punch**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **pixels**: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), **componentX**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **componentY**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

A class that is returned as a result of the [decode](../decode.md) function. This class contains everything necessary for rendering a BlurHash to the screen as an image.

## Constructors

| | |
|---|---|
| [Result](-result.md) | [common]<br>fun [Result](-result.md)(blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), punch: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Properties

| Name | Summary |
|---|---|
| [blurHash](blur-hash.md) | [common]<br>val [blurHash](blur-hash.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [componentX](component-x.md) | [common]<br>val [componentX](component-x.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [componentY](component-y.md) | [common]<br>val [componentY](component-y.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [height](height.md) | [common]<br>val [height](height.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [pixels](pixels.md) | [common]<br>val [pixels](pixels.md): [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) |
| [punch](punch.md) | [common]<br>val [punch](punch.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [width](width.md) | [common]<br>val [width](width.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [toBitmap](../../to-bitmap.md) | [android]<br>fun [BlurHashDecoder.Result](index.md#238473149%2FExtensions%2F-264708746).[toBitmap](../../to-bitmap.md)(): [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) |
