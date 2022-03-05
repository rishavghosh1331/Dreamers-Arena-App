package com.example.dreamersarena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, members::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener {
            val intent = Intent(this, about_us::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button11)
        button3.setOnClickListener {
            val intent = Intent(this, activities::class.java)
            startActivity(intent)
        }
    }
}