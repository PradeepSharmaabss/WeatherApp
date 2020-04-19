
package gojeck.weather.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LoginData {

    @SerializedName("data")
    private Data mData;
    @SerializedName("OK")
    private Long mOK;
    @SerializedName("status")
    private String mStatus;

    public Data getData() {
        return mData;
    }

    public void setData(Data data) {
        mData = data;
    }

    public Long getOK() {
        return mOK;
    }

    public void setOK(Long oK) {
        mOK = oK;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
