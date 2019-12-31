package com.example.databaseapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.databaseapp.entity.BookEntity

@Dao
interface BookDAO {
    @Insert
    fun saveBooks(book:BookEntity)

    @Query(value = "Select * from BookEntity")
    fun getAllBooks():List<BookEntity>

    
}