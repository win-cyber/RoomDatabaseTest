package com.example.databaseapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.databaseapp.dao.BookDAO
import com.example.databaseapp.entity.BookEntity

@Database(entities = [(BookEntity::class)],version = 1)
abstract class AddDatabase:RoomDatabase(){
    abstract fun bookDao():BookDAO
}
