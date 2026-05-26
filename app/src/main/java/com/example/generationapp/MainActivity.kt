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
            val generation = when (year) {}
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}