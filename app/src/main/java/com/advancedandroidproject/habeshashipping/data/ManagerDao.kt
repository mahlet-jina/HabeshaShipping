package com.advancedandroidproject.habeshashipping.data

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update

@Dao
interface ManagerDao {

    @Query("SELECT * FROM manager WHERE user_name = :userName AND password = :password LIMIT 1")
    fun validateManager(userName:String,password:String):Manager

    @Update
    fun updateManager(manager:Manager):Int
}