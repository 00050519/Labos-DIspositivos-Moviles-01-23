package com.example.laboratorio4_00050519

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class DataActivity : AppCompatActivity() {
    private lateinit var nameDisplayTextView: TextView
    private lateinit var emailDisplayTextView: TextView
    private lateinit var phoneDisplayTextView: TextView
    private lateinit var shareButton: Button

    private var name = ""
    private var email = ""
    private var phone = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        bind()
        setData()
        setListeners()
    }

    private fun setListeners() {
        shareButton.setOnClickListener(){
            shareData()
        }
    }

    private fun shareData() {
        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.setType("text/pain")
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Name: $name, Email: $email, Phone Number: $phone")
        startActivity(Intent.createChooser(shareIntent, "Share data"));
    }

    private fun setData() {
        name = intent.getStringExtra("name").toString()
        email = intent.getStringExtra("email").toString()
        phone = intent.getStringExtra("phone").toString()
        nameDisplayTextView.text = "Name: " + name
        emailDisplayTextView.text = "Email: " + email
        phoneDisplayTextView.text = "Phone Number: " + phone
    }

    private fun bind() {
        nameDisplayTextView = findViewById(R.id.name_display_text_view)
        emailDisplayTextView = findViewById(R.id.email_display_text_view)
        phoneDisplayTextView = findViewById(R.id.phone_display_text_view)
        shareButton = findViewById(R.id.share_button)
    }
}