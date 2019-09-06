
package gojeck.weather.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseModel {

    @SerializedName("alert")
    private Alert mAlert;
    @SerializedName("current")
    private Current mCurrent;
    @SerializedName("forecast")
    private Forecast mForecast;
    @SerializedName("location")
    private Location mLocation;

    public Alert getAlert() {
        return mAlert;
    }

    public void setAlert(Alert alert) {
        mAlert = alert;
    }

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Forecast getForecast() {
        return mForecast;
    }

    public void setForecast(Forecast forecast) {
        mForecast = forecast;
    }

    public Location getLocation() {
        return mLocation;
    }

    public void setLocation(Location location) {
        mLocation = location;
    }

}
