package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Particulares(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class ParticularesViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.ParticularesFoto)
        val Nombre: TextView = itemView.findViewById(R.id.ParticularesNombre)
        val Horarios: TextView = itemView.findViewById(R.id.ParticularesHorarios)
        val Ubicacion: TextView = itemView.findViewById(R.id.ParticularesUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.ParticularesMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.ParticularesContacto)
        val Servicio: TextView = itemView.findViewById(R.id.ParticularesServicio)
    }
}