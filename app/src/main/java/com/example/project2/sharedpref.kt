package com.example.project2

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class sharedpref : AppCompatActivity() {
    private val file1="myfile3"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sharedpref)
        val sp:SharedPreferences=this.getSharedPreferences(file1,Context.MODE_PRIVATE)
        val id1:EditText=findViewById(R.id.id1)
        val name1:EditText=findViewById(R.id.name1)
        val id2:TextView=findViewById(R.id.id2)
        val name2:TextView=findViewById(R.id.name2)
        val bsave:Button=findViewById(R.id.bsave)
        val bview:Button=findViewById(R.id.bview)
        val bclear:Button=findViewById(R.id.bclear)

        bsave.setOnClickListener {
            val e = sp.edit()
            val id3:Int = Integer.parseInt(id1.text.toString())
            val name3:String = name1.text.toString()

            e.putInt("id",id3)
            e.putString("name",name3)
            e.apply()
            e.commit()
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()
        }
        bview.setOnClickListener {
            id2.setText(sp.getInt("id",0).toString())
            name2.setText(sp.getString("name","deafult val"))
        }
        bclear.setOnClickListener {
            val ed = sp.edit()
            ed.clear()
            ed.apply()
            id2.setText("")
            name2.setText("")

        }

    }
}