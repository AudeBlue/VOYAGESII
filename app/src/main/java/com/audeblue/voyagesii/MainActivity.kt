package com.audeblue.voyagesii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {



    var liste: ArrayList<Travel> = TravelDataController.instance.getAllTravel()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = MainVoyageAdapter(liste)



            main_recycler_view.layoutManager = LinearLayoutManager(this)

                    main_recycler_view.adapter = adapter
fab.setOnClickListener { val intent = Intent(this, TravelCreationActivity::class.java)
startActivity(intent)}



    }

}
