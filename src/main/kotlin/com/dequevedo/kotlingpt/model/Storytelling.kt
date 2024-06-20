package com.dequevedo.kotlingpt.model

import jakarta.persistence.*

@Entity
data class Storytelling(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Lob
    @ElementCollection
    @CollectionTable(name = "storytelling_messages", joinColumns = [JoinColumn(name = "storytelling_id")])
    val messages: List<String> = mutableListOf()
)