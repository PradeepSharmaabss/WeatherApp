package io.swagger.client.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserModel  {
  
  @SerializedName("UserId")
  private Integer userId = null;
  @SerializedName("Firstname")
  private String firstname = null;
  @SerializedName("Lastname")
  private String lastname = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("Phone")
  private String phone = null;
  @SerializedName("BirthDate")
  private Date birthDate = null;

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
  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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
  public Date getBirthDate() {
    return birthDate;
  }
  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserModel userModel = (UserModel) o;
    return (this.userId == null ? userModel.userId == null : this.userId.equals(userModel.userId)) &&
        (this.firstname == null ? userModel.firstname == null : this.firstname.equals(userModel.firstname)) &&
        (this.lastname == null ? userModel.lastname == null : this.lastname.equals(userModel.lastname)) &&
        (this.email == null ? userModel.email == null : this.email.equals(userModel.email)) &&
        (this.phone == null ? userModel.phone == null : this.phone.equals(userModel.phone)) &&
        (this.birthDate == null ? userModel.birthDate == null : this.birthDate.equals(userModel.birthDate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.firstname == null ? 0: this.firstname.hashCode());
    result = 31 * result + (this.lastname == null ? 0: this.lastname.hashCode());
    result = 31 * result + (this.email == null ? 0: this.email.hashCode());
    result = 31 * result + (this.phone == null ? 0: this.phone.hashCode());
    result = 31 * result + (this.birthDate == null ? 0: this.birthDate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserModel {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("  lastname: ").append(lastname).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  birthDate: ").append(birthDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
