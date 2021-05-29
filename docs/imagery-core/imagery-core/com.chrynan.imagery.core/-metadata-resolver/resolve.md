//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[MetadataResolver](index.md)/[resolve](resolve.md)



# resolve  
[common]  
Content  
abstract suspend fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)?  
More info  


Retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an [Image](../../com.chrynan.imagery.core.model/-image/index.md) defined by the provided [uri](resolve.md) and [mimeType](resolve.md). If the [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) cannot be obtained, then null is returned.

  



