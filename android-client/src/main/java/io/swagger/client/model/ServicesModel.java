package io.swagger.client.model;

import java.util.UUID;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ServicesModel  {
  
  @SerializedName("ServiceId")
  private UUID serviceId = null;
  @SerializedName("ServiceName")
  private String serviceName = null;

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
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesModel servicesModel = (ServicesModel) o;
    return (this.serviceId == null ? servicesModel.serviceId == null : this.serviceId.equals(servicesModel.serviceId)) &&
        (this.serviceName == null ? servicesModel.serviceName == null : this.serviceName.equals(servicesModel.serviceName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.serviceId == null ? 0: this.serviceId.hashCode());
    result = 31 * result + (this.serviceName == null ? 0: this.serviceName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesModel {\n");
    
    sb.append("  serviceId: ").append(serviceId).append("\n");
    sb.append("  serviceName: ").append(serviceName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
