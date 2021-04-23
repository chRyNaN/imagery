//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[BlurHashEncoder](index.md)



# BlurHashEncoder  
 [common] interface [BlurHashEncoder](index.md)

A utility that converts an array of pixel data to a BlurHash [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/BlurHashEncoder.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core/BlurHashEncoder.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/BlurHashEncoder/encode/#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[encode](encode.md)| <a name="com.chrynan.imagery.core/BlurHashEncoder/encode/#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract suspend fun [encode](encode.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashEncoder#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashEncoder#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [BlurHashEncoder](index.md).[invoke](../invoke.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|

