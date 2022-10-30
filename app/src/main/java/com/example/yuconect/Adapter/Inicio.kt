package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Inicio(
    val Foto: Int,
    val Nombre: String
) {
    class InicioViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.InicioFoto)
        val Nombre: TextView = itemView.findViewById(R.id.InicioNombre)

    }
}
