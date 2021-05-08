@file:Suppress("unused")

package com.chrynan.imagery.core.util

import com.chrynan.imagery.core.model.NamedCollection

fun <T> namedListOf(name: String? = null, values: List<T>): NamedCollection<T, List<T>> =
    NamedCollection(
        name = name,
        values = values
    )

fun <T> namedListOf(name: String? = null, vararg values: T): NamedCollection<T, List<T>> =
    NamedCollection(
        name = name,
        values = values.toList()
    )

fun <T> namedSetOf(name: String? = null, values: Set<T>): NamedCollection<T, Set<T>> =
    NamedCollection(
        name = name,
        values = values
    )

fun <T> namedSetOf(name: String? = null, vararg values: T): NamedCollection<T, Set<T>> =
    NamedCollection(
        name = name,
        values = values.toSet()
    )
