package com.example.a10001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.security.PrivateKey

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageview:ImageView= findViewById(R.id.imageView)
        imageview.setOnClickListener{
            nextpageactivity()
        }
    }

    private fun nextpageactivity() {
        val intent =Intent(this,Register::class.java)
        startActivity(intent)

    }
}