//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[ImageVariant](index.md)



# ImageVariant  
 [common] data class [ImageVariant](index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **image**: [Image](../-image/index.md))

A variant of an [Image](../-image/index.md) in an [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html). An [ImageVariant](index.md) represents a different version of the same image. An [ImageVariant](index.md) is defined by its [name](name.md) which could be any arbitrary [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value. An [ImageVariant](index.md) can represent a particular size or density of an [Image](../-image/index.md), mime type, type of photo (360, landscape, banner, etc), alteration (natural, effect), or any other differentiating factor. It is up to the User of this library to define what [name](name.md) values they wish to support and to handle them appropriately.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model/ImageVariant/ImageVariant/#kotlin.String#com.chrynan.imagery.core.model.Image/PointingToDeclaration/"></a>[ImageVariant](-image-variant.md)| <a name="com.chrynan.imagery.core.model/ImageVariant/ImageVariant/#kotlin.String#com.chrynan.imagery.core.model.Image/PointingToDeclaration/"></a> [common] fun [ImageVariant](-image-variant.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), image: [Image](../-image/index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/ImageVariant.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core.model/ImageVariant.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/ImageVariant/image/#/PointingToDeclaration/"></a>[image](image.md)| <a name="com.chrynan.imagery.core.model/ImageVariant/image/#/PointingToDeclaration/"></a> [common] val [image](image.md): [Image](../-image/index.md)   <br>|
| <a name="com.chrynan.imagery.core.model/ImageVariant/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.chrynan.imagery.core.model/ImageVariant/name/#/PointingToDeclaration/"></a> [common] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

