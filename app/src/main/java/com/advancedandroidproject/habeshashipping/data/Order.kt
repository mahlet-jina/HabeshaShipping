package com.advancedandroidproject.habeshashipping.data
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "shipping_order")
data class Order(@PrimaryKey @ColumnInfo(name = "id")val id:Int,
                 @ColumnInfo(name = "item")val item:String,
                 @ColumnInfo(name = "num_of_items")val numOfItems:Int,
                 @ColumnInfo(name = "vechiles_needed")val vechilesNeeded:Int,
                 @ColumnInfo(name = "item_arrived")val itemArrived:Boolean)