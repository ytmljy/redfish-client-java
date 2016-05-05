package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.util.*;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Message100Message   {
  
  private String message = null;
  private List<String> messageArgs = new ArrayList<String>();
  private String messageId = null;
  private ResourceOem oem = null;
  private List<String> relatedProperties = new ArrayList<String>();
  private String resolution = null;
  private String severity = null;

  
  /**
   * This is the human readable message, if provided.
   **/
  
  @ApiModelProperty(value = "This is the human readable message, if provided.")
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * This array of message arguments are substituted for the arguments in the message when looked up in the message registry.
   **/
  
  @ApiModelProperty(value = "This array of message arguments are substituted for the arguments in the message when looked up in the message registry.")
  @JsonProperty("MessageArgs")
  public List<String> getMessageArgs() {
    return messageArgs;
  }
  public void setMessageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
  }

  
  /**
   * This is the key for this message which can be used to look up the message in a message registry.
   **/
  
  @ApiModelProperty(value = "This is the key for this message which can be used to look up the message in a message registry.")
  @JsonProperty("MessageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  
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
   * This is an array of properties described by the message.
   **/
  
  @ApiModelProperty(value = "This is an array of properties described by the message.")
  @JsonProperty("RelatedProperties")
  public List<String> getRelatedProperties() {
    return relatedProperties;
  }
  public void setRelatedProperties(List<String> relatedProperties) {
    this.relatedProperties = relatedProperties;
  }

  
  /**
   * Used to provide suggestions on how to resolve the situation that caused the error.
   **/
  
  @ApiModelProperty(value = "Used to provide suggestions on how to resolve the situation that caused the error.")
  @JsonProperty("Resolution")
  public String getResolution() {
    return resolution;
  }
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  
  /**
   * This is the severity of the errors.
   **/
  
  @ApiModelProperty(value = "This is the severity of the errors.")
  @JsonProperty("Severity")
  public String getSeverity() {
    return severity;
  }
  public void setSeverity(String severity) {
    this.severity = severity;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message100Message message100Message = (Message100Message) o;
    return Objects.equals(message, message100Message.message) &&
        Objects.equals(messageArgs, message100Message.messageArgs) &&
        Objects.equals(messageId, message100Message.messageId) &&
        Objects.equals(oem, message100Message.oem) &&
        Objects.equals(relatedProperties, message100Message.relatedProperties) &&
        Objects.equals(resolution, message100Message.resolution) &&
        Objects.equals(severity, message100Message.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageArgs, messageId, oem, relatedProperties, resolution, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message100Message {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageArgs: ").append(toIndentedString(messageArgs)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    relatedProperties: ").append(toIndentedString(relatedProperties)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

