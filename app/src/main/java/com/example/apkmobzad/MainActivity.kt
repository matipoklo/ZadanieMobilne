package com.example.apkmobzad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var imien = findViewById<TextView>(R.id.textView)
        var dodaj = findViewById<EditText>(R.id.editTextTextPersonName)

        findViewById<Button>(R.id.button).setOnClickListener(){
            imien.text = imien.text.toString() + dodaj.text
        }
        findViewById<Button>(R.id.button2).setOnClickListener(){
            imien.text = "Mateusz Poklekowski"
        }
    }
}