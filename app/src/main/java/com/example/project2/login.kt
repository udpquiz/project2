package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val r3: View =findViewById(R.id.rectangle_3)
        val e1: EditText =findViewById(R.id.rectangle_1)
        val e2: EditText =findViewById(R.id.rectangle_2)
        val t1=e1.text
        val t2=e2.text
        r3.setOnClickListener {
            Toast.makeText(this, "Clicked Login $t1  $t2", Toast.LENGTH_SHORT).show()
        }
    }
}