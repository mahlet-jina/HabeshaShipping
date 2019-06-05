package com.advancedandroidproject.habeshashipping.repository

import androidx.lifecycle.LiveData
import com.advancedandroidproject.habeshashipping.data.Order
import com.advancedandroidproject.habeshashipping.data.OrderDao

class OrderRepository(private val orderDao: OrderDao) {

    fun searchItem(item: String) : LiveData<Order> = orderDao.searchItem(item)

    fun getAllItems() : LiveData<List<Order>> = orderDao.getAllItems()

    fun placeOrder(order: Order){
        orderDao.placeOrder(order)
    }
    fun editOrder(order: Order){
        orderDao.editOrder(order)
    }
    fun deleteOrder(order: Order){
        orderDao.deleteOrder(order)
    }
}