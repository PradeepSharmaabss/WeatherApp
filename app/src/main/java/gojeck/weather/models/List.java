
package gojeck.weather.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class List {

    @SerializedName("Address")
    private String mAddress;
    @SerializedName("ApproxPrice")
    private String mApproxPrice;
    @SerializedName("CityId")
    private Double mCityId;
    @SerializedName("CurrentRating")
    private Double mCurrentRating;
    @SerializedName("Id")
    private String mId;
    @SerializedName("Phone")
    private String mPhone;
    @SerializedName("Saloner")
    private String mSaloner;
    @SerializedName("SaloonName")
    private String mSaloonName;
    @SerializedName("Services")
    private String mServices;
    @SerializedName("UserId")
    private Double mUserId;

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getApproxPrice() {
        return mApproxPrice;
    }

    public void setApproxPrice(String approxPrice) {
        mApproxPrice = approxPrice;
    }

    public Double getCityId() {
        return mCityId;
    }

    public void setCityId(Double cityId) {
        mCityId = cityId;
    }

    public Double getCurrentRating() {
        return mCurrentRating;
    }

    public void setCurrentRating(Double currentRating) {
        mCurrentRating = currentRating;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getPhone() {
        return mPhone;
    }

    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getSaloner() {
        return mSaloner;
    }

    public void setSaloner(String saloner) {
        mSaloner = saloner;
    }

    public String getSaloonName() {
        return mSaloonName;
    }

    public void setSaloonName(String saloonName) {
        mSaloonName = saloonName;
    }

    public String getServices() {
        return mServices;
    }

    public void setServices(String services) {
        mServices = services;
    }

    public Double getUserId() {
        return mUserId;
    }

    public void setUserId(Double userId) {
        mUserId = userId;
    }

}
