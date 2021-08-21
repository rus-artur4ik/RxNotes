package com.rus_artur4ik.data.converter

import androidx.room.TypeConverter
import java.time.Instant
import java.util.*

class DateConverter {
    @TypeConverter
    fun dateToTimestamp(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun timestampToDate(date: Long): Date {
        return Date(date)
    }
}