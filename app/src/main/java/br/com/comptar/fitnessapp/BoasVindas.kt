package br.com.comptar.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BoasVindas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_boas_vindas)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.btnContinuarFrameLayout, FragmentoBotao())
                .commit()
        }

        //Obtém o nome passado na activity anterior
        val nomeInformado = intent.getStringExtra("name")

        //Exibe a mensagem de boas-vindas com o nome informado
        val tvBoasVindas : TextView = findViewById(R.id.tvBoasVindas)
        tvBoasVindas.text = "Bem-vindo, $nomeInformado!"

        val btnContinuar: FrameLayout = findViewById(R.id.btnContinuarFrameLayout)
        btnContinuar.setOnClickListener {
            val intent = Intent(this@BoasVindas, PerguntaAcademia::class.java)
            startActivity(intent)
        }
    }
}