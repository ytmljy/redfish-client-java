package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDBootImageBootImageList   {
  


  public enum OsNameEnum {
    CENTOS("CentOS"),
    CENTOS_KVM("CentOS+KVM"),
    ESXI("ESXi"),
    RHEL("RHEL"),
    RHEL_KVM("RHEL+KVM");

    private String value;

    OsNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OsNameEnum osName = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("osName")
  public OsNameEnum getOsName() {
    return osName;
  }
  public void setOsName(OsNameEnum osName) {
    this.osName = osName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageBootImageList rackHDBootImageBootImageList = (RackHDBootImageBootImageList) o;
    return Objects.equals(osName, rackHDBootImageBootImageList.osName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageBootImageList {\n");
    
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
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

