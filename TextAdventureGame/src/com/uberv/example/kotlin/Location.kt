package com.uberv.example.kotlin

data class Location(val locationID: Int, val description: String) {

    val exits = mutableMapOf<String, Int>()

    init {
        exits["Q"] = 0
    }

    fun addExit(direction: String, destionationID: Int) {
        exits[direction] = destionationID
    }
}
