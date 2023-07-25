package com.hoanghai.activity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var EditGmail : EditText
    private lateinit var btnSave : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave = findViewById(R.id.btnMainSave)

        btnSave.setOnClickListener {
            callActivity()
        }

    }

    private fun callActivity() {
        var editText = findViewById<EditText>(R.id.edtMainMail)
        var message = editText.text.toString()
        val Intent = Intent(this,Activity2::class.java)
        Intent.putExtra("Name",message)
        startActivity(Intent)
        }
    }