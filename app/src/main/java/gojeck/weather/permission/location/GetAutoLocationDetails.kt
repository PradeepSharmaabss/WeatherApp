package app.elektron.com.common.permission.location

import android.annotation.SuppressLint
import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.util.Log
import com.google.gson.Gson
import gojeck.weather.utils.Utills
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.*
import kotlin.collections.HashMap

class GetAutoLocationDetails {
    private var activeLocale = ""
    private var defaultTag = ""
    var mContext: Context? = null

    private val defaultAddress: Address
        get() {
            val address = Address(Locale.ENGLISH)
            address.latitude = 0.0
            address.longitude = 0.0
            address.adminArea = "XXXX"
            address.countryCode = "MY"
            address.featureName = "XXXX"
            address.countryName = "Myanmar"
            address.locality = "XXXX"
            address.subAdminArea = "XXXX"
            address.subLocality = "XXXX"
            return address
        }

    @SuppressLint("CheckResult")
    fun getCurrentLocationDetails(
        mLat: Double = 0.0,
        mLong: Double = 0.0,
        mVarargs: List<String> = mutableListOf("en", "my")
    ): Observable<AddressModel>? {
        return Observable.fromCallable {
            return@fromCallable getAddress(latitude = mLat, longitude = mLong, locale = mVarargs[0])
        }.observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io())
    }

    private fun getAddress(
        latitude: Double,
        longitude: Double,
        streetAddress: String = "",
        locale: String
    ): AddressModel {
        var city = ""
        var state = ""
        var roadName: String = ""
        var oldName = ""
        val mData = HashMap<String, String>()
        mData["road"] = roadName
        mData["city"] = city
        mData["state"] = state
        mData["oldName"] = oldName
        var address = defaultAddress
        try {
            if (!Utills.isNetworkAvailable(mContext!!)) {
                mData["oldName"] = defaultTag
                return AddressModel(latitude = latitude, longitude = longitude)
            }
            val geocoder = Geocoder(mContext, Locale(locale))
            var addresses: List<Address>? = null
            if (streetAddress.isEmpty())
                addresses = geocoder.getFromLocation(latitude, longitude, 5)
            else
                addresses = geocoder.getFromLocationName(streetAddress, 5)

            if (addresses != null && addresses.isNotEmpty()) {
                Log.e("address", Gson().toJson(addresses))
                addresses = addresses.sortedWith(compareBy({ it.longitude }, { it.longitude }))
                address = addresses[0]
                city = validateCity(address)
                state = validateState(address)
                roadName = validateStreet(address)
            }

            oldName =
                (if (roadName != null) "$roadName, " else "") + state.trim { it <= ' ' } + ", " + city.trim { it <= ' ' }
        } catch (ignored: Exception) {
            ignored.printStackTrace();
        }

        oldName = oldName.replace("-", " ၊ ")

        if (oldName.isEmpty())
            oldName = defaultTag

        mData["road"] = roadName
        mData["city"] = city
        mData["state"] = state
        mData["oldName"] = oldName
        return AddressModel(
            latitude = latitude, longitude = longitude,
            locality = address.locality,
            subLocality = address.subLocality,
            subAdminArea = address.subAdminArea,
            countryCode = address.countryCode,
            countryName = address.countryName,
            fullAddress = address.getAddressLine(0),
            isFound = true,
            adminArea = address.adminArea,
            featureName = address.featureName,
            roadName = roadName,
            city = city,
            state = state,
            pincode = address.postalCode
        )
    }

    private fun validateCity(address: Address): String {
        if (address.adminArea != null)
            return address.adminArea
        return if (address.subAdminArea != null) address.subAdminArea else ""
    }

    private fun validateState(address: Address): String {
        if (address.subLocality != null)
            return address.subLocality
        return if (address.locality != null) address.locality else ""
    }

    private fun validateStreet(address: Address): String {
        return if (address.featureName != null) address.featureName else ""
    }

    companion object {
        @SuppressLint("StaticFieldLeak")
        private var INSTANCE: GetAutoLocationDetails? = null

        fun getInstance(mContext: Context): GetAutoLocationDetails = INSTANCE?.also { it.mContext = mContext }
            ?: GetAutoLocationDetails().also { it.mContext = mContext;INSTANCE = it }
    }
}


class AddressModel(
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var adminArea: String = "",
    var countryCode: String = "",
    var featureName: String = "",
    var countryName: String = "",
    var locality: String = "",
    var subAdminArea: String = "",
    var fullAddress: String = "",
    var subLocality: String = "",
    var isFound: Boolean = false,
    var roadName: String = "",
    var city: String = "",
    var state: String = "",
    var pincode: String = "",
    var house: String = "",
    var landmark: String = ""
)