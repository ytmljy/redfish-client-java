package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ManagerNetworkProtocol100SSDProtocol   {
  


  public enum NotifyIPv6ScopeEnum {
    LINK("Link"),
    SITE("Site"),
    ORGANIZATION("Organization");

    private String value;

    NotifyIPv6ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private NotifyIPv6ScopeEnum notifyIPv6Scope = null;
  private BigDecimal notifyMulticastIntervalSeconds = null;
  private BigDecimal notifyTTL = null;
  private BigDecimal port = null;
  private Boolean protocolEnabled = null;

  
  /**
   * Indicates the scope for the IPv6 Notify messages for SSDP.
   **/
  
  @ApiModelProperty(value = "Indicates the scope for the IPv6 Notify messages for SSDP.")
  @JsonProperty("NotifyIPv6Scope")
  public NotifyIPv6ScopeEnum getNotifyIPv6Scope() {
    return notifyIPv6Scope;
  }
  public void setNotifyIPv6Scope(NotifyIPv6ScopeEnum notifyIPv6Scope) {
    this.notifyIPv6Scope = notifyIPv6Scope;
  }

  
  /**
   * Indicates how often the Multicast is done from this service for SSDP.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "Indicates how often the Multicast is done from this service for SSDP.")
  @JsonProperty("NotifyMulticastIntervalSeconds")
  public BigDecimal getNotifyMulticastIntervalSeconds() {
    return notifyMulticastIntervalSeconds;
  }
  public void setNotifyMulticastIntervalSeconds(BigDecimal notifyMulticastIntervalSeconds) {
    this.notifyMulticastIntervalSeconds = notifyMulticastIntervalSeconds;
  }

  
  /**
   * Indicates the time to live hop count for SSDPs Notify messages.
   * minimum: 1.0
   **/
  
  @ApiModelProperty(value = "Indicates the time to live hop count for SSDPs Notify messages.")
  @JsonProperty("NotifyTTL")
  public BigDecimal getNotifyTTL() {
    return notifyTTL;
  }
  public void setNotifyTTL(BigDecimal notifyTTL) {
    this.notifyTTL = notifyTTL;
  }

  
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
    ManagerNetworkProtocol100SSDProtocol managerNetworkProtocol100SSDProtocol = (ManagerNetworkProtocol100SSDProtocol) o;
    return Objects.equals(notifyIPv6Scope, managerNetworkProtocol100SSDProtocol.notifyIPv6Scope) &&
        Objects.equals(notifyMulticastIntervalSeconds, managerNetworkProtocol100SSDProtocol.notifyMulticastIntervalSeconds) &&
        Objects.equals(notifyTTL, managerNetworkProtocol100SSDProtocol.notifyTTL) &&
        Objects.equals(port, managerNetworkProtocol100SSDProtocol.port) &&
        Objects.equals(protocolEnabled, managerNetworkProtocol100SSDProtocol.protocolEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyIPv6Scope, notifyMulticastIntervalSeconds, notifyTTL, port, protocolEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerNetworkProtocol100SSDProtocol {\n");
    
    sb.append("    notifyIPv6Scope: ").append(toIndentedString(notifyIPv6Scope)).append("\n");
    sb.append("    notifyMulticastIntervalSeconds: ").append(toIndentedString(notifyMulticastIntervalSeconds)).append("\n");
    sb.append("    notifyTTL: ").append(toIndentedString(notifyTTL)).append("\n");
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

