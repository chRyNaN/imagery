//[imagery-core](../../../index.md)/[com.chrynan.imagery.core.model](../index.md)/[NamedCollection](index.md)

# NamedCollection

[common]\
data class [NamedCollection](index.md)<[T](index.md), [C](index.md) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>>(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?, **values**: [C](index.md)) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)> 

A [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) that contains an optional [name](name.md) property. This class is serializable. To obtain an instance of this class, either use the constructor directly or use one of the specific Collection constructor utility functions, such as [namedListOf](../../com.chrynan.imagery.core.util/named-list-of.md) and [namedSetOf](../../com.chrynan.imagery.core.util/named-set-of.md).

Note that this class implements the [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) interface and delegates to the [values](values.md) property. However, this class has two generic type parameters: T (the type of each value in the [values](values.md) Collection) and C (the type of the Collection used List, Set, etc). So for specific Collection type functionality, use the [values](values.md) property directly.

## Constructors

| | |
|---|---|
| [NamedCollection](-named-collection.md) | [common]<br>fun <[C](index.md) : [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>> [NamedCollection](-named-collection.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, values: [C](index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [contains](index.md#1825712522%2FFunctions%2F42137572) | [common]<br>open operator override fun [contains](index.md#1825712522%2FFunctions%2F42137572)(element: [T](index.md)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [containsAll](index.md#-348659435%2FFunctions%2F42137572) | [common]<br>open override fun [containsAll](index.md#-348659435%2FFunctions%2F42137572)(elements: [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)<[T](index.md)>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isEmpty](index.md#-719293276%2FFunctions%2F42137572) | [common]<br>open override fun [isEmpty](index.md#-719293276%2FFunctions%2F42137572)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [iterator](index.md#-1438676347%2FFunctions%2F42137572) | [common]<br>open operator override fun [iterator](index.md#-1438676347%2FFunctions%2F42137572)(): [Iterator](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)<[T](index.md)> |

## Properties

| Name | Summary |
|---|---|
| [name](name.md) | [common]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null |
| [size](index.md#1661717351%2FProperties%2F42137572) | [common]<br>open override val [size](index.md#1661717351%2FProperties%2F42137572): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [values](values.md) | [common]<br>val [values](values.md): [C](index.md) |
