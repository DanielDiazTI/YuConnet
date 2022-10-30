package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterParticulares (private val ParticularesList: ArrayList<Particulares>): RecyclerView.Adapter<Particulares.ParticularesViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Particulares.ParticularesViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_particulares, parent, false)
        return Particulares.ParticularesViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Particulares.ParticularesViewHolder, position: Int) {
        val CurrentItem = ParticularesList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
        holder.Horarios.text = CurrentItem.Horarios
        holder.Ubicacion.text = CurrentItem.Ubicacion
        holder.Municipio.text = CurrentItem.Municipio
        holder.Contacto.text = CurrentItem.Contacto
        holder.Servicio.text = CurrentItem.Servicio
    }

    override fun getItemCount(): Int {
        return ParticularesList.size
    }
}