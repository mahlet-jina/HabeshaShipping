package com.advancedandroidproject.habeshashipping.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Driver::class,Manager::class,Order::class,OrderingCompany::class),version = 1)
abstract class ShippingDatabase:RoomDatabase() {

    abstract fun driverDao():DriverDao
    abstract fun managerDao():ManagerDao
    abstract fun orderDao():OrderDao
    abstract fun orderingCompanyDao():OrderingCompanyDao

    companion object {

        @Volatile
        private var INSTANCE: ShippingDatabase? = null

        fun getDatabase(context: Context): ShippingDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ShippingDatabase::class.java, "habesha_shipping"
                ).build()

                INSTANCE = instance
                return instance
            }

        }
    }
}
