//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[FocalPointResolver](index.md)



# FocalPointResolver  
 [common] interface [FocalPointResolver](index.md)   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/FocalPointResolver.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core/FocalPointResolver.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core/FocalPointResolver.Result///PointingToDeclaration/"></a>[Result](-result/index.md)| <a name="com.chrynan.imagery.core/FocalPointResolver.Result///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Result](-result/index.md)(**scale**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **dx**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **dy**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **viewWidth**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **viewHeight**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **imageWidth**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **imageHeight**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **focalPoint**: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md))  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/FocalPointResolver/resolve/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#com.chrynan.imagery.core.model.FocalPoint/PointingToDeclaration/"></a>[resolve](resolve.md)| <a name="com.chrynan.imagery.core/FocalPointResolver/resolve/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#com.chrynan.imagery.core.model.FocalPoint/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [resolve](resolve.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)): [FocalPointResolver.Result](-result/index.md)  <br><br><br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.FocalPointResolver#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#com.chrynan.imagery.core.model.FocalPoint/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.FocalPointResolver#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#com.chrynan.imagery.core.model.FocalPoint/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [FocalPointResolver](index.md).[invoke](../invoke.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../../com.chrynan.imagery.core.model/-focal-point/index.md)): [FocalPointResolver.Result](-result/index.md)  <br><br><br>|

