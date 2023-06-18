package br.com.comptar.fitnessapp

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerguntaAgua : AppCompatActivity() {

    private lateinit var btnRespostaMenosDe1Litro : Button
    private lateinit var btnRespostabtnEntre_1_Litro_e_2_litros : Button
    private lateinit var btnRespostaEntre_2_Litros_e_3_litros : Button
    private lateinit var btnRespostaEntre_3_Litros_e_4_litros : Button
    private lateinit var btnRespostaMaisDe4Litros : Button
    private lateinit var btnConfirmaRespostaActivityPergunta2: Button
    private var respostaSelecionada: Int = 0

    //Criando cor para o botão desabilitado
    val cor_cinza_btn_desabilitado = Color.rgb(128,128,128)
    //Criando cor para o botão habilitado
    val cor_verde_btn_habilitado = Color.rgb(0,189,133)

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_pergunta_agua)

        // Criando uma nova cor para adicionar ao botão
        val cor_cinza_btn_clicado = Color.rgb(97, 97, 97)

        // Alterando entre as telas ao clicar no botão de confirmar resposta
        btnConfirmaRespostaActivityPergunta2 = findViewById<Button>(R.id.btnConfResp)
        btnConfirmaRespostaActivityPergunta2.setOnClickListener {
            val intent = Intent(this@PerguntaAgua, PerguntaFastFood::class.java)
//            obterValorRespostaSelecionada()
            startActivity(intent)
        }

        // Altera a cor do botão com opção Menos de 1 litros, caso seja a resposta selecionada
        btnRespostaMenosDe1Litro = findViewById<Button>(R.id.btnMenosDe1Litro)
        btnRespostaMenosDe1Litro.setOnClickListener{
            btnRespostaMenosDe1Litro.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMenosDe1Litro.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 5
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção 1 LITRO - 2 LITROS, caso seja a resposta selecionada
        btnRespostabtnEntre_1_Litro_e_2_litros = findViewById<Button>(R.id.btnEntre_1_Litro_e_2_litros)
        btnRespostabtnEntre_1_Litro_e_2_litros.setOnClickListener {
            btnRespostabtnEntre_1_Litro_e_2_litros.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostabtnEntre_1_Litro_e_2_litros.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 8
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção 2 LITROS - 3 LITROS, caso seja a resposta selecionada
        btnRespostaEntre_2_Litros_e_3_litros = findViewById<Button>(R.id.btnEntre_2_Litros_e_3_litros)
        btnRespostaEntre_2_Litros_e_3_litros.setOnClickListener {
            btnRespostaEntre_2_Litros_e_3_litros.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_2_Litros_e_3_litros.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 12
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção 3 LITROS - 4 LITROS, caso seja a resposta selecionada
        btnRespostaEntre_3_Litros_e_4_litros = findViewById<Button>(R.id.btnEntre_3_Litros_e_4_litros)
        btnRespostaEntre_3_Litros_e_4_litros.setOnClickListener {
            btnRespostaEntre_3_Litros_e_4_litros.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaEntre_3_Litros_e_4_litros.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 18
            HabiltarButtonConfirmarResposta()
        }

        // Altera a cor do botão com opção MAIS DE 4 LITROS, caso seja a resposta selecionada
        btnRespostaMaisDe4Litros = findViewById<Button>(R.id.btnMaisDe4Litros)
        btnRespostaMaisDe4Litros.setOnClickListener {
            btnRespostaMaisDe4Litros.setBackgroundColor(cor_cinza_btn_clicado)
            btnRespostaMaisDe4Litros.setTextColor(Color.WHITE)
            respostaSelecionada = it.id
            SharedData.totalScore += 20
            HabiltarButtonConfirmarResposta()
        }
        DesabilitarButtonConfirmarResposta()
    }

    // Função para adicionar um valor ao botão quando ele for clicacado
    // Função para adicionar um valor ao botão quando ele for clicacado
//    fun obterValorRespostaSelecionada() {
//        when (respostaSelecionada) {
//            R.id.btnMenosDe1Litro -> {
//                SharedData.totalScore += 5
//                SharedData.lastPoints = 5
//            }
//            R.id.btnEntre_1_Litro_e_2_litros -> {
//                SharedData.totalScore += 8
//                SharedData.lastPoints = 8
//            }
//            R.id.btnEntre_2_Litros_e_3_litros -> {
//                SharedData.totalScore += 12
//                SharedData.lastPoints = 12
//            }
//            R.id.btnEntre_3_Litros_e_4_litros -> {
//                SharedData.totalScore += 18
//                SharedData.lastPoints = 18
//            }
//            R.id.btnMaisDe4Litros -> {
//                SharedData.totalScore += 20
//                SharedData.lastPoints = 20
//            }
//        }
//    }

    //Função que habilita o botão de confirmar resposta quando alguma opção é selecionada
    private fun HabiltarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta2.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta2.setBackgroundColor(cor_verde_btn_habilitado)
        btnConfirmaRespostaActivityPergunta2.isEnabled = true
    }

    //Função que mantém o botão de confirmar resposta desabilitado até que alguma opção seja selecionada
    private fun DesabilitarButtonConfirmarResposta() {
        btnConfirmaRespostaActivityPergunta2.setTextColor(Color.WHITE)
        btnConfirmaRespostaActivityPergunta2.setBackgroundColor(cor_cinza_btn_desabilitado)
        btnConfirmaRespostaActivityPergunta2.isEnabled = false
    }
}