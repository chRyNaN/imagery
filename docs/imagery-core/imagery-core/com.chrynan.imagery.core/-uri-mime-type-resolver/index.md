//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[UriMimeTypeResolver](index.md)



# UriMimeTypeResolver  
 [common] interface [UriMimeTypeResolver](index.md)

A Utility interface that can resolve Mime Type information about a provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) URI path.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/UriMimeTypeResolver.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core/UriMimeTypeResolver.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/UriMimeTypeResolver/resolve/#kotlin.String/PointingToDeclaration/"></a>[resolve](resolve.md)| <a name="com.chrynan.imagery.core/UriMimeTypeResolver/resolve/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [resolve](resolve.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br>More info  <br>Retrieves the full Mime Type (ex: "image/png") from the provided [uri](resolve.md) or null if no Mime Type could be resolved.  <br><br><br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.imagery.core/BaseUriMimeTypeResolver///PointingToDeclaration/"></a>[BaseUriMimeTypeResolver](../-base-uri-mime-type-resolver/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.UriMimeTypeResolver#kotlin.String/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.UriMimeTypeResolver#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [UriMimeTypeResolver](index.md).[invoke](../invoke.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>|

