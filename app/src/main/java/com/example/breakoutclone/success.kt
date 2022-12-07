package com.example.breakoutclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class success : AppCompatActivity() {
    private lateinit var Goback2: Button
    private lateinit var again:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        Goback2=findViewById(R.id.Goback2)
        again=findViewById(R.id.again)

        Goback2.setOnClickListener {
            Intent(this,MainActivity::class.java).apply {
                startActivity(this)
            }
        }

        again.setOnClickListener {
            Intent(this,game::class.java).apply {
                startActivity(this)
            }
        }

    }
}