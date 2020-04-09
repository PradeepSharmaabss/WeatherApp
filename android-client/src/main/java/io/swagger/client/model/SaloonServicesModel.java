package io.swagger.client.model;

import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SaloonServicesModel  {
  
  @SerializedName("SlId")
  private UUID slId = null;
  @SerializedName("SaloonProfileId")
  private UUID saloonProfileId = null;
  @SerializedName("ServiceId")
  private UUID serviceId = null;
  @SerializedName("Price")
  private Double price = null;
  @SerializedName("TimeFrom")
  private String timeFrom = null;
  @SerializedName("TimeTo")
  private String timeTo = null;
  @SerializedName("TakeTime")
  private String takeTime = null;
  @SerializedName("NoOfSit")
  private Integer noOfSit = null;
  @SerializedName("UserId")
  private Integer userId = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getSlId() {
    return slId;
  }
  public void setSlId(UUID slId) {
    this.slId = slId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getSaloonProfileId() {
    return saloonProfileId;
  }
  public void setSaloonProfileId(UUID saloonProfileId) {
    this.saloonProfileId = saloonProfileId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getServiceId() {
    return serviceId;
  }
  public void setServiceId(UUID serviceId) {
    this.serviceId = serviceId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeFrom() {
    return timeFrom;
  }
  public void setTimeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeTo() {
    return timeTo;
  }
  public void setTimeTo(String timeTo) {
    this.timeTo = timeTo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTakeTime() {
    return takeTime;
  }
  public void setTakeTime(String takeTime) {
    this.takeTime = takeTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNoOfSit() {
    return noOfSit;
  }
  public void setNoOfSit(Integer noOfSit) {
    this.noOfSit = noOfSit;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaloonServicesModel saloonServicesModel = (SaloonServicesModel) o;
    return (this.slId == null ? saloonServicesModel.slId == null : this.slId.equals(saloonServicesModel.slId)) &&
        (this.saloonProfileId == null ? saloonServicesModel.saloonProfileId == null : this.saloonProfileId.equals(saloonServicesModel.saloonProfileId)) &&
        (this.serviceId == null ? saloonServicesModel.serviceId == null : this.serviceId.equals(saloonServicesModel.serviceId)) &&
        (this.price == null ? saloonServicesModel.price == null : this.price.equals(saloonServicesModel.price)) &&
        (this.timeFrom == null ? saloonServicesModel.timeFrom == null : this.timeFrom.equals(saloonServicesModel.timeFrom)) &&
        (this.timeTo == null ? saloonServicesModel.timeTo == null : this.timeTo.equals(saloonServicesModel.timeTo)) &&
        (this.takeTime == null ? saloonServicesModel.takeTime == null : this.takeTime.equals(saloonServicesModel.takeTime)) &&
        (this.noOfSit == null ? saloonServicesModel.noOfSit == null : this.noOfSit.equals(saloonServicesModel.noOfSit)) &&
        (this.userId == null ? saloonServicesModel.userId == null : this.userId.equals(saloonServicesModel.userId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.slId == null ? 0: this.slId.hashCode());
    result = 31 * result + (this.saloonProfileId == null ? 0: this.saloonProfileId.hashCode());
    result = 31 * result + (this.serviceId == null ? 0: this.serviceId.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.timeFrom == null ? 0: this.timeFrom.hashCode());
    result = 31 * result + (this.timeTo == null ? 0: this.timeTo.hashCode());
    result = 31 * result + (this.takeTime == null ? 0: this.takeTime.hashCode());
    result = 31 * result + (this.noOfSit == null ? 0: this.noOfSit.hashCode());
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaloonServicesModel {\n");
    
    sb.append("  slId: ").append(slId).append("\n");
    sb.append("  saloonProfileId: ").append(saloonProfileId).append("\n");
    sb.append("  serviceId: ").append(serviceId).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  timeFrom: ").append(timeFrom).append("\n");
    sb.append("  timeTo: ").append(timeTo).append("\n");
    sb.append("  takeTime: ").append(takeTime).append("\n");
    sb.append("  noOfSit: ").append(noOfSit).append("\n");
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
