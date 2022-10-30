package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Salud(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class SaludViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.SaludFoto)
        val Nombre: TextView = itemView.findViewById(R.id.SaludNombre)
        val Horarios: TextView = itemView.findViewById(R.id.SaludHorarios)
        val Ubicacion: TextView = itemView.findViewById(R.id.SaludUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.SaludMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.SaludContacto)
        val Servicio: TextView = itemView.findViewById(R.id.SaludServicio)
    }
}
