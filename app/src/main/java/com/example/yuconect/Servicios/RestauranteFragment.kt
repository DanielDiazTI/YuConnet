package com.example.yuconect.Servicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterHospedaje
import com.example.yuconect.Adapter.AdapterRestaurante
import com.example.yuconect.Adapter.Hospedaje
import com.example.yuconect.Adapter.Restaurante
import com.example.yuconect.R


class RestauranteFragment : Fragment() {

    private lateinit var adapter: AdapterRestaurante
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Restaurante>

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
        return inflater.inflate(R.layout.fragment_restaurante, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvRestaurante)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterRestaurante(newArrayList)
        recyclerView.adapter = adapter

    }
    private fun dataInitialize() {
        newArrayList = arrayListOf<Restaurante>()

        imageId = arrayOf(
            R.drawable.foto_r1,
            R.drawable.foto_r2,
            R.drawable.foto_r3

        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_r1),
            getString(R.string.nombre_servicio_r2),
            getString(R.string.nombre_servicio_r3),

            )
        horarios = arrayOf(
            getString(R.string.horario_r1),
            getString(R.string.horario_r2),
            getString(R.string.horario_r3),

            )

        precios = arrayOf(
            getString(R.string.precio_r1),
            getString(R.string.precio_r2),
            getString(R.string.precio_r3),

            )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_r1),
            getString(R.string.ubicacion_r2),
            getString(R.string.ubicacion_r3),

            )

        municipio = arrayOf(
            getString(R.string.municipio_r1),
            getString(R.string.municipio_r2),
            getString(R.string.municipio_r3),

            )
        contacto = arrayOf(
            getString(R.string.contacto_r1),
            getString(R.string.contacto_r2),
            getString(R.string.contacto_r3),

            )

        servicio = arrayOf(
            getString(R.string.servicio_r1),
            getString(R.string.servicio_r2),
            getString(R.string.servicio_r3),

            )

        for (i in imageId.indices) {
            val news = Restaurante(
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