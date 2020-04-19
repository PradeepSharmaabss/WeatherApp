
package gojeck.weather.models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Data {

    @SerializedName("access_token")
    private String mAccessToken;
    @SerializedName(".expires")
    private String mExpires;
    @SerializedName("expires_in")
    private Long mExpiresIn;
    @SerializedName(".issued")
    private String mIssued;
    @SerializedName("phoneNumber")
    private String mPhoneNumber;
    @SerializedName("refresh_token")
    private String mRefreshToken;
    @SerializedName("token_type")
    private String mTokenType;
    @SerializedName("userName")
    private String mUserName;

    public String getAccessToken() {
        return mAccessToken;
    }

    public void setAccessToken(String accessToken) {
        mAccessToken = accessToken;
    }

    public String getExpires() {
        return mExpires;
    }

    public void setExpires(String expires) {
        mExpires = expires;
    }

    public Long getExpiresIn() {
        return mExpiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        mExpiresIn = expiresIn;
    }

    public String getIssued() {
        return mIssued;
    }

    public void setIssued(String issued) {
        mIssued = issued;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getRefreshToken() {
        return mRefreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        mRefreshToken = refreshToken;
    }

    public String getTokenType() {
        return mTokenType;
    }

    public void setTokenType(String tokenType) {
        mTokenType = tokenType;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

}
