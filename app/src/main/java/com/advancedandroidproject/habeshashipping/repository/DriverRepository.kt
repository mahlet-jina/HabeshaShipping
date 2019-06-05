package com.advancedandroidproject.habeshashipping.repository

import androidx.lifecycle.LiveData
import com.advancedandroidproject.habeshashipping.data.Driver
import com.advancedandroidproject.habeshashipping.data.DriverDao

class DriverRepository(private  val driverDao: DriverDao) {

    fun getAllDrivers() : LiveData<List<Driver>> = driverDao.getAllDrivers()

    fun searchDriver(name:String) : LiveData<Driver> = driverDao.searchDriver(name)

    fun validateDriver(userName:String,password:String) :LiveData<Driver> = driverDao.validateDriver(userName,password)

    fun registerDriver(driver:Driver){
        driverDao.registerDriver(driver)
    }
    fun deleteDriver(driver:Driver){
        driverDao.deleteDriver(driver)
    }
    fun updateDriver(driver:Driver){
        driverDao.updateDriver(driver)
    }
}