package com.rus_artur4ik.data.entity

@Entity
data class Note(
    @PrimaryKey val uid: String,
    @ColumnInfo(name = "date_time") val dateTime: Long,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "subtitle") val subtitle: String)