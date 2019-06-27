package com.audeblue.voyagesii

import android.media.Image
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.audeblue.voyagesii.Travel
import kotlinx.android.synthetic.main.activity_travel_creation.*
import kotlinx.android.synthetic.main.activity_travel_creation.view.*
import java.util.*

class TravelCreationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_creation)
    }

    fun verifaction() : Boolean {

        if ( (placeeditText.text.count() > 0) && (titleeditText.text.count() > 0) && (startdateeditText.text.count() > 0) && (enddateeditText.text.count() > 0) ) {
            return true
        }

        return false
    }

    fun onConfirmTouched(button: View){

        if ( verifaction() == true) {

            //SAVE INFORMATION IN DATABASE

            val date = startdateeditText.text.toString()

            val title = titleeditText.text.toString()

            val place = placeeditText.text.toString()

            //val newTravel = Travel(titleeditText.text.toString(), date,placeeditText.text.toString())

            //TravelDataController.instance.add(newTravel)

            println("SAVE TRAVEL")

            println("Title : " + title)
            println("Place : " + place)
            println("Date : " + date.toString())
        }
    }
}
