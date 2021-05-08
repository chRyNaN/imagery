package com.chrynan.imagery.core.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NamedCollection<T, C : Collection<T>>(
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "values") val values: C
) : Collection<T> by values
