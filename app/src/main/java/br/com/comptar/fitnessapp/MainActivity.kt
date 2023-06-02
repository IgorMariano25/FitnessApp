package br.com.comptar.fitnessapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var contadorKm = 0
    private lateinit var contadorKmTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contadorKmTextView = findViewById(R.id.contadorKmTextView)
        val adicionarKmButton: Button = findViewById(R.id.adicionarKmButton)
        val removerKmButton: Button = findViewById(R.id.removerKmButton)

        adicionarKmButton.setOnClickListener {
            contadorKm++
            updatecontadorKm()
        }

        removerKmButton.setOnClickListener {
            if (contadorKm > 0){
                contadorKm--
            } else {
                contadorKm = 0
            }

            updatecontadorKm()
        }
    }

    private fun updatecontadorKm() {
        contadorKmTextView.text = contadorKm.toString()
    }
}
