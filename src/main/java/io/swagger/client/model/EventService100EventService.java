package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventDestinationCollectionEventDestinationCollection;
import io.swagger.client.model.EventService100EventServiceActions;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;
import java.util.*;



/**
 * This is the schema definition for the Event Service. It represents the properties for the service itself and has links to the actual list of subscriptions.
 **/

@ApiModel(description = "This is the schema definition for the Event Service. It represents the properties for the service itself and has links to the actual list of subscriptions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class EventService100EventService   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private EventService100EventServiceActions actions = null;
  private BigDecimal deliveryRetryAttempts = null;
  private BigDecimal deliveryRetryIntervalSeconds = null;
  private String description = null;


  public enum EventTypesForSubscriptionEnum {
    STATUSCHANGE("StatusChange"),
    RESOURCEUPDATED("ResourceUpdated"),
    RESOURCEADDED("ResourceAdded"),
    RESOURCEREMOVED("ResourceRemoved"),
    ALERT("Alert");

    private String value;

    EventTypesForSubscriptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<EventTypesForSubscriptionEnum> eventTypesForSubscription = new ArrayList<EventTypesForSubscriptionEnum>();
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;
  private Boolean serviceEnabled = null;
  private ResourceStatus status = null;
  private EventDestinationCollectionEventDestinationCollection subscriptions = null;

  
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Actions")
  public EventService100EventServiceActions getActions() {
    return actions;
  }
  public void setActions(EventService100EventServiceActions actions) {
    this.actions = actions;
  }

  
  /**
   * This is the number of attempts an event posting is retried before the subscription is terminated.
   **/
  
  @ApiModelProperty(value = "This is the number of attempts an event posting is retried before the subscription is terminated.")
  @JsonProperty("DeliveryRetryAttempts")
  public BigDecimal getDeliveryRetryAttempts() {
    return deliveryRetryAttempts;
  }
  public void setDeliveryRetryAttempts(BigDecimal deliveryRetryAttempts) {
    this.deliveryRetryAttempts = deliveryRetryAttempts;
  }

  
  /**
   * This represents the number of seconds between retry attempts for sending any given Event
   **/
  
  @ApiModelProperty(value = "This represents the number of seconds between retry attempts for sending any given Event")
  @JsonProperty("DeliveryRetryIntervalSeconds")
  public BigDecimal getDeliveryRetryIntervalSeconds() {
    return deliveryRetryIntervalSeconds;
  }
  public void setDeliveryRetryIntervalSeconds(BigDecimal deliveryRetryIntervalSeconds) {
    this.deliveryRetryIntervalSeconds = deliveryRetryIntervalSeconds;
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
   * This is the types of Events that can be subscribed to.
   **/
  
  @ApiModelProperty(value = "This is the types of Events that can be subscribed to.")
  @JsonProperty("EventTypesForSubscription")
  public List<EventTypesForSubscriptionEnum> getEventTypesForSubscription() {
    return eventTypesForSubscription;
  }
  public void setEventTypesForSubscription(List<EventTypesForSubscriptionEnum> eventTypesForSubscription) {
    this.eventTypesForSubscription = eventTypesForSubscription;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  
  /**
   * This is a reference to a collection of Event Destination resources.
   **/
  
  @ApiModelProperty(value = "This is a reference to a collection of Event Destination resources.")
  @JsonProperty("Subscriptions")
  public EventDestinationCollectionEventDestinationCollection getSubscriptions() {
    return subscriptions;
  }
  public void setSubscriptions(EventDestinationCollectionEventDestinationCollection subscriptions) {
    this.subscriptions = subscriptions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventService100EventService eventService100EventService = (EventService100EventService) o;
    return Objects.equals(odataContext, eventService100EventService.odataContext) &&
        Objects.equals(odataId, eventService100EventService.odataId) &&
        Objects.equals(odataType, eventService100EventService.odataType) &&
        Objects.equals(actions, eventService100EventService.actions) &&
        Objects.equals(deliveryRetryAttempts, eventService100EventService.deliveryRetryAttempts) &&
        Objects.equals(deliveryRetryIntervalSeconds, eventService100EventService.deliveryRetryIntervalSeconds) &&
        Objects.equals(description, eventService100EventService.description) &&
        Objects.equals(eventTypesForSubscription, eventService100EventService.eventTypesForSubscription) &&
        Objects.equals(id, eventService100EventService.id) &&
        Objects.equals(name, eventService100EventService.name) &&
        Objects.equals(oem, eventService100EventService.oem) &&
        Objects.equals(serviceEnabled, eventService100EventService.serviceEnabled) &&
        Objects.equals(status, eventService100EventService.status) &&
        Objects.equals(subscriptions, eventService100EventService.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, deliveryRetryAttempts, deliveryRetryIntervalSeconds, description, eventTypesForSubscription, id, name, oem, serviceEnabled, status, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventService100EventService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    deliveryRetryAttempts: ").append(toIndentedString(deliveryRetryAttempts)).append("\n");
    sb.append("    deliveryRetryIntervalSeconds: ").append(toIndentedString(deliveryRetryIntervalSeconds)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventTypesForSubscription: ").append(toIndentedString(eventTypesForSubscription)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

