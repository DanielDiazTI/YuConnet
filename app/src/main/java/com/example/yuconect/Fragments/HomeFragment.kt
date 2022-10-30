package com.example.yuconect.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.Adapter.AdapterInicio
import com.example.yuconect.Adapter.Inicio
import com.example.yuconect.R

class HomeFragment : Fragment() {

    private lateinit var adapter: AdapterInicio
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Inicio>

    private lateinit var imageId: Array<Int>
    lateinit var nombre: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataInitialize()

        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.rvInicio)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = AdapterInicio(newArrayList)
        recyclerView.adapter = adapter
    }

    private fun dataInitialize() {
        newArrayList = arrayListOf<Inicio>()

        imageId = arrayOf(
            R.drawable.foto_f1,
            R.drawable.foto_f2,
            R.drawable.foto_f3,
            R.drawable.foto_f4,
            R.drawable.foto_f5,
            R.drawable.foto_f6,
            R.drawable.foto_f7,
            R.drawable.foto_f8

        )
        nombre = arrayOf(
            getString(R.string.nombre_l1),
            getString(R.string.nombre_l2),
            getString(R.string.nombre_l3),
            getString(R.string.nombre_l4),
            getString(R.string.nombre_l5),
            getString(R.string.nombre_l6),
            getString(R.string.nombre_l7),
            getString(R.string.nombre_l8)
        )

        for (i in imageId.indices) {
            val news = Inicio(
                imageId[i],
                nombre[i]
            )
            newArrayList.add(news)

        }

    }


}