package com.example.yuconect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterPromociones
import com.example.yuconect.Adapter.Inicio
import com.example.yuconect.Adapter.Promociones
import com.example.yuconect.R


class PromotionsFragment : Fragment() {

    private lateinit var adapter: AdapterPromociones
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Promociones>

    private lateinit var imageId: Array<Int>
    lateinit var NombreEmpresa: Array<String>
    lateinit var DescripcionEmpresa: Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_promotions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvpromociones)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterPromociones(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Promociones>()

        imageId = arrayOf(
            R.drawable.foto_p1,
            R.drawable.foto_p2,
            R.drawable.foto_p3,
            R.drawable.foto_p4,
            R.drawable.foto_p5,
            R.drawable.foto_p6,


        )
        NombreEmpresa = arrayOf(
            getString(R.string.nombre_p1),
            getString(R.string.nombre_p2),
            getString(R.string.nombre_p3),
            getString(R.string.nombre_p4),
            getString(R.string.nombre_p5),
            getString(R.string.nombre_p6),

        )
        DescripcionEmpresa = arrayOf(
            getString(R.string.descripcion_p1),
            getString(R.string.descripcion_p2),
            getString(R.string.descripcion_p3),
            getString(R.string.descripcion_p4),
            getString(R.string.descripcion_p5),
            getString(R.string.descripcion_p6),

        )
        
        for (i in imageId.indices) {
            val news = Promociones(
                imageId[i],
                NombreEmpresa[i],
                DescripcionEmpresa[i]
            )
            newArrayList.add(news)

        }

    }

}