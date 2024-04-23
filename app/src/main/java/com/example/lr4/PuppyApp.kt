package com.example.lr4

import android.app.Application
import androidx.room.Room

class PuppyApp : Application() {
    companion object {
        lateinit var database: PuppyDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            PuppyDatabase::class.java,
            "PuppyDatabase"
        ).build()
    }
}