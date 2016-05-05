package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RackHDBootImageNetworkAddress;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDBootImageNetworkDevice   {
  
  private String device = null;
  private RackHDBootImageNetworkAddress ipv4 = null;
  private RackHDBootImageNetworkAddress ipv6 = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("device")
  public String getDevice() {
    return device;
  }
  public void setDevice(String device) {
    this.device = device;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ipv4")
  public RackHDBootImageNetworkAddress getIpv4() {
    return ipv4;
  }
  public void setIpv4(RackHDBootImageNetworkAddress ipv4) {
    this.ipv4 = ipv4;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ipv6")
  public RackHDBootImageNetworkAddress getIpv6() {
    return ipv6;
  }
  public void setIpv6(RackHDBootImageNetworkAddress ipv6) {
    this.ipv6 = ipv6;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageNetworkDevice rackHDBootImageNetworkDevice = (RackHDBootImageNetworkDevice) o;
    return Objects.equals(device, rackHDBootImageNetworkDevice.device) &&
        Objects.equals(ipv4, rackHDBootImageNetworkDevice.ipv4) &&
        Objects.equals(ipv6, rackHDBootImageNetworkDevice.ipv6);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, ipv4, ipv6);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageNetworkDevice {\n");
    
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    ipv4: ").append(toIndentedString(ipv4)).append("\n");
    sb.append("    ipv6: ").append(toIndentedString(ipv6)).append("\n");
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

