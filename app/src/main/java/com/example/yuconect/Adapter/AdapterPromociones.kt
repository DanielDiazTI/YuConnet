package com.example.yuconect.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

class AdapterPromociones (private val PromocionesList: ArrayList<Promociones>): RecyclerView.Adapter<Promociones.PromocionesViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Promociones.PromocionesViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.item_promotions, parent, false)
        return Promociones.PromocionesViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: Promociones.PromocionesViewHolder, position: Int) {
        val CurrentItem = PromocionesList[position]
        holder.FotoEmpresa.setImageResource(CurrentItem.FotoEmpresa)
        holder.NombreEmpresa.text = CurrentItem.NombreEmpresa
        holder.Descripcion.text = CurrentItem.Descripcion
    }

    override fun getItemCount(): Int {
        return PromocionesList.size
    }
}