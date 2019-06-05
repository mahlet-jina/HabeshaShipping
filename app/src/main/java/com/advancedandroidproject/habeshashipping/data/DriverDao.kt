package com.advancedandroidproject.habeshashipping.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface DriverDao {

    @Query("SELECT * FROM driver WHERE name = :name LIMIT 1")
    fun searchDriver(name : String): LiveData<Driver>

    @Query("SELECT * FROM driver WHERE user_name = :userName AND password = :password LIMIT 1")
    fun validateDriver(userName :String,password:String): LiveData<Driver>

    @Query("SELECT * FROM driver")
    fun getAllDrivers():LiveData<List<Driver>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun registerDriver(driver:Driver):Long

    @Update
    fun updateDriver(driver:Driver):Int

    @Delete
    fun deleteDriver(driver:Driver):Int
}