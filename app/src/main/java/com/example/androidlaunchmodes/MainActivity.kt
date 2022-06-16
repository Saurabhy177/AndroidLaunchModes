package com.example.androidlaunchmodes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn1).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // When launchMode = singleTop,
            // if we open an activity that exists in the backstack (not at the stack top),
            // then it creates a new instance for the same activity at the top.
            // So, we are using Intent.FLAG_ACTIVITY_CLEAR_TOP flag to prevent that and
            // move to the activity in backstack instead.
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
        Toast.makeText(this, "Activity 1 start toast", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Activity 1 resume toast", Toast.LENGTH_SHORT).show()
    }

    /**
     * onNewIntent() is called when you create another instance of this activity and
     * if launchMode = singleTop, and the same activity is on stack top.
     * if launchMode = singleTask, and the same activity is somewhere in the back stack.
     * */
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "Activity 1 on new intent toast", Toast.LENGTH_SHORT).show()
    }
}