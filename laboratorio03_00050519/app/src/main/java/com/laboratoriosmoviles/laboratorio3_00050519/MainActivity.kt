package com.laboratoriosmoviles.laboratorio3_00050519

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private lateinit var c5ImageView: ImageView
    private lateinit var c10ImageView: ImageView
    private lateinit var c25ImageView: ImageView
    private lateinit var d1ImageView: ImageView
    private var counter: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()
    }

    private fun bind() {
        counterTextView = findViewById(R.id.counter_textview)
        c5ImageView = findViewById(R.id.c5_imageView)
        c10ImageView = findViewById(R.id.c10_imageView)
        c25ImageView = findViewById(R.id.c25_imageView)
        d1ImageView = findViewById(R.id.d1_imageView)
    }

    private fun count(number: Double){
        counterTextView.text = "%.2f".format(number)
    }

    private fun addListener(){

        c5ImageView.setOnClickListener{
            counter+=0.05
            count(counter)
        }
        c10ImageView.setOnClickListener{
            counter+=0.10
            count(counter)
        }
        c25ImageView.setOnClickListener{
            counter+=0.25
            count(counter)
        }
        d1ImageView.setOnClickListener{
            counter+=1.00
            count(counter)
        }
    }
}