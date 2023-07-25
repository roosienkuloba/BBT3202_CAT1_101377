package com.baobapps.recipeapp

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.baobapps.recipeapp.ui.theme.Welcome_pageTheme

class ExplorePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val TAG = "Explore Activity"

        Log.d(TAG, "ONCREATE ACTIVITY CALLED ") //Important for Debugging purposes

        @Suppress("DEPRECATION")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // Hide the status bar

        setContentView(R.layout.activity_explore_page) // Declare the View for user

        val image : ImageView = findViewById(R.id.logo_image)
        val logo : TextView = findViewById(R.id.logo_name)
        val slogan : TextView = findViewById(R.id.slogan_name) // Add the animations using variables

        val recipeListView: ListView = findViewById(R.id.listViewRecipes)
        val recipeList: ArrayList<String> = ArrayList()

        for (recipe in list_recipes) {
            recipeList.add(recipe.name)
        } // Extract the names of each recipe from the recipeList and add them to the recipeViewList


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recipeList) // Create an ArrayAdapter

        recipeListView.adapter = adapter // Bind it to the ListView

        recipeListView.setOnItemClickListener { _, _, position, _ ->
            Log.d(TAG, "RECIPE SELECTED") // Important for Debugging Purposes

            val intent = Intent(this, RecipeDetailsActivity::class.java)
            intent.putExtra("SELECTED_RECIPE_INDEX", position)
            startActivity(intent)
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

