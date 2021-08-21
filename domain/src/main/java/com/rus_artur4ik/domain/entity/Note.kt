package com.rus_artur4ik.domain.entity

import java.util.*

data class Note(
    val uid: String,
    val dateTime: Date,
    val title: String,
    val subtitle: String,
    val fields: List<Field>
)
