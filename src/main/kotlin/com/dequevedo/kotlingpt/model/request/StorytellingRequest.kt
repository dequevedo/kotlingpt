package com.dequevedo.kotlingpt.model.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


data class StorytellingRequest(
    @field:NotBlank(message = "apiKey is mandatory.")
    val apiKey: String,

    @field:NotNull(message = "id is mandatory.")
    val id: Long?,

    @field:NotBlank(message = "text is mandatory.")
    val text: String,
)