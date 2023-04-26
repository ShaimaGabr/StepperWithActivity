package com.example.stepperwithactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var next:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next=findViewById(R.id.next)
        val  view: View = findViewById(R.id.circle_one);
        view.setBackground(getResources().getDrawable(R.drawable.ic_greencircle_24));

       // val view2:View = findViewById(R.id.circle_two);
        next.setOnClickListener {

                val intent: Intent =  Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
