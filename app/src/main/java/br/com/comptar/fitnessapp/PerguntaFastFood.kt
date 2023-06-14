package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaFastFood : AppCompatActivity() {

    private lateinit var btnRespostaNenhumaFastFood : Button
    private lateinit var btnRespostaEntre_1_vez_e_2_vezes_Fast_Food : Button
    private lateinit var btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food : Button
    private lateinit var btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food : Button
    private lateinit var btnRespostaMaisDe4Vezes_Fast_Food : Button
    private lateinit var btnConfirmaRespostaActivityPergunta3 : Button
    private var respostaSelecionada: Int = 0

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(0,189,133)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_pergunta_fast_food)

        //Criando uma nova cor para adicionar ao botão
        val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

        //Alterando entre as telas ao clicar no botão de confirmar resposta
        btnConfirmaRespostaActivityPergunta3 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta3.setOnClickListener {
            val intent = Intent(this@PerguntaFastFood, PerguntaHorasDormidas::class.java)
//            obterValorRespostaSelecionada()
            startActivity(intent)
        }

        //Altera a cor do botão com opção NENHUMA, caso seja a resposta selecionada
        btnRespostaNenhumaFastFood = findViewById<Button>(R.id.btnRespostaNenhumaFastFood)
        btnRespostaNenhumaFastFood.setOnClickListener {
            btnRespostaNenhumaFastFood.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaNenhumaFastFood.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }

        //Altera a cor do botão com opção 1 VEZ - 2 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_1_vez_e_2_vezes_Fast_Food = findViewById<Button>(R.id.btnRespostaEntre_1_vez_e_2_vezes_Fast_Food)
        btnRespostaEntre_1_vez_e_2_vezes_Fast_Food.setOnClickListener {
            btnRespostaEntre_1_vez_e_2_vezes_Fast_Food.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_1_vez_e_2_vezes_Fast_Food.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 18
            HabiltarButtonConfirmarResposta()
        }

        //Altera a cor do botão com opção 2 VEZES - 3 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food = findViewById<Button>(R.id.btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food)
        btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food.setOnClickListener {
            btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 12
            HabiltarButtonConfirmarResposta()
        }

        //Altera a cor do botão com opção 3 VEZES - 4 VEZES, caso seja a resposta selecionada
        btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food = findViewById<Button>(R.id.btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food)
        btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food.setOnClickListener {
            btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 8
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção MAIS DE 4 VEZES, caso seja a resposta selecionada
        btnRespostaMaisDe4Vezes_Fast_Food = findViewById<Button>(R.id.btnRespostaMaisDe4Vezes_Fast_Food)
        btnRespostaMaisDe4Vezes_Fast_Food.setOnClickListener {
            btnRespostaMaisDe4Vezes_Fast_Food.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMaisDe4Vezes_Fast_Food.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 5
            HabiltarButtonConfirmarResposta()
        }
            DesabilitarButtonConfirmarRespoasta()
        }

    // Função para adicionar um valor ao botão quando ele for clicacado
//    fun obterValorRespostaSelecionada() {
//        when (respostaSelecionada) {
//            R.id.btnRespostaNenhumaFastFood -> {
//                SharedData.totalScore += 5
//                SharedData.lastPoints = 5
//            }
//            R.id.btnRespostaEntre_1_vez_e_2_vezes_Fast_Food -> {
//                SharedData.totalScore += 8
//                SharedData.lastPoints = 8
//            }
//            R.id.btnRespostaEntre_2_vezes_e_3_vezes_Fast_Food -> {
//                SharedData.totalScore += 12
//                SharedData.lastPoints = 12
//            }
//            R.id.btnRespostaEntre_3_vezes_e_4_vezes_Fast_Food -> {
//                SharedData.totalScore += 18
//                SharedData.lastPoints = 18
//            }
//            R.id.btnRespostaMaisDe4Vezes_Fast_Food -> {
//                SharedData.totalScore += 20
//                SharedData.lastPoints = 20
//            }
//        }
//    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta3.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta3.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmaRespostaActivityPergunta3.isEnabled = true
    }

    //Função que mantém o botão de confirmar resposta desabilitado até que alguma opção seja selecionada
    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfirmaRespostaActivityPergunta3.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta3.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta3.isEnabled = false
    }
}