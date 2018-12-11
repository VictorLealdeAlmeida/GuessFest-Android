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

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))

        thems.add(ThemeItem("Futebol","Esportes", R.drawable.soccer_on))



        return thems
    }
}