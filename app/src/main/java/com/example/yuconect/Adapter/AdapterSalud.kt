package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterSalud (private val SaludList: ArrayList<Salud>): RecyclerView.Adapter<Salud.SaludViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Salud.SaludViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_salud, parent, false)
        return Salud.SaludViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Salud.SaludViewHolder, position: Int) {
        val CurrentItem = SaludList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
        holder.Horarios.text = CurrentItem.Horarios
        holder.Ubicacion.text = CurrentItem.Ubicacion
        holder.Municipio.text = CurrentItem.Municipio
        holder.Contacto.text = CurrentItem.Contacto
        holder.Servicio.text = CurrentItem.Servicio
    }

    override fun getItemCount(): Int {
        return SaludList.size
    }
}