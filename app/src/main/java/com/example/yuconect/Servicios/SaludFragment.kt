package com.example.yuconect.Servicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterSalud
import com.example.yuconect.Adapter.Salud
import com.example.yuconect.R


class SaludFragment : Fragment() {

    private lateinit var adapter: AdapterSalud
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Salud>

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
        return inflater.inflate(R.layout.fragment_salud, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvSalud)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterSalud(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Salud>()

        imageId = arrayOf(
            R.drawable.foto_s1,
            R.drawable.foto_s2,
            R.drawable.foto_s3
        )

        nombre = arrayOf(
            getString(R.string.nombre_servicio_s1),
            getString(R.string.nombre_servicio_s2),
            getString(R.string.nombre_servicio_s3)
        )

        horarios = arrayOf(
            getString(R.string.horario_s1),
            getString(R.string.horario_s2),
            getString(R.string.horario_s3)
        )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_s1),
            getString(R.string.ubicacion_s2),
            getString(R.string.ubicacion_s3)
        )

        municipio = arrayOf(
            getString(R.string.municipio_s1),
            getString(R.string.municipio_s2),
            getString(R.string.municipio_s3)
        )

        contacto = arrayOf(
            getString(R.string.contacto_s1),
            getString(R.string.contacto_s2),
            getString(R.string.contacto_s3)
        )

        servicio = arrayOf(
            getString(R.string.servicio_s1),
            getString(R.string.servicio_s2),
            getString(R.string.servicio_s3)

        )

        for (i in imageId.indices) {
            val news = Salud(
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