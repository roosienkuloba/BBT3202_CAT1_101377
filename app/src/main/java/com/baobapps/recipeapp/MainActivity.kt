package com.baobapps.recipeapp

import android.app.ActivityOptions
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Pair
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val TAG = "Main Activity"

        Log.d(TAG, "ONCREATE ACTIVITY CALLED ") //Important for Debugging purposes

        @Suppress("DEPRECATION")
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN) // Hide the status bar

        setContentView(R.layout.activity_main) // Declare the View for user

        val topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnim= AnimationUtils.loadAnimation(this, R.anim.bottom_animation)
        val image : ImageView = findViewById(R.id.imageView)
        val logo : TextView = findViewById(R.id.textView)
        val slogan : TextView = findViewById(R.id.textView2) // Add the animations using variables

        image.startAnimation(topAnim)
        logo.startAnimation(bottomAnim)
        slogan.startAnimation(bottomAnim) // Apply the animations

        @Suppress("DEPRECATION")
        android.os.Handler().postDelayed(
            {
                val intent = Intent(this, ExplorePageActivity::class.java)

                val pairs = arrayOf<Pair<View, String>>(
                    Pair(image, "app_image"),
                    Pair(logo, "app_image_text"),
                    Pair(slogan, "app_image_slogan")
                )

                val options = ActivityOptions.makeSceneTransitionAnimation(this, *pairs)
                startActivity(intent, options.toBundle())

            },
            5000
        )// Move to the next activity after the splash screen has completed running

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "ONSTART ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "ONRESUME ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "ONSTOP ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "ONRESTART ACTIVITY CALLED") // Important for Debugging purposes

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ONDESTROY ACTIVITY CALLED") // Important for Debugging purposes
    }

}