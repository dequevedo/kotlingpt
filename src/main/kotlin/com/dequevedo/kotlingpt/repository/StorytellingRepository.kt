package com.dequevedo.kotlingpt.repository;

import com.dequevedo.kotlingpt.model.Storytelling
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StorytellingRepository : JpaRepository<Storytelling, Long> {
    fun save(storytelling: Storytelling): Storytelling
}
