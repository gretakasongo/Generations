package com.example.generationapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Link UI
        val edtYear = findViewById<EditText>(R.id.edtYear)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val txtGen = findViewById<TextView>(R.id.txtGen)
        // Logic for the submit button
        btnSubmit.setOnClickListener {
             // Get the year entered by the user
            val year = edtYear.text.toString().toInt()
            // Determine the generation using a when statement
            val generation = when (year) {
                // Silent Generation
                in 1925..1945 -> "Silent Generation"
                // Baby Boomers
                in 1946..1964 -> "Baby Boomers"
                //Generation X
                in 1965..1980 -> "Generation X"
                // Millennials
                in 1981..1996 -> "Millenials"
                // Generation Z
                in 1997..2012 -> "Generation Z"
                // Generation Alpha
                in 2013..2024 -> "Generation Alpha"
                // Generation Beta
                in 2025..2039 -> "Generation Beta"
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}