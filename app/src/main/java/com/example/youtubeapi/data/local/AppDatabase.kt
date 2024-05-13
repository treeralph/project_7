package com.example.youtubeapi.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [], version = 1)
abstract class AppDatabase: RoomDatabase() {
    companion object {
        private var INSTANCE: AppDatabase? = null
        @Synchronized
        fun getInstance(context: Context): AppDatabase? {
            if(INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "app_db"
                ).build()
            }
            return INSTANCE
        }
    }
}