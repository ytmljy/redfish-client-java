package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.SessionCollectionSessionCollection;
import java.math.BigDecimal;



/**
 * This is the schema definition for the Session Service.  It represents the properties for the service itself and has links to the actual list of sessions.
 **/

@ApiModel(description = "This is the schema definition for the Session Service.  It represents the properties for the service itself and has links to the actual list of sessions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class SessionService100SessionService   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;
  private Boolean serviceEnabled = null;
  private BigDecimal sessionTimeout = null;
  private SessionCollectionSessionCollection sessions = null;
  private ResourceStatus status = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.context")
  public String getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.id")
  public String getOdataId() {
    return odataId;
  }
  public void setOdataId(String odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.type")
  public String getOdataType() {
    return odataType;
  }
  public void setOdataType(String odataType) {
    this.odataType = odataType;
  }

  
  /**
   * Provides a description of this resource and is used for commonality  in the schema definitions.
   **/
  
  @ApiModelProperty(value = "Provides a description of this resource and is used for commonality  in the schema definitions.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Uniquely identifies the resource within the collection of like resources.
   **/
  
  @ApiModelProperty(value = "Uniquely identifies the resource within the collection of like resources.")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The name of the resource or array element.
   **/
  
  @ApiModelProperty(value = "The name of the resource or array element.")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  
  @ApiModelProperty(value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * This indicates whether this service is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates whether this service is enabled.")
  @JsonProperty("ServiceEnabled")
  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
  }

  
  /**
   * This is the number of seconds of inactivity that a session may have before the session service closes the session due to inactivity.
   * minimum: 30.0
   * maximum: 86400.0
   **/
  
  @ApiModelProperty(value = "This is the number of seconds of inactivity that a session may have before the session service closes the session due to inactivity.")
  @JsonProperty("SessionTimeout")
  public BigDecimal getSessionTimeout() {
    return sessionTimeout;
  }
  public void setSessionTimeout(BigDecimal sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  
  /**
   * Link to a collection of Sessions
   **/
  
  @ApiModelProperty(value = "Link to a collection of Sessions")
  @JsonProperty("Sessions")
  public SessionCollectionSessionCollection getSessions() {
    return sessions;
  }
  public void setSessions(SessionCollectionSessionCollection sessions) {
    this.sessions = sessions;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionService100SessionService sessionService100SessionService = (SessionService100SessionService) o;
    return Objects.equals(odataContext, sessionService100SessionService.odataContext) &&
        Objects.equals(odataId, sessionService100SessionService.odataId) &&
        Objects.equals(odataType, sessionService100SessionService.odataType) &&
        Objects.equals(description, sessionService100SessionService.description) &&
        Objects.equals(id, sessionService100SessionService.id) &&
        Objects.equals(name, sessionService100SessionService.name) &&
        Objects.equals(oem, sessionService100SessionService.oem) &&
        Objects.equals(serviceEnabled, sessionService100SessionService.serviceEnabled) &&
        Objects.equals(sessionTimeout, sessionService100SessionService.sessionTimeout) &&
        Objects.equals(sessions, sessionService100SessionService.sessions) &&
        Objects.equals(status, sessionService100SessionService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, name, oem, serviceEnabled, sessionTimeout, sessions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionService100SessionService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
    sb.append("    sessionTimeout: ").append(toIndentedString(sessionTimeout)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

