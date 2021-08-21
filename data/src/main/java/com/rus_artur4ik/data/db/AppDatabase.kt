package com.rus_artur4ik.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rus_artur4ik.data.converter.DateConverter
import com.rus_artur4ik.data.dao.NoteDao
import com.rus_artur4ik.data.model.Field
import com.rus_artur4ik.data.model.Note

@Database(entities = [Note::class, Field::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}