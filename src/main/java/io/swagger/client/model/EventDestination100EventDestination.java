package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventDestination100HttpHeaderProperty;
import io.swagger.client.model.ResourceOem;
import java.util.*;



/**
 * This is the base type for resources and referenceable members.
 **/

@ApiModel(description = "This is the base type for resources and referenceable members.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class EventDestination100EventDestination   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String context = null;
  private String description = null;
  private String destination = null;


  public enum EventTypesEnum {
    STATUSCHANGE("StatusChange"),
    RESOURCEUPDATED("ResourceUpdated"),
    RESOURCEADDED("ResourceAdded"),
    RESOURCEREMOVED("ResourceRemoved"),
    ALERT("Alert");

    private String value;

    EventTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<EventTypesEnum> eventTypes = new ArrayList<EventTypesEnum>();
  private List<EventDestination100HttpHeaderProperty> httpHeaders = new ArrayList<EventDestination100HttpHeaderProperty>();
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;


  public enum ProtocolEnum {
    REDFISH("Redfish");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ProtocolEnum protocol = null;

  
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
   * A client-supplied string that is stored with the event destination subscription.
   **/
  
  @ApiModelProperty(required = true, value = "A client-supplied string that is stored with the event destination subscription.")
  @JsonProperty("Context")
  public String getContext() {
    return context;
  }
  public void setContext(String context) {
    this.context = context;
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
   * The URI of the destination Event Service.
   **/
  
  @ApiModelProperty(required = true, value = "The URI of the destination Event Service.")
  @JsonProperty("Destination")
  public String getDestination() {
    return destination;
  }
  public void setDestination(String destination) {
    this.destination = destination;
  }

  
  /**
   * This property shall contain the types of events that shall be sent to the desination.
   **/
  
  @ApiModelProperty(required = true, value = "This property shall contain the types of events that shall be sent to the desination.")
  @JsonProperty("EventTypes")
  public List<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }
  public void setEventTypes(List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }

  
  /**
   * This is for setting HTTP headers, such as authorization information.  This object will be null on a GET.
   **/
  
  @ApiModelProperty(value = "This is for setting HTTP headers, such as authorization information.  This object will be null on a GET.")
  @JsonProperty("HttpHeaders")
  public List<EventDestination100HttpHeaderProperty> getHttpHeaders() {
    return httpHeaders;
  }
  public void setHttpHeaders(List<EventDestination100HttpHeaderProperty> httpHeaders) {
    this.httpHeaders = httpHeaders;
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
   * The protocol type of the event connection.
   **/
  
  @ApiModelProperty(required = true, value = "The protocol type of the event connection.")
  @JsonProperty("Protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDestination100EventDestination eventDestination100EventDestination = (EventDestination100EventDestination) o;
    return Objects.equals(odataContext, eventDestination100EventDestination.odataContext) &&
        Objects.equals(odataId, eventDestination100EventDestination.odataId) &&
        Objects.equals(odataType, eventDestination100EventDestination.odataType) &&
        Objects.equals(context, eventDestination100EventDestination.context) &&
        Objects.equals(description, eventDestination100EventDestination.description) &&
        Objects.equals(destination, eventDestination100EventDestination.destination) &&
        Objects.equals(eventTypes, eventDestination100EventDestination.eventTypes) &&
        Objects.equals(httpHeaders, eventDestination100EventDestination.httpHeaders) &&
        Objects.equals(id, eventDestination100EventDestination.id) &&
        Objects.equals(name, eventDestination100EventDestination.name) &&
        Objects.equals(oem, eventDestination100EventDestination.oem) &&
        Objects.equals(protocol, eventDestination100EventDestination.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, context, description, destination, eventTypes, httpHeaders, id, name, oem, protocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDestination100EventDestination {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

