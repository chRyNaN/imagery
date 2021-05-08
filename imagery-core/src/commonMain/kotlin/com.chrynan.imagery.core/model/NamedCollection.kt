package com.chrynan.imagery.core.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@ExperimentalSerializationApi
@Serializable
data class NamedCollection<T, C : Collection<T>>(
    @SerialName(value = "name") val name: String? = null,
    @SerialName(value = "values") @JsonNames(names = ["elements", "variants"]) val values: C
) : Collection<T> by values
