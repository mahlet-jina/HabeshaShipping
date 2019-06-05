package com.advancedandroidproject.habeshashipping.repository

import com.advancedandroidproject.habeshashipping.data.Manager

class ManagerRepository(private val managerRepository: ManagerRepository) {

    fun validateManager(manager: Manager){
        managerRepository.validateManager(manager)
    }

    fun updateManager(manager: Manager){
        managerRepository.updateManager(manager)
    }
}