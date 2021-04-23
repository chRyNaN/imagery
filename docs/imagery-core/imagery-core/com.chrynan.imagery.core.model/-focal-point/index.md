//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[FocalPoint](index.md)



# FocalPoint  
 [common] data class [FocalPoint](index.md)(**x**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **y**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

Represents a coordinate, or a point of focus, in a two-dimensional plane. This is usually used with images to indicate the important part of the image so that it is still shown when cropping is applied.



Note that the value of a coordinate ([x](x.md), [y](y.md)) can be a float anywhere between -1.0f and +1.0f, where 0.0f is the center. An [x](x.md) value of -1.0f indicates the left edge of the image, and an [x](x.md) value of 1.0f indicates the right edge. For the y axis, a [y](y.md) value of 1.0f indicates the top edge of the image, and a [y](y.md) value of -1.0f indicates the bottom edge.



Note that this is useful dependent on the scale type used on a platforms image view. For instance, Android's ImageView component, provides a scaleType property that allows specifying how the image should be scaled and displayed. This allows the image to scaled down to fit in the view bounds. However, we can choose to crop the image using the scaleType property, in this case, using a focal point would be useful so that the cropped image still displays the important part of the image. For this case, we would use the Android ImageView's matrix scaleType and convert this [FocalPoint](index.md) to a Matrix.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model/FocalPoint///PointingToDeclaration/"></a>| <a name="com.chrynan.imagery.core.model/FocalPoint///PointingToDeclaration/"></a><br><br>[Android ImageView ScaleType](https://developer.android.com/reference/android/widget/ImageView.ScaleType)<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model/FocalPoint/FocalPoint/#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[FocalPoint](-focal-point.md)| <a name="com.chrynan.imagery.core.model/FocalPoint/FocalPoint/#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a> [common] fun [FocalPoint](-focal-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/FocalPoint.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core.model/FocalPoint.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/FocalPoint/viewX/#/PointingToDeclaration/"></a>[viewX](view-x.md)| <a name="com.chrynan.imagery.core.model/FocalPoint/viewX/#/PointingToDeclaration/"></a> [common] val [viewX](view-x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)The [x](x.md) coordinate value in a traditional view coordinate plane, where the origin is in the top left (0, 0) and the right edge is considered 1.0f.   <br>|
| <a name="com.chrynan.imagery.core.model/FocalPoint/viewY/#/PointingToDeclaration/"></a>[viewY](view-y.md)| <a name="com.chrynan.imagery.core.model/FocalPoint/viewY/#/PointingToDeclaration/"></a> [common] val [viewY](view-y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)The [y](y.md) coordinate value in a traditional view coordinate plane, where the origin is in the top left (0, 0) and the bottom edge is considered 1.0f.   <br>|
| <a name="com.chrynan.imagery.core.model/FocalPoint/x/#/PointingToDeclaration/"></a>[x](x.md)| <a name="com.chrynan.imagery.core.model/FocalPoint/x/#/PointingToDeclaration/"></a> [common] val [x](x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)The coordinate value on the horizontal axis in the two-dimensional plane.   <br>|
| <a name="com.chrynan.imagery.core.model/FocalPoint/y/#/PointingToDeclaration/"></a>[y](y.md)| <a name="com.chrynan.imagery.core.model/FocalPoint/y/#/PointingToDeclaration/"></a> [common] val [y](y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)The coordinate value on the vertical axis in the two-dimensional plane.   <br>|

