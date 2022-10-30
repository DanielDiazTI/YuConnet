package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterInicio (private val InicioList: ArrayList<Inicio>): RecyclerView.Adapter<Inicio.InicioViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Inicio.InicioViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_inicio, parent, false)
        return Inicio.InicioViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Inicio.InicioViewHolder, position: Int) {
        val CurrentItem = InicioList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
    }

    override fun getItemCount(): Int {
        return InicioList.size
    }


}