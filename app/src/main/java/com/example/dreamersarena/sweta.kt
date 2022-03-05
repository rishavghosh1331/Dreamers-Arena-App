package com.example.dreamersarena

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sweta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweta)

        val button = findViewById<Button>(R.id.button7)
        button.setOnClickListener {
            val intent = Intent(this, members::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button8)
        button2.setOnClickListener {
            val intent = Intent(this, diyasini::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button10)
        button3.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1tdFBi6lpARSX-yZDoJ2nq_IHg8qzcoNH/view?usp=sharing"))
            startActivity(intent)
        }
    }
}