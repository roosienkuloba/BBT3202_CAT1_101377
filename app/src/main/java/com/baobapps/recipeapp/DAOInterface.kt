package com.baobapps.recipeapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface DAOInterface {
    @Query("SELECT * FROM recipes" )
    suspend fun getAll(): List<Recipes>

    @Insert
    suspend fun addRecipe(recipe: Recipes)

    @Query ("SELECT * FROM recipes WHERE id==id")
        suspend fun getRecipeById(id: Int): Recipes

    @Query("SELECT * FROM recipes WHERE type=='Breakfast'" )
        suspend fun getRecipeByBreakfast(type: String): List<Recipes>

    @Query("SELECT * FROM recipes WHERE type=='Lunch'" )
        suspend fun getRecipeByLunch(type: String): List<Recipes>

    @Query("SELECT * FROM recipes WHERE type=='Supper'" )
        suspend fun getRecipeBySupper(type: String): List<Recipes>


}