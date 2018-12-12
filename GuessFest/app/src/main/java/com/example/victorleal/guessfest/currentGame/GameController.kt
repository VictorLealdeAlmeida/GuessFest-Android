package com.example.victorleal.guessfest.currentGame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.victorleal.guessfest.R
import android.view.View
import kotlinx.android.synthetic.main.current_game.*
import java.util.Random

class GameController : AppCompatActivity() {


    var words: MutableList<String> = mutableListOf("Palavra 1", "Palavra 2", "Palavra 3", "Palavra 4", "Palavra 5", "Palavra 6", "Palavra 7", "Palavra 8")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("Thema Escolhido", getIntent().getStringExtra("THEME_NAME"))

        setContentView(R.layout.current_game)

        //Setar primeira palavra
        word_label.text = sortWord()

    }


    fun backMenu(view: View) {
        super.onBackPressed();
    }

    fun hit(view: View) {

        word_label.text = sortWord()
    }

    fun pass(view: View) {

        word_label.text = sortWord()
    }

    fun sortWord(): String{

        // Log.i("wordRandom", value.toString())
        // Log.i("wordRandom", words[value])

        if (words.size == 0) {
            return "Acabou as palavras"
        }

        var value  = Random().nextInt(words.size)
        val word = words[value]
        words.removeAt(value)

        return word
    }

}