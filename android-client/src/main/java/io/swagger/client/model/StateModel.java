package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class StateModel  {
  
  @SerializedName("StateId")
  private Integer stateId = null;
  @SerializedName("CountryId")
  private Integer countryId = null;
  @SerializedName("StateCode")
  private String stateCode = null;
  @SerializedName("StateName")
  private String stateName = null;
  @SerializedName("LanguageId")
  private Integer languageId = null;
  @SerializedName("Status")
  private Boolean status = null;

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
  public Integer getCountryId() {
    return countryId;
  }
  public void setCountryId(Integer countryId) {
    this.countryId = countryId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStateCode() {
    return stateCode;
  }
  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStateName() {
    return stateName;
  }
  public void setStateName(String stateName) {
    this.stateName = stateName;
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
    StateModel stateModel = (StateModel) o;
    return (this.stateId == null ? stateModel.stateId == null : this.stateId.equals(stateModel.stateId)) &&
        (this.countryId == null ? stateModel.countryId == null : this.countryId.equals(stateModel.countryId)) &&
        (this.stateCode == null ? stateModel.stateCode == null : this.stateCode.equals(stateModel.stateCode)) &&
        (this.stateName == null ? stateModel.stateName == null : this.stateName.equals(stateModel.stateName)) &&
        (this.languageId == null ? stateModel.languageId == null : this.languageId.equals(stateModel.languageId)) &&
        (this.status == null ? stateModel.status == null : this.status.equals(stateModel.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.stateId == null ? 0: this.stateId.hashCode());
    result = 31 * result + (this.countryId == null ? 0: this.countryId.hashCode());
    result = 31 * result + (this.stateCode == null ? 0: this.stateCode.hashCode());
    result = 31 * result + (this.stateName == null ? 0: this.stateName.hashCode());
    result = 31 * result + (this.languageId == null ? 0: this.languageId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateModel {\n");
    
    sb.append("  stateId: ").append(stateId).append("\n");
    sb.append("  countryId: ").append(countryId).append("\n");
    sb.append("  stateCode: ").append(stateCode).append("\n");
    sb.append("  stateName: ").append(stateName).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
