package com.rus_artur4ik.rxnotes

import android.app.Application
import android.content.res.Configuration
import org.koin.core.context.GlobalContext.startKoin

class RxNotesApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // use Koin logger
            printLogger()
            // declare modules
            modules(
                listOf(

                )
            )
        }
        // Required initialization logic here!
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    override fun onConfigurationChanged ( newConfig : Configuration) {
        super.onConfigurationChanged(newConfig)
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    override fun onLowMemory() {
        super.onLowMemory()
    }
}