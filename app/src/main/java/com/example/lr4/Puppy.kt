package com.example.lr4

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("puppy")
data class Puppy(
    @PrimaryKey(true)
    val id: Long = 0,
    val name: String,
    val desc: String
)