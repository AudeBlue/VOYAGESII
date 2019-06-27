package com.audeblue.voyagesii

import java.util.*

data class Travel(var title: String) {

    companion object {
        private var nextId = 0
        fun getNextId(): Int {
            nextId += 1
            return nextId
        }
    }

    var _id: Int = 0
    var date: Long = 0
    var place: String = ""
    var picture: Int = 0

    constructor(title: String, date: Date, place: String, picture: Int) : this(title) {
        this._id = getNextId()
        this.title = title
        this.date = date.time / 1000
        this.place = place
        this.picture = picture
    }

    fun getId(): Int {
        return this._id
    }
}