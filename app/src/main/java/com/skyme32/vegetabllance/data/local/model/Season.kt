package com.skyme32.vegetabllance.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index

@Entity(
    tableName = "season",
    primaryKeys = ["month", "id_vegetable"],
    indices = [Index(value = ["month", "id_vegetable"], unique = true)]
)
data class Season(

    @ColumnInfo(name = "month")
    val month: Int,

    @ColumnInfo(name = "id_vegetable")
    val idVegetable: Int,
)
