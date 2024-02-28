package com.example.project2

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class addlec : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addlec)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            showDialog()
        }
    }
    private fun showDialog() {
        val dialogView = layoutInflater.inflate(R.layout.dialog, null)
        val editText = dialogView.findViewById<EditText>(R.id.editText)
        val editText2 = dialogView.findViewById<EditText>(R.id.editText2)
        val editText3 = dialogView.findViewById<EditText>(R.id.editText3)
        val dialogButtonOK = dialogView.findViewById<Button>(R.id.dialogButtonOK)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setTitle("Enter Lecture Details")

        val dialog = builder.create()

        dialogButtonOK.setOnClickListener {
            val newText = editText.text.toString()
            val newText2 = editText2.text.toString()
            val newText3 = editText3.text.toString()
            button.text = newText+"\n"+newText2+"\n"+newText3
            dialog.dismiss()
        }

        dialog.show()
    }
}