package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val x = et.text.toString()
            if (x.isNotEmpty()) {
                val y = Calendar.getInstance().get(Calendar.YEAR)
                val age = y - x.toInt()
                var output = ""
                when (age) {
                    in 0..17 -> output = "Underage"
                    in 18..65 -> output = "Young People"
                    in 66..79 -> output = "Middle-aged"
                    in 80..99 -> output = "Elderly"
                    else -> {
                        output = "Long Lived Elderly"
                    }
                }
                tv.text = "Your age is $age"
                tv2.text = "$output"
            } else {
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show();
            }
        }
    }
}