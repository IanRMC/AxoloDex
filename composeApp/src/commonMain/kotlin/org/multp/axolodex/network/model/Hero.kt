package org.multp.axolodex.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Hero(
    val id: String,
    val name: String,
    val biography: Biography,
    @SerialName("image")
    val image: Image,
    val work: Work
)

@Serializable
data class Image(
    val url: String
)

@Serializable
data class Biography(
    @SerialName("full-name")
    val fullName: String,
    val aliases: List<String>,
    val publisher: String
)

@Serializable
data class Work(
    val occupation: String
)