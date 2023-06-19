package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaObjetivo : AppCompatActivity(){

    private lateinit var btnRespostaEmagrecer : Button
    private lateinit var btnRespostaGanharMusculo : Button
    private lateinit var btnRespostaCondicionamentoFisico : Button
    private lateinit var btnRespostaSaude : Button
    private lateinit var btnRespostaEstetica : Button
    private lateinit var btnConfirmaRespostaActivityPergunta5: Button
    private var respostaSelecionada: Int = 0

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(0,189,133)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pergunta_objetivo)

        // Criando uma nova cor para adicionar ao botão
        val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

        btnConfirmaRespostaActivityPergunta5 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta5.setOnClickListener {
            val intent = Intent(this@PerguntaObjetivo, ResultadoFinal::class.java)
//            obterValorRespostaSelecionada()
            startActivity(intent)
        }

        // Altera a cor do botão com opção EMAGRECER, caso seja a resposta selecionada
        btnRespostaEmagrecer = findViewById<Button>(R.id.btnEmagrecer)
        btnRespostaEmagrecer.setOnClickListener {
            btnRespostaEmagrecer.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEmagrecer.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção GANHAR MUSCULO, caso seja a resposta selecionada
        btnRespostaGanharMusculo = findViewById<Button>(R.id.btnGanharMusculo)
        btnRespostaGanharMusculo.setOnClickListener {
            btnRespostaGanharMusculo.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaGanharMusculo.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção CONDICIONAMENTO FÍSICO, caso seja a resposta selecionada
        btnRespostaCondicionamentoFisico = findViewById<Button>(R.id.btnCondicionamentoFisico)
        btnRespostaCondicionamentoFisico.setOnClickListener {
            btnRespostaCondicionamentoFisico.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaCondicionamentoFisico.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opçãO SAÚDE, caso seja a resposta selecionada
        btnRespostaSaude = findViewById<Button>(R.id.btnSaude)
        btnRespostaSaude.setOnClickListener {
            btnRespostaSaude.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaSaude.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opçãO ESTÉTICA, caso seja a resposta selecionada
        btnRespostaEstetica = findViewById<Button>(R.id.btnEstetica)
        btnRespostaEstetica.setOnClickListener {
            btnRespostaEstetica.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEstetica.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }
        DesabilitarButtonConfirmarRespoasta()
    }

    // Função para adicionar um valor ao botão quando ele for clicacado
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
        btnConfirmaRespostaActivityPergunta5.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta5.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmaRespostaActivityPergunta5.isEnabled = true
    }

    //Função que mantém o botão de confirmar resposta desabilitado até que alguma opção seja selecionada
    private fun DesabilitarButtonConfirmarRespoasta() {
        btnConfirmaRespostaActivityPergunta5.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta5.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta5.isEnabled = false
    }
}
