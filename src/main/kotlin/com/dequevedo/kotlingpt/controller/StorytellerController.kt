package com.dequevedo.kotlingpt.controller;

import com.dequevedo.kotlingpt.model.request.StorytellingRequest
import com.dequevedo.kotlingpt.model.response.ChatResponse
import com.dequevedo.kotlingpt.service.StorytellingService
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/storytelling")
class StorytellerController(private val storytellingService: StorytellingService) {

    @PostMapping
    fun startStorytelling(@Valid @RequestBody request: StorytellingRequest): ChatResponse? {
        return storytellingService.startStorytelling(request)
    }

}
