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
        val thems = themes[position]
        holder.categories.text = thems.title


        holder.name.text = thems.value



        holder.image.setImageResource(thems.image)
    }

    private inner class DownloadImageTask(internal var bmImage: ImageView) : AsyncTask<String, Void, Bitmap>() {

        override fun doInBackground(vararg urls: String): Bitmap? {
            val urldisplay = urls[0]
            var mIcon11: Bitmap? = null
            try {
                val `in` = java.net.URL(urldisplay).openStream()
                mIcon11 = BitmapFactory.decodeStream(`in`)
            } catch (e: Exception) {
                Log.e("Error", e.message)
                e.printStackTrace()
            }

            return mIcon11
        }

        override fun onPostExecute(result: Bitmap) {
            bmImage.setImageBitmap(result)
        }
    }
}