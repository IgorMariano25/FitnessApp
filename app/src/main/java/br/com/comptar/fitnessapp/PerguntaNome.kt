package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class PerguntaNome : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_nome)

    val btnContinuar: Button = findViewById(R.id.btnContinuar)
    btnContinuar.setOnClickListener {
        val editTextNomeInformado: EditText = findViewById(R.id.editTextNomeInformado)
        val nomeInformado = editTextNomeInformado.text.toString().trim()
        if (nomeInformado.isNotEmpty() && nomeInformado != "Por favor, insira um nome !" ){
            val intent = Intent(this@PerguntaNome, MainActivity::class.java)
            intent.putExtra("name", nomeInformado)
            startActivity(intent)
        } else {
            editTextNomeInformado.setTextColor(Color.RED)
            editTextNomeInformado.setText("Por favor, insira um nome !")
            editTextNomeInformado.setTypeface(null, Typeface.BOLD_ITALIC)
            editTextNomeInformado.setTextSize(18f)
            editTextNomeInformado.error = "Você deve inserir um nome para prosseguir"
            editTextNomeInformado.setOnClickListener {
                editTextNomeInformado.setText("")
                editTextNomeInformado.setTextColor(Color.BLACK)
                editTextNomeInformado.setTypeface(null, Typeface.BOLD_ITALIC)
                editTextNomeInformado.setTextSize(24f)
            }
            }
        }
    }
}