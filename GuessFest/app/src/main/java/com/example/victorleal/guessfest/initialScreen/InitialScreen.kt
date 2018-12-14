package com.example.victorleal.guessfest.initialScreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.victorleal.guessfest.R
import com.example.victorleal.guessfest.listTheme.ListThemeActivity

class InitialScreen : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.initial_screen)



    }

    fun toMenuList(view: View){

        val intent = Intent(this, ListThemeActivity :: class.java)

        this.startActivity(intent)

    }

    fun toResults(view: View){

        val intent = Intent(this, ResultsActivity :: class.java)

        this.startActivity(intent)

    }
}