package com.tablet.erestaurant.util.callback

import android.location.Location

interface CurrentLocationCallback {
    fun currentLocation(mLocation: Location, oldLocation: Location?, mDistanceFromFirstLocation: Double)
}