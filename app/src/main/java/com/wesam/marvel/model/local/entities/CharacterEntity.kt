package com.wesam.marvel.model.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "CHARACTER_TABLE")
data class CharacterEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
)
