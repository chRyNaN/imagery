//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[UriMimeTypeResolver](index.md)

# UriMimeTypeResolver

[common]\
interface [UriMimeTypeResolver](index.md)

A Utility interface that can resolve Mime Type information about a provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) URI path.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [resolve](resolve.md) | [common]<br>abstract suspend fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the full Mime Type (ex: "image/png") from the provided [uri](resolve.md) or null if no Mime Type could be resolved. |

## Inheritors

| Name |
|---|
| [BaseUriMimeTypeResolver](../-base-uri-mime-type-resolver/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [invoke](../invoke.md) | [common]<br>suspend operator fun [UriMimeTypeResolver](index.md).[invoke](../invoke.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? |
