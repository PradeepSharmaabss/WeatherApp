package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LanguageModel  {
  
  @SerializedName("LanguageId")
  private Integer languageId = null;
  @SerializedName("Language")
  private String language = null;
  @SerializedName("Status")
  private Boolean status = null;

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
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
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
    LanguageModel languageModel = (LanguageModel) o;
    return (this.languageId == null ? languageModel.languageId == null : this.languageId.equals(languageModel.languageId)) &&
        (this.language == null ? languageModel.language == null : this.language.equals(languageModel.language)) &&
        (this.status == null ? languageModel.status == null : this.status.equals(languageModel.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.languageId == null ? 0: this.languageId.hashCode());
    result = 31 * result + (this.language == null ? 0: this.language.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageModel {\n");
    
    sb.append("  languageId: ").append(languageId).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
