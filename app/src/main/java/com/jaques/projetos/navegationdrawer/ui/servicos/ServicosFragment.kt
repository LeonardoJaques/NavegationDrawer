package com.jaques.projetos.navegationdrawer.ui.servicos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.jaques.projetos.navegationdrawer.R

/**
 * A simple [Fragment] subclass.
 */
class ServicosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_servicos, container, false)
    }

}
