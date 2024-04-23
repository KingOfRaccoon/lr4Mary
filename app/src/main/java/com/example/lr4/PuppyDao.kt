package com.example.lr4

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PuppyDao {
    @Insert
    fun addPuppy(puppy: Puppy)

    @Query("Select * from puppy")
    fun getAllPuppy(): LiveData<List<Puppy>>
}