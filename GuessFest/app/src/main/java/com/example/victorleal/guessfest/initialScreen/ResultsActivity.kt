package com.example.victorleal.guessfest.initialScreen

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.victorleal.guessfest.R

class ResultsActivity : AppCompatActivity(){

    var results: MutableList<String> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_layout)


        getResults()
        readDatas()

    }

    fun getResults(){
        val preferences = this.getSharedPreferences("Prefs", Context.MODE_PRIVATE)
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

    fun readDatas(){
        var word = ""
        var words: MutableList<String> = mutableListOf()



        var resultActual = results[0]

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




    }
}