package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterPublico (private val PublicoList: ArrayList<Publico>): RecyclerView.Adapter<Publico.PublicoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Publico.PublicoViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_publico, parent, false)
        return Publico.PublicoViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Publico.PublicoViewHolder, position: Int) {
        val CurrentItem = PublicoList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
        holder.Horarios.text = CurrentItem.Horarios
        holder.Ubicacion.text = CurrentItem.Ubicacion
        holder.Municipio.text = CurrentItem.Municipio
        holder.Contacto.text = CurrentItem.Contacto
        holder.Servicio.text = CurrentItem.Servicio
    }

    override fun getItemCount(): Int {
        return PublicoList.size
    }
}