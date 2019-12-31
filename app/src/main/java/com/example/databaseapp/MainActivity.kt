package com.example.databaseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import com.example.databaseapp.database.AddDatabase
import com.example.databaseapp.entity.BookEntity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var db= Room.databaseBuilder(applicationContext,AddDatabase::class.java,"BookDB").build()
        Thread{
            var bookEntity=BookEntity()
            bookEntity.bookId=1
            bookEntity.bookName="Kotlin for Android Developer"
            db.bookDao().saveBooks(bookEntity)

            bookEntity.bookId=2
            bookEntity.bookName="Java for Android Developer"
            db.bookDao().saveBooks(bookEntity)

            db.bookDao().getAllBooks().forEach()
            {
                Log.i("Fetch Records","Id::${it.bookId}")
                Log.i("Fetch Records","Name::${it.bookName}")

            }

        }.start()
    }
}
