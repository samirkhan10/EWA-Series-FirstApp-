package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tv = findViewById<TextView>(R.id.tv)

        val intent = intent
        val value = intent.getStringExtra("name")

        tv.text = value



    }
}