@file:Suppress("unused")

package com.chrynan.imagery.core.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName

/**
 * A variant of an [Image] in an [Collection]. An [ImageVariant] represents a different version of
 * the same image. An [ImageVariant] is defined by its [name] which could be any arbitrary [String]
 * value. An [ImageVariant] can represent a particular size or density of an [Image], mime type,
 * type of photo (360, landscape, banner, etc), alteration (natural, effect), or any other
 * differentiating factor. It is up to the User of this library to define what [name] values they
 * wish to support and to handle them appropriately.
 */
@Serializable
data class ImageVariant(
    @SerialName(value = "name") val name: String,
    @SerialName(value = "image") val image: Image
)
