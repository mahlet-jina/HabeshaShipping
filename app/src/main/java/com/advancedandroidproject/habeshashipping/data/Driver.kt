package com.advancedandroidproject.habeshashipping.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "driver")
data class Driver(@PrimaryKey @ColumnInfo(name = "id")val id: Int,
                  @ColumnInfo(name = "name")val name:String,
                  @ColumnInfo(name = "experience")val experience:Int,
                  @ColumnInfo(name = "is_available")val isAvailable : Boolean,
                  @ColumnInfo(name = "user_name")val userName:String,
                  @ColumnInfo(name = "password")val password:String)