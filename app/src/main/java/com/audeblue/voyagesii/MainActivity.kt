package com.audeblue.voyagesii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {



    var liste: ArrayList<Travel> = ArrayList<Travel>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        liste.add(Travel("MON Premier voyage", Date(), "Marseille", R.drawable.abc_ab_share_pack_mtrl_alpha))
        val adapter = MainVoyageAdapter(liste)



            main_recycler_view.layoutManager = LinearLayoutManager(this)

                    main_recycler_view.adapter = adapter






    }
}
