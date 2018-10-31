package com.example.victorleal.guessfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.widget.CardView
import android.widget.TextView
import android.widget.RelativeLayout
import android.view.ViewGroup
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val mainLinearLayout = findViewById(R.id.cardViewThemes) as LinearLayout
        val cardLinearLayout = LinearLayout(this)
        cardLinearLayout.orientation = LinearLayout.VERTICAL
        val params = RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
        params.setMargins(16,16,16,16)

        val cardView = CardView(this)
        cardView.radius = 15f
        cardView.setCardBackgroundColor(Color.parseColor("#009688"))
        cardView.setContentPadding(36,36,36,36)
        cardView.layoutParams = params
        cardView.cardElevation = 30f

        val quote = TextView(this)
        quote.text = "\"Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time.\n";
        quote.textSize = 24f
        quote.setTextColor(Color.WHITE)
        quote.setTypeface(Typeface.SANS_SERIF,Typeface.NORMAL)

        val name = TextView(this)
        name.text = "- Thomas A. Edison"
        name.textSize = 16f
        name.setTypeface(Typeface.MONOSPACE, Typeface.ITALIC)
        name.setTextColor(Color.parseColor("#E0F2F1"))
        cardLinearLayout.addView(quote)
        cardLinearLayout.addView(name)
        cardView.addView(cardLinearLayout)
      //  mainLinearLayout.addView(cardView)

    }
}
