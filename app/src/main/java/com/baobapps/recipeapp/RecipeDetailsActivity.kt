package com.baobapps.recipeapp

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.cardview.widget.CardView
import com.google.android.material.bottomnavigation.BottomNavigationView

class RecipeDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val TAG = "Recipe Details Activity"

        Log.d(TAG, "ONCREATE ACTIVITY CALLED ") //Important for Debugging purposes

        @Suppress("DEPRECATION")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // Hide the status bar

        setContentView(R.layout.activity_recipe_details) // Declare the View for user

        val image : ImageView = findViewById(R.id.logo_image) // Add the animation using variables

        val selectedRecipeIndex = intent.getIntExtra("SELECTED_RECIPE_INDEX", 0) // Get the index of the selected recipe that has been passed from the previous activity

        val selectedRecipe = list_recipes[selectedRecipeIndex] // Get the selected recipe from the list


        val recipesCardView: CardView = findViewById(R.id.cardView)
        val textRecipeName: TextView = findViewById(R.id.textRecipeName)
        val textRecipeType: TextView = findViewById(R.id.textRecipeType)
        val textRecipeServings: TextView = findViewById(R.id.textRecipeServings)
        val textRecipeDifficulty: TextView = findViewById(R.id.textRecipeDifficulty)
        val textRecipeIngredients: TextView = findViewById(R.id.textRecipeIngredients)
        val textRecipeInstructions: TextView = findViewById(R.id.textRecipeInstructions)
        // Find the views inside the card view layout


        // Set the recipe data to the views
        textRecipeName.text = "${selectedRecipe.name}\n"
        textRecipeType.text = "Type: ${selectedRecipe.type}\t"
        textRecipeServings.text = "Servings: ${selectedRecipe.servings}\t"
        textRecipeDifficulty.text = "Difficulty: ${selectedRecipe.difficultyLevel}\n"
        textRecipeIngredients.text = "Ingredients:\n ${selectedRecipe.ingredients}\n"
        textRecipeInstructions.text = "Instructions:\n ${selectedRecipe.instructions}\n"

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        @Suppress("DEPRECATION")
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.page_home -> {
                    val intentHome = Intent(this, ExplorePageActivity::class.java)
                    startActivity(intentHome)
                    // Handle click for Home
                    true
                }
                R.id.page_breakfast -> {
                    val intentHome = Intent(this, BreakfastPageActivity::class.java)
                    startActivity(intentHome)
                    // Handle click for Breakfast
                    true
                }
                R.id.page_lunch -> {
                    val intentHome = Intent(this, LunchPageActivity::class.java)
                    startActivity(intentHome)
                    // Handle click for Lunch
                    true
                }
                R.id.page_dinner -> {
                    val intentHome = Intent(this, DinnerPageActivity::class.java)
                    startActivity(intentHome)
                    // Handle click for Dinner
                    true
                }
                else -> false
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(ContentValues.TAG, "ONSTART ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onResume() {
        super.onResume()
        Log.d(ContentValues.TAG, "ONRESUME ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onStop() {
        super.onStop()
        Log.d(ContentValues.TAG, "ONSTOP ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(ContentValues.TAG, "ONRESTART ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(ContentValues.TAG, "ONDESTROY ACTIVITY CALLED") // Important for Debugging purposes
    }
}

