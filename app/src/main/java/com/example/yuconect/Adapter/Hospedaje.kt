package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Hospedaje(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Precios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class HospedajeViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {

        val Foto : ImageView = itemView.findViewById(R.id.HospedajeFoto)
        val Nombre : TextView = itemView.findViewById(R.id.HospedajeNombre)
        val Horarios : TextView = itemView.findViewById(R.id.HospedajeHorarios)
        val Precios : TextView = itemView.findViewById(R.id.HospedajePrecios)
        val Ubicacion : TextView = itemView.findViewById(R.id.HospedajeUbicacion)
        val Municipio : TextView = itemView.findViewById(R.id.HospedajeMunicipio)
        val Contacto : TextView = itemView.findViewById(R.id.HospedajeContacto)
        val Servicio : TextView = itemView.findViewById(R.id.HospedajeServicio)
    }
}
