//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[ImageVariant](index.md)

# ImageVariant

[common]\
data class [ImageVariant](index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **image**: [Image](../-image/index.md))

A variant of an [Image](../-image/index.md) in an [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). An [ImageVariant](index.md) represents a different version of the same image. An [ImageVariant](index.md) is defined by its [name](name.md) which could be any arbitrary [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value. An [ImageVariant](index.md) can represent a particular size or density of an [Image](../-image/index.md), mime type, type of photo (360, landscape, banner, etc), alteration (natural, effect), or any other differentiating factor. It is up to the User of this library to define what [name](name.md) values they wish to support and to handle them appropriately.

## Constructors

| | |
|---|---|
| [ImageVariant](-image-variant.md) | [common]<br>fun [ImageVariant](-image-variant.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), image: [Image](../-image/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [image](image.md) | [common]<br>val [image](image.md): [Image](../-image/index.md) |
| [name](name.md) | [common]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
