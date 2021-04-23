//[imagery-core](../../index.md)/[com.chrynan.imagery.core.model](index.md)/[FocalPoint](-focal-point.md)



# FocalPoint  
[common]  
Content  
fun [FocalPoint](-focal-point.md)(imageX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FocalPoint](-focal-point/index.md)  
More info  


Creates a [FocalPoint](-focal-point/index.md) from the provided parameters.



Note that an exception will be thrown if the [imageX](-focal-point.md) and [imageY](-focal-point.md) values are not within their ranges, 0 to [imageWidth](-focal-point.md), and 0 to [imageHeight](-focal-point.md), respectively.



#### Return  


The resulting [FocalPoint](-focal-point/index.md).



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>imageX| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The x-coordinate in the image of the focal point. Note that the left side of the image is 0.0f and the right side of the image is equal to [imageWidth](-focal-point.md).<br><br>|
| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>imageY| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The y-coordinate in the image of the focal point. Note that the top side of the image is 0.0f and the bottom side of the image is equal to [imageHeight](-focal-point.md).<br><br>|
| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>imageWidth| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The width of the image.<br><br>|
| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>imageHeight| <a name="com.chrynan.imagery.core.model//FocalPoint/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The height of the image.<br><br>|
  
  



