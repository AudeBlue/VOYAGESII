package com.audeblue.voyagesii

import java.util.ArrayList

class TravelDataController {

    companion object {
        val instance = TravelDataController()
    }

    private var travelList: ArrayList<Travel> = ArrayList()

    init {
        //travelList.add()
    }

    fun add (travel : Travel) {
        travelList.add(travel)
    }

    fun getAllTravel() : ArrayList<Travel> {
        add(Travel("MON PREMIER VOYAGE", "01-01-2001", "MARSEILLE"))
        return travelList
    }


}