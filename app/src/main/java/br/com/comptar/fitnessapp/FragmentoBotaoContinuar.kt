package br.com.comptar.fitnessapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentoBotaoContinuar : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_fragmento_botao, container, false)

        val btnContinuar: Button = view.findViewById(R.id.btnContinuarFragmento)
        btnContinuar.setOnClickListener {
            val intent = Intent(requireContext(), PerguntaAcademia::class.java)
            startActivity(intent)
        }
        return view
    }
}