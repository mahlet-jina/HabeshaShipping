package com.advancedandroidproject.habeshashipping.data
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "manager")
data class Manager(@PrimaryKey @ColumnInfo(name = "id")val id:String,
                   @ColumnInfo(name = "name")val name:String,
                   @ColumnInfo(name = "user_name")val userName:String,
                   @ColumnInfo(name  = "password")val password:String) :Serializable