package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LogEntry100EventSeverity;
import io.swagger.client.model.LogEntry100LogEntryCode;
import io.swagger.client.model.LogEntry100LogEntryLinks;
import io.swagger.client.model.LogEntry100LogEntryType;
import io.swagger.client.model.LogEntry100SensorType;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * This resource represents the log record format for logs.  It is designed to be used for SEL logs from IPMI as well as Event Logs and OEM specific logs.  The EntryType field indicates the type of log and there are other properties dependent on it&#39;s value.
 **/

@ApiModel(description = "This resource represents the log record format for logs.  It is designed to be used for SEL logs from IPMI as well as Event Logs and OEM specific logs.  The EntryType field indicates the type of log and there are other properties dependent on it's value.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class LogEntry100LogEntry   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private Date created = null;
  private ResourceDescription description = null;
  private LogEntry100LogEntryCode entryCode = null;
  private LogEntry100LogEntryType entryType = null;
  private ResourceId id = null;
  private LogEntry100LogEntryLinks links = null;
  private String message = null;
  private List<String> messageArgs = new ArrayList<String>();
  private String messageId = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private LogEntry100SensorType sensorType = null;
  private LogEntry100EventSeverity severity = null;

  
  /**
   **/
  public LogEntry100LogEntry odataContext(Odata400Context odataContext) {
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
  public LogEntry100LogEntry odataId(Odata400Id odataId) {
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
  public LogEntry100LogEntry odataType(Odata400Type odataType) {
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

  
  @ApiModelProperty(example = "null", value = "The time the log entry was created.")
  @JsonProperty("Created")
  public Date getCreated() {
    return created;
  }

  
  /**
   **/
  public LogEntry100LogEntry description(ResourceDescription description) {
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
   * If the EntryType is SEL, this will have the entry code for the log entry.
   **/
  public LogEntry100LogEntry entryCode(LogEntry100LogEntryCode entryCode) {
    this.entryCode = entryCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the EntryType is SEL, this will have the entry code for the log entry.")
  @JsonProperty("EntryCode")
  public LogEntry100LogEntryCode getEntryCode() {
    return entryCode;
  }
  public void setEntryCode(LogEntry100LogEntryCode entryCode) {
    this.entryCode = entryCode;
  }

  
  /**
   * his is the type of log entry.
   **/
  public LogEntry100LogEntry entryType(LogEntry100LogEntryType entryType) {
    this.entryType = entryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "his is the type of log entry.")
  @JsonProperty("EntryType")
  public LogEntry100LogEntryType getEntryType() {
    return entryType;
  }
  public void setEntryType(LogEntry100LogEntryType entryType) {
    this.entryType = entryType;
  }

  
  /**
   **/
  public LogEntry100LogEntry id(ResourceId id) {
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
  public LogEntry100LogEntry links(LogEntry100LogEntryLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Links")
  public LogEntry100LogEntryLinks getLinks() {
    return links;
  }
  public void setLinks(LogEntry100LogEntryLinks links) {
    this.links = links;
  }

  
  @ApiModelProperty(example = "null", value = "This property decodes from EntryType:  If it is Event then it is a message string.  Otherwise, it is SEL or Oem specific.  In most cases, this will be the actual Log Entry.")
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  
  /**
   * The values of this property shall be any arguments for the message.
   **/
  public LogEntry100LogEntry messageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The values of this property shall be any arguments for the message.")
  @JsonProperty("MessageArgs")
  public List<String> getMessageArgs() {
    return messageArgs;
  }
  public void setMessageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
  }

  
  @ApiModelProperty(example = "null", value = "This property decodes from EntryType:  If it is Event then it is a message id.  Otherwise, it is SEL or Oem specific.  This value is only used for registries - for more information, see the specification.")
  @JsonProperty("MessageId")
  public String getMessageId() {
    return messageId;
  }

  
  /**
   **/
  public LogEntry100LogEntry name(ResourceName name) {
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
  public LogEntry100LogEntry oem(ResourceOem oem) {
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
   * If the EntryType is SEL, this will have the sensor type that the log entry pertains to.
   **/
  public LogEntry100LogEntry sensorType(LogEntry100SensorType sensorType) {
    this.sensorType = sensorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If the EntryType is SEL, this will have the sensor type that the log entry pertains to.")
  @JsonProperty("SensorType")
  public LogEntry100SensorType getSensorType() {
    return sensorType;
  }
  public void setSensorType(LogEntry100SensorType sensorType) {
    this.sensorType = sensorType;
  }

  
  /**
   * This is the severity of the log entry.
   **/
  public LogEntry100LogEntry severity(LogEntry100EventSeverity severity) {
    this.severity = severity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the severity of the log entry.")
  @JsonProperty("Severity")
  public LogEntry100EventSeverity getSeverity() {
    return severity;
  }
  public void setSeverity(LogEntry100EventSeverity severity) {
    this.severity = severity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogEntry100LogEntry logEntry100LogEntry = (LogEntry100LogEntry) o;
    return Objects.equals(this.odataContext, logEntry100LogEntry.odataContext) &&
        Objects.equals(this.odataId, logEntry100LogEntry.odataId) &&
        Objects.equals(this.odataType, logEntry100LogEntry.odataType) &&
        Objects.equals(this.created, logEntry100LogEntry.created) &&
        Objects.equals(this.description, logEntry100LogEntry.description) &&
        Objects.equals(this.entryCode, logEntry100LogEntry.entryCode) &&
        Objects.equals(this.entryType, logEntry100LogEntry.entryType) &&
        Objects.equals(this.id, logEntry100LogEntry.id) &&
        Objects.equals(this.links, logEntry100LogEntry.links) &&
        Objects.equals(this.message, logEntry100LogEntry.message) &&
        Objects.equals(this.messageArgs, logEntry100LogEntry.messageArgs) &&
        Objects.equals(this.messageId, logEntry100LogEntry.messageId) &&
        Objects.equals(this.name, logEntry100LogEntry.name) &&
        Objects.equals(this.oem, logEntry100LogEntry.oem) &&
        Objects.equals(this.sensorType, logEntry100LogEntry.sensorType) &&
        Objects.equals(this.severity, logEntry100LogEntry.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, created, description, entryCode, entryType, id, links, message, messageArgs, messageId, name, oem, sensorType, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogEntry100LogEntry {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entryCode: ").append(toIndentedString(entryCode)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageArgs: ").append(toIndentedString(messageArgs)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    sensorType: ").append(toIndentedString(sensorType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

