package com.dequevedo.kotlingpt.service;

import com.dequevedo.kotlingpt.client.OpenAIClient
import com.dequevedo.kotlingpt.model.request.ChatMessage
import com.dequevedo.kotlingpt.model.request.ChatRequest
import com.dequevedo.kotlingpt.model.request.StorytellingRequest
import com.dequevedo.kotlingpt.model.response.ChatResponse
import com.dequevedo.kotlingpt.repository.StorytellingRepository
import org.springframework.stereotype.Service

@Service
class StorytellingService(private val storytellingRepository: StorytellingRepository, private val openAIClient: OpenAIClient) {

    fun startStorytelling(storytellingRequest: StorytellingRequest): ChatResponse? {
        val messages = listOf(
            ChatMessage(role = "user", content = storytellingRequest.text)
        )

        val request = ChatRequest(
            model = "gpt-4o",
            messages = messages,
            temperature = 1.0,
            max_tokens = 4096,
            top_p = 1.0,
            frequency_penalty = 0.0,
            presence_penalty = 0.0
        )

        val response = openAIClient.getChatResponse(request, storytellingRequest.apiKey)
        return response
    }
}
