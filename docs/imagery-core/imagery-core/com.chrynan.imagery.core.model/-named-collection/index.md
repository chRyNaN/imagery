//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[NamedCollection](index.md)



# NamedCollection  
 [common] data class [NamedCollection](index.md)<[T](index.md), [C](index.md) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>>(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **values**: [C](index.md)) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)> 

A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that contains an optional [name](name.md) property. This class is serializable. To obtain an instance of this class, either use the constructor directly or use one of the specific Collection constructor utility functions, such as [namedListOf](../../com.chrynan.imagery.core.util/named-list-of.md) and [namedSetOf](../../com.chrynan.imagery.core.util/named-set-of.md).



Note that this class implements the [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) interface and delegates to the [values](values.md) property. However, this class has two generic type parameters: T (the type of each value in the [values](values.md) Collection) and C (the type of the Collection used List, Set, etc). So for specific Collection type functionality, use the [values](values.md) property directly.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.imagery.core.model/NamedCollection/NamedCollection/#kotlin.String?#TypeParam(bounds=[kotlin.collections.Collection[TypeParam(bounds=[kotlin.Any?])]])/PointingToDeclaration/"></a>[NamedCollection](-named-collection.md)| <a name="com.chrynan.imagery.core.model/NamedCollection/NamedCollection/#kotlin.String?#TypeParam(bounds=[kotlin.collections.Collection[TypeParam(bounds=[kotlin.Any?])]])/PointingToDeclaration/"></a> [common] fun <[C](index.md) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>> [NamedCollection](-named-collection.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, values: [C](index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/NamedCollection.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.imagery.core.model/NamedCollection.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="kotlin.collections/Collection/contains/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[contains](index.md#%5Bkotlin.collections%2FCollection%2Fcontains%2F%23TypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)| <a name="kotlin.collections/Collection/contains/#TypeParam(bounds=[kotlin.Any?])/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [contains](index.md#%5Bkotlin.collections%2FCollection%2Fcontains%2F%23TypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)(element: [T](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="kotlin.collections/Collection/containsAll/#kotlin.collections.Collection[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[containsAll](index.md#%5Bkotlin.collections%2FCollection%2FcontainsAll%2F%23kotlin.collections.Collection%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)| <a name="kotlin.collections/Collection/containsAll/#kotlin.collections.Collection[TypeParam(bounds=[kotlin.Any?])]/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [containsAll](index.md#%5Bkotlin.collections%2FCollection%2FcontainsAll%2F%23kotlin.collections.Collection%5BTypeParam%28bounds%3D%5Bkotlin.Any%3F%5D%29%5D%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="kotlin.collections/Collection/isEmpty/#/PointingToDeclaration/"></a>[isEmpty](index.md#%5Bkotlin.collections%2FCollection%2FisEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)| <a name="kotlin.collections/Collection/isEmpty/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [isEmpty](index.md#%5Bkotlin.collections%2FCollection%2FisEmpty%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="kotlin.collections/Collection/iterator/#/PointingToDeclaration/"></a>[iterator](index.md#%5Bkotlin.collections%2FCollection%2Fiterator%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)| <a name="kotlin.collections/Collection/iterator/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [iterator](index.md#%5Bkotlin.collections%2FCollection%2Fiterator%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-1687587241)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)<[T](index.md)>  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.imagery.core.model/NamedCollection/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.chrynan.imagery.core.model/NamedCollection/name/#/PointingToDeclaration/"></a> [common] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null   <br>|
| <a name="com.chrynan.imagery.core.model/NamedCollection/size/#/PointingToDeclaration/"></a>[size](index.md#%5Bcom.chrynan.imagery.core.model%2FNamedCollection%2Fsize%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1687587241)| <a name="com.chrynan.imagery.core.model/NamedCollection/size/#/PointingToDeclaration/"></a> [common] open override val [size](index.md#%5Bcom.chrynan.imagery.core.model%2FNamedCollection%2Fsize%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1687587241): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.imagery.core.model/NamedCollection/values/#/PointingToDeclaration/"></a>[values](values.md)| <a name="com.chrynan.imagery.core.model/NamedCollection/values/#/PointingToDeclaration/"></a> [common] val [values](values.md): [C](index.md)   <br>|

