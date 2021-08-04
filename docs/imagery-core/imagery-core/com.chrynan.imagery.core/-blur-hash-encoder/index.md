//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[BlurHashEncoder](index.md)

# BlurHashEncoder

[common]\
interface [BlurHashEncoder](index.md)

A utility that converts an array of pixel data to a BlurHash [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [encode](encode.md) | [common]<br>abstract suspend fun [encode](encode.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [encode](../encode.md) | [android]<br>suspend fun [BlurHashEncoder](index.md#-80169182%2FExtensions%2F-264708746).[encode](../encode.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [invoke](../invoke.md) | [common]<br>suspend operator fun [BlurHashEncoder](index.md).[invoke](../invoke.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
