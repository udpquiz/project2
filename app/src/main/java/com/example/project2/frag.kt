package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class frag : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val fm = supportFragmentManager
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frag)
        val b1:Button=findViewById(R.id.b1)
        val b2:Button=findViewById(R.id.b2)

    }
}