//[imagery-core](../../index.md)/[com.chrynan.imagery.core](index.md)



# Package com.chrynan.imagery.core  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core/BlurHashDecoder///PointingToDeclaration/"></a>[BlurHashDecoder](-blur-hash-decoder/index.md)| <a name="com.chrynan.imagery.core/BlurHashDecoder///PointingToDeclaration/"></a>[common]  <br>Content  <br>interface [BlurHashDecoder](-blur-hash-decoder/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core/BlurHashEncoder///PointingToDeclaration/"></a>[BlurHashEncoder](-blur-hash-encoder/index.md)| <a name="com.chrynan.imagery.core/BlurHashEncoder///PointingToDeclaration/"></a>[common]  <br>Content  <br>interface [BlurHashEncoder](-blur-hash-encoder/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core/FocalPointResolver///PointingToDeclaration/"></a>[FocalPointResolver](-focal-point-resolver/index.md)| <a name="com.chrynan.imagery.core/FocalPointResolver///PointingToDeclaration/"></a>[common]  <br>Content  <br>interface [FocalPointResolver](-focal-point-resolver/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core/UriMimeTypeResolver///PointingToDeclaration/"></a>[UriMimeTypeResolver](-uri-mime-type-resolver/index.md)| <a name="com.chrynan.imagery.core/UriMimeTypeResolver///PointingToDeclaration/"></a>[common]  <br>Content  <br>interface [UriMimeTypeResolver](-uri-mime-type-resolver/index.md)  <br>More info  <br>A Utility interface that can resolve Mime Type information about a provided [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) URI path.  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core//BlurHashDecoder/#/PointingToDeclaration/"></a>[BlurHashDecoder](-blur-hash-decoder.md)| <a name="com.chrynan.imagery.core//BlurHashDecoder/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [BlurHashDecoder](-blur-hash-decoder.md)(): [BlurHashDecoder](-blur-hash-decoder/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core//BlurHashEncoder/#/PointingToDeclaration/"></a>[BlurHashEncoder](-blur-hash-encoder.md)| <a name="com.chrynan.imagery.core//BlurHashEncoder/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [BlurHashEncoder](-blur-hash-encoder.md)(): [BlurHashEncoder](-blur-hash-encoder/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core//FocalPointResolver/#/PointingToDeclaration/"></a>[FocalPointResolver](-focal-point-resolver.md)| <a name="com.chrynan.imagery.core//FocalPointResolver/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [FocalPointResolver](-focal-point-resolver.md)(): [FocalPointResolver](-focal-point-resolver/index.md)  <br><br><br>|
| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.UriMimeTypeResolver#kotlin.String/PointingToDeclaration/"></a>[invoke](invoke.md)| <a name="com.chrynan.imagery.core//invoke/com.chrynan.imagery.core.UriMimeTypeResolver#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>suspend operator fun [UriMimeTypeResolver](-uri-mime-type-resolver/index.md).[invoke](invoke.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br>suspend operator fun [BlurHashDecoder](-blur-hash-decoder/index.md).[invoke](invoke.md)(blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), punch: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1f): [BlurHashDecoder.Result](-blur-hash-decoder/-result/index.md)?  <br>suspend operator fun [BlurHashEncoder](-blur-hash-encoder/index.md).[invoke](invoke.md)(pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>suspend operator fun [FocalPointResolver](-focal-point-resolver/index.md).[invoke](invoke.md)(viewWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), viewHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageWidth: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), imageHeight: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPoint: [FocalPoint](../com.chrynan.imagery.core.model/-focal-point/index.md)): [FocalPointResolver.Result](-focal-point-resolver/-result/index.md)  <br><br><br>|

