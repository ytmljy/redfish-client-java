package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Type;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
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
  private Odata400Type odataType = null;

  
  /**
   **/
  public RackHDBootImageBootImageList osName(OsNameEnum osName) {
    this.osName = osName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("osName")
  public OsNameEnum getOsName() {
    return osName;
  }
  public void setOsName(OsNameEnum osName) {
    this.osName = osName;
  }

  
  /**
   **/
  public RackHDBootImageBootImageList odataType(Odata400Type odataType) {
    this.odataType = odataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.type")
  public Odata400Type getOdataType() {
    return odataType;
  }
  public void setOdataType(Odata400Type odataType) {
    this.odataType = odataType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageBootImageList rackHDBootImageBootImageList = (RackHDBootImageBootImageList) o;
    return Objects.equals(this.osName, rackHDBootImageBootImageList.osName) &&
        Objects.equals(this.odataType, rackHDBootImageBootImageList.odataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osName, odataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageBootImageList {\n");
    
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
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

