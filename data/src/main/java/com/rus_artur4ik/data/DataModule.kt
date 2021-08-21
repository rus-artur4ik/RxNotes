package com.rus_artur4ik.data

import androidx.room.Room
import com.rus_artur4ik.data.db.AppDatabase
import org.koin.dsl.module

val dataModule = module {
    single<AppDatabase> {
        Room.databaseBuilder(
            get(),
            AppDatabase::class.java,
            "NotesDB"
        ).build()
    }
}