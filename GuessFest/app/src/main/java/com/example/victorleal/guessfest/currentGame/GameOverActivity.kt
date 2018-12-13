package com.example.victorleal.guessfest.currentGame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.victorleal.guessfest.R
import com.example.victorleal.guessfest.listTheme.ListThemeActivity
import kotlinx.android.synthetic.main.game_over.*
import android.view.animation.AlphaAnimation


class GameOverActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over)

        blue_score_label.text = getIntent().getStringExtra("BLUE_POINTS")
        pink_score_label.text = getIntent().getStringExtra("PINK_POINTS")


    }

    fun setAnimation(){
        val animation1 = AlphaAnimation(0.0f, 1.0f)
        animation1.duration = 1000
        // animation1.startOffset = 5000
        animation1.fillAfter = true

        screen_game_over.startAnimation(animation1)
        blue_label.startAnimation(animation1)
        blue_score_label.startAnimation(animation1)
        pink_label.startAnimation(animation1)
        pink_score_label.startAnimation(animation1)
        team_bar.startAnimation(animation1)
        team_label.startAnimation(animation1)
        team_label2.startAnimation(animation1)
        menu_button.startAnimation(animation1)
        replay_button.startAnimation(animation1)


    }

    fun toMenu(view: View){
        val intent = Intent(this, ListThemeActivity :: class.java)

        this.startActivity(intent)
    }


}