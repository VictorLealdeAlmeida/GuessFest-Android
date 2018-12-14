package com.example.victorleal.guessfest.listTheme

import android.content.Context
import android.content.Intent
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
import com.example.victorleal.guessfest.currentGame.GameController
import kotlinx.android.synthetic.main.card_theme.view.*
import android.support.v7.app.AppCompatActivity
import android.support.v4.content.ContextCompat


class AdapterCardTheme (private val themes: List<ThemeItem>, private val context: Context): RecyclerView.Adapter<AdapterCardTheme.ViewHolderProduct>(){

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
        holder.categories.text = them.value
        holder.name.text = them.title
        holder.image.setImageResource(them.image)


        holder.image.setOnClickListener {
            Log.i("Clicou",them.title)
            val intent = Intent(context, com.example.victorleal.guessfest.currentGame.PreGameActivity :: class.java)

            Log.i("Contexx",intent.toString())

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("THEME_NAME", them.title);


            context.startActivity(intent)





        }

    }




}