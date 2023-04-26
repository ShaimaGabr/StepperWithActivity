package com.example.stepperwithactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var back:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        back=findViewById(R.id.back)
        val  view2:View = findViewById(R.id.circle_two);
        view2.setBackground(getResources().getDrawable(R.drawable.ic_greencircle_24))

        val  view:View = findViewById(R.id.circle_one);
        back.setOnClickListener {

               val intent:Intent =  Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
