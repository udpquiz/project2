package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.Toast

class seekbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)
        val sk:SeekBar=findViewById(R.id.sk)
        val rt:RatingBar=findViewById(R.id.rate1)
        val b1:Button=findViewById(R.id.btn)
        b1.setOnClickListener {
            val rate=rt.rating.toString()
            Toast.makeText(this,"Rate is : "+rate,Toast.LENGTH_SHORT).show()
        }
        sk?.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(this@seekbar,"pro is : "+sk.progress+" %",Toast.LENGTH_SHORT).show()
            }
        })
    }
}