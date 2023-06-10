package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaAcademia : AppCompatActivity() {

    private lateinit var btnRespostaNenhumaAcademia: Button
    private lateinit var btnRespostaEntre_1_vez_e_2_vezes_Academia: Button
    private lateinit var btnRespostaEntre_2_vezes_e_3_vezes_Academia: Button
    private lateinit var btnRespostaEntre_3_vezes_e_4_vezes_Academia: Button
    private lateinit var btnRespostaMaisDe4Vezes_Academia: Button
    private lateinit var btnConfirmaRespostaActivityPergunta1: Button

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(0,189,133)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_academia)

        // Criando uma nova cor para adicionar ao botão
        val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

        // Alterando entre as telas ao clicar no botão de confirmar resposta
        btnConfirmaRespostaActivityPergunta1 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta1.setOnClickListener {
            val intent = Intent(this@PerguntaAcademia, PerguntaAgua::class.java)
            startActivity(intent)
        }

        // Altera a cor do botão com opção NENHUMA, caso seja a resposta selecionada
        btnRespostaNenhumaAcademia = findViewById<Button>(R.id.btnRespostaNenhumaAcademia)
        btnRespostaNenhumaAcademia.setOnClickListener {
            btnRespostaNenhumaAcademia.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaNenhumaAcademia.setTextColor(Color.WHITE)
        }

        // Altera a cor do botão com opção 1 VEZ - 2 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_1_vez_e_2_vezes_Academia = findViewById<Button>(R.id.btnRespostaEntre_1_vez_e_2_vezes_Academia)
        btnRespostaEntre_1_vez_e_2_vezes_Academia.setOnClickListener {
            btnRespostaEntre_1_vez_e_2_vezes_Academia.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_1_vez_e_2_vezes_Academia.setTextColor(Color.WHITE)
        }

        // Altera a cor do botão com opção 2 VEZES - 3 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_2_vezes_e_3_vezes_Academia = findViewById<Button>(R.id.btnRespostaEntre_2_vezes_e_3_vezes_Academia)
        btnRespostaEntre_2_vezes_e_3_vezes_Academia.setOnClickListener {
            btnRespostaEntre_2_vezes_e_3_vezes_Academia.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_2_vezes_e_3_vezes_Academia.setTextColor(Color.WHITE)
        }

        // Altera a cor do botão com opção 3 VEZES - 4 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_3_vezes_e_4_vezes_Academia = findViewById<Button>(R.id.btnRespostaEntre_3_vezes_e_4_vezes_Academia)
        btnRespostaEntre_3_vezes_e_4_vezes_Academia.setOnClickListener {
            btnRespostaEntre_3_vezes_e_4_vezes_Academia.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_3_vezes_e_4_vezes_Academia.setTextColor(Color.WHITE)
        }

        // Altera a cor do botão com opção MAIS DE 4 VEZES, caso seja a resposta selecionada
        btnRespostaMaisDe4Vezes_Academia = findViewById<Button>(R.id.btnRespostaMaisDe4Vezes_Academia)
        btnRespostaMaisDe4Vezes_Academia.setOnClickListener {
            btnRespostaMaisDe4Vezes_Academia.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMaisDe4Vezes_Academia.setTextColor(Color.WHITE)
        }
    }
}