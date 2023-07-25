package com.baobapps.recipeapp

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
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

        val TAG = "Explore Activity"

        Log.d(TAG, "ONCREATE ACTIVITY CALLED ") //Important for Debugging purposes

        super.onCreate(savedInstanceState)

        @Suppress("DEPRECATION")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // Hide the status bar

        setContentView(R.layout.activity_explore_page) // Declare the View for user

        val image : ImageView = findViewById(R.id.logo_image)
        val logo : TextView = findViewById(R.id.logo_name)
        val slogan : TextView = findViewById(R.id.slogan_name) // Add the animations using variables

        val recipeListView: ListView = findViewById(R.id.listViewRecipes)
        val recipeViewList: ArrayList<String> = ArrayList()

        // Extract the names of each recipe from the recipeList and add them to the recipeViewList
        for (recipe in list_recipes) {
            recipeViewList.add(recipe.name)
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, recipeViewList) // Create an ArrayAdapter

        recipeListView.adapter = adapter // Bind it to the ListView

        // Set item click listener for the ListView to handle click events
        recipeListView.setOnItemClickListener { _, _, position, _ ->
            // TODO: Add code to handle the click event, e.g., open the details of the selected recipe
            // You can get the selected recipe using recipeList[position]
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

