package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Promociones(
    val FotoEmpresa: Int,
    val NombreEmpresa: String,
    val Descripcion: String
) {
    class PromocionesViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val FotoEmpresa: ImageView = itemView.findViewById(R.id.promocionesFoto)
        val NombreEmpresa: TextView = itemView.findViewById(R.id.promociones_nombreEmpresa)
        val Descripcion: TextView = itemView.findViewById(R.id.promocionesDescripcion)

    }
}
