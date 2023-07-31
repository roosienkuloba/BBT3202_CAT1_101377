package com.baobapps.recipeapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlin.coroutines.CoroutineContext

@Database(entities = [Recipes::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun recipeDao(): DAOInterface

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {

                INSTANCE ?: Room.databaseBuilder(

                    context.applicationContext,
                    AppDatabase::class.java, "app_database"

                )

                    .fallbackToDestructiveMigration()
                    .build()
                    .also { INSTANCE = it }
            }

        }
    }

    //val newRecipe = Recipes(name = "Chicken Quesadilla")
    //val appDatabase = AppDatabase.getInstance(context)
    //appDatabase.recipeDao().insert(newRecipe)
}