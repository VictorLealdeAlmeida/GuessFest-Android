package com.example.victorleal.guessfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.support.v7.widget.CardView
import android.util.Log
import android.widget.TextView
import android.widget.RelativeLayout
import android.view.ViewGroup
import android.widget.LinearLayout
import com.inlocomedia.android.ads.InLocoMedia
import com.inlocomedia.android.ads.InLocoMediaOptions
import com.inlocomedia.android.ads.AdError
import com.inlocomedia.android.ads.AdRequest
import com.inlocomedia.android.ads.interstitial.InterstitialAd
import com.inlocomedia.android.ads.interstitial.InterstitialAdListener





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

        // In Loco Media SDK Init
        val options = InLocoMediaOptions.getInstance(this)

        // The AppId you acquired in earlier steps
        options.adsKey = "c0cc2276042bf6a59e7fa18d5363cb6ed673f934e52d9c4f7d0317149892217d"

        // Verbose mode flag, if this is set as true InLocoMedia SDK will let you know about errors on the Logcat
        options.isLogEnabled = true

        // Development Devices set here are only going to receive test ads
            //options.setDevelopmentDevices("C55FBEEAAAD1B7E6F89D365283D9483")

        InLocoMedia.init(this, options)


        val interstitialAd = InterstitialAd(this)
        interstitialAd.setInterstitialAdListener(object : InterstitialAdListener() {

            override fun onAdReady(ad: InterstitialAd) {
                ad.show()
            }

            override fun onAdError(ad: InterstitialAd, error: AdError) {
                Log.w("InLocoMedia", "Your interstitial has failed with error: $error")
            }
        })

        val adRequest = AdRequest()
        interstitialAd.loadAd(adRequest)

    }
}
