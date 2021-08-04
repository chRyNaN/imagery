//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[Image](index.md)

# Image

[common]\
data class [Image](index.md)(**uri**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **mimeType**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **isStatic**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **labels**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>?, **accessibilityDescriptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>?, **blurHash**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **focalPoint**: [FocalPoint](../-focal-point/index.md)?, **size**: [Size](../-size/index.md)?, **density**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)?, **orientation**: [ImageOrientation](../-image-orientation/index.md)?, **colorPalette**: Palette?, **metadata**: [Metadata](../-metadata/index.md)?)

Representation of an image that can be accessed via a [uri](uri.md).

## Constructors

| | |
|---|---|
| [Image](-image.md) | [common]<br>fun [Image](-image.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, isStatic: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>? = null, accessibilityDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>? = null, blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, focalPoint: [FocalPoint](../-focal-point/index.md)? = null, size: [Size](../-size/index.md)? = null, density: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, orientation: [ImageOrientation](../-image-orientation/index.md)? = null, colorPalette: Palette? = null, metadata: [Metadata](../-metadata/index.md)? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [accessibilityDescriptions](accessibility-descriptions.md) | [common]<br>val [accessibilityDescriptions](accessibility-descriptions.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>? = null<br>A [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [LocalizedText](../-localized-text/index.md)s representing useful descriptions of this image that can be used for accessibility means, such as screen readers. |
| [aspectRatio](aspect-ratio.md) | [common]<br>val [aspectRatio](aspect-ratio.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)?<br>The aspect ratio of the image. |
| [blurHash](blur-hash.md) | [common]<br>val [blurHash](blur-hash.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>A blur hash [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value used as a placeholder while the image is being loaded. |
| [colorPalette](color-palette.md) | [common]<br>val [colorPalette](color-palette.md): Palette? = null<br>The color palette extracted from this image. |
| [density](density.md) | [common]<br>val [density](density.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null<br>The original or desired pixels per inch (PPI) density for the image. |
| [displayOrientation](display-orientation.md) | [common]<br>val [displayOrientation](display-orientation.md): [ImageOrientation](../-image-orientation/index.md)?<br>The [ImageOrientation](../-image-orientation/index.md) calculated from the dimensions of this [Image](index.md). |
| [focalPoint](focal-point.md) | [common]<br>val [focalPoint](focal-point.md): [FocalPoint](../-focal-point/index.md)? = null<br>The [FocalPoint](../-focal-point/index.md), or area of importance, in the image. |
| [isStatic](is-static.md) | [common]<br>val [isStatic](is-static.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true<br>Whether this image is a static non-animating image. |
| [labels](labels.md) | [common]<br>val [labels](labels.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../-localized-text/index.md)>? = null<br>A [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [LocalizedText](../-localized-text/index.md)s representing a localized label, or description, of this image. |
| [metadata](metadata.md) | [common]<br>val [metadata](metadata.md): [Metadata](../-metadata/index.md)? = null |
| [mimeType](mime-type.md) | [common]<br>val [mimeType](mime-type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>The MIME Type of this image. |
| [name](name.md) | [common]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>The optional name of the image. |
| [orientation](orientation.md) | [common]<br>val [orientation](orientation.md): [ImageOrientation](../-image-orientation/index.md)? = null<br>The [ImageOrientation](../-image-orientation/index.md) of this image. |
| [size](size.md) | [common]<br>val [size](size.md): [Size](../-size/index.md)? = null<br>The size of this image. |
| [uri](uri.md) | [common]<br>val [uri](uri.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) used to access the image resource. |
