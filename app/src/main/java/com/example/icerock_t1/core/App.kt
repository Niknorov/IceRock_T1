package com.example.icerock_t1.core

import android.app.Application
import com.example.icerock_t1.auth.di.authModule
import com.example.icerock_t1.core.di.networkModule
import com.example.icerock_t1.repo.di.repositoriesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                networkModule,
                authModule,
                repositoriesModule,

            )
        }
    }
}