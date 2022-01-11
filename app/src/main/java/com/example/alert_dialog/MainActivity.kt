package com.example.alert_dialog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var next_btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next_btn = findViewById(R.id.next)
        Log.e("on_start" , "onCreate()" )
        next_btn.setOnClickListener {
            val intent = Intent(this , MainActivity2::class.java )
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.e("on_start" , "onStart()" )
    }

    override fun onResume() {
        super.onResume()
        Log.e("on_resume","OnResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.e("on_pause","onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e("on_stop","onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("on_destroy","onDestroy()")

    }
}