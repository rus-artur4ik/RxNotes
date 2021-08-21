package com.rus_artur4ik.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(
    entity = Note::class,
    parentColumns = arrayOf("uid"),
    childColumns = arrayOf("note_id")
)]
)
data class Field(
    @PrimaryKey val uid: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "completed") val completed: Boolean,
    @ColumnInfo(name = "note_id") val noteId: String
)
