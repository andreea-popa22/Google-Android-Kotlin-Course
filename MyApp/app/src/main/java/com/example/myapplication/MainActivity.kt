package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private var diceRollCounter: Int = 0
    private lateinit var rollDiceNumber: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDiceNumber = findViewById(R.id.textView)
        rollDiceNumber.text = diceRollCounter.toString()
        val rollDice: Button = findViewById(R.id.button)
        rollDice.setOnClickListener {
            diceRollCounter++
            rollDiceNumber.text = diceRollCounter.toString()
        }
    }
}