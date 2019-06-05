package com.advancedandroidproject.habeshashipping.data

import androidx.room.*

@Dao
interface OrderingCompanyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun registerCompany(orderingCompany: OrderingCompany): Long

    @Update
    fun updateCompany(orderingCompany: OrderingCompany): Int

}