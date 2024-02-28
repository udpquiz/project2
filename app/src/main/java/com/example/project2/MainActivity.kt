package com.example.project2

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private lateinit var dateButton: Button
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sp:Button=findViewById(R.id.sp)
        sp.setOnClickListener {
            startActivity(Intent(this,sharedpref::class.java))

        }
        val dt:Button=findViewById(R.id.dt)
        dt.setOnClickListener {
            startActivity(Intent(this,datetime::class.java))

        }
        val sk:Button=findViewById(R.id.sk)
        sk.setOnClickListener {
            startActivity(Intent(this,seekbar::class.java))

        }
        val mn:Button=findViewById(R.id.men)
        mn.setOnClickListener {
            startActivity(Intent(this,allmenu::class.java))

        }
        val fg:Button=findViewById(R.id.frag)
        fg.setOnClickListener {
            startActivity(Intent(this,frag::class.java))

        }
        val tt:Button=findViewById(R.id.tt)
        tt.setOnClickListener {
            startActivity(Intent(this,timetab::class.java))

        }
        val te:Button=findViewById(R.id.test)
        te.setOnClickListener {
            startActivity(Intent(this,login::class.java))

        }
        val te1:Button=findViewById(R.id.test1)
        te1.setOnClickListener {
            startActivity(Intent(this,test1::class.java))

        }

    }

//        dateButton = findViewById(R.id.dateButton)
//
//        // Set an initial date on the button
//        updateDateButtonText()
//
//        // Set a click listener on the button to show the DatePickerDialog
//        dateButton.setOnClickListener {
//            showDatePicker()
//        }
//    }
//
//    private fun showDatePicker() {
//        val datePickerDialog = DatePickerDialog(
//            this,
//            { _, year, month, day ->
//                // Update the calendar with the selected date
//                calendar.set(Calendar.YEAR, year)
//                calendar.set(Calendar.MONTH, month)
//                calendar.set(Calendar.DAY_OF_MONTH, day)
//
//                // Update the text on the button with the selected date
//                updateDateButtonText()
//            },
//            calendar.get(Calendar.YEAR),
//            calendar.get(Calendar.MONTH),
//            calendar.get(Calendar.DAY_OF_MONTH)
//        )
//
//        // Set a listener to automatically close the dialog when a date is selected
////        datePickerDialog.setOnDateSetListener { _, _, _, _ ->
////            datePickerDialog.dismiss()
////        }
//
//        datePickerDialog.show()
//    }
//
//    private fun updateDateButtonText() {
//        val selectedDate = android.text.format.DateFormat.format("dd MMM yyyy", calendar.time)
//        dateButton.text = selectedDate
//    }

    }