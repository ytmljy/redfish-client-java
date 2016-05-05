package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EventService100SubmitTestEvent;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class EventService100EventServiceActions   {
  
  private EventService100SubmitTestEvent eventServiceSubmitTestEvent = null;
  private Object oem = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#EventService.SubmitTestEvent")
  public EventService100SubmitTestEvent getEventServiceSubmitTestEvent() {
    return eventServiceSubmitTestEvent;
  }
  public void setEventServiceSubmitTestEvent(EventService100SubmitTestEvent eventServiceSubmitTestEvent) {
    this.eventServiceSubmitTestEvent = eventServiceSubmitTestEvent;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
    this.oem = oem;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventService100EventServiceActions eventService100EventServiceActions = (EventService100EventServiceActions) o;
    return Objects.equals(eventServiceSubmitTestEvent, eventService100EventServiceActions.eventServiceSubmitTestEvent) &&
        Objects.equals(oem, eventService100EventServiceActions.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventServiceSubmitTestEvent, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventService100EventServiceActions {\n");
    
    sb.append("    eventServiceSubmitTestEvent: ").append(toIndentedString(eventServiceSubmitTestEvent)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

