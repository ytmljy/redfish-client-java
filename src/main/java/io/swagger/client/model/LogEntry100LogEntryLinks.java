package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;



/**
 * The links object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "The links object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class LogEntry100LogEntryLinks   {
  
  private ResourceOem oem = null;
  private Odata400IdRef originOfCondition = null;

  
  /**
   * Oem extension object.
   **/
  
  @ApiModelProperty(value = "Oem extension object.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * This is the URI of the resource that caused the log entry
   **/
  
  @ApiModelProperty(value = "This is the URI of the resource that caused the log entry")
  @JsonProperty("OriginOfCondition")
  public Odata400IdRef getOriginOfCondition() {
    return originOfCondition;
  }
  public void setOriginOfCondition(Odata400IdRef originOfCondition) {
    this.originOfCondition = originOfCondition;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEntry100LogEntryLinks logEntry100LogEntryLinks = (LogEntry100LogEntryLinks) o;
    return Objects.equals(oem, logEntry100LogEntryLinks.oem) &&
        Objects.equals(originOfCondition, logEntry100LogEntryLinks.originOfCondition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oem, originOfCondition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEntry100LogEntryLinks {\n");
    
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    originOfCondition: ").append(toIndentedString(originOfCondition)).append("\n");
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

