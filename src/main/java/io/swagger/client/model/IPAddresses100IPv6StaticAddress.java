package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.math.BigDecimal;



/**
 * This object represents a single IPv6 static address to be assigned on a network interface.
 **/

@ApiModel(description = "This object represents a single IPv6 static address to be assigned on a network interface.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class IPAddresses100IPv6StaticAddress   {
  
  private String address = null;
  private ResourceOem oem = null;
  private BigDecimal prefixLength = null;

  
  /**
   * A valid IPv6 address.
   **/
  
  @ApiModelProperty(required = true, value = "A valid IPv6 address.")
  @JsonProperty("Address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
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
   * The Prefix Length of this IPv6 address.
   * minimum: 1.0
   * maximum: 128.0
   **/
  
  @ApiModelProperty(required = true, value = "The Prefix Length of this IPv6 address.")
  @JsonProperty("PrefixLength")
  public BigDecimal getPrefixLength() {
    return prefixLength;
  }
  public void setPrefixLength(BigDecimal prefixLength) {
    this.prefixLength = prefixLength;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddresses100IPv6StaticAddress iPAddresses100IPv6StaticAddress = (IPAddresses100IPv6StaticAddress) o;
    return Objects.equals(address, iPAddresses100IPv6StaticAddress.address) &&
        Objects.equals(oem, iPAddresses100IPv6StaticAddress.oem) &&
        Objects.equals(prefixLength, iPAddresses100IPv6StaticAddress.prefixLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, oem, prefixLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddresses100IPv6StaticAddress {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    prefixLength: ").append(toIndentedString(prefixLength)).append("\n");
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

