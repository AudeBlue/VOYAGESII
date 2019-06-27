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
        return travelList
    }


}