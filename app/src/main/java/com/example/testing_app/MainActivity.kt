package com.example.testing_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

interface FragClickListen {
    fun onClick()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**val textV:EditText = findViewById(R.id.txt)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val inp = textV.text.toString()
            val data = Intent(this, SecondActivity::class.java).apply {
            }
            data.putExtra("msg", inp)
            startActivity(data)
        }*/

        supportFragmentManager.beginTransaction().add(R.id.contain, Frag_1()).commit()
    }
}