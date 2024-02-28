package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.DatePicker
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import java.util.Calendar

class timetab : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var semester:TextView
    lateinit var division:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timetab)
        val date1:DatePicker=findViewById(R.id.date1)
        val spin1:Spinner=findViewById(R.id.spin1)
        val spin2:Spinner=findViewById(R.id.spin2)
        semester=findViewById(R.id.text1)
        division=findViewById(R.id.text2)
        val btna:Button=findViewById(R.id.btna)
        val sem= arrayOf(1,2,3,4,5,6)
        val div= arrayOf("A","B","C","D","E")

        val td= Calendar.getInstance()
        date1.init(td.get(Calendar.YEAR),td.get(Calendar.MONTH),td.get(Calendar.DAY_OF_MONTH))
        {view,year,month,day->
            val month=month+1
//            Toast.makeText(this,"$day/$month/$year", Toast.LENGTH_SHORT).show()
            val selecteddate= "$day/$month/$year"
//            text1.setText(selecteddate.toString())
        }
        val aa:ArrayAdapter<Int> = ArrayAdapter<Int>(this,android.R.layout.select_dialog_item,sem)
        spin1.setAdapter(aa)
        val aa2:ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.select_dialog_item,div)
        spin2.setAdapter(aa2)
        spin1.onItemSelectedListener=this
        spin2.onItemSelectedListener=this
    }

//    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//        val text3: String = parent?.getItemAtPosition(position).toString()
//        val text4: String = parent?.getItemAtPosition(position).toString()
//        semester.text=text3
//        division.text=text4
//
//    }
override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    when (parent?.id) {
        R.id.spin1 -> {
            val text3: String = parent.getItemAtPosition(position).toString()
            semester.text = text3
        }

        R.id.spin2 -> {
            val text4: String = parent.getItemAtPosition(position).toString()
            division.text = text4
        }
    }
}

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }

}