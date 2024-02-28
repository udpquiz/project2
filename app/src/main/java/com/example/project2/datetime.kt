package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import java.util.Calendar

class datetime : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datetime)
        val date1:DatePicker=findViewById(R.id.date1)
        val time1:TimePicker=findViewById(R.id.time1)
        val text1:TextView=findViewById(R.id.text1)

        val td=Calendar.getInstance()
        date1.init(td.get(Calendar.YEAR),td.get(Calendar.MONTH),td.get(Calendar.DAY_OF_MONTH))
        {view,year,month,day->
            val month=month+1
            Toast.makeText(this,"$day/$month/$year",Toast.LENGTH_SHORT).show()
            val selecteddate= "$day/$month/$year"
            text1.setText(selecteddate.toString())
        }
    }
}