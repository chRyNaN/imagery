//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[AndroidMetadataResolver](index.md)



# AndroidMetadataResolver  
 [android] class [AndroidMetadataResolver](index.md) : [MetadataResolver](../-metadata-resolver/index.md)

Android implementation of the [MetadataResolver](../-metadata-resolver/index.md) interface.



Note that this only works with local image files.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core/AndroidMetadataResolver/AndroidMetadataResolver/#/PointingToDeclaration/"></a>[AndroidMetadataResolver](-android-metadata-resolver.md)| <a name="com.chrynan.imagery.core/AndroidMetadataResolver/AndroidMetadataResolver/#/PointingToDeclaration/"></a> [android] fun [AndroidMetadataResolver](-android-metadata-resolver.md)()   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/AndroidMetadataResolver/resolve/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[resolve](resolve.md)| <a name="com.chrynan.imagery.core/AndroidMetadataResolver/resolve/#kotlin.String#kotlin.String?/PointingToDeclaration/"></a>[android]  <br>Content  <br>open suspend override fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md)?  <br>More info  <br>Retrieves [Metadata](../../com.chrynan.imagery.core.model/-metadata/index.md) from an Image defined by the provided [uri](resolve.md) and [mimeType](resolve.md).  <br><br><br>|

