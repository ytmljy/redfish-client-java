package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LogEntryCollectionLogEntryCollection;
import io.swagger.client.model.LogService100LogServiceActions;
import io.swagger.client.model.LogService100OverWritePolicy;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;



/**
 * This resource represents the log service for the resource or service to which it is associated.
 **/

@ApiModel(description = "This resource represents the log service for the resource or service to which it is associated.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class LogService100LogService   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private LogService100LogServiceActions actions = null;
  private ResourceDescription description = null;
  private LogEntryCollectionLogEntryCollection entries = null;
  private ResourceId id = null;
  private BigDecimal maxNumberOfRecords = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private LogService100OverWritePolicy overWritePolicy = null;
  private ResourceStatus status = null;

  
  /**
   **/
  public LogService100LogService odataContext(Odata400Context odataContext) {
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
  public LogService100LogService odataId(Odata400Id odataId) {
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
  public LogService100LogService odataType(Odata400Type odataType) {
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
  public LogService100LogService actions(LogService100LogServiceActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Actions")
  public LogService100LogServiceActions getActions() {
    return actions;
  }
  public void setActions(LogService100LogServiceActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public LogService100LogService description(ResourceDescription description) {
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
   * References to the log entry collection.
   **/
  public LogService100LogService entries(LogEntryCollectionLogEntryCollection entries) {
    this.entries = entries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "References to the log entry collection.")
  @JsonProperty("Entries")
  public LogEntryCollectionLogEntryCollection getEntries() {
    return entries;
  }
  public void setEntries(LogEntryCollectionLogEntryCollection entries) {
    this.entries = entries;
  }

  
  /**
   **/
  public LogService100LogService id(ResourceId id) {
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

  
  @ApiModelProperty(example = "null", value = "The maximum number of log entries this service can have.")
  @JsonProperty("MaxNumberOfRecords")
  public BigDecimal getMaxNumberOfRecords() {
    return maxNumberOfRecords;
  }

  
  /**
   **/
  public LogService100LogService name(ResourceName name) {
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
  public LogService100LogService oem(ResourceOem oem) {
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
   * The overwrite policy for this service that takes place when the log is full.
   **/
  public LogService100LogService overWritePolicy(LogService100OverWritePolicy overWritePolicy) {
    this.overWritePolicy = overWritePolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The overwrite policy for this service that takes place when the log is full.")
  @JsonProperty("OverWritePolicy")
  public LogService100OverWritePolicy getOverWritePolicy() {
    return overWritePolicy;
  }
  public void setOverWritePolicy(LogService100OverWritePolicy overWritePolicy) {
    this.overWritePolicy = overWritePolicy;
  }

  
  /**
   **/
  public LogService100LogService status(ResourceStatus status) {
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
    LogService100LogService logService100LogService = (LogService100LogService) o;
    return Objects.equals(this.odataContext, logService100LogService.odataContext) &&
        Objects.equals(this.odataId, logService100LogService.odataId) &&
        Objects.equals(this.odataType, logService100LogService.odataType) &&
        Objects.equals(this.actions, logService100LogService.actions) &&
        Objects.equals(this.description, logService100LogService.description) &&
        Objects.equals(this.entries, logService100LogService.entries) &&
        Objects.equals(this.id, logService100LogService.id) &&
        Objects.equals(this.maxNumberOfRecords, logService100LogService.maxNumberOfRecords) &&
        Objects.equals(this.name, logService100LogService.name) &&
        Objects.equals(this.oem, logService100LogService.oem) &&
        Objects.equals(this.overWritePolicy, logService100LogService.overWritePolicy) &&
        Objects.equals(this.status, logService100LogService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, description, entries, id, maxNumberOfRecords, name, oem, overWritePolicy, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogService100LogService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxNumberOfRecords: ").append(toIndentedString(maxNumberOfRecords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    overWritePolicy: ").append(toIndentedString(overWritePolicy)).append("\n");
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

