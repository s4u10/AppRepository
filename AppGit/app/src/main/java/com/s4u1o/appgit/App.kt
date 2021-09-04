package com.s4u1o.appgit

import android.app.Application
import com.s4u1o.appgit.data.di.DataModule
import com.s4u1o.appgit.domain.di.DomainModule
import com.s4u1o.appgit.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}