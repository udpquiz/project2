package com.example.project2
//
//import android.app.AlertDialog
//import android.app.Dialog
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//import android.widget.Toast
//
//class test : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test)
//
//        }
//    }

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.storage

class test : AppCompatActivity() {

    private val PICK_FILE_REQUEST_CODE = 1
    private lateinit var storage:FirebaseStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        storage=Firebase.storage
        val uploadButton = findViewById<Button>(R.id.upload_button)
        uploadButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "*/*" // Allow any file type
            startActivityForResult(intent, PICK_FILE_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_FILE_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            data?.data?.let { uri ->
                // Here, 'uri' is the URI of the selected file
                // You can now perform your upload operation with this URI
//                uploadFile(uri
                val fileRef = storage.reference.child("filename.txt")
                val uploadTask = fileRef.putFile(uri)
                Toast.makeText(this, "File uploaded successfully", Toast.LENGTH_SHORT).show()
                // Register observers to listen for when the upload is done or if it fails
                uploadTask.addOnSuccessListener {
                    // File uploaded successfully
                    Toast.makeText(this, "File uploaded successfully", Toast.LENGTH_SHORT).show()
                }.addOnFailureListener {
                    // Handle unsuccessful uploads
                    Toast.makeText(this, "Upload failed: ${it.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun uploadFile(fileUri: Uri) {
        // Implement your file upload logic here
        // This could involve uploading the file to a server or storing it locally, etc.
        // Remember to handle permissions properly and perform any necessary background tasks.
    }
}

