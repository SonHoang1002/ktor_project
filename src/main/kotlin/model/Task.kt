// model/Task.kt
package com.example.model

import kotlinx.serialization.Serializable

@Serializable
data class Task(
    val id: String,
    val name: String,
    val priority: Priority
)

@Serializable
enum class Priority {
    Low, Medium, High
}
