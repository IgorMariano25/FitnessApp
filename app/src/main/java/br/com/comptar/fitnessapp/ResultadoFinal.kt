package br.com.comptar.fitnessapp


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultadoFinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_final)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.btnRepositórioGitHub, FragmentoBotaoPortifolioGitHub())
                .commit()
        }

        val nomeInformado = SharedData.name

        val tvNomeResultadoFinal : TextView = findViewById(R.id.tvNomeResultadoFinal)
        tvNomeResultadoFinal.text = "Parabéns, $nomeInformado !"

        val btnSiteGrowth = findViewById<Button>(R.id.btnSiteGwothSuplementos)
        btnSiteGrowth.setOnClickListener {
            val URL = Uri.parse("https://www.gsuplementos.com.br/")
            val intent = Intent(Intent.ACTION_VIEW, URL)
            startActivity(intent)
        }

        val btnTelefoneGrowth = findViewById<Button>(R.id.btnTelefoneGrowthSuplementos)
        btnTelefoneGrowth.setOnClickListener {
            val telefone = Uri.parse("tel:1130033994")
            val intent = Intent(Intent.ACTION_DIAL, telefone)
            startActivity(intent)
        }

        val btEmailGrowth = findViewById<Button>(R.id.btnEmailGwothSuplementos)
        btEmailGrowth.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:")
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("sac@growthsupplements.com.br"))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Quanto está o kg do pó ?")
            intent.putExtra(Intent.EXTRA_TEXT, "É de whey Protein, galera, relaxa \uD83D\uDE02\uD83D\uDE02\uD83D\uDE02")
            startActivity(intent)
        }

        val ImageButtonLogotGrowthSite = findViewById<ImageButton>(R.id.ImageButtonLogoGrowthSuplementos)
        ImageButtonLogotGrowthSite.setOnClickListener {
            val URL = Uri.parse("https://www.gsuplementos.com.br/")
            val intent = Intent(Intent.ACTION_VIEW, URL)
            startActivity(intent)
        }
        exibirResultadoFinal()
    }

    private fun exibirResultadoFinal() {

        val tvNotaFitness = findViewById<TextView>(R.id.tvNotaFitness)
        tvNotaFitness.text = SharedData.totalScore.toString()

    }
}