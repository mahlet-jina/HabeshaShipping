package com.advancedandroidproject.habeshashipping.repository

import com.advancedandroidproject.habeshashipping.data.OrderingCompany
import com.advancedandroidproject.habeshashipping.data.OrderingCompanyDao

class OrderingCompanyRepository(private val orderingCompanyDao: OrderingCompanyDao) {

    fun registerCompany(orderingCompany: OrderingCompany){
        orderingCompanyDao.registerCompany(orderingCompany)
    }
    fun updateCompany(orderingCompany: OrderingCompany){
        orderingCompanyDao.updateCompany(orderingCompany)
    }
}