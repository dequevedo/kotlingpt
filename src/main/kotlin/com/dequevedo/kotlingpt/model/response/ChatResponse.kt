package com.dequevedo.kotlingpt.model.response

import com.dequevedo.kotlingpt.model.request.ChatMessage
import com.fasterxml.jackson.annotation.JsonProperty

data class ChatResponse(
    val id: String,
    @JsonProperty("object")
    val objectType: String,
    val created: Long,
    val model: String,
    val choices: List<Choice>
) {
    data class Choice(
        val index: Int,
        val message: ChatMessage,
        val finish_reason: String
    )
}