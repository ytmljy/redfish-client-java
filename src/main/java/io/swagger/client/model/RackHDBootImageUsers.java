package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class RackHDBootImageUsers   {
  
  private String password = null;
  private BigDecimal uid = null;
  private String name = null;
  private String sshKey = null;

  
  /**
   * This is the password of user, it should pass the clear text, OnRack will do encryption before storing it into a kickstart file.
   **/
  public RackHDBootImageUsers password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the password of user, it should pass the clear text, OnRack will do encryption before storing it into a kickstart file.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * The unique identifier of user
   **/
  public RackHDBootImageUsers uid(BigDecimal uid) {
    this.uid = uid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of user")
  @JsonProperty("uid")
  public BigDecimal getUid() {
    return uid;
  }
  public void setUid(BigDecimal uid) {
    this.uid = uid;
  }

  
  /**
   * This is the name of user
   **/
  public RackHDBootImageUsers name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the name of user")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This is the SSH key that will be appended into the file ~/.ssh/authorized_keys
   **/
  public RackHDBootImageUsers sshKey(String sshKey) {
    this.sshKey = sshKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the SSH key that will be appended into the file ~/.ssh/authorized_keys")
  @JsonProperty("sshKey")
  public String getSshKey() {
    return sshKey;
  }
  public void setSshKey(String sshKey) {
    this.sshKey = sshKey;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageUsers rackHDBootImageUsers = (RackHDBootImageUsers) o;
    return Objects.equals(this.password, rackHDBootImageUsers.password) &&
        Objects.equals(this.uid, rackHDBootImageUsers.uid) &&
        Objects.equals(this.name, rackHDBootImageUsers.name) &&
        Objects.equals(this.sshKey, rackHDBootImageUsers.sshKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, uid, name, sshKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageUsers {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sshKey: ").append(toIndentedString(sshKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

