package com.dequevedo.kotlingpt.model.request

data class ChatRequest(
    val model: String,
    val messages: List<ChatMessage>,
    val temperature: Double,
    val max_tokens: Int,
    val top_p: Double = 1.0,
    val frequency_penalty: Double = 0.0,
    val presence_penalty: Double = 0.0
)
