package com.rus_artur4ik.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.rus_artur4ik.data.model.Field
import com.rus_artur4ik.data.model.Note
import com.rus_artur4ik.data.model.NoteFields

@Dao
interface NoteDao {

    @Query("SELECT * FROM Note")
    fun getAll(): List<Note>

    @Query("SELECT * FROM Note")
    fun getAllWithFields(): List<NoteFields>

    @Query("SELECT * FROM Note WHERE title LIKE :title")
    fun findByName(title: String): List<NoteFields>

    @Insert
    fun insert(note: Note)

    @Insert
    fun insert(field: Field)

    @Insert
    fun insertNotes(notes: List<Note>)

    @Insert
    fun insertFields(fields: List<Field>)

    @Delete
    fun delete(note: Note)

    @Delete
    fun delete(field: Field)


}