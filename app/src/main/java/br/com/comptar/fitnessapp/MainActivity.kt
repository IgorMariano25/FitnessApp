package br.com.comptar.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtém o nome passado na activity anterior
        val nomeInformado = intent.getStringExtra("name")

        // Exibe a mensagem de boas-vindas com o nome informado
        val tvBoasVindas : TextView = findViewById(R.id.tvBoasVindas)
        tvBoasVindas.text = "Bem-vindo, $nomeInformado!"
    }
}