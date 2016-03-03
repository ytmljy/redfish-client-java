package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class RackHDBootImageNetworkAddress   {
  
  private String netmask = null;
  private String ipAddr = null;
  private String gateway = null;
  private String vlanId = null;

  
  /**
   * This is the subnet mask
   **/
  public RackHDBootImageNetworkAddress netmask(String netmask) {
    this.netmask = netmask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the subnet mask")
  @JsonProperty("netmask")
  public String getNetmask() {
    return netmask;
  }
  public void setNetmask(String netmask) {
    this.netmask = netmask;
  }

  
  /**
   * This is the assigned static IP address of the network device
   **/
  public RackHDBootImageNetworkAddress ipAddr(String ipAddr) {
    this.ipAddr = ipAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the assigned static IP address of the network device")
  @JsonProperty("ipAddr")
  public String getIpAddr() {
    return ipAddr;
  }
  public void setIpAddr(String ipAddr) {
    this.ipAddr = ipAddr;
  }

  
  /**
   * This is the gateway address.
   **/
  public RackHDBootImageNetworkAddress gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the gateway address.")
  @JsonProperty("gateway")
  public String getGateway() {
    return gateway;
  }
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  /**
   * This is the VLAN ID represented as a array of integers with values of 0 to 4096
   **/
  public RackHDBootImageNetworkAddress vlanId(String vlanId) {
    this.vlanId = vlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the VLAN ID represented as a array of integers with values of 0 to 4096")
  @JsonProperty("vlanId")
  public String getVlanId() {
    return vlanId;
  }
  public void setVlanId(String vlanId) {
    this.vlanId = vlanId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageNetworkAddress rackHDBootImageNetworkAddress = (RackHDBootImageNetworkAddress) o;
    return Objects.equals(this.netmask, rackHDBootImageNetworkAddress.netmask) &&
        Objects.equals(this.ipAddr, rackHDBootImageNetworkAddress.ipAddr) &&
        Objects.equals(this.gateway, rackHDBootImageNetworkAddress.gateway) &&
        Objects.equals(this.vlanId, rackHDBootImageNetworkAddress.vlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netmask, ipAddr, gateway, vlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageNetworkAddress {\n");
    
    sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
    sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

