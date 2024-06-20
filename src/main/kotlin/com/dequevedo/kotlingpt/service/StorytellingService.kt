package com.dequevedo.kotlingpt.service;

import com.dequevedo.kotlingpt.client.OpenAIClient
import com.dequevedo.kotlingpt.model.Storytelling
import com.dequevedo.kotlingpt.model.request.ChatRequest
import com.dequevedo.kotlingpt.model.response.ChatResponse
import com.dequevedo.kotlingpt.repository.StorytellingRepository
import org.springframework.stereotype.Service

@Service
class StorytellingService(
    private val storytellingRepository: StorytellingRepository,
    private val openAIClient: OpenAIClient
) {

    fun startStorytelling(request: ChatRequest, apiKey: String): ChatResponse? {
        storytellingRepository.save(
            Storytelling(
                messages = request.messages.stream().map { chatMessage -> chatMessage.content }.toList()
            )
        )

        val response = openAIClient.getChatResponse(request, apiKey)
        return response
    }
}
