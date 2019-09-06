
package gojeck.weather.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Forecastday {

    @SerializedName("astro")
    private Astro mAstro;
    @SerializedName("date")
    private String mDate;
    @SerializedName("date_epoch")
    private Long mDateEpoch;
    @SerializedName("day")
    private Day mDay;

    public Astro getAstro() {
        return mAstro;
    }

    public void setAstro(Astro astro) {
        mAstro = astro;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public Long getDateEpoch() {
        return mDateEpoch;
    }

    public void setDateEpoch(Long dateEpoch) {
        mDateEpoch = dateEpoch;
    }

    public Day getDay() {
        return mDay;
    }

    public void setDay(Day day) {
        mDay = day;
    }

}
