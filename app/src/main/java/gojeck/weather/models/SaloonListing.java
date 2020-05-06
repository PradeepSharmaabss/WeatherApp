
package gojeck.weather.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SaloonListing {

    @SerializedName("data")
    private List<Datum> mData;
    @SerializedName("OK")
    private Double mOK;
    @SerializedName("status")
    private String mStatus;

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

    public Double getOK() {
        return mOK;
    }

    public void setOK(Double oK) {
        mOK = oK;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
