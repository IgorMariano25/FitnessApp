package br.com.comptar.fitnessapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var exerciseCount = 0
    private lateinit var exerciseCountTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exerciseCountTextView = findViewById(R.id.exerciseCountTextView)
        val incrementButton: Button = findViewById(R.id.incrementButton)
        val resetButton: Button = findViewById(R.id.resetButton)

        incrementButton.setOnClickListener {
            exerciseCount++
            updateExerciseCount()
        }

        resetButton.setOnClickListener {
            exerciseCount = 0
            updateExerciseCount()
        }
    }

    private fun updateExerciseCount() {
        exerciseCountTextView.text = exerciseCount.toString()
    }
}
