package com.johnbosco.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
import java.util.*

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val y=findViewById<Button>(R.id.buff2)
        y.setOnClickListener {
            val t=Intent(this,MainActivity::class.java)
            startActivity(t)
        }
        }
        fun bb(View:View){
            val DOB=findViewById<EditText>(R.id.edit1)
            val SHOWAGE=findViewById<TextView>(R.id.txt2)
            val userDOB: String = DOB.text.toString()
            if (userDOB.toInt() == 0) {
                SHOWAGE.text= "invalid input"
                return
            }
            val year: Int = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = year - userDOB.toInt()
            SHOWAGE.text = "Your age is $myAge"
        }
}