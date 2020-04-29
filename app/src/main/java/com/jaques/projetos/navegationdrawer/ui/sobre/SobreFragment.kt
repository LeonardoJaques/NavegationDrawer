package com.jaques.projetos.navegationdrawer.ui.sobre

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.jaques.projetos.navegationdrawer.R
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element

/**
 * A simple [Fragment] subclass.
 */
class SobreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false)
        val descricao =
            "A ATM Consultoria tem como missão apoiar organizações que desejam " +
                    "alcançar sucesso através da excelência em gestão e da busca pelo qualidade"

       val versao = Element()
           versao.setTitle("Versão 1.0")
        val aboutPage =
            AboutPage(activity)
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em Contato ")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://leonardojaques.github.io/","Meu site pessoal")

                .addGroup("Redes sociais")
                .addGitHub("leonardojaques","GitHub").addTwitter("@lajaques","Twitter pessoal")

                .addItem(versao)
                .create()
        return aboutPage
    }

}
