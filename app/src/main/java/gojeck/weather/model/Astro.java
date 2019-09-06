
package gojeck.weather.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Astro {

    @SerializedName("moonrise")
    private String mMoonrise;
    @SerializedName("moonset")
    private String mMoonset;
    @SerializedName("sunrise")
    private String mSunrise;
    @SerializedName("sunset")
    private String mSunset;

    public String getMoonrise() {
        return mMoonrise;
    }

    public void setMoonrise(String moonrise) {
        mMoonrise = moonrise;
    }

    public String getMoonset() {
        return mMoonset;
    }

    public void setMoonset(String moonset) {
        mMoonset = moonset;
    }

    public String getSunrise() {
        return mSunrise;
    }

    public void setSunrise(String sunrise) {
        mSunrise = sunrise;
    }

    public String getSunset() {
        return mSunset;
    }

    public void setSunset(String sunset) {
        mSunset = sunset;
    }

}
