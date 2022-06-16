package com.example.androidlaunchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn2).setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        findViewById<Button>(R.id.btn3).setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Activity 3 start toast", Toast.LENGTH_SHORT).show()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "Activity 3 on new intent toast", Toast.LENGTH_SHORT).show()
    }
}