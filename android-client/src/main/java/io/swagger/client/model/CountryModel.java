package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CountryModel  {
  
  @SerializedName("CountryId")
  private Integer countryId = null;
  @SerializedName("CountryCode")
  private String countryCode = null;
  @SerializedName("CountryName")
  private String countryName = null;
  @SerializedName("LanguageId")
  private Integer languageId = null;
  @SerializedName("Status")
  private Boolean status = null;

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
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCountryName() {
    return countryName;
  }
  public void setCountryName(String countryName) {
    this.countryName = countryName;
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
    CountryModel countryModel = (CountryModel) o;
    return (this.countryId == null ? countryModel.countryId == null : this.countryId.equals(countryModel.countryId)) &&
        (this.countryCode == null ? countryModel.countryCode == null : this.countryCode.equals(countryModel.countryCode)) &&
        (this.countryName == null ? countryModel.countryName == null : this.countryName.equals(countryModel.countryName)) &&
        (this.languageId == null ? countryModel.languageId == null : this.languageId.equals(countryModel.languageId)) &&
        (this.status == null ? countryModel.status == null : this.status.equals(countryModel.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.countryId == null ? 0: this.countryId.hashCode());
    result = 31 * result + (this.countryCode == null ? 0: this.countryCode.hashCode());
    result = 31 * result + (this.countryName == null ? 0: this.countryName.hashCode());
    result = 31 * result + (this.languageId == null ? 0: this.languageId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryModel {\n");
    
    sb.append("  countryId: ").append(countryId).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  countryName: ").append(countryName).append("\n");
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
