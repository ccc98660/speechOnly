package com.example.speechonly

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {
   var but:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        but = findViewById(R.id.but)
        but!!.setOnClickListener(){}
    }

    override fun onClick(v: View?) {

    }

    }
