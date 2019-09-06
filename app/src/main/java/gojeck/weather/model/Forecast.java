
package gojeck.weather.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Forecast {

    @SerializedName("forecastday")
    private List<Forecastday> mForecastday;

    public List<Forecastday> getForecastday() {
        return mForecastday;
    }

    public void setForecastday(List<Forecastday> forecastday) {
        mForecastday = forecastday;
    }

}
