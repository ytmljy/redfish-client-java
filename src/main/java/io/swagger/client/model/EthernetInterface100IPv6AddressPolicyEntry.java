package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class EthernetInterface100IPv6AddressPolicyEntry   {
  
  private BigDecimal label = null;
  private BigDecimal precedence = null;
  private String prefix = null;

  
  /**
   * The IPv6 Label (as defined in RFC 6724 section 2.1)
   * minimum: 0.0
   * maximum: 100.0
   **/
  
  @ApiModelProperty(value = "The IPv6 Label (as defined in RFC 6724 section 2.1)")
  @JsonProperty("Label")
  public BigDecimal getLabel() {
    return label;
  }
  public void setLabel(BigDecimal label) {
    this.label = label;
  }

  
  /**
   * The IPv6 Precedence (as defined in RFC 6724 section 2.1
   * minimum: 1.0
   * maximum: 100.0
   **/
  
  @ApiModelProperty(value = "The IPv6 Precedence (as defined in RFC 6724 section 2.1")
  @JsonProperty("Precedence")
  public BigDecimal getPrecedence() {
    return precedence;
  }
  public void setPrecedence(BigDecimal precedence) {
    this.precedence = precedence;
  }

  
  /**
   * The IPv6 Address Prefix (as defined in RFC 3484 section 2.1)
   **/
  
  @ApiModelProperty(value = "The IPv6 Address Prefix (as defined in RFC 3484 section 2.1)")
  @JsonProperty("Prefix")
  public String getPrefix() {
    return prefix;
  }
  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetInterface100IPv6AddressPolicyEntry ethernetInterface100IPv6AddressPolicyEntry = (EthernetInterface100IPv6AddressPolicyEntry) o;
    return Objects.equals(label, ethernetInterface100IPv6AddressPolicyEntry.label) &&
        Objects.equals(precedence, ethernetInterface100IPv6AddressPolicyEntry.precedence) &&
        Objects.equals(prefix, ethernetInterface100IPv6AddressPolicyEntry.prefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, precedence, prefix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetInterface100IPv6AddressPolicyEntry {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
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

