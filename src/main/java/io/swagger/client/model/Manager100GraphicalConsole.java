package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Manager100GraphicalConnectTypesSupported;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



/**
 * Used for describing services like Serial Console, Command Shell or Graphical Console
 **/

@ApiModel(description = "Used for describing services like Serial Console, Command Shell or Graphical Console")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Manager100GraphicalConsole   {
  
  private List<Manager100GraphicalConnectTypesSupported> connectTypesSupported = new ArrayList<Manager100GraphicalConnectTypesSupported>();
  private BigDecimal maxConcurrentSessions = null;
  private Boolean serviceEnabled = null;

  
  /**
   * This object is used to enumerate the Graphical Console connection types allowed by the implementation.
   **/
  public Manager100GraphicalConsole connectTypesSupported(List<Manager100GraphicalConnectTypesSupported> connectTypesSupported) {
    this.connectTypesSupported = connectTypesSupported;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This object is used to enumerate the Graphical Console connection types allowed by the implementation.")
  @JsonProperty("ConnectTypesSupported")
  public List<Manager100GraphicalConnectTypesSupported> getConnectTypesSupported() {
    return connectTypesSupported;
  }
  public void setConnectTypesSupported(List<Manager100GraphicalConnectTypesSupported> connectTypesSupported) {
    this.connectTypesSupported = connectTypesSupported;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates the maximum number of service sessions, regardless of protocol, this manager is able to support.")
  @JsonProperty("MaxConcurrentSessions")
  public BigDecimal getMaxConcurrentSessions() {
    return maxConcurrentSessions;
  }

  
  /**
   * Indicates if the service is enabled for this manager.
   **/
  public Manager100GraphicalConsole serviceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the service is enabled for this manager.")
  @JsonProperty("ServiceEnabled")
  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100GraphicalConsole manager100GraphicalConsole = (Manager100GraphicalConsole) o;
    return Objects.equals(this.connectTypesSupported, manager100GraphicalConsole.connectTypesSupported) &&
        Objects.equals(this.maxConcurrentSessions, manager100GraphicalConsole.maxConcurrentSessions) &&
        Objects.equals(this.serviceEnabled, manager100GraphicalConsole.serviceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectTypesSupported, maxConcurrentSessions, serviceEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100GraphicalConsole {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

