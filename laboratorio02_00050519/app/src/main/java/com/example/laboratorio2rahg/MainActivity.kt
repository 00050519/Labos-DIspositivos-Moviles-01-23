package com.example.laboratorio2rahg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Comment

class MainActivity : AppCompatActivity() {

    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var bmiButton: Button
    private lateinit var bmiNumberDisplayTextView: TextView
    private lateinit var bmiResultDisplayTextView: TextView
    private lateinit var bmiComment: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()
    }

    private fun bind() {
        weightEditText = findViewById(R.id.weight_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        bmiButton = findViewById(R.id.btn_bmi)
        bmiNumberDisplayTextView = findViewById(R.id.bmi_number_display_textview)
        bmiResultDisplayTextView = findViewById(R.id.bmi_result_display_textview)
    }
    private fun calculateBMI(weight: Float, height: Float): Float {
        return weight / ((height/100) * (height/100))
    }

    private fun validateInput(weight: String?, height: String?): Boolean {
        return when {
            weight.isNullOrEmpty() -> {
                Toast.makeText(this, "Weight is empty", Toast.LENGTH_SHORT).show()
                return false;
            }

            height.isNullOrEmpty() -> {
                Toast.makeText(this, "Height is empty", Toast.LENGTH_SHORT).show()
                return false
            }

            else -> true;
        }
    }

    private fun addListener() {

        bmiButton.setOnClickListener{
            var height = heightEditText.toString()
            var weight = weightEditText.toString()

            if (validateInput(weight, height)){
                var bmiResult = calculateBMI(height.toFloat(), weight.toFloat())
                bmiNumberDisplayTextView.text = bmiResult.toString()

                if(bmiResult <18.5){
                  bmiResultDisplayTextView.text = "UnderWeight"
                    bmiComment.text = "Under 18.5"
                }
                else if (bmiResult > 18.5 && bmiResult < 25){
                    bmiResultDisplayTextView.text = "Healthy"
                    bmiComment.text = "normal range is between 18.5 and 25"
                }
                else if (bmiResult > 25 && bmiResult < 29.99){
                    bmiResultDisplayTextView.text = "Overweight"
                    bmiComment.text = "Above 25"
                }
                else if (bmiResult > 29.99){
                    bmiResultDisplayTextView.text = "Obese"
                    bmiComment.text = "Above 29.99"
                }
            }
        }
    }



}