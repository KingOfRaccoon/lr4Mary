package com.example.lr4

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Puppy::class], version = 1)
abstract class PuppyDatabase: RoomDatabase() {
    abstract fun puppyDao(): PuppyDao
}