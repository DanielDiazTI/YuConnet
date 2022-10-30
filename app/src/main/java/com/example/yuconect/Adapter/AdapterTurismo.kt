package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R


class AdapterTurismo (private val TurismoList: ArrayList<Turismo>): RecyclerView.Adapter<Turismo.TurismoViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Turismo.TurismoViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_turismo, parent, false)
        return Turismo.TurismoViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Turismo.TurismoViewHolder, position: Int) {
        val CurrentItem = TurismoList[position]
        holder.Foto.setImageResource(CurrentItem.Foto)
        holder.Nombre.text = CurrentItem.Nombre
        holder.Horarios.text = CurrentItem.Horarios
        holder.Precios.text = CurrentItem.Precios
        holder.Ubicacion.text = CurrentItem.Ubicacion
        holder.Municipio.text = CurrentItem.Municipio
        holder.Contacto.text = CurrentItem.Contacto
        holder.Servicio.text = CurrentItem.Servicio
    }

    override fun getItemCount(): Int {
        return TurismoList.size
    }
}