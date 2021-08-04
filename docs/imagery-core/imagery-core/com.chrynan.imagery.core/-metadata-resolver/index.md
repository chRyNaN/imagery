//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[MetadataResolver](index.md)

# MetadataResolver

[common]\
interface [MetadataResolver](index.md)

A utility that retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an [Image](../../com.chrynan.imagery.core.model/-image/index.md).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [resolve](resolve.md) | [common]<br>abstract suspend fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)?<br>Retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an [Image](../../com.chrynan.imagery.core.model/-image/index.md) defined by the provided [uri](resolve.md) and [mimeType](resolve.md). |

## Inheritors

| Name |
|---|
| [AndroidMetadataResolver](../-android-metadata-resolver/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [invoke](../invoke.md) | [common]<br>suspend operator fun [MetadataResolver](index.md).[invoke](../invoke.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)? |
