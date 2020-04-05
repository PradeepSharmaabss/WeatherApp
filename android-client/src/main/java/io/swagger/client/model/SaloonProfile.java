package io.swagger.client.model;

import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SaloonProfile  {
  
  @SerializedName("Id")
  private UUID id = null;
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("SaloonName")
  private String saloonName = null;
  @SerializedName("CityId")
  private Integer cityId = null;
  @SerializedName("PinCode")
  private String pinCode = null;
  @SerializedName("Area")
  private String area = null;
  @SerializedName("Address")
  private String address = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("Lat")
  private String lat = null;
  @SerializedName("Lng")
  private String lng = null;
  @SerializedName("ApproxPrice")
  private String approxPrice = null;
  @SerializedName("Saloner")
  private String saloner = null;
  @SerializedName("ClientId")
  private Integer clientId = null;
  @SerializedName("Services")
  private String services = null;
  @SerializedName("CurrentRating")
  private String currentRating = null;
  @SerializedName("MaxTime")
  private String maxTime = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSaloonName() {
    return saloonName;
  }
  public void setSaloonName(String saloonName) {
    this.saloonName = saloonName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCityId() {
    return cityId;
  }
  public void setCityId(Integer cityId) {
    this.cityId = cityId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPinCode() {
    return pinCode;
  }
  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getArea() {
    return area;
  }
  public void setArea(String area) {
    this.area = area;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLat() {
    return lat;
  }
  public void setLat(String lat) {
    this.lat = lat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLng() {
    return lng;
  }
  public void setLng(String lng) {
    this.lng = lng;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getApproxPrice() {
    return approxPrice;
  }
  public void setApproxPrice(String approxPrice) {
    this.approxPrice = approxPrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSaloner() {
    return saloner;
  }
  public void setSaloner(String saloner) {
    this.saloner = saloner;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }
  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getServices() {
    return services;
  }
  public void setServices(String services) {
    this.services = services;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCurrentRating() {
    return currentRating;
  }
  public void setCurrentRating(String currentRating) {
    this.currentRating = currentRating;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMaxTime() {
    return maxTime;
  }
  public void setMaxTime(String maxTime) {
    this.maxTime = maxTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaloonProfile saloonProfile = (SaloonProfile) o;
    return (this.id == null ? saloonProfile.id == null : this.id.equals(saloonProfile.id)) &&
        (this.userId == null ? saloonProfile.userId == null : this.userId.equals(saloonProfile.userId)) &&
        (this.saloonName == null ? saloonProfile.saloonName == null : this.saloonName.equals(saloonProfile.saloonName)) &&
        (this.cityId == null ? saloonProfile.cityId == null : this.cityId.equals(saloonProfile.cityId)) &&
        (this.pinCode == null ? saloonProfile.pinCode == null : this.pinCode.equals(saloonProfile.pinCode)) &&
        (this.area == null ? saloonProfile.area == null : this.area.equals(saloonProfile.area)) &&
        (this.address == null ? saloonProfile.address == null : this.address.equals(saloonProfile.address)) &&
        (this.phone == null ? saloonProfile.phone == null : this.phone.equals(saloonProfile.phone)) &&
        (this.lat == null ? saloonProfile.lat == null : this.lat.equals(saloonProfile.lat)) &&
        (this.lng == null ? saloonProfile.lng == null : this.lng.equals(saloonProfile.lng)) &&
        (this.approxPrice == null ? saloonProfile.approxPrice == null : this.approxPrice.equals(saloonProfile.approxPrice)) &&
        (this.saloner == null ? saloonProfile.saloner == null : this.saloner.equals(saloonProfile.saloner)) &&
        (this.clientId == null ? saloonProfile.clientId == null : this.clientId.equals(saloonProfile.clientId)) &&
        (this.services == null ? saloonProfile.services == null : this.services.equals(saloonProfile.services)) &&
        (this.currentRating == null ? saloonProfile.currentRating == null : this.currentRating.equals(saloonProfile.currentRating)) &&
        (this.maxTime == null ? saloonProfile.maxTime == null : this.maxTime.equals(saloonProfile.maxTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.saloonName == null ? 0: this.saloonName.hashCode());
    result = 31 * result + (this.cityId == null ? 0: this.cityId.hashCode());
    result = 31 * result + (this.pinCode == null ? 0: this.pinCode.hashCode());
    result = 31 * result + (this.area == null ? 0: this.area.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lng == null ? 0: this.lng.hashCode());
    result = 31 * result + (this.approxPrice == null ? 0: this.approxPrice.hashCode());
    result = 31 * result + (this.saloner == null ? 0: this.saloner.hashCode());
    result = 31 * result + (this.clientId == null ? 0: this.clientId.hashCode());
    result = 31 * result + (this.services == null ? 0: this.services.hashCode());
    result = 31 * result + (this.currentRating == null ? 0: this.currentRating.hashCode());
    result = 31 * result + (this.maxTime == null ? 0: this.maxTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaloonProfile {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  saloonName: ").append(saloonName).append("\n");
    sb.append("  cityId: ").append(cityId).append("\n");
    sb.append("  pinCode: ").append(pinCode).append("\n");
    sb.append("  area: ").append(area).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lng: ").append(lng).append("\n");
    sb.append("  approxPrice: ").append(approxPrice).append("\n");
    sb.append("  saloner: ").append(saloner).append("\n");
    sb.append("  clientId: ").append(clientId).append("\n");
    sb.append("  services: ").append(services).append("\n");
    sb.append("  currentRating: ").append(currentRating).append("\n");
    sb.append("  maxTime: ").append(maxTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
