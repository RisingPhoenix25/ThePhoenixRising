package com.example.thephoenixrising

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val button: Button = findViewById<View>(R.id.birdlist) as Button

        button.setOnClickListener {
            val intent = Intent(this, Birds::class.java);
            startActivity(intent);
        }

    }
}