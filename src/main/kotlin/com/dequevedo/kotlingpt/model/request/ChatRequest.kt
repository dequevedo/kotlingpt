package com.dequevedo.kotlingpt.model.request

data class ChatRequest(
    val model: String = "gpt-4o",
    val messages: List<ChatMessage>,
    val temperature: Double = 1.0,
    val max_tokens: Int = 4096,
    val top_p: Double = 1.0,
    val frequency_penalty: Double = 0.0,
    val presence_penalty: Double = 0.0
)
