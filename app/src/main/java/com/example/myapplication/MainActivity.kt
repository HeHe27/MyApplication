package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomInt1 = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val ans = randomInt + randomInt1 + randomInt2

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.num2)
        val resultText2: TextView = findViewById(R.id.num3)
        val total: TextView = findViewById(R.id.total)

        total.visibility = View.VISIBLE
        resultText1.visibility = View.VISIBLE
        resultText2.visibility = View.VISIBLE

        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()
        total.text = ans.toString()


    }

}
