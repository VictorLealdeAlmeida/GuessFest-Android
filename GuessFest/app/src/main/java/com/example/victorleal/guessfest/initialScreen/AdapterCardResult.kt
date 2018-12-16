package com.example.victorleal.guessfest.initialScreen

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.RecyclerView
import com.example.victorleal.guessfest.R
import kotlinx.android.synthetic.main.card_result.view.*


class AdapterCardResult (private val results: List<ResultCard>, private val context: Context): RecyclerView.Adapter<AdapterCardResult.ViewHolderResult>(){

    class ViewHolderResult(itemView: View): RecyclerView.ViewHolder(itemView) {
        // utilizado para referenciar os campos do layout, para assim poderem ser alterados em onBindViewHolder
       // val categories = itemView.theme_categories_result
        val theme = itemView.theme_name_result
        val image = itemView.theme_image_result
        val score = itemView.score
        val date = itemView.date
        var card = itemView.card_linear


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
        holder.theme.text = result.winner
        holder.score.text = "Rosa: " + formatMinut(result.pinkPoints.toInt()) + " X Azul: " + formatMinut(result.bluePoints.toInt())

        holder.image.setImageResource(getImage(result.theme))

        var color = "#E4B64F"
        if (result.winner == "TIME ROSA"){
            color = "#DF5798"
        }else if (result.winner == "TIME AZUL"){
            color = "#57BAD9"
        }

        holder.card.setBackgroundColor(color.toColor())
        holder.date.setBackgroundColor(color.toColor())
        holder.image.setBackgroundColor(color.toColor())
        holder.theme.setBackgroundColor(color.toColor())
        holder.score.setBackgroundColor(color.toColor())

        holder.date.setBackgroundColor(color.toColor())

    }

    fun String.toColor(): Int = Color.parseColor(this)

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

    fun formatMinut(time: Int) : String{
        val minutes = time / 60
        val seconds = time % 60
        return String.format("%d:%02d", minutes, seconds)
    }

}