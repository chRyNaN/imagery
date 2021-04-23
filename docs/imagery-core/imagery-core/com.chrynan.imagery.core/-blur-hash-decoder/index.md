//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[BlurHashDecoder](index.md)



# BlurHashDecoder  
 [common] interface [BlurHashDecoder](index.md)

A utility that can decode a BlurHash [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) into a [Result](-result/index.md) object that contains information on how to render the BlurHash image to the screen.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/BlurHashDecoder.Result///PointingToDeclaration/"></a>[Result](-result/index.md)| <a name="com.chrynan.imagery.core/BlurHashDecoder.Result///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Result](-result/index.md)(**blurHash**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **width**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **height**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **punch**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **pixels**: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), **componentX**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **componentY**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))  <br>More info  <br>A class that is returned as a result of the [decode](decode.md) function.  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/BlurHashDecoder/decode/#kotlin.String?#kotlin.Int#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[decode](decode.md)| <a name="com.chrynan.imagery.core/BlurHashDecoder/decode/#kotlin.String?#kotlin.Int#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [decode](decode.md)(blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), punch: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1f): [BlurHashDecoder.Result](-result/index.md)?  <br><br><br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashDecoder#kotlin.String?#kotlin.Int#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashDecoder#kotlin.String?#kotlin.Int#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [BlurHashDecoder](index.md).[invoke](../invoke.md)(blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), punch: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1f): [BlurHashDecoder.Result](-result/index.md)?  <br><br><br>|

