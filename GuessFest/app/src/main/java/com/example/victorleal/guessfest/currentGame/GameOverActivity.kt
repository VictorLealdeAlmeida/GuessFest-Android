package com.example.victorleal.guessfest.currentGame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.victorleal.guessfest.R
import com.example.victorleal.guessfest.listTheme.ListThemeActivity
import kotlinx.android.synthetic.main.game_over.*

class GameOverActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over)

        blue_score_label.text = getIntent().getStringExtra("BLUE_POINTS")
        pink_score_label.text = getIntent().getStringExtra("PINK_POINTS")


    }

    fun toMenu(view: View){
        val intent = Intent(this, ListThemeActivity :: class.java)

        this.startActivity(intent)
    }


}