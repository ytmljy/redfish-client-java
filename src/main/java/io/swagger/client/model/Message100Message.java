package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Message100Message   {
  
  private List<String> messageArgs = new ArrayList<String>();
  private String messageId = null;
  private ResourceOem oem = null;
  private List<String> relatedProperties = new ArrayList<String>();

  
  /**
   * This array of message arguments are substituted for the arguments in the message when looked up in the message registry.
   **/
  public Message100Message messageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This array of message arguments are substituted for the arguments in the message when looked up in the message registry.")
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
  public Message100Message messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the key for this message which can be used to look up the message in a message registry.")
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
  public Message100Message oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Oem extension object.")
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
  public Message100Message relatedProperties(List<String> relatedProperties) {
    this.relatedProperties = relatedProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is an array of properties described by the message.")
  @JsonProperty("RelatedProperties")
  public List<String> getRelatedProperties() {
    return relatedProperties;
  }
  public void setRelatedProperties(List<String> relatedProperties) {
    this.relatedProperties = relatedProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message100Message message100Message = (Message100Message) o;
    return Objects.equals(this.messageArgs, message100Message.messageArgs) &&
        Objects.equals(this.messageId, message100Message.messageId) &&
        Objects.equals(this.oem, message100Message.oem) &&
        Objects.equals(this.relatedProperties, message100Message.relatedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageArgs, messageId, oem, relatedProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message100Message {\n");
    
    sb.append("    messageArgs: ").append(toIndentedString(messageArgs)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    relatedProperties: ").append(toIndentedString(relatedProperties)).append("\n");
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

