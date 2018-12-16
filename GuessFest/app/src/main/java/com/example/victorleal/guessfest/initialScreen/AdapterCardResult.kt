package com.example.victorleal.guessfest.initialScreen

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
import kotlinx.android.synthetic.main.card_result.view.*
import kotlinx.android.synthetic.main.game_over.view.*


class AdapterCardResult (private val results: List<ResultCard>, private val context: Context): RecyclerView.Adapter<AdapterCardResult.ViewHolderResult>(){

    class ViewHolderResult(itemView: View): RecyclerView.ViewHolder(itemView) {
        // utilizado para referenciar os campos do layout, para assim poderem ser alterados em onBindViewHolder
       // val categories = itemView.theme_categories_result
        val theme = itemView.theme_name_result
        val image = itemView.theme_image_result
        val pinkPoints = itemView.points_pink
        val bluePoints = itemView.points_blue
        val date = itemView.date


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderResult {
        // utilizado para inflar o layout do itemlista para cada item da lista de RSSs
        val view = LayoutInflater.from(context).inflate(R.layout.card_result, parent, false)
        return ViewHolderResult(view)
    }

    override fun getItemCount(): Int {
        return results.size
    }

    override fun onBindViewHolder(holder: ViewHolderResult, position: Int) {
        val result = results[position]
        holder.date.text = result.dataTime
        holder.theme.text = result.theme
        holder.pinkPoints.text = result.pinkPoints
        holder.bluePoints.text = result.bluePoints

        holder.image.setImageResource(getImage(result.theme))


    }

    fun getImage(theme: String): Int{

        if (theme == "The Beatles"){
            return R.drawable.beatle
        }else if (theme == "Futebol"){
            return R.drawable.soccer
        }else if (theme == "Celebridades"){
            return R.drawable.celebrities
        }else if (theme == "Música"){
            return R.drawable.music
        }else if (theme == "Anos 80"){
            return R.drawable.anos80
        }else if (theme == "Anos 90"){
            return R.drawable.anos90
        }else if (theme == "Anos 2000"){
            return R.drawable.anos2000
        }


        return 0
    }

}