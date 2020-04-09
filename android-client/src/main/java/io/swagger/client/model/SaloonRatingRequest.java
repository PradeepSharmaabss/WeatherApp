package io.swagger.client.model;

import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SaloonRatingRequest  {
  
  @SerializedName("SaloonId")
  private UUID saloonId = null;
  @SerializedName("Rating")
  private Integer rating = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public UUID getSaloonId() {
    return saloonId;
  }
  public void setSaloonId(UUID saloonId) {
    this.saloonId = saloonId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaloonRatingRequest saloonRatingRequest = (SaloonRatingRequest) o;
    return (this.saloonId == null ? saloonRatingRequest.saloonId == null : this.saloonId.equals(saloonRatingRequest.saloonId)) &&
        (this.rating == null ? saloonRatingRequest.rating == null : this.rating.equals(saloonRatingRequest.rating));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.saloonId == null ? 0: this.saloonId.hashCode());
    result = 31 * result + (this.rating == null ? 0: this.rating.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaloonRatingRequest {\n");
    
    sb.append("  saloonId: ").append(saloonId).append("\n");
    sb.append("  rating: ").append(rating).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
