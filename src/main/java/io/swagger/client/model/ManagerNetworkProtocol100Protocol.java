package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ManagerNetworkProtocol100Protocol   {
  
  private BigDecimal port = null;
  private Boolean protocolEnabled = null;

  
  /**
   * Indicates the protocol port.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "Indicates the protocol port.")
  @JsonProperty("Port")
  public BigDecimal getPort() {
    return port;
  }
  public void setPort(BigDecimal port) {
    this.port = port;
  }

  
  /**
   * Indicates if the protocol is enabled or disabled
   **/
  
  @ApiModelProperty(value = "Indicates if the protocol is enabled or disabled")
  @JsonProperty("ProtocolEnabled")
  public Boolean getProtocolEnabled() {
    return protocolEnabled;
  }
  public void setProtocolEnabled(Boolean protocolEnabled) {
    this.protocolEnabled = protocolEnabled;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerNetworkProtocol100Protocol managerNetworkProtocol100Protocol = (ManagerNetworkProtocol100Protocol) o;
    return Objects.equals(port, managerNetworkProtocol100Protocol.port) &&
        Objects.equals(protocolEnabled, managerNetworkProtocol100Protocol.protocolEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(port, protocolEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerNetworkProtocol100Protocol {\n");
    
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    protocolEnabled: ").append(toIndentedString(protocolEnabled)).append("\n");
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

