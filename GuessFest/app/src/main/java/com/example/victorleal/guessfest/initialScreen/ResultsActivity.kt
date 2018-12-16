package com.example.victorleal.guessfest.initialScreen

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.victorleal.guessfest.R
import com.example.victorleal.guessfest.listTheme.AdapterCardTheme
import com.example.victorleal.guessfest.listTheme.CardsTheme
import kotlinx.android.synthetic.main.activity_list_themes.*

class ResultsActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_layout)



        val results = DataResult().sequence(this)
        val mLayoutManager = LinearLayoutManager(this)
        recyclerView?.setLayoutManager(mLayoutManager)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.adapter= AdapterCardResult(results, this)

        recyclerProducts.apply {

            layoutManager = LinearLayoutManager(applicationContext)
            adapter = AdapterCardResult(results, applicationContext)
        }
    }
}
