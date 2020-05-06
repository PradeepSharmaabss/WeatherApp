package gojeck.weather.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by pratap.kesaboyina on 01-12-2015.
 */
public class SingleItemModel {


    private String name;
    private String url;
    private String description;

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


    public SingleItemModel() {
    }

    public SingleItemModel(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmApproxPrice() {
        return mApproxPrice;
    }

    public void setmApproxPrice(String mApproxPrice) {
        this.mApproxPrice = mApproxPrice;
    }

    public Double getmCityId() {
        return mCityId;
    }

    public void setmCityId(Double mCityId) {
        this.mCityId = mCityId;
    }

    public Double getmCurrentRating() {
        return mCurrentRating;
    }

    public void setmCurrentRating(Double mCurrentRating) {
        this.mCurrentRating = mCurrentRating;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public String getmSaloner() {
        return mSaloner;
    }

    public void setmSaloner(String mSaloner) {
        this.mSaloner = mSaloner;
    }

    public String getmSaloonName() {
        return mSaloonName;
    }

    public void setmSaloonName(String mSaloonName) {
        this.mSaloonName = mSaloonName;
    }

    public String getmServices() {
        return mServices;
    }

    public void setmServices(String mServices) {
        this.mServices = mServices;
    }

    public Double getmUserId() {
        return mUserId;
    }

    public void setmUserId(Double mUserId) {
        this.mUserId = mUserId;
    }
}
