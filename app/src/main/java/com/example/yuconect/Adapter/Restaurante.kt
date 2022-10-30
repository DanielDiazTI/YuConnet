package com.example.yuconect.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.yuconect.R

data class Restaurante(
    val Foto: Int,
    val Nombre: String,
    val Horarios: String,
    val Precios: String,
    val Ubicacion: String,
    val Municipio: String,
    val Contacto: String,
    val Servicio: String
) {
    class RestauranteViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {

        val Foto: ImageView = itemView.findViewById(R.id.RestauranteFoto)
        val Nombre: TextView = itemView.findViewById(R.id.RestauranteNombre)
        val Horarios: TextView = itemView.findViewById(R.id.RestauranteHorarios)
        val Precios: TextView = itemView.findViewById(R.id.RestaurantePrecios)
        val Ubicacion: TextView = itemView.findViewById(R.id.RestauranteUbicacion)
        val Municipio: TextView = itemView.findViewById(R.id.RestauranteMunicipio)
        val Contacto: TextView = itemView.findViewById(R.id.RestauranteContacto)
        val Servicio: TextView = itemView.findViewById(R.id.RestauranteServicio)
    }
}