package com.example.yuconect.Servicios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterRestaurante
import com.example.yuconect.Adapter.AdapterTurismo
import com.example.yuconect.Adapter.Restaurante
import com.example.yuconect.Adapter.Turismo
import com.example.yuconect.R


class TurismoFragment : Fragment() {

    private lateinit var adapter: AdapterTurismo
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Turismo>

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
        return inflater.inflate(R.layout.fragment_turismo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvTurismo)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterTurismo(newArrayList)
        recyclerView.adapter = adapter

    }
    private fun dataInitialize() {
        newArrayList = arrayListOf<Turismo>()

        imageId = arrayOf(
            R.drawable.foto_t1,
            R.drawable.foto_t2,
            R.drawable.foto_t3

        )
        nombre = arrayOf(
            getString(R.string.nombre_servicio_t1),
            getString(R.string.nombre_servicio_t2),
            getString(R.string.nombre_servicio_t3),

            )
        horarios = arrayOf(
            getString(R.string.horario_t1),
            getString(R.string.horario_t2),
            getString(R.string.horario_t3),

            )

        precios = arrayOf(
            getString(R.string.precio_t1),
            getString(R.string.precio_t2),
            getString(R.string.precio_t3),

            )

        ubicacion = arrayOf(
            getString(R.string.ubicacion_t1),
            getString(R.string.ubicacion_t2),
            getString(R.string.ubicacion_t3),

            )
        municipio = arrayOf(
            getString(R.string.municipio_t1),
            getString(R.string.municipio_t2),
            getString(R.string.municipio_t3),

            )
        contacto = arrayOf(
            getString(R.string.contacto_t1),
            getString(R.string.contacto_t2),
            getString(R.string.contacto_t3),

            )

        servicio = arrayOf(
            getString(R.string.servicio_t1),
            getString(R.string.servicio_t2),
            getString(R.string.servicio_t3),

            )

        for (i in imageId.indices) {
            val news = Turismo(
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