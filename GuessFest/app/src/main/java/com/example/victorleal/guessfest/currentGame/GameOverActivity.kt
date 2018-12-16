package com.example.victorleal.guessfest.currentGame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.victorleal.guessfest.R
import com.example.victorleal.guessfest.listTheme.ListThemeActivity
import kotlinx.android.synthetic.main.game_over.*
import android.view.animation.AlphaAnimation
import android.R.id.edit
import android.content.SharedPreferences
import android.content.Context
import android.preference.PreferenceManager
import android.util.Log
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.time.LocalDateTime

class GameOverActivity : AppCompatActivity() {


    var themeName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_over)



        setWin()
    }

    fun setWin(){

        themeName = getIntent().getStringExtra("THEME_NAME3")
        blue_score_label.text = getIntent().getStringExtra("BLUE_POINTS")
        pink_score_label.text = getIntent().getStringExtra("PINK_POINTS")

        if (getIntent().getStringExtra("BLUE_POINTS") > getIntent().getStringExtra("PINK_POINTS")){
            team_bar.setImageResource(R.drawable.pink_team);
            team_label.text = "TIME ROSA"
            saveResult("TIME ROSA", getIntent().getStringExtra("BLUE_POINTS").toString(), getIntent().getStringExtra("PINK_POINTS").toString())

        }else if (getIntent().getStringExtra("BLUE_POINTS") < getIntent().getStringExtra("PINK_POINTS")){
            team_bar.setImageResource(R.drawable.blue_team);
            team_label.text = "TIME AZUL"
            saveResult("TIME AZUL", getIntent().getStringExtra("BLUE_POINTS").toString(), getIntent().getStringExtra("PINK_POINTS").toString())

        }else{
            team_bar.setImageResource(R.drawable.yellow_bar);
            team_label.text = "EMPATE"
            saveResult("EMPATE", getIntent().getStringExtra("BLUE_POINTS").toString(), getIntent().getStringExtra("PINK_POINTS").toString())
        }
    }

    fun saveResult(winner: String, bluePoints: String, pinkPoints: String){

        val preferences = this.getSharedPreferences("Prefs", Context.MODE_PRIVATE)
        var resultWinner = preferences.getString("resultWinner", "Defs")

        val currentDateTime = LocalDateTime.now()
        var dataTime = currentDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM))

        resultWinner = resultWinner!! + (themeName + "%" + winner + "%" + bluePoints + "%" + pinkPoints  + "%" + dataTime + '%'+'$')

        //--SAVE Data
     /*   val editor = preferences.edit()
        editor.putStringSet("resultWinner", mutableSetOf()).toString()
        editor.commit()


        Log.i("Defaults", preferences.getStringSet("resultWinner", mutableSetOf()).toString())
*/

//--Init


//--SAVE Data
     //   val preferences2 = this.getSharedPreferences("MyPreferences2", Context.MODE_PRIVATE)
        val editor2 = preferences.edit()
        editor2.putString("resultWinner", resultWinner.toString())
        editor2.commit()


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