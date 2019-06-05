package com.advancedandroidproject.habeshashipping.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface OrderDao {

    @Query("SELECT * FROM shipping_order WHERE item = :item")
    fun searchItem(item:String): LiveData<Order>

    @Query("SELECT * FROM shipping_order")
    fun getAllItems():LiveData<List<Order>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun placeOrder(order:Order):Long

    @Update
    fun editOrder(order:Order):Int

    @Delete
    fun deleteOrder(order:Order):Int
}