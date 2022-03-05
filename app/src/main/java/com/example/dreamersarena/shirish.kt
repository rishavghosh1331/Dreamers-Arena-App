package com.example.dreamersarena

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shirish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shirish)
        val button = findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            val intent = Intent(this, members::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button8)
        button2.setOnClickListener {
            val intent = Intent(this, about_us::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button10)
        button3.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1FUckuRBRK2K7Z9m8HL4dfVCUxcDWpLBb/view?usp=sharing"))
            startActivity(intent)
        }
    }
}