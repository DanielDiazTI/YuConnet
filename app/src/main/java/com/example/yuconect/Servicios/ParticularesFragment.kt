package com.example.yuconect.Servicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterParticulares
import com.example.yuconect.Adapter.AdapterRestaurante
import com.example.yuconect.Adapter.Particulares
import com.example.yuconect.Adapter.Restaurante
import com.example.yuconect.R


class ParticularesFragment : Fragment() {

    private lateinit var adapter: AdapterParticulares
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Particulares>

    private lateinit var imageId: Array<Int>
    lateinit var nombre: Array<String>
    lateinit var horarios: Array<String>
    lateinit var ubicacion: Array<String>
    lateinit var municipio: Array<String>
    lateinit var contacto: Array<String>
    lateinit var servicio: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_particulares, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvParticulares)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterParticulares(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Particulares>()

        imageId = arrayOf(
            R.drawable.foto_si1,
            R.drawable.foto_si2,
            R.drawable.foto_si3

        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_si1),
            getString(R.string.nombre_servicio_si2),
            getString(R.string.nombre_servicio_si3),

            )
        horarios = arrayOf(
            getString(R.string.horario_si1),
            getString(R.string.horario_si2),
            getString(R.string.horario_si3),

            )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_si1),
            getString(R.string.ubicacion_si2),
            getString(R.string.ubicacion_si3),

            )

        municipio = arrayOf(
            getString(R.string.municipio_si1),
            getString(R.string.municipio_si2),
            getString(R.string.municipio_si3),

            )
        contacto = arrayOf(
            getString(R.string.contacto_si1),
            getString(R.string.contacto_si2),
            getString(R.string.contacto_si3),

            )

        servicio = arrayOf(
            getString(R.string.servicio_si1),
            getString(R.string.servicio_si2),
            getString(R.string.servicio_si3),

            )

        for (i in imageId.indices) {
            val news = Particulares(
                imageId[i],
                nombre[i],
                horarios[i],
                ubicacion[i],
                municipio[i],
                contacto[i],
                servicio[i]
            )
            newArrayList.add(news)

        }

    }

}