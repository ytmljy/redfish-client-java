package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class IPAddresses100IPv4Address   {
  
  private String address = null;


  public enum AddressOriginEnum {
    STATIC("Static"),
    DHCP("DHCP"),
    BOOTP("BOOTP"),
    IPV4LINKLOCAL("IPv4LinkLocal");

    private String value;

    AddressOriginEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AddressOriginEnum addressOrigin = null;
  private String gateway = null;
  private ResourceOem oem = null;
  private String subnetMask = null;

  
  /**
   * This is the IPv4 Address.
   **/
  
  @ApiModelProperty(value = "This is the IPv4 Address.")
  @JsonProperty("Address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   * This indicates how the address was determined.
   **/
  
  @ApiModelProperty(value = "This indicates how the address was determined.")
  @JsonProperty("AddressOrigin")
  public AddressOriginEnum getAddressOrigin() {
    return addressOrigin;
  }
  public void setAddressOrigin(AddressOriginEnum addressOrigin) {
    this.addressOrigin = addressOrigin;
  }

  
  /**
   * This is the IPv4 gateway for this address.
   **/
  
  @ApiModelProperty(value = "This is the IPv4 gateway for this address.")
  @JsonProperty("Gateway")
  public String getGateway() {
    return gateway;
  }
  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * This is the IPv4 Subnet mask.
   **/
  
  @ApiModelProperty(value = "This is the IPv4 Subnet mask.")
  @JsonProperty("SubnetMask")
  public String getSubnetMask() {
    return subnetMask;
  }
  public void setSubnetMask(String subnetMask) {
    this.subnetMask = subnetMask;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddresses100IPv4Address iPAddresses100IPv4Address = (IPAddresses100IPv4Address) o;
    return Objects.equals(address, iPAddresses100IPv4Address.address) &&
        Objects.equals(addressOrigin, iPAddresses100IPv4Address.addressOrigin) &&
        Objects.equals(gateway, iPAddresses100IPv4Address.gateway) &&
        Objects.equals(oem, iPAddresses100IPv4Address.oem) &&
        Objects.equals(subnetMask, iPAddresses100IPv4Address.subnetMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressOrigin, gateway, oem, subnetMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddresses100IPv4Address {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressOrigin: ").append(toIndentedString(addressOrigin)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
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

