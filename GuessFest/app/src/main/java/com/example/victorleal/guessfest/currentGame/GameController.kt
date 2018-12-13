package com.example.victorleal.guessfest.currentGame

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.victorleal.guessfest.R
import android.view.View
import kotlinx.android.synthetic.main.current_game.*
import java.util.Random
import android.os.CountDownTimer
import java.util.concurrent.TimeUnit
import android.view.animation.AlphaAnimation



class GameController : AppCompatActivity() {


    var words: MutableList<String> = mutableListOf("Palavra 1", "Palavra 2", "Palavra 3", "Palavra 4", "Palavra 5", "Palavra 6", "Palavra 7", "Palavra 8")
    var teamTurn = "teamBlue"
    var bluePoints = 0
    var pinkPoints = 0
    var gameStart = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.current_game)

        Log.i("Thema Escolhido", getIntent().getStringExtra("THEME_NAME2"))



        teamTurn = getIntent().getStringExtra("TEAM_START")

        startTimer(4000)

        hit_button.alpha = 0.0f
        jump_button.alpha = 0.0f
        timer_label.alpha = 0.0f
        crow_image.alpha = 0.0f
        team_bar.alpha = 0.0f
        team_label.alpha = 0.0f

    }

    fun startGame(){
        gameStart = true
        startTimer(20000)
        changeTeam()

        //Setar primeira palavra
        word_label.text = sortWord()


        setAnimation()
    }

    fun setAnimation(){
        val animation1 = AlphaAnimation(0.0f, 1.0f)
        animation1.duration = 1000
       // animation1.startOffset = 5000
        animation1.fillAfter = true

        hit_button.alpha = 1.0f
        jump_button.alpha = 1.0f
        timer_label.alpha = 1.0f
        crow_image.alpha = 1.0f
        team_bar.alpha = 1.0f
        team_label.alpha = 1.0f


        word_label.startAnimation(animation1)
        hit_button.startAnimation(animation1)
        jump_button.startAnimation(animation1)
        timer_label.startAnimation(animation1)
        crow_image.startAnimation(animation1)
        team_bar.startAnimation(animation1)
        team_label.startAnimation(animation1)


    }




    fun hit(view: View) {

        word_label.text = sortWord()

        changeTeam()
    }

    fun changeTeam(){
        if (teamTurn == "teamBlue"){
            teamTurn = "teamPink"
            team_label.text = "TIME ROSA"
            team_bar.setImageResource(R.drawable.pink_team);
        }else if (teamTurn == "teamPink"){
            teamTurn = "teamBlue"
            team_label.text = "TIME AZUL"
            team_bar.setImageResource(R.drawable.blue_team);
        }
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

    var timer: Timer?=null

    //Call this method to start timer on activity start
    private fun startTimer(time: Long){
        timer = Timer(time);
        timer?.start()
    }

    //Call this method to update the timer
  /*  private fun updateTimer(){
        if(timer!=null) {
            val miliis = timer?.millisUntilFinished!!.toLong() + TimeUnit.SECONDS.toMillis(5)
            //Here you need to maintain single instance for previous
            timer?.cancel()
            timer = Timer(miliis);
            timer?.start()
        }else{
            startTimer()
        }
    }*/

    inner class Timer(miliis:Long) : CountDownTimer(miliis,1000){
        var millisUntilFinished:Long = 0
        override fun onFinish() {

            if (gameStart) {

                timer_label.text = "0:00"
                Log.i("PointsBlue", bluePoints.toString())
                Log.i("PointsPink", pinkPoints.toString())

                toGameOver()

            }else{
               // word_label.alpha = 0.0f
                startGame()
            }
        }

        override fun onTick(millisUntilFinished: Long) {
            this.millisUntilFinished = millisUntilFinished

            if (gameStart) {
                assignPoints()
                timer_label.text = formatMinut((millisUntilFinished / 1000).toInt())
                crowColor()
            }else{
                word_label.text = (millisUntilFinished / 1000).toString()
            }
        }
    }


    fun crowColor(){
        if (bluePoints < pinkPoints){
            crow_image.setImageResource(R.drawable.coroa_azul);
        }else if (bluePoints > pinkPoints){
            crow_image.setImageResource(R.drawable.coroa_rosa);
        }else{
            crow_image.setImageResource(R.drawable.coroa_amarela);
        }
    }

    fun formatMinut(time: Int) : String{
        val minutes = time / 60
        val seconds = time % 60
        return String.format("%d:%02d", minutes, seconds)
    }

    fun assignPoints(){
       // Log.i("PointsBlue", bluePoints.toString())
       // Log.i("PointsPink", pinkPoints.toString())
        if (teamTurn == "teamBlue"){
            bluePoints++
        }else if (teamTurn == "teamPink"){
            pinkPoints++
        }
    }

    fun toGameOver(){
        val intent = Intent(this, GameOverActivity :: class.java)


        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("BLUE_POINTS", bluePoints.toString());
        intent.putExtra("PINK_POINTS", pinkPoints.toString());


        this.startActivity(intent)
    }

}