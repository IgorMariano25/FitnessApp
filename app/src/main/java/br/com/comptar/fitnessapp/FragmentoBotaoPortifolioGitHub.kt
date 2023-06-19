package br.com.comptar.fitnessapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout

class FragmentoBotaoPortifolioGitHub : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_fragmento_botao_projeto_github, container, false)

        val btnRepositorioDoProjeto: Button = view.findViewById(R.id.btnFragmentoRepositorioGitHub)
        btnRepositorioDoProjeto.setOnClickListener {
            val URL = Uri.parse("https://github.com/IgorMariano25/FitnessApp")
            val intent = Intent(Intent.ACTION_VIEW, URL)
            startActivity(intent)
        }
        return view
    }
}