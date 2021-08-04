//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[BaseUriMimeTypeResolver](index.md)

# BaseUriMimeTypeResolver

[common]\
abstract class [BaseUriMimeTypeResolver](index.md) : [UriMimeTypeResolver](../-uri-mime-type-resolver/index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [resolve](../-uri-mime-type-resolver/resolve.md) | [common]<br>abstract suspend fun [resolve](../-uri-mime-type-resolver/resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the full Mime Type (ex: "image/png") from the provided [uri](../-uri-mime-type-resolver/resolve.md) or null if no Mime Type could be resolved. |
