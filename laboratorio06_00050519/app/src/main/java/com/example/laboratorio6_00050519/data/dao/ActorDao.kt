package com.example.laboratorio6_00050519.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.example.laboratorio6_00050519.data.model.ActorModel

@Dao
interface ActorDao {

    @Query("SELECT * FROM actor_table")
    suspend fun getAllActors(): List<ActorModel>

    @Transaction
    @Insert
    suspend fun insertActor(actor: ActorModel)
}