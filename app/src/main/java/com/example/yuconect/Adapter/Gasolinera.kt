package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Gasolinera(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Precios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class GasolineraViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.GasolineraFoto)
        val Nombre: TextView = itemView.findViewById(R.id.GasolineraNombre)
        val Horarios: TextView = itemView.findViewById(R.id.GasolineraHorarios)
        val Precios: TextView = itemView.findViewById(R.id.GasolineraPrecios)
        val Ubicacion: TextView = itemView.findViewById(R.id.GasolineraUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.GasolineraMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.GasolineraContacto)
        val Servicio: TextView = itemView.findViewById(R.id.GasolineraServicio)
    }
}
