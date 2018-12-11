package com.example.victorleal.guessfest.currentGame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.victorleal.guessfest.R
import android.content.Intent


class GameController : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("aaaa", getIntent().getStringExtra("THEME_NAME"))

        setContentView(R.layout.current_game)

    }

}