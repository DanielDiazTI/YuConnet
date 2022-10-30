package com.example.yuconect.Servicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterGasolinera
import com.example.yuconect.Adapter.AdapterRestaurante
import com.example.yuconect.Adapter.Gasolinera
import com.example.yuconect.Adapter.Restaurante
import com.example.yuconect.R


class GasolineraFragment : Fragment() {

    private lateinit var adapter: AdapterGasolinera
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Gasolinera>

    private lateinit var imageId: Array<Int>
    lateinit var nombre: Array<String>
    lateinit var horarios: Array<String>
    lateinit var precios: Array<String>
    lateinit var ubicacion: Array<String>
    lateinit var municipio: Array<String>
    lateinit var contacto: Array<String>
    lateinit var servicio: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gasolinera, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvGasolinera)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterGasolinera(newArrayList)
        recyclerView.adapter = adapter

    }
    private fun dataInitialize() {
        newArrayList = arrayListOf<Gasolinera>()

        imageId = arrayOf(
            R.drawable.foto_g1,
            R.drawable.foto_g2,
            R.drawable.foto_g3,


        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_g1),
            getString(R.string.nombre_servicio_g2),
            getString(R.string.nombre_servicio_g3),

            )
        horarios = arrayOf(
            getString(R.string.horario_g1),
            getString(R.string.horario_g2),
            getString(R.string.horario_g3),

            )

        precios = arrayOf(
            getString(R.string.precio_g1),
            getString(R.string.precio_g2),
            getString(R.string.precio_g3),

            )
        ubicacion = arrayOf(
            getString(R.string.ubicacion_g1),
            getString(R.string.ubicacion_g2),
            getString(R.string.ubicacion_g3),

            )

        municipio = arrayOf(
            getString(R.string.municipio_g1),
            getString(R.string.municipio_g2),
            getString(R.string.municipio_g3),

            )
        contacto = arrayOf(
            getString(R.string.contacto_g1),
            getString(R.string.contacto_g2),
            getString(R.string.contacto_g3),

            )

        servicio = arrayOf(
            getString(R.string.servicio_g1),
            getString(R.string.servicio_g2),
            getString(R.string.servicio_g3),

            )

        for (i in imageId.indices) {
            val news = Gasolinera(
                imageId[i],
                nombre[i],
                horarios[i],
                precios[i],
                ubicacion[i],
                municipio[i],
                contacto[i],
                servicio[i]
            )
            newArrayList.add(news)

        }

    }

}