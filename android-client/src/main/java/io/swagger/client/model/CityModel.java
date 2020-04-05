package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CityModel  {
  
  @SerializedName("CityId")
  private Integer cityId = null;
  @SerializedName("StateId")
  private Integer stateId = null;
  @SerializedName("CityCode")
  private String cityCode = null;
  @SerializedName("CityName")
  private String cityName = null;
  @SerializedName("LanguageId")
  private Integer languageId = null;
  @SerializedName("Status")
  private Boolean status = null;

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
  public Integer getStateId() {
    return stateId;
  }
  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getLanguageId() {
    return languageId;
  }
  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CityModel cityModel = (CityModel) o;
    return (this.cityId == null ? cityModel.cityId == null : this.cityId.equals(cityModel.cityId)) &&
        (this.stateId == null ? cityModel.stateId == null : this.stateId.equals(cityModel.stateId)) &&
        (this.cityCode == null ? cityModel.cityCode == null : this.cityCode.equals(cityModel.cityCode)) &&
        (this.cityName == null ? cityModel.cityName == null : this.cityName.equals(cityModel.cityName)) &&
        (this.languageId == null ? cityModel.languageId == null : this.languageId.equals(cityModel.languageId)) &&
        (this.status == null ? cityModel.status == null : this.status.equals(cityModel.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cityId == null ? 0: this.cityId.hashCode());
    result = 31 * result + (this.stateId == null ? 0: this.stateId.hashCode());
    result = 31 * result + (this.cityCode == null ? 0: this.cityCode.hashCode());
    result = 31 * result + (this.cityName == null ? 0: this.cityName.hashCode());
    result = 31 * result + (this.languageId == null ? 0: this.languageId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CityModel {\n");
    
    sb.append("  cityId: ").append(cityId).append("\n");
    sb.append("  stateId: ").append(stateId).append("\n");
    sb.append("  cityCode: ").append(cityCode).append("\n");
    sb.append("  cityName: ").append(cityName).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
