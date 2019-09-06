
package gojeck.weather.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Day {

    @SerializedName("avghumidity")
    private Double mAvghumidity;
    @SerializedName("avgtemp_c")
    private Double mAvgtempC;
    @SerializedName("avgtemp_f")
    private Double mAvgtempF;
    @SerializedName("avgvis_km")
    private Double mAvgvisKm;
    @SerializedName("avgvis_miles")
    private Double mAvgvisMiles;
    @SerializedName("condition")
    private Condition mCondition;
    @SerializedName("maxtemp_c")
    private Double mMaxtempC;
    @SerializedName("maxtemp_f")
    private Double mMaxtempF;
    @SerializedName("maxwind_kph")
    private Double mMaxwindKph;
    @SerializedName("maxwind_mph")
    private Double mMaxwindMph;
    @SerializedName("mintemp_c")
    private Double mMintempC;
    @SerializedName("mintemp_f")
    private Double mMintempF;
    @SerializedName("totalprecip_in")
    private Double mTotalprecipIn;
    @SerializedName("totalprecip_mm")
    private Double mTotalprecipMm;
    @SerializedName("uv")
    private Double mUv;

    public Double getAvghumidity() {
        return mAvghumidity;
    }

    public void setAvghumidity(Double avghumidity) {
        mAvghumidity = avghumidity;
    }

    public int getAvgtempC() {
        return mAvgtempC.intValue();
    }

    public void setAvgtempC(Double avgtempC) {
        mAvgtempC = avgtempC;
    }

    public Double getAvgtempF() {
        return mAvgtempF;
    }

    public void setAvgtempF(Double avgtempF) {
        mAvgtempF = avgtempF;
    }

    public Double getAvgvisKm() {
        return mAvgvisKm;
    }

    public void setAvgvisKm(Double avgvisKm) {
        mAvgvisKm = avgvisKm;
    }

    public Double getAvgvisMiles() {
        return mAvgvisMiles;
    }

    public void setAvgvisMiles(Double avgvisMiles) {
        mAvgvisMiles = avgvisMiles;
    }

    public Condition getCondition() {
        return mCondition;
    }

    public void setCondition(Condition condition) {
        mCondition = condition;
    }

    public Double getMaxtempC() {
        return mMaxtempC;
    }

    public void setMaxtempC(Double maxtempC) {
        mMaxtempC = maxtempC;
    }

    public Double getMaxtempF() {
        return mMaxtempF;
    }

    public void setMaxtempF(Double maxtempF) {
        mMaxtempF = maxtempF;
    }

    public Double getMaxwindKph() {
        return mMaxwindKph;
    }

    public void setMaxwindKph(Double maxwindKph) {
        mMaxwindKph = maxwindKph;
    }

    public Double getMaxwindMph() {
        return mMaxwindMph;
    }

    public void setMaxwindMph(Double maxwindMph) {
        mMaxwindMph = maxwindMph;
    }

    public Double getMintempC() {
        return mMintempC;
    }

    public void setMintempC(Double mintempC) {
        mMintempC = mintempC;
    }

    public Double getMintempF() {
        return mMintempF;
    }

    public void setMintempF(Double mintempF) {
        mMintempF = mintempF;
    }

    public Double getTotalprecipIn() {
        return mTotalprecipIn;
    }

    public void setTotalprecipIn(Double totalprecipIn) {
        mTotalprecipIn = totalprecipIn;
    }

    public Double getTotalprecipMm() {
        return mTotalprecipMm;
    }

    public void setTotalprecipMm(Double totalprecipMm) {
        mTotalprecipMm = totalprecipMm;
    }

    public Double getUv() {
        return mUv;
    }

    public void setUv(Double uv) {
        mUv = uv;
    }

}
