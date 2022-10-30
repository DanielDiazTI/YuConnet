package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Turismo(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Precios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class TurismoViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.TurismoFoto)
        val Nombre: TextView = itemView.findViewById(R.id.TurismoNombre)
        val Horarios: TextView = itemView.findViewById(R.id.TurismoHorarios)
        val Precios: TextView = itemView.findViewById(R.id.TurismoPrecios)
        val Ubicacion: TextView = itemView.findViewById(R.id.TurismoUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.TurismoMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.TurismoContacto)
        val Servicio: TextView = itemView.findViewById(R.id.TurismoServicio)
    }
}
