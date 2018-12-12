package com.example.victorleal.guessfest.currentGame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.victorleal.guessfest.R
import android.view.View

class PreGameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pre_game)


        Log.i("Thema Escolhido", getIntent().getStringExtra("THEME_NAME"))

    }

    fun play(view: View){
        val intent = Intent(this, GameController :: class.java)


        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("THEME_NAME2", getIntent().getStringExtra("THEME_NAME"));
        intent.putExtra("TEAM_START", "teamPink");


        this.startActivity(intent)
    }

}