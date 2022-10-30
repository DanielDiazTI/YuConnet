package com.example.yuconect.Servicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.Abarrotes
import com.example.yuconect.Adapter.AdapterAbarrotes
import com.example.yuconect.Adapter.AdapterParticulares
import com.example.yuconect.Adapter.Particulares
import com.example.yuconect.R

class AbarrotesFragment : Fragment() {

    private lateinit var adapter: AdapterAbarrotes
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Abarrotes>

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
        return inflater.inflate(R.layout.fragment_abarrotes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvAbarrotes)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterAbarrotes(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Abarrotes>()

        imageId = arrayOf(
            R.drawable.foto_a1,
            R.drawable.foto_a2,
            R.drawable.foto_a3

        )

        nombre = arrayOf(
            getString(R.string.nombre_servicio_a1),
            getString(R.string.nombre_servicio_a2),
            getString(R.string.nombre_servicio_a3)

            )

        horarios = arrayOf(
            getString(R.string.horario_a1),
            getString(R.string.horario_a2),
            getString(R.string.horario_a3)

            )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_a1),
            getString(R.string.ubicacion_a2),
            getString(R.string.ubicacion_a3)

            )

        municipio = arrayOf(
            getString(R.string.municipio_a1),
            getString(R.string.municipio_a2),
            getString(R.string.municipio_a3)

            )
        contacto = arrayOf(
            getString(R.string.contacto_a1),
            getString(R.string.contacto_a2),
            getString(R.string.contacto_a3)

            )

        servicio = arrayOf(
            getString(R.string.servicio_a1),
            getString(R.string.servicio_a2),
            getString(R.string.servicio_a3)

            )

        for (i in imageId.indices) {
            val news = Abarrotes(
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