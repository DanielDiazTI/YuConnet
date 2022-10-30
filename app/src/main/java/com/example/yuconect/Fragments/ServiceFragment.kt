package com.example.yuconect.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavGraph
import androidx.navigation.Navigation
import com.example.yuconect.*
import com.example.yuconect.Servicios.HospedajeFragment
import com.example.yuconect.databinding.FragmentServiceBinding


class ServiceFragment : Fragment() {
    //ViewBinding
    private var _binding: FragmentServiceBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentServiceBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Hospedaje
        binding.LayoutHospedaje.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutHospedaje, null))
        //Restaurante
        binding.LayoutRestaurante.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutRestaurante, null))
        //Turismo
        binding.LayoutTurismo.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutTurismo, null))
        //Gasolinera
        binding.LayoutGasolinera.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutGasolinera, null))
        //Servicio Partuculares
        binding.LayoutServiciosParticulares.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutServiciosParticulares, null))
        //Abarrotes
        binding.LayoutAbarrotes.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutAbarrotes, null))
        //Salud
        binding.LayoutSalud.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutSalud, null))
        //Servicios Publicos
        binding.LayoutServiciosPublicos.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.LayoutServiciosPublicos, null))

    }


}