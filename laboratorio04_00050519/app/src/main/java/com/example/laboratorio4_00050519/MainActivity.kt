package com.example.laboratorio4_00050519

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.bind
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var saveButton: Button
    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var phoneEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()
    }

    private fun addListener() {
        saveButton.setOnClickListener(){
            saveInformation()
        }
    }

    private fun saveInformation() {
        var name = nameEditText.text.toString()
        var email = emailEditText.text.toString()
        var phone = phoneEditText.text.toString()

       var intent = Intent(this, DataActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("phone", phone)
        startActivity(intent)
    }

    private fun bind() {
        saveButton = findViewById(R.id.save_button)
        nameEditText = findViewById(R.id.name_edit_text)
        emailEditText = findViewById(R.id.email_edit_text)
        phoneEditText = findViewById(R.id.phone_edit_text)
    }

}