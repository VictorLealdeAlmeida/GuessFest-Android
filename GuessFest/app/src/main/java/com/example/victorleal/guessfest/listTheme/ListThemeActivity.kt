package com.example.victorleal.guessfest.listTheme

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.GridLayoutManager
import com.example.victorleal.guessfest.R
import kotlinx.android.synthetic.main.activity_list_themes.*
import com.example.victorleal.guessfest.listTheme.AdapterCardTheme



class ListThemeActivity : AppCompatActivity() {
    private val recyclerView: RecyclerView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_themes)


        val thems = CardsTheme().getCardsTheme()
        val mLayoutManager = GridLayoutManager(this, 2)
        recyclerView?.setLayoutManager(mLayoutManager)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.adapter= AdapterCardTheme(thems, this)

        recyclerProducts.apply {
            // colocando para o recycle view utilizar o layout do linearlayoutmanager
//            layoutManager = LinearLayoutManager(applicationContext)
//            adapter = AdapterCardTheme(prods, applicationContext)
            layoutManager = GridLayoutManager(applicationContext, 2)
            adapter = AdapterCardTheme(thems, applicationContext)
        }
    }
}
