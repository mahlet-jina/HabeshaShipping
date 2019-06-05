package com.advancedandroidproject.habeshashipping.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "ordering_company")
data class OrderingCompany(@PrimaryKey @ColumnInfo(name = "id")val id:String,
                           @ColumnInfo(name = "company_name")val companyName:String,
                           @ColumnInfo(name = "user_name")val userName:String,
                           @ColumnInfo(name = "password")val password:String): Serializable