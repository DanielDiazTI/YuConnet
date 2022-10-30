package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Publico(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class PublicoViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.PublicoFoto)
        val Nombre: TextView = itemView.findViewById(R.id.PublicoNombre)
        val Horarios: TextView = itemView.findViewById(R.id.PublicoHorarios)
        val Ubicacion: TextView = itemView.findViewById(R.id.PublicoUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.PublicoMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.PublicoContacto)
        val Servicio: TextView = itemView.findViewById(R.id.PublicoServicio)
    }
}
