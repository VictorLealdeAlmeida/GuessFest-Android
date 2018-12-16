package com.example.victorleal.guessfest.initialScreen

import android.content.Context
import android.util.Log
import org.json.JSONArray
import org.json.JSONObject
import java.lang.Exception
import android.net.Uri
import com.example.victorleal.guessfest.R
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity


class DataResult() {

    var results: MutableList<String> = mutableListOf()

    fun sequence(act: AppCompatActivity): List<ResultCard>{
        getResults(act)


        return getCardsResult()
    }

    fun getCardsResult(): List<ResultCard> {
        val rts: MutableList<ResultCard> = mutableListOf()

        var i = results.size
        while (i > 0){

            rts.add(readDatas(i-1))

            i--
        }


        Log.i("aaaaa2", rts.toString())


        return rts
    }

    fun getResults(act: AppCompatActivity){
        val preferences = act.getSharedPreferences("Prefs", Context.MODE_PRIVATE)
        var resultWinner = preferences.getString("resultWinner", "Defs")

        if (resultWinner == "Defs"){
            val editor = preferences.edit()
            resultWinner = ""
            editor.putString("", resultWinner)
            Log.i("aaaaa", resultWinner)
        }else{
            Log.i("aaaaa", resultWinner)
        }

        var result = ""


        for (i in 0 until resultWinner.length) {


            if (resultWinner[i] == '$'){
                results.add(result)
                result = ""
            }else{
                result = result + resultWinner[i]
            }

        }

        Log.i("Defaults22", results[0].toString())
    }

    fun readDatas(index: Int): ResultCard{
        var word = ""
        var words: MutableList<String> = mutableListOf()



        var resultActual = results[index]

        for (i in 0 until resultActual.length) {


            if (resultActual[i] == '%'){
                words.add(word)
                word = ""
            }else{
                word = word + resultActual[i]
            }

        }



        Log.i("Dados", words[0])
        Log.i("Dados", words[1])
        Log.i("Dados", words[2])
        Log.i("Dados", words[3])
        Log.i("Dados", words[4])

        return ResultCard(words[0], words[1], words[2], words[3], words[4])


    }
}