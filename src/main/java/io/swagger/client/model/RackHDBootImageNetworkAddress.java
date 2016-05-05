package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDBootImageNetworkAddress   {
  
  private String gateway = null;
  private String ipAddr = null;
  private String netmask = null;
  private String vlanId = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gateway")
  public String getGateway() {
    return gateway;
  }
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ipAddr")
  public String getIpAddr() {
    return ipAddr;
  }
  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("netmask")
  public String getNetmask() {
    return netmask;
  }
  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("vlanId")
  public String getVlanId() {
    return vlanId;
  }
  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageNetworkAddress rackHDBootImageNetworkAddress = (RackHDBootImageNetworkAddress) o;
    return Objects.equals(gateway, rackHDBootImageNetworkAddress.gateway) &&
        Objects.equals(ipAddr, rackHDBootImageNetworkAddress.ipAddr) &&
        Objects.equals(netmask, rackHDBootImageNetworkAddress.netmask) &&
        Objects.equals(vlanId, rackHDBootImageNetworkAddress.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateway, ipAddr, netmask, vlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageNetworkAddress {\n");
    
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

