package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Abarrotes(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class AbarrotesViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.AbarrotesFoto)
        val Nombre: TextView = itemView.findViewById(R.id.AbarrotesNombre)
        val Horarios: TextView = itemView.findViewById(R.id.AbarrotesHorarios)
        val Ubicacion: TextView = itemView.findViewById(R.id.AbarrotesUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.AbarrotesMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.AbarrotesContacto)
        val Servicio: TextView = itemView.findViewById(R.id.AbarrotesServicio)
    }
}
