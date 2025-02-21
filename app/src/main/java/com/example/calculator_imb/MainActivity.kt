package com.example.calculator_imb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.BaseTransientBottomBar
import java.awt.font.TextAttribute

class MainActivity : AppCompatActivity() {

    lateinit var heightEditText : EditText
    lateinit var weightEditText:EditText
    lateinit var calculateBottomBar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heightEditText= findViewById(R.id.heigtEditText)
        weightEditText= findViewById(R.id.weigtEditTex)
        calculateBottomBar = findViewById(R.id.button)

    }
}