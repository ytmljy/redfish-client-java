package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class IPAddresses100IPv6Address   {
  
  private String address = null;


  public enum AddressOriginEnum {
    STATIC("Static"),
    DHCPV6("DHCPv6"),
    LINKLOCAL("LinkLocal"),
    SLAAC("SLAAC");

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


  public enum AddressStateEnum {
    PREFERRED("Preferred"),
    DEPRECATED("Deprecated"),
    TENTATIVE("Tentative"),
    FAILED("Failed");

    private String value;

    AddressStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AddressStateEnum addressState = null;
  private ResourceOem oem = null;
  private BigDecimal prefixLength = null;

  
  /**
   * This is the IPv6 Address.
   **/
  
  @ApiModelProperty(value = "This is the IPv6 Address.")
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
   * The current state of this address as defined in RFC 4862.
   **/
  
  @ApiModelProperty(value = "The current state of this address as defined in RFC 4862.")
  @JsonProperty("AddressState")
  public AddressStateEnum getAddressState() {
    return addressState;
  }
  public void setAddressState(AddressStateEnum addressState) {
    this.addressState = addressState;
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
   * This is the IPv6 Address Prefix Length.
   * minimum: 1.0
   * maximum: 128.0
   **/
  
  @ApiModelProperty(value = "This is the IPv6 Address Prefix Length.")
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
    IPAddresses100IPv6Address iPAddresses100IPv6Address = (IPAddresses100IPv6Address) o;
    return Objects.equals(address, iPAddresses100IPv6Address.address) &&
        Objects.equals(addressOrigin, iPAddresses100IPv6Address.addressOrigin) &&
        Objects.equals(addressState, iPAddresses100IPv6Address.addressState) &&
        Objects.equals(oem, iPAddresses100IPv6Address.oem) &&
        Objects.equals(prefixLength, iPAddresses100IPv6Address.prefixLength);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressOrigin, addressState, oem, prefixLength);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddresses100IPv6Address {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressOrigin: ").append(toIndentedString(addressOrigin)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
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

