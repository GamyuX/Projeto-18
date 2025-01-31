package com.example.projeto_18

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [UserModel::class], version = 1)
abstract class UserDataBase: RoomDataBase() {

    abstract fun userDao(): UserDAO

    companion object {
        private lateinit var INSTANCE: UserDataBase

        fun getDataBase(context: Context): UserDataBase {
            if (!::INSTANCE.isInitialized) {
                synchronized(UserDataBase::class.java) {
                    INSTANCE = Room.databaseBuilder (context, UserDataBase ::class.java,"userDB")
                        //.addMigrations(MIGRATION_1_2)
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

    private val MIGRATION_1_2: Migration = object : Migration(1,2){
        override fun migrate(db: SupportSQLiteDatabase) {
            //IMPLEMENTAÇÃO NECESSÁRIA
            }
        }
    }
}

open class RoomDataBase {

}
