package com.example.victorleal.guessfest.listTheme

import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.lang.Exception
import android.net.Uri
import com.example.victorleal.guessfest.R


class CardsTheme() {


    fun getCardsTheme(): List<ThemeItem> {
        val thems: MutableList<ThemeItem> = mutableListOf()

        thems.add(ThemeItem("The Beatles","Música", R.drawable.beatle))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer))

        thems.add(ThemeItem("Celebridades","Geral", R.drawable.celebrities))

        thems.add(ThemeItem("Música","Música", R.drawable.music))

        thems.add(ThemeItem("Anos 80","História", R.drawable.anos80))

        thems.add(ThemeItem("Anos 90","História", R.drawable.anos90))

        thems.add(ThemeItem("Anos 2000","História", R.drawable.anos2000))



        return thems
    }
}