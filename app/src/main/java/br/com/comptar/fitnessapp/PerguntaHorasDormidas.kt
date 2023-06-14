package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaHorasDormidas : AppCompatActivity() {

    private lateinit var btnRespostaMenosDe5Horas : Button
    private lateinit var btnRespostaEntre_5_horas_e_6_horas : Button
    private  lateinit var btnRespostaEntre_6_horas_e_7_horas : Button
    private lateinit var btnRespostaEntre_7_horas_e_8_horas : Button
    private lateinit var btnRespostaMaisDe8Horas : Button
    private lateinit var btnConfirmaRespostaActivityPergunta4: Button
    private var respostaSelecionada: Int = 0

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(0,189,133)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_horas_dormidas)

        // Criando uma nova cor para adicionar ao botão
        val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

        btnConfirmaRespostaActivityPergunta4 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta4.setOnClickListener {
            val intent = Intent(this@PerguntaHorasDormidas, PerguntaObjetivo::class.java)
//            obterValorRespostaSelecionada()
            startActivity(intent)
        }

        // Altera a cor do botão com opção MENOS DE 5 HORAS, caso seja a resposta selecionada
        btnRespostaMenosDe5Horas = findViewById<Button>(R.id.btnMenosDe5Horas)
        btnRespostaMenosDe5Horas.setOnClickListener {
            btnRespostaMenosDe5Horas.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMenosDe5Horas.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 5
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção ENTRE 5 HORAS E 6 HORAS, caso seja a resposta selecionada
        btnRespostaEntre_5_horas_e_6_horas = findViewById<Button>(R.id.btnEntre_5_horas_e_6_horas)
        btnRespostaEntre_5_horas_e_6_horas.setOnClickListener {
            btnRespostaEntre_5_horas_e_6_horas.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_5_horas_e_6_horas.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 8
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção ENTRE 6 HORAS E 7 HORAS, caso seja a resposta selecionada
        btnRespostaEntre_6_horas_e_7_horas = findViewById<Button>(R.id.btnEntre_6_horas_e_7_horas)
        btnRespostaEntre_6_horas_e_7_horas.setOnClickListener {
            btnRespostaEntre_6_horas_e_7_horas.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_6_horas_e_7_horas.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 12
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção ENTRE 7 HORAS E 8 HORAS, caso seja a resposta selecionada
        btnRespostaEntre_7_horas_e_8_horas = findViewById<Button>(R.id.btnEntre_7_horas_e_8_horas)
        btnRespostaEntre_7_horas_e_8_horas.setOnClickListener {
            btnRespostaEntre_7_horas_e_8_horas.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_7_horas_e_8_horas.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 18
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção MAIS DE 8 HORAS, caso seja a resposta selecionada
        btnRespostaMaisDe8Horas = findViewById<Button>(R.id.btnMaisDe8Horas)
        btnRespostaMaisDe8Horas.setOnClickListener {
            btnRespostaMaisDe8Horas.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMaisDe8Horas.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }
        DesabilitarButtonConfirmarRespoasta()
    }

    // Função para adicionar um valor ao botão quando ele for clicacado
//    fun obterValorRespostaSelecionada(){
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
        btnConfirmaRespostaActivityPergunta4.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta4.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmaRespostaActivityPergunta4.isEnabled = true
    }

    //Função que mantém o botão de confirmar resposta desabilitado até que alguma opção seja selecionada
    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfirmaRespostaActivityPergunta4.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta4.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta4.isEnabled = false
    }
}