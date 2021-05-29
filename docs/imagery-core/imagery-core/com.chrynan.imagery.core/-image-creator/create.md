//[imagery-core](../../../index.md)/[com.chrynan.imagery.core](../index.md)/[ImageCreator](index.md)/[create](create.md)



# create  
[common]  
Content  
abstract suspend fun [create](create.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, isStatic: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, accessibilityDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, orientation: [ImageOrientation](../../com.chrynan.imagery.core.model/-image-orientation/index.md)? = null, density: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, width: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), height: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), blurHashComponentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), blurHashComponentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), focalPointX: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), focalPointY: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Image](../../com.chrynan.imagery.core.model/-image/index.md)  
More info  


Creates an image from the provided values, calculating necessary data, such as the Blur Hash and the Focal Point.

  



