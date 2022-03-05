package com.example.dreamersarena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class about_us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this, members::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button)
        button2.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}