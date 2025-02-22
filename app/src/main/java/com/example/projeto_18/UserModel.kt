package com.example.projeto_18

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class UserModel {

    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "id")
    var id: Int = 0

    @ColumnInfo(name = "username")
    var username: String = ""

    @ColumnInfo(name = "password")
    var password: String = ""


}