package com.hoanghai.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity2 : AppCompatActivity() {

    private lateinit var GmailUpdate : EditText
    private lateinit var btnUpdate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        GmailUpdate = findViewById(R.id.edtMainMailUpDate)
        btnUpdate = findViewById(R.id.btnMainBack)

        GmailUpdate.setText(intent.getStringExtra("Name"))


        btnUpdate.setOnClickListener {
            backActivity()
        }

    }

    private fun backActivity() {
        var editText = findViewById<EditText>(R.id.edtMainMail)
        var message = editText.text.toString()
        finish()
    }
}