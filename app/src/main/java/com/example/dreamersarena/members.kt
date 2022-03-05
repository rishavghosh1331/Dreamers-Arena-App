package com.example.dreamersarena

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class members : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_members)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button3)
            button2.setOnClickListener {
                val intent = Intent(this, about_us::class.java)
                startActivity(intent)
            }
        val button3 = findViewById<Button>(R.id.button5)
        button3.setOnClickListener {
            val intent = Intent(this, members_all::class.java)
            startActivity(intent)
        }
        val button4 = findViewById<Button>(R.id.button6)
        button4.setOnClickListener {
            val intent = Intent(this, members1::class.java)
            startActivity(intent)
        }
        }
    }