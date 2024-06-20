package com.dequevedo.kotlingpt.client

import com.dequevedo.kotlingpt.model.request.ChatRequest
import com.dequevedo.kotlingpt.model.response.ChatResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class OpenAIClient(private val restTemplate: RestTemplate) {

    fun getChatResponse(chatRequest: ChatRequest, apiKey: String): ChatResponse? {
        val url = "https://api.openai.com/v1/chat/completions"

        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_JSON
            set("Authorization", "Bearer $apiKey")
        }

        val entity = HttpEntity(chatRequest, headers)

        val response = restTemplate.exchange(url, HttpMethod.POST, entity, ChatResponse::class.java)
        return response.body
    }
}
