package com.example.victorleal.guessfest.listTheme

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.AsyncTask
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.support.v7.widget.RecyclerView
import com.example.victorleal.guessfest.R
import kotlinx.android.synthetic.main.card_theme.view.*



class AdapterCardTheme (private val themes: List<ThemeItem>, private val context: Context): RecyclerView.Adapter<AdapterCardTheme.ViewHolderProduct>() {

    class ViewHolderProduct(itemView: View): RecyclerView.ViewHolder(itemView) {
        // utilizado para referenciar os campos do layout, para assim poderem ser alterados em onBindViewHolder
        val categories = itemView.theme_categories
        val name = itemView.theme_name
        val image = itemView.theme_image


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderProduct {
        // utilizado para inflar o layout do itemlista para cada item da lista de RSSs
        val view = LayoutInflater.from(context).inflate(R.layout.card_theme, parent, false)
        return ViewHolderProduct(view)
    }

    override fun getItemCount(): Int {
        return themes.size
    }

    override fun onBindViewHolder(holder: ViewHolderProduct, position: Int) {
        val them = themes[position]
        holder.categories.text = them.title
        holder.name.text = them.value
        holder.image.setImageResource(them.image)

        holder.image.setOnClickListener {
            Log.i("Clicou",them.title)
        }

    }




}