package br.com.comptar.fitnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaObjetivo : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_objetivo)

        val btnActivityPergunta5 = findViewById<Button>(R.id.btnConfResp)
        btnActivityPergunta5.setOnClickListener {
            val intent = Intent(this@PerguntaObjetivo, ResultadoFinal::class.java)
            startActivity(intent)
        }
    }
}
