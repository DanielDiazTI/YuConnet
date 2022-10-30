package com.example.yuconect.Servicios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterPublico
import com.example.yuconect.Adapter.Publico
import com.example.yuconect.R

class PublicoFragment : Fragment() {
    private lateinit var adapter: AdapterPublico
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Publico>

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
        return inflater.inflate(R.layout.fragment_publico, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvPublico)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterPublico(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Publico>()

        imageId = arrayOf(
            R.drawable.foto_sp1,
            R.drawable.foto_sp2,
            R.drawable.foto_sp3

        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_sp1),
            getString(R.string.nombre_servicio_sp2),
            getString(R.string.nombre_servicio_sp3),

            )
        horarios = arrayOf(
            getString(R.string.horario_sp1),
            getString(R.string.horario_sp2),
            getString(R.string.horario_sp3)

        )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_sp1),
            getString(R.string.ubicacion_sp2),
            getString(R.string.ubicacion_sp3)

        )

        municipio = arrayOf(
            getString(R.string.municipio_sp1),
            getString(R.string.municipio_sp2),
            getString(R.string.municipio_sp3)

        )
        contacto = arrayOf(
            getString(R.string.contacto_sp1),
            getString(R.string.contacto_sp2),
            getString(R.string.contacto_sp3)

        )

        servicio = arrayOf(
            getString(R.string.servicio_sp1),
            getString(R.string.servicio_sp2),
            getString(R.string.servicio_sp3)

        )

        for (i in imageId.indices) {
            val news = Publico(
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