package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDBootImageUsers   {
  
  private String name = null;
  private String password = null;
  private String sshKey = null;
  private BigDecimal uid = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sshKey")
  public String getSshKey() {
    return sshKey;
  }
  public void setSshKey(String sshKey) {
    this.sshKey = sshKey;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("uid")
  public BigDecimal getUid() {
    return uid;
  }
  public void setUid(BigDecimal uid) {
    this.uid = uid;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageUsers rackHDBootImageUsers = (RackHDBootImageUsers) o;
    return Objects.equals(name, rackHDBootImageUsers.name) &&
        Objects.equals(password, rackHDBootImageUsers.password) &&
        Objects.equals(sshKey, rackHDBootImageUsers.sshKey) &&
        Objects.equals(uid, rackHDBootImageUsers.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, sshKey, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageUsers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

