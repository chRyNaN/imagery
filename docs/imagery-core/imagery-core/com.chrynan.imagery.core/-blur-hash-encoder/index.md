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
| <a name="com.chrynan.imagery.core//encode/com.chrynan.imagery.core.BlurHashEncoder#android.graphics.Bitmap#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[encode](../encode.md)| <a name="com.chrynan.imagery.core//encode/com.chrynan.imagery.core.BlurHashEncoder#android.graphics.Bitmap#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[android]  <br>Content  <br>suspend fun [BlurHashEncoder](index.md#%5Bcom.chrynan.imagery.core%2FBlurHashEncoder%2F%2F%2FPointingToDeclaration%2F%5D%2FExtensions%2F378157083).[encode](../encode.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashEncoder#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[invoke](../invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.BlurHashEncoder#kotlin.IntArray#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [BlurHashEncoder](index.md).[invoke](../invoke.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>|

