package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.*;



/**
 * Used for describing services like Serial Console, Command Shell or Graphical Console
 **/

@ApiModel(description = "Used for describing services like Serial Console, Command Shell or Graphical Console")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Manager100CommandShell   {
  


  public enum ConnectTypesSupportedEnum {
    SSH("SSH"),
    TELNET("Telnet"),
    IPMI("IPMI"),
    OEM("Oem");

    private String value;

    ConnectTypesSupportedEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ConnectTypesSupportedEnum> connectTypesSupported = new ArrayList<ConnectTypesSupportedEnum>();
  private BigDecimal maxConcurrentSessions = null;
  private Boolean serviceEnabled = null;

  
  /**
   * This object is used to enumerate the Command Shell connection types allowed by the implementation.
   **/
  
  @ApiModelProperty(value = "This object is used to enumerate the Command Shell connection types allowed by the implementation.")
  @JsonProperty("ConnectTypesSupported")
  public List<ConnectTypesSupportedEnum> getConnectTypesSupported() {
    return connectTypesSupported;
  }
  public void setConnectTypesSupported(List<ConnectTypesSupportedEnum> connectTypesSupported) {
    this.connectTypesSupported = connectTypesSupported;
  }

  
  /**
   * Indicates the maximum number of service sessions, regardless of protocol, this manager is able to support.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "Indicates the maximum number of service sessions, regardless of protocol, this manager is able to support.")
  @JsonProperty("MaxConcurrentSessions")
  public BigDecimal getMaxConcurrentSessions() {
    return maxConcurrentSessions;
  }
  public void setMaxConcurrentSessions(BigDecimal maxConcurrentSessions) {
    this.maxConcurrentSessions = maxConcurrentSessions;
  }

  
  /**
   * Indicates if the service is enabled for this manager.
   **/
  
  @ApiModelProperty(value = "Indicates if the service is enabled for this manager.")
  @JsonProperty("ServiceEnabled")
  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100CommandShell manager100CommandShell = (Manager100CommandShell) o;
    return Objects.equals(connectTypesSupported, manager100CommandShell.connectTypesSupported) &&
        Objects.equals(maxConcurrentSessions, manager100CommandShell.maxConcurrentSessions) &&
        Objects.equals(serviceEnabled, manager100CommandShell.serviceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectTypesSupported, maxConcurrentSessions, serviceEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100CommandShell {\n");
    
    sb.append("    connectTypesSupported: ").append(toIndentedString(connectTypesSupported)).append("\n");
    sb.append("    maxConcurrentSessions: ").append(toIndentedString(maxConcurrentSessions)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
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

