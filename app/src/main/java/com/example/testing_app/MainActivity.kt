package com.example.testing_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), ButtonClick {
    private var txt = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.contain1, Frag_1())
            .commit()
        /**val textV:EditText = findViewById(R.id.txt)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val inp = textV.text.toString()
            val data = Intent(this, SecondActivity::class.java).apply {
            }
            data.putExtra("msg", inp)
            startActivity(data)
        }*/
    }

    override fun onClick() {
        txt = "Trello"
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.contain1, Frag_2.newInstance(txt))
            .commit()
    }
}