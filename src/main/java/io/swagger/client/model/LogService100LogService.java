package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LogEntryCollectionLogEntryCollection;
import io.swagger.client.model.LogService100LogServiceActions;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;
import java.util.Date;



/**
 * This resource represents the log service for the resource or service to which it is associated.
 **/

@ApiModel(description = "This resource represents the log service for the resource or service to which it is associated.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class LogService100LogService   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private LogService100LogServiceActions actions = null;
  private Date dateTime = null;
  private String dateTimeLocalOffset = null;
  private String description = null;
  private LogEntryCollectionLogEntryCollection entries = null;
  private String id = null;
  private BigDecimal maxNumberOfRecords = null;
  private String name = null;
  private ResourceOem oem = null;


  public enum OverWritePolicyEnum {
    UNKNOWN("Unknown"),
    WRAPSWHENFULL("WrapsWhenFull"),
    NEVEROVERWRITES("NeverOverWrites");

    private String value;

    OverWritePolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OverWritePolicyEnum overWritePolicy = null;
  private Boolean serviceEnabled = null;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Actions")
  public LogService100LogServiceActions getActions() {
    return actions;
  }
  public void setActions(LogService100LogServiceActions actions) {
    this.actions = actions;
  }

  
  /**
   * The current DateTime (with offset) for the log service, used to set or read time.
   **/
  
  @ApiModelProperty(value = "The current DateTime (with offset) for the log service, used to set or read time.")
  @JsonProperty("DateTime")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  
  /**
   * The time offset from UTC that the DateTime property is set to in format: +06:00 .
   **/
  
  @ApiModelProperty(value = "The time offset from UTC that the DateTime property is set to in format: +06:00 .")
  @JsonProperty("DateTimeLocalOffset")
  public String getDateTimeLocalOffset() {
    return dateTimeLocalOffset;
  }
  public void setDateTimeLocalOffset(String dateTimeLocalOffset) {
    this.dateTimeLocalOffset = dateTimeLocalOffset;
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
   * References to the log entry collection.
   **/
  
  @ApiModelProperty(value = "References to the log entry collection.")
  @JsonProperty("Entries")
  public LogEntryCollectionLogEntryCollection getEntries() {
    return entries;
  }
  public void setEntries(LogEntryCollectionLogEntryCollection entries) {
    this.entries = entries;
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
   * The maximum number of log entries this service can have.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The maximum number of log entries this service can have.")
  @JsonProperty("MaxNumberOfRecords")
  public BigDecimal getMaxNumberOfRecords() {
    return maxNumberOfRecords;
  }
  public void setMaxNumberOfRecords(BigDecimal maxNumberOfRecords) {
    this.maxNumberOfRecords = maxNumberOfRecords;
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
   * The overwrite policy for this service that takes place when the log is full.
   **/
  
  @ApiModelProperty(value = "The overwrite policy for this service that takes place when the log is full.")
  @JsonProperty("OverWritePolicy")
  public OverWritePolicyEnum getOverWritePolicy() {
    return overWritePolicy;
  }
  public void setOverWritePolicy(OverWritePolicyEnum overWritePolicy) {
    this.overWritePolicy = overWritePolicy;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogService100LogService logService100LogService = (LogService100LogService) o;
    return Objects.equals(odataContext, logService100LogService.odataContext) &&
        Objects.equals(odataId, logService100LogService.odataId) &&
        Objects.equals(odataType, logService100LogService.odataType) &&
        Objects.equals(actions, logService100LogService.actions) &&
        Objects.equals(dateTime, logService100LogService.dateTime) &&
        Objects.equals(dateTimeLocalOffset, logService100LogService.dateTimeLocalOffset) &&
        Objects.equals(description, logService100LogService.description) &&
        Objects.equals(entries, logService100LogService.entries) &&
        Objects.equals(id, logService100LogService.id) &&
        Objects.equals(maxNumberOfRecords, logService100LogService.maxNumberOfRecords) &&
        Objects.equals(name, logService100LogService.name) &&
        Objects.equals(oem, logService100LogService.oem) &&
        Objects.equals(overWritePolicy, logService100LogService.overWritePolicy) &&
        Objects.equals(serviceEnabled, logService100LogService.serviceEnabled) &&
        Objects.equals(status, logService100LogService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, dateTime, dateTimeLocalOffset, description, entries, id, maxNumberOfRecords, name, oem, overWritePolicy, serviceEnabled, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogService100LogService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    dateTimeLocalOffset: ").append(toIndentedString(dateTimeLocalOffset)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxNumberOfRecords: ").append(toIndentedString(maxNumberOfRecords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    overWritePolicy: ").append(toIndentedString(overWritePolicy)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
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

