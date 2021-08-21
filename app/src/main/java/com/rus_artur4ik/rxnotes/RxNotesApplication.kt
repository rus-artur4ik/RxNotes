package com.rus_artur4ik.rxnotes

import android.app.Application
import android.content.res.Configuration
import com.rus_artur4ik.data.dataModule
import com.rus_artur4ik.domain.domainModule
import com.rus_artur4ik.notes.notesModule
import org.koin.core.context.GlobalContext.startKoin

class RxNotesApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            printLogger()
            modules(
                listOf(
                    dataModule,
                    domainModule,
                    notesModule
                )
            )
        }
    }

    override fun onConfigurationChanged ( newConfig : Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }
}