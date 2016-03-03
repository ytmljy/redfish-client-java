package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.SessionCollectionSessionCollection;
import java.math.BigDecimal;



/**
 * This is the schema definition for the Session Service.  It represents the properties for the service itself and has links to the actual list of sessions.
 **/

@ApiModel(description = "This is the schema definition for the Session Service.  It represents the properties for the service itself and has links to the actual list of sessions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class SessionService100SessionService   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private BigDecimal sessionTimeout = null;
  private SessionCollectionSessionCollection sessions = null;
  private ResourceStatus status = null;

  
  /**
   **/
  public SessionService100SessionService odataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.context")
  public Odata400Context getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  public SessionService100SessionService odataId(Odata400Id odataId) {
    this.odataId = odataId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.id")
  public Odata400Id getOdataId() {
    return odataId;
  }
  public void setOdataId(Odata400Id odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  public SessionService100SessionService odataType(Odata400Type odataType) {
    this.odataType = odataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.type")
  public Odata400Type getOdataType() {
    return odataType;
  }
  public void setOdataType(Odata400Type odataType) {
    this.odataType = odataType;
  }

  
  /**
   **/
  public SessionService100SessionService description(ResourceDescription description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Description")
  public ResourceDescription getDescription() {
    return description;
  }
  public void setDescription(ResourceDescription description) {
    this.description = description;
  }

  
  /**
   **/
  public SessionService100SessionService id(ResourceId id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Id")
  public ResourceId getId() {
    return id;
  }
  public void setId(ResourceId id) {
    this.id = id;
  }

  
  /**
   **/
  public SessionService100SessionService name(ResourceName name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Name")
  public ResourceName getName() {
    return name;
  }
  public void setName(ResourceName name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  public SessionService100SessionService oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * This is the number of seconds of inactivity that a session may have before the session service closes the session due to inactivity.
   * minimum: 30.0
   * maximum: 86400.0
   **/
  public SessionService100SessionService sessionTimeout(BigDecimal sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the number of seconds of inactivity that a session may have before the session service closes the session due to inactivity.")
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
  public SessionService100SessionService sessions(SessionCollectionSessionCollection sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to a collection of Sessions")
  @JsonProperty("Sessions")
  public SessionCollectionSessionCollection getSessions() {
    return sessions;
  }
  public void setSessions(SessionCollectionSessionCollection sessions) {
    this.sessions = sessions;
  }

  
  /**
   **/
  public SessionService100SessionService status(ResourceStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionService100SessionService sessionService100SessionService = (SessionService100SessionService) o;
    return Objects.equals(this.odataContext, sessionService100SessionService.odataContext) &&
        Objects.equals(this.odataId, sessionService100SessionService.odataId) &&
        Objects.equals(this.odataType, sessionService100SessionService.odataType) &&
        Objects.equals(this.description, sessionService100SessionService.description) &&
        Objects.equals(this.id, sessionService100SessionService.id) &&
        Objects.equals(this.name, sessionService100SessionService.name) &&
        Objects.equals(this.oem, sessionService100SessionService.oem) &&
        Objects.equals(this.sessionTimeout, sessionService100SessionService.sessionTimeout) &&
        Objects.equals(this.sessions, sessionService100SessionService.sessions) &&
        Objects.equals(this.status, sessionService100SessionService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, name, oem, sessionTimeout, sessions, status);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

