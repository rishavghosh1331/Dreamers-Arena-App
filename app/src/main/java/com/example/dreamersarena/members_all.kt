package com.example.dreamersarena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class members_all : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members_all)

        val button = findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            val intent = Intent(this, members::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button9)
        button2.setOnClickListener {
            val intent = Intent(this, members1::class.java)
            startActivity(intent)
        }
    }
}