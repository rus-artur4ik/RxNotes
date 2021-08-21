package com.rus_artur4ik.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.rus_artur4ik.data.converter.DateConverter
import java.util.*

@Entity
data class Note(
    @PrimaryKey val uid: String,
    @TypeConverters(DateConverter::class)
    @ColumnInfo(name = "date_time")
    val dateTime: Date,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "subtitle")
    val subtitle: String)