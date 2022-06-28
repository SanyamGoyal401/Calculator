package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvInput : TextView
    var lastNumeric : Boolean = false;
    var lastDot : Boolean = false;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         tvInput = findViewById<TextView>(R.id.tvInput)

    }

    fun onDigit(view: android.view.View) {
        tvInput.append((view as Button).text);
        lastNumeric = true;
    }

    fun onClear(view: android.view.View) {
        tvInput.text = ""
        lastNumeric = false;
        lastDot = false;
    }

    fun onDecimal(view: android.view.View) {
        if(lastNumeric && !lastDot){
            tvInput.append(".")
            lastNumeric = false;
            lastDot = true;
        }
    }
}