package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterGasolinera (private val GasolineraList: ArrayList<Gasolinera>): RecyclerView.Adapter<Gasolinera.GasolineraViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Gasolinera.GasolineraViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_gasolinera, parent, false)
        return Gasolinera.GasolineraViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Gasolinera.GasolineraViewHolder, position: Int) {
        val CurrentItem = GasolineraList[position]
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
        return GasolineraList.size
    }
}