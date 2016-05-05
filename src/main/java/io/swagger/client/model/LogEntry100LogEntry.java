package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LogEntry100LogEntryLinks;
import io.swagger.client.model.ResourceOem;
import java.math.BigDecimal;
import java.util.*;
import java.util.Date;



/**
 * This resource represents the log record format for logs.  It is designed to be used for SEL logs from IPMI as well as Event Logs and OEM specific logs.  The EntryType field indicates the type of log and there are other properties dependent on it&#39;s value.
 **/

@ApiModel(description = "This resource represents the log record format for logs.  It is designed to be used for SEL logs from IPMI as well as Event Logs and OEM specific logs.  The EntryType field indicates the type of log and there are other properties dependent on it's value.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class LogEntry100LogEntry   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private Date created = null;
  private String description = null;


  public enum EntryCodeEnum {
    ASSERT("Assert"),
    DEASSERT("Deassert"),
    LOWER_NON_CRITICAL_GOING_LOW("Lower Non-critical - going low"),
    LOWER_NON_CRITICAL_GOING_HIGH("Lower Non-critical - going high"),
    LOWER_CRITICAL_GOING_LOW("Lower Critical - going low"),
    LOWER_CRITICAL_GOING_HIGH("Lower Critical - going high"),
    LOWER_NON_RECOVERABLE_GOING_LOW("Lower Non-recoverable - going low"),
    LOWER_NON_RECOVERABLE_GOING_HIGH("Lower Non-recoverable - going high"),
    UPPER_NON_CRITICAL_GOING_LOW("Upper Non-critical - going low"),
    UPPER_NON_CRITICAL_GOING_HIGH("Upper Non-critical - going high"),
    UPPER_CRITICAL_GOING_LOW("Upper Critical - going low"),
    UPPER_CRITICAL_GOING_HIGH("Upper Critical - going high"),
    UPPER_NON_RECOVERABLE_GOING_LOW("Upper Non-recoverable - going low"),
    UPPER_NON_RECOVERABLE_GOING_HIGH("Upper Non-recoverable - going high"),
    TRANSITION_TO_IDLE("Transition to Idle"),
    TRANSITION_TO_ACTIVE("Transition to Active"),
    TRANSITION_TO_BUSY("Transition to Busy"),
    STATE_DEASSERTED("State Deasserted"),
    STATE_ASSERTED("State Asserted"),
    PREDICTIVE_FAILURE_DEASSERTED("Predictive Failure deasserted"),
    PREDICTIVE_FAILURE_ASSERTED("Predictive Failure asserted"),
    LIMIT_NOT_EXCEEDED("Limit Not Exceeded"),
    LIMIT_EXCEEDED("Limit Exceeded"),
    PERFORMANCE_MET("Performance Met"),
    PERFORMANCE_LAGS("Performance Lags"),
    TRANSITION_TO_OK("Transition to OK"),
    TRANSITION_TO_NON_CRITICAL_FROM_OK("Transition to Non-Critical from OK"),
    TRANSITION_TO_CRITICAL_FROM_LESS_SEVERE("Transition to Critical from less severe"),
    TRANSITION_TO_NON_RECOVERABLE_FROM_LESS_SEVERE("Transition to Non-recoverable from less severe"),
    TRANSITION_TO_NON_CRITICAL_FROM_MORE_SEVERE("Transition to Non-Critical from more severe"),
    TRANSITION_TO_CRITICAL_FROM_NON_RECOVERABLE("Transition to Critical from Non-recoverable"),
    TRANSITION_TO_NON_RECOVERABLE("Transition to Non-recoverable"),
    MONITOR("Monitor"),
    INFORMATIONAL("Informational"),
    DEVICE_REMOVED_DEVICE_ABSENT("Device Removed / Device Absent"),
    DEVICE_INSERTED_DEVICE_PRESENT("Device Inserted / Device Present"),
    DEVICE_DISABLED("Device Disabled"),
    DEVICE_ENABLED("Device Enabled"),
    TRANSITION_TO_RUNNING("Transition to Running"),
    TRANSITION_TO_IN_TEST("Transition to In Test"),
    TRANSITION_TO_POWER_OFF("Transition to Power Off"),
    TRANSITION_TO_ON_LINE("Transition to On Line"),
    TRANSITION_TO_OFF_LINE("Transition to Off Line"),
    TRANSITION_TO_OFF_DUTY("Transition to Off Duty"),
    TRANSITION_TO_DEGRADED("Transition to Degraded"),
    TRANSITION_TO_POWER_SAVE("Transition to Power Save"),
    INSTALL_ERROR("Install Error"),
    FULLY_REDUNDANT("Fully Redundant"),
    REDUNDANCY_LOST("Redundancy Lost"),
    REDUNDANCY_DEGRADED("Redundancy Degraded"),
    NON_REDUNDANT_SUFFICIENT_RESOURCES_FROM_REDUNDANT("Non-redundant:Sufficient Resources from Redundant"),
    NON_REDUNDANT_SUFFICIENT_RESOURCES_FROM_INSUFFICIENT_RESOURCES("Non-redundant:Sufficient Resources from Insufficient Resources"),
    NON_REDUNDANT_INSUFFICIENT_RESOURCES("Non-redundant:Insufficient Resources"),
    REDUNDANCY_DEGRADED_FROM_FULLY_REDUNDANT("Redundancy Degraded from Fully Redundant"),
    REDUNDANCY_DEGRADED_FROM_NON_REDUNDANT("Redundancy Degraded from Non-redundant"),
    D0_POWER_STATE("D0 Power State"),
    D1_POWER_STATE("D1 Power State"),
    D2_POWER_STATE("D2 Power State"),
    D3_POWER_STATE("D3 Power State");

    private String value;

    EntryCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EntryCodeEnum entryCode = null;


  public enum EntryTypeEnum {
    EVENT("Event"),
    SEL("SEL"),
    OEM("Oem");

    private String value;

    EntryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EntryTypeEnum entryType = null;
  private String id = null;
  private LogEntry100LogEntryLinks links = null;
  private String message = null;
  private List<String> messageArgs = new ArrayList<String>();
  private String messageId = null;
  private String name = null;
  private ResourceOem oem = null;
  private String oemRecordFormat = null;
  private BigDecimal sensorNumber = null;


  public enum SensorTypeEnum {
    PLATFORM_SECURITY_VIOLATION_ATTEMPT("Platform Security Violation Attempt"),
    TEMPERATURE("Temperature"),
    VOLTAGE("Voltage"),
    CURRENT("Current"),
    FAN("Fan"),
    PHYSICAL_CHASSIS_SECURITY("Physical Chassis Security"),
    PROCESSOR("Processor"),
    POWER_SUPPLY_CONVERTER("Power Supply / Converter"),
    POWERUNIT("PowerUnit"),
    COOLINGDEVICE("CoolingDevice"),
    OTHER_UNITS_BASED_SENSOR("Other Units-based Sensor"),
    MEMORY("Memory"),
    DRIVE_SLOT_BAY("Drive Slot/Bay"),
    POST_MEMORY_RESIZE("POST Memory Resize"),
    SYSTEM_FIRMWARE_PROGRESS("System Firmware Progress"),
    EVENT_LOGGING_DISABLED("Event Logging Disabled"),
    SYSTEM_EVENT("System Event"),
    CRITICAL_INTERRUPT("Critical Interrupt"),
    BUTTON_SWITCH("Button/Switch"),
    MODULE_BOARD("Module/Board"),
    MICROCONTROLLER_COPROCESSOR("Microcontroller/Coprocessor"),
    ADD_IN_CARD("Add-in Card"),
    CHASSIS("Chassis"),
    CHIPSET("ChipSet"),
    OTHER_FRU("Other FRU"),
    CABLE_INTERCONNECT("Cable/Interconnect"),
    TERMINATOR("Terminator"),
    SYSTEMBOOT_RESTART("SystemBoot/Restart"),
    BOOT_ERROR("Boot Error"),
    BASEOSBOOT_INSTALLATIONSTATUS("BaseOSBoot/InstallationStatus"),
    OS_STOP_SHUTDOWN("OS Stop/Shutdown"),
    SLOT_CONNECTOR("Slot/Connector"),
    SYSTEM_ACPI_POWERSTATE("System ACPI PowerState"),
    WATCHDOG("Watchdog"),
    PLATFORM_ALERT("Platform Alert"),
    ENTITY_PRESENCE("Entity Presence"),
    MONITOR_ASIC_IC("Monitor ASIC/IC"),
    LAN("LAN"),
    MANAGEMENT_SUBSYSTEM_HEALTH("Management Subsystem Health"),
    BATTERY("Battery"),
    SESSION_AUDIT("Session Audit"),
    VERSION_CHANGE("Version Change"),
    FRUSTATE("FRUState");

    private String value;

    SensorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SensorTypeEnum sensorType = null;


  public enum SeverityEnum {
    OK("OK"),
    WARNING("Warning"),
    CRITICAL("Critical");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SeverityEnum severity = null;

  
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
   * The time the log entry was created.
   **/
  
  @ApiModelProperty(value = "The time the log entry was created.")
  @JsonProperty("Created")
  public Date getCreated() {
    return created;
  }
  public void setCreated(Date created) {
    this.created = created;
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
   * If the EntryType is SEL, this will have the entry code for the log entry.
   **/
  
  @ApiModelProperty(value = "If the EntryType is SEL, this will have the entry code for the log entry.")
  @JsonProperty("EntryCode")
  public EntryCodeEnum getEntryCode() {
    return entryCode;
  }
  public void setEntryCode(EntryCodeEnum entryCode) {
    this.entryCode = entryCode;
  }

  
  /**
   * his is the type of log entry.
   **/
  
  @ApiModelProperty(required = true, value = "his is the type of log entry.")
  @JsonProperty("EntryType")
  public EntryTypeEnum getEntryType() {
    return entryType;
  }
  public void setEntryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Links")
  public LogEntry100LogEntryLinks getLinks() {
    return links;
  }
  public void setLinks(LogEntry100LogEntryLinks links) {
    this.links = links;
  }

  
  /**
   * This property decodes from EntryType:  If it is Event then it is a message string.  Otherwise, it is SEL or Oem specific.  In most cases, this will be the actual Log Entry.
   **/
  
  @ApiModelProperty(value = "This property decodes from EntryType:  If it is Event then it is a message string.  Otherwise, it is SEL or Oem specific.  In most cases, this will be the actual Log Entry.")
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * The values of this property shall be any arguments for the message.
   **/
  
  @ApiModelProperty(value = "The values of this property shall be any arguments for the message.")
  @JsonProperty("MessageArgs")
  public List<String> getMessageArgs() {
    return messageArgs;
  }
  public void setMessageArgs(List<String> messageArgs) {
    this.messageArgs = messageArgs;
  }

  
  /**
   * This property decodes from EntryType:  If it is Event then it is a message id.  Otherwise, it is SEL or Oem specific.  This value is only used for registries - for more information, see the specification.
   **/
  
  @ApiModelProperty(value = "This property decodes from EntryType:  If it is Event then it is a message id.  Otherwise, it is SEL or Oem specific.  This value is only used for registries - for more information, see the specification.")
  @JsonProperty("MessageId")
  public String getMessageId() {
    return messageId;
  }
  public void setMessageId(String messageId) {
    this.messageId = messageId;
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
   * If the entry type is Oem, this will contain more information about the record format from the Oem.
   **/
  
  @ApiModelProperty(value = "If the entry type is Oem, this will contain more information about the record format from the Oem.")
  @JsonProperty("OemRecordFormat")
  public String getOemRecordFormat() {
    return oemRecordFormat;
  }
  public void setOemRecordFormat(String oemRecordFormat) {
    this.oemRecordFormat = oemRecordFormat;
  }

  
  /**
   * This property decodes from EntryType:  If it is SEL, it is the sensor number; if Event then the count of events.  Otherwise, it is Oem specific.
   **/
  
  @ApiModelProperty(value = "This property decodes from EntryType:  If it is SEL, it is the sensor number; if Event then the count of events.  Otherwise, it is Oem specific.")
  @JsonProperty("SensorNumber")
  public BigDecimal getSensorNumber() {
    return sensorNumber;
  }
  public void setSensorNumber(BigDecimal sensorNumber) {
    this.sensorNumber = sensorNumber;
  }

  
  /**
   * If the EntryType is SEL, this will have the sensor type that the log entry pertains to.
   **/
  
  @ApiModelProperty(value = "If the EntryType is SEL, this will have the sensor type that the log entry pertains to.")
  @JsonProperty("SensorType")
  public SensorTypeEnum getSensorType() {
    return sensorType;
  }
  public void setSensorType(SensorTypeEnum sensorType) {
    this.sensorType = sensorType;
  }

  
  /**
   * This is the severity of the log entry.
   **/
  
  @ApiModelProperty(value = "This is the severity of the log entry.")
  @JsonProperty("Severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
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
    LogEntry100LogEntry logEntry100LogEntry = (LogEntry100LogEntry) o;
    return Objects.equals(odataContext, logEntry100LogEntry.odataContext) &&
        Objects.equals(odataId, logEntry100LogEntry.odataId) &&
        Objects.equals(odataType, logEntry100LogEntry.odataType) &&
        Objects.equals(created, logEntry100LogEntry.created) &&
        Objects.equals(description, logEntry100LogEntry.description) &&
        Objects.equals(entryCode, logEntry100LogEntry.entryCode) &&
        Objects.equals(entryType, logEntry100LogEntry.entryType) &&
        Objects.equals(id, logEntry100LogEntry.id) &&
        Objects.equals(links, logEntry100LogEntry.links) &&
        Objects.equals(message, logEntry100LogEntry.message) &&
        Objects.equals(messageArgs, logEntry100LogEntry.messageArgs) &&
        Objects.equals(messageId, logEntry100LogEntry.messageId) &&
        Objects.equals(name, logEntry100LogEntry.name) &&
        Objects.equals(oem, logEntry100LogEntry.oem) &&
        Objects.equals(oemRecordFormat, logEntry100LogEntry.oemRecordFormat) &&
        Objects.equals(sensorNumber, logEntry100LogEntry.sensorNumber) &&
        Objects.equals(sensorType, logEntry100LogEntry.sensorType) &&
        Objects.equals(severity, logEntry100LogEntry.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, created, description, entryCode, entryType, id, links, message, messageArgs, messageId, name, oem, oemRecordFormat, sensorNumber, sensorType, severity);
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
    sb.append("    oemRecordFormat: ").append(toIndentedString(oemRecordFormat)).append("\n");
    sb.append("    sensorNumber: ").append(toIndentedString(sensorNumber)).append("\n");
    sb.append("    sensorType: ").append(toIndentedString(sensorType)).append("\n");
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

