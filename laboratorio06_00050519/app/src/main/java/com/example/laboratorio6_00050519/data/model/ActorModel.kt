package com.example.laboratorio6_00050519.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "actor_table")
data class ActorModel(
    @PrimaryKey(autoGenerate = true) val actorId: Int,
    @ColumnInfo(name = "name") val name: String
    )

{
    constructor(name: String):
            this(0, name)
}
