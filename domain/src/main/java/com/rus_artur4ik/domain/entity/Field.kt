package com.rus_artur4ik.domain.entity

data class Field(
    val uid: String,
    val note: Note,
    val title: String,
    val completed: Boolean
)