//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[Swatch](index.md)



# Swatch  
 [common] data class [Swatch](index.md)(**color**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **primaryOnColor**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **secondaryOnColor**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), **population**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)

Represents a color swatch which contains a [color](color.md) and the related [primaryOnColor](primary-on-color.md) and [secondaryOnColor](secondary-on-color.md) which can be used to overlap the [color](color.md) with enough contrast. A color [Swatch](index.md) is typically extracted from an image by looking at it's pixel data.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model/Swatch/Swatch/#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int?/PointingToDeclaration/"></a>[Swatch](-swatch.md)| <a name="com.chrynan.imagery.core.model/Swatch/Swatch/#kotlin.Int#kotlin.Int#kotlin.Int#kotlin.Int?/PointingToDeclaration/"></a> [common] fun [Swatch](-swatch.md)(color: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), primaryOnColor: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), secondaryOnColor: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), population: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null)   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/Swatch.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core.model/Swatch.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/Swatch/color/#/PointingToDeclaration/"></a>[color](color.md)| <a name="com.chrynan.imagery.core.model/Swatch/color/#/PointingToDeclaration/"></a> [common] val [color](color.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The primary Color for this swatch.   <br>|
| <a name="com.chrynan.imagery.core.model/Swatch/population/#/PointingToDeclaration/"></a>[population](population.md)| <a name="com.chrynan.imagery.core.model/Swatch/population/#/PointingToDeclaration/"></a> [common] val [population](population.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = nullThe number of pixels represented by this swatch in an underlying image.   <br>|
| <a name="com.chrynan.imagery.core.model/Swatch/primaryOnColor/#/PointingToDeclaration/"></a>[primaryOnColor](primary-on-color.md)| <a name="com.chrynan.imagery.core.model/Swatch/primaryOnColor/#/PointingToDeclaration/"></a> [common] val [primaryOnColor](primary-on-color.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The primary color that can be used on top of the [color](color.md) value.   <br>|
| <a name="com.chrynan.imagery.core.model/Swatch/secondaryOnColor/#/PointingToDeclaration/"></a>[secondaryOnColor](secondary-on-color.md)| <a name="com.chrynan.imagery.core.model/Swatch/secondaryOnColor/#/PointingToDeclaration/"></a> [common] val [secondaryOnColor](secondary-on-color.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The secondary color that can be used on top of the [color](color.md) value.   <br>|

