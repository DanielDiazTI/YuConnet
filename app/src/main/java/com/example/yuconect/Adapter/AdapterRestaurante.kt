package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterRestaurante (private val RestauranteList: ArrayList<Restaurante>): RecyclerView.Adapter<Restaurante.RestauranteViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Restaurante.RestauranteViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)
        return Restaurante.RestauranteViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Restaurante.RestauranteViewHolder, position: Int) {
        val CurrentItem = RestauranteList[position]
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
        return RestauranteList.size
    }
}