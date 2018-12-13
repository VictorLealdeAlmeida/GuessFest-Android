package com.example.victorleal.guessfest.currentGame

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.victorleal.guessfest.R
import kotlinx.android.synthetic.main.game_over.*

class GameOverActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over)

        blue_score_label.text = getIntent().getStringExtra("BLUE_POINTS")
        pink_score_label.text = getIntent().getStringExtra("PINK_POINTS")


    }


}