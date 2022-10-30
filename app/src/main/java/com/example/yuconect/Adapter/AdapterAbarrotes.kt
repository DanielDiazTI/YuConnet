package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterAbarrotes (private val AbarrotesList: ArrayList<Abarrotes>): RecyclerView.Adapter<Abarrotes.AbarrotesViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Abarrotes.AbarrotesViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_abarrotes, parent, false)
        return Abarrotes.AbarrotesViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Abarrotes.AbarrotesViewHolder, position: Int) {
        val CurrentItem = AbarrotesList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
        holder.Horarios.text = CurrentItem.Horarios
        holder.Ubicacion.text = CurrentItem.Ubicacion
        holder.Municipio.text = CurrentItem.Municipio
        holder.Contacto.text = CurrentItem.Contacto
        holder.Servicio.text = CurrentItem.Servicio
    }

    override fun getItemCount(): Int {
        return AbarrotesList.size
    }
}