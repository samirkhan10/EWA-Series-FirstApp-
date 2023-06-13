package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {

            val myName = name.text.toString()
            var intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("name",myName)
            startActivity(intent)


        }



    }
}