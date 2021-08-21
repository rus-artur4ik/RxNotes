package com.rus_artur4ik.data.entity

@Entity(foreignKeys = @ForeignKey(entity = Note.class, parentColumns = "uid", childColumns = "note_id"))
data class Check(
    @PrimaryKey val uid: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "completed") val completed: String,
    @ColumnInfo(name = "note_id") val noteId: String
)
