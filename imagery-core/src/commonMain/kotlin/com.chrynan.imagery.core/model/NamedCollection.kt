package com.chrynan.imagery.core.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import com.chrynan.imagery.core.util.namedListOf
import com.chrynan.imagery.core.util.namedSetOf

/**
 * A [Collection] that contains an optional [name] property. This class is serializable. To obtain
 * an instance of this class, either use the constructor directly or use one of the specific
 * Collection constructor utility functions, such as [namedListOf] and [namedSetOf].
 *
 * Note that this class implements the [Collection] interface and delegates to the [values]
 * property. However, this class has two generic type parameters: T (the type of each value in the
 * [values] Collection) and C (the type of the Collection used [List, Set, etc]). So for specific
 * Collection type functionality, use the [values] property directly.
 */
@ExperimentalSerializationApi
@Serializable
data class NamedCollection<T, C : Collection<T>>(
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "values") /* @JsonNames(names = ["elements", "variants", "images"]) */ val values: C
) : Collection<T> by values {

    companion object
}
