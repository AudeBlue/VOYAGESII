package com.audeblue.voyagesii

import android.graphics.Bitmap
import java.util.*

data class Travel(var title : String, var date: String, var place: String) {

    companion object {
        private var nextId = 0
        fun getNextId(): Int {
            nextId += 1
            return nextId
        }
    }

    private var id: Int = 0

    fun getId(): Int {
        return this.id
    }
}
