package com.advancedandroidproject.habeshashipping.data

import androidx.room.*

@Dao
interface OrderDao {

    @Query("SELECT * FROM shipping_order WHERE item = :item")
    fun searchItem(item:String):Order

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun placeOrder(order:Order):Long

    @Update
    fun editOrder(order:Order):Int

    @Delete
    fun deletOrder(order:Order):Int
}