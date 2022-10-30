package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R


class AdapterHospedaje(private val HospedajeList: ArrayList<Hospedaje>): RecyclerView.Adapter<Hospedaje.HospedajeViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Hospedaje.HospedajeViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_hospedaje, parent, false)
        return Hospedaje.HospedajeViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Hospedaje.HospedajeViewHolder, position: Int) {
        val CurrentItem = HospedajeList[position]
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
        return HospedajeList.size
    }


}
