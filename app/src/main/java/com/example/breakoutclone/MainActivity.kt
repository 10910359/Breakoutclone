package com.example.breakoutclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnStart:Button
    private lateinit var Gameinstructions:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart=findViewById(R.id.btnStart)
        Gameinstructions=findViewById(R.id.Gameinstructions)


        Gameinstructions.setOnClickListener {
            Intent(this,Gameinstructions::class.java).apply {
                startActivity(this)
            }
        }
    }
}