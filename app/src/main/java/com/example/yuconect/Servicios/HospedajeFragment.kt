package com.example.yuconect.Servicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterHospedaje
import com.example.yuconect.Adapter.Hospedaje
import com.example.yuconect.R

class HospedajeFragment : Fragment() {

    private lateinit var adapter: AdapterHospedaje
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Hospedaje>

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
        return inflater.inflate(R.layout.fragment_hospedaje, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvHospedaje)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterHospedaje(newArrayList)
        recyclerView.adapter = adapter

    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Hospedaje>()

        imageId = arrayOf(
            R.drawable.foto_h1,
            R.drawable.foto_h2,
            R.drawable.foto_h3

        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_h1),
            getString(R.string.nombre_servicio_h2),
            getString(R.string.nombre_servicio_h3),

        )
        horarios = arrayOf(
            getString(R.string.horario_h1),
            getString(R.string.horario_h2),
            getString(R.string.horario_h3),

            )

        precios = arrayOf(
            getString(R.string.precio_h1),
            getString(R.string.precio_h2),
            getString(R.string.precio_h3),

            )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_h1),
            getString(R.string.ubicacion_h2),
            getString(R.string.ubicacion_h3),

            )

        municipio = arrayOf(
            getString(R.string.municipio_h1),
            getString(R.string.municipio_h2),
            getString(R.string.municipio_h3),

            )

        contacto = arrayOf(
            getString(R.string.contacto_h1),
            getString(R.string.contacto_h2),
            getString(R.string.contacto_h3),

            )

        servicio = arrayOf(
            getString(R.string.servicio_h1),
            getString(R.string.servicio_h2),
            getString(R.string.servicio_h3),

            )

        for (i in imageId.indices) {
            val news = Hospedaje(
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
