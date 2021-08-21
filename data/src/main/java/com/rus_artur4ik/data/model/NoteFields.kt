package com.rus_artur4ik.data.model

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Relation

data class NoteFields(
    @Embedded
    val note: Note,
    @Relation(parentColumn = "uid", entityColumn = "note_id")
    val fields: Field
)
