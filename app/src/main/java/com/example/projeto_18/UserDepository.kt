package com.example.projeto_18

import android.content.Context

class UserDepository(context: Context) {

    private val userDataBase: UserDAO = UserDataBase.getDataBase(context).userDao()

    fun insert(user: UserModel): Long{
        return userDataBase.insert(user)
    }

    fun update(user: UserModel): Int{
        return userDataBase.update(user)
    }

    fun delete(user: UserModel): Int{
        return userDataBase.delete(user)
    }

    fun get(id: Int): UserModel{
        return userDataBase.get(id)
    }

    fun getAll(): List<UserModel> {
        return userDataBase.getAll()

    }
}