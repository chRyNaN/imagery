//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[MetadataResolver](index.md)



# MetadataResolver  
 [common] interface [MetadataResolver](index.md)

A utility that retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an [Image](../../com.chrynan.imagery.core.model/-image/index.md).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/MetadataResolver.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core/MetadataResolver.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/MetadataResolver/resolve/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[resolve](resolve.md)| <a name="com.chrynan.imagery.core/MetadataResolver/resolve/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)?  <br>More info  <br>Retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an [Image](../../com.chrynan.imagery.core.model/-image/index.md) defined by the provided [uri](resolve.md) and [mimeType](resolve.md).  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.imagery.core/AndroidMetadataResolver///PointingToDeclaration/"></a>[AndroidMetadataResolver](../-android-metadata-resolver/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.MetadataResolver#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.MetadataResolver#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [MetadataResolver](index.md).[invoke](../invoke.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)?  <br><br><br>|

