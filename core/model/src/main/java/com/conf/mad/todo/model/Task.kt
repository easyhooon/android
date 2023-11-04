package com.conf.mad.todo.model

data class Task(
    val id: Long,
    val title: String,
    val isCompleted: Boolean,
    val isFavorite: Boolean
)
