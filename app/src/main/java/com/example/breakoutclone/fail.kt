package com.example.breakoutclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fail : AppCompatActivity() {
    private lateinit var Goback3: Button
    private lateinit var again2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail)

        Goback3=findViewById(R.id.Goback3)
        again2=findViewById(R.id.again2)

        Goback3.setOnClickListener {
            Intent(this,MainActivity::class.java).apply {
                startActivity(this)
            }
        }

        again2.setOnClickListener {
            Intent(this,game::class.java).apply {
                startActivity(this)
            }
        }
    }
}