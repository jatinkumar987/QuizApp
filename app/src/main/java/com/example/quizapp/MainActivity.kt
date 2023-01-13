package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe = findViewById<Button>(R.id.btn_start)
        val tex: TextView = findViewById(R.id.et_name)

        btnClickMe.setOnClickListener {
            if(tex.text.toString().isEmpty()){
                Toast.makeText(this,
                    "Enter your name", Toast.LENGTH_SHORT).show()
            }else{
                val intent =Intent(this,QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }




        }
    }