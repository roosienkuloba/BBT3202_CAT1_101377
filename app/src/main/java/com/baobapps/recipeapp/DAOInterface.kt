package com.baobapps.recipeapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAOInterface {
    @Query ("SELECT * FROM recipes WHERE id==id")
        fun getRecipeById(id: Int): Recipes

    @Query("SELECT * FROM recipes WHERE type=='Breakfast'" )
        fun getRecipeByBreakfast(type: String): List<Recipes>

    @Query("SELECT * FROM recipes WHERE type=='Lunch'" )
        fun getRecipeByLunch(type: String): List<Recipes>

    @Query("SELECT * FROM recipes WHERE type=='Supper'" )
        fun getRecipeBySupper(type: String): List<Recipes>

    @Query("SELECT * FROM recipes" )
        fun getAll(): List<Recipes>

}