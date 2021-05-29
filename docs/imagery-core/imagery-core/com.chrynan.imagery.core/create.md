//[imagery-core](../../index.md)/[com.chrynan.imagery.core](index.md)/[create](create.md)



# create  
[common]  
Content  
suspend fun [ImageCreator](-image-creator/index.md).[create](create.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, isStatic: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, accessibilityDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, orientation: [ImageOrientation](../com.chrynan.imagery.core.model/-image-orientation/index.md)? = null, density: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, width: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), height: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), pixels: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html), blurHashComponentX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), blurHashComponentY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), focalPointX: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), focalPointY: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Image](../com.chrynan.imagery.core.model/-image/index.md)  
More info  


A convenience function that delegates to the [ImageCreator.create](-image-creator/create.md) function.

  


[common]  
Content  
fun [ImageCreator](-image-creator/index.md).[create](create.md)(uri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, mimeType: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, isStatic: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, labels: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, accessibilityDescriptions: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[LocalizedText](../com.chrynan.imagery.core.model/-localized-text/index.md)>? = null, blurHash: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, focalPoint: [FocalPoint](../com.chrynan.imagery.core.model/-focal-point/index.md)? = null, size: [Size](../com.chrynan.imagery.core.model/-size/index.md)? = null, density: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)? = null, orientation: [ImageOrientation](../com.chrynan.imagery.core.model/-image-orientation/index.md)? = null): [Image](../com.chrynan.imagery.core.model/-image/index.md)  
More info  


A convenience function that creates an [Image](../com.chrynan.imagery.core.model/-image/index.md) by delegating to the [Image](../com.chrynan.imagery.core.model/-image/index.md) constructor.

  



