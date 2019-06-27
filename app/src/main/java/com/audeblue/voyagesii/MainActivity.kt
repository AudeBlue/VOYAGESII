package com.audeblue.voyagesii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    var liste = mutableListOf<Travel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MainVoyageAdapter(liste)



            main_recycler_view.layoutManager = LinearLayoutManager(this)

                    main_recycler_view.adapter = adapter




    }
}
