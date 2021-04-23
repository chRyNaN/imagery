//[imagery-core](../../index.md)/[com.chrynan.imagery.core.model](index.md)



# Package com.chrynan.imagery.core.model  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/FocalPoint///PointingToDeclaration/"></a>[FocalPoint](-focal-point/index.md)| <a name="com.chrynan.imagery.core.model/FocalPoint///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [FocalPoint](-focal-point/index.md)(**x**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **y**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br>More info  <br>Represents a coordinate, or a point of focus, in a two-dimensional plane.  <br><br><br>|
| <a name="com.chrynan.imagery.core.model/Image///PointingToDeclaration/"></a>[Image](-image/index.md)| <a name="com.chrynan.imagery.core.model/Image///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Image](-image/index.md)(**uri**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **mimeType**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **isStatic**: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html), **labels**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](-localized-text/index.md)>?, **accessibilityDescriptions**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](-localized-text/index.md)>?, **blurHash**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **focalPoint**: [FocalPoint](-focal-point/index.md)?, **size**: [Size](-size/index.md)?, **aspectRatio**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)?, **density**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)?, **orientation**: [ImageOrientation](-image-orientation/index.md)?)  <br>More info  <br>Representation of an image that can be accessed via a [uri](-image/uri.md).  <br><br><br>|
| <a name="com.chrynan.imagery.core.model/ImageMimeTypes///PointingToDeclaration/"></a>[ImageMimeTypes](-image-mime-types/index.md)| <a name="com.chrynan.imagery.core.model/ImageMimeTypes///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [ImageMimeTypes](-image-mime-types/index.md)  <br>More info  <br>An object containing common Image MIME Types.  <br><br><br>|
| <a name="com.chrynan.imagery.core.model/ImageOrientation///PointingToDeclaration/"></a>[ImageOrientation](-image-orientation/index.md)| <a name="com.chrynan.imagery.core.model/ImageOrientation///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [ImageOrientation](-image-orientation/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[ImageOrientation](-image-orientation/index.md)>   <br>More info  <br>An enum class that indicates the orientation of an image.  <br><br><br>|
| <a name="com.chrynan.imagery.core.model/LocalizedText///PointingToDeclaration/"></a>[LocalizedText](-localized-text/index.md)| <a name="com.chrynan.imagery.core.model/LocalizedText///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [LocalizedText](-localized-text/index.md)(**languageCode**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **value**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))  <br><br><br>|
| <a name="com.chrynan.imagery.core.model/Size///PointingToDeclaration/"></a>[Size](-size/index.md)| <a name="com.chrynan.imagery.core.model/Size///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Size](-size/index.md)(**width**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **height**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br>More info  <br>Represents a two-dimensional size of a component.  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[FocalPoint](-focal-point.md)| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [FocalPoint](-focal-point.md)(imageX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FocalPoint](-focal-point/index.md)  <br>More info  <br>Creates a [FocalPoint](-focal-point/index.md) from the provided parameters.  <br><br><br>|

