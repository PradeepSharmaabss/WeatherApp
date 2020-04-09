package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SaloonSearchRequest  {
  
  @SerializedName("Lat")
  private Double lat = null;
  @SerializedName("Lng")
  private Double lng = null;
  @SerializedName("Distance")
  private Integer distance = null;
  @SerializedName("PageNumber")
  private Integer pageNumber = null;
  @SerializedName("NumberOfRows")
  private Integer numberOfRows = null;
  @SerializedName("Terms")
  private String terms = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLat() {
    return lat;
  }
  public void setLat(Double lat) {
    this.lat = lat;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Double getLng() {
    return lng;
  }
  public void setLng(Double lng) {
    this.lng = lng;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDistance() {
    return distance;
  }
  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfRows() {
    return numberOfRows;
  }
  public void setNumberOfRows(Integer numberOfRows) {
    this.numberOfRows = numberOfRows;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTerms() {
    return terms;
  }
  public void setTerms(String terms) {
    this.terms = terms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SaloonSearchRequest saloonSearchRequest = (SaloonSearchRequest) o;
    return (this.lat == null ? saloonSearchRequest.lat == null : this.lat.equals(saloonSearchRequest.lat)) &&
        (this.lng == null ? saloonSearchRequest.lng == null : this.lng.equals(saloonSearchRequest.lng)) &&
        (this.distance == null ? saloonSearchRequest.distance == null : this.distance.equals(saloonSearchRequest.distance)) &&
        (this.pageNumber == null ? saloonSearchRequest.pageNumber == null : this.pageNumber.equals(saloonSearchRequest.pageNumber)) &&
        (this.numberOfRows == null ? saloonSearchRequest.numberOfRows == null : this.numberOfRows.equals(saloonSearchRequest.numberOfRows)) &&
        (this.terms == null ? saloonSearchRequest.terms == null : this.terms.equals(saloonSearchRequest.terms));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.lat == null ? 0: this.lat.hashCode());
    result = 31 * result + (this.lng == null ? 0: this.lng.hashCode());
    result = 31 * result + (this.distance == null ? 0: this.distance.hashCode());
    result = 31 * result + (this.pageNumber == null ? 0: this.pageNumber.hashCode());
    result = 31 * result + (this.numberOfRows == null ? 0: this.numberOfRows.hashCode());
    result = 31 * result + (this.terms == null ? 0: this.terms.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SaloonSearchRequest {\n");
    
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lng: ").append(lng).append("\n");
    sb.append("  distance: ").append(distance).append("\n");
    sb.append("  pageNumber: ").append(pageNumber).append("\n");
    sb.append("  numberOfRows: ").append(numberOfRows).append("\n");
    sb.append("  terms: ").append(terms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
