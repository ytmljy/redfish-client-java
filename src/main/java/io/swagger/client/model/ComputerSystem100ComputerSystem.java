package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ComputerSystem100Boot;
import io.swagger.client.model.ComputerSystem100ComputerSystemActions;
import io.swagger.client.model.ComputerSystem100ComputerSystemLinks;
import io.swagger.client.model.ComputerSystem100MemorySummary;
import io.swagger.client.model.ComputerSystem100ProcessorSummary;
import io.swagger.client.model.EthernetInterfaceCollectionEthernetInterfaceCollection;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.ProcessorCollectionProcessorCollection;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.SimpleStorageCollectionSimpleStorageCollection;



/**
 * This schema defines a computer system and its respective properties.  A computer system represents a machine (physical or virtual) and the local resources such as memory, cpu and other devices that can be accessed from that machine.
 **/

@ApiModel(description = "This schema defines a computer system and its respective properties.  A computer system represents a machine (physical or virtual) and the local resources such as memory, cpu and other devices that can be accessed from that machine.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ComputerSystem100ComputerSystem   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private ComputerSystem100ComputerSystemActions actions = null;
  private String assetTag = null;
  private String biosVersion = null;
  private ComputerSystem100Boot boot = null;
  private String description = null;
  private EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces = null;
  private String hostName = null;
  private String id = null;


  public enum IndicatorLEDEnum {
    UNKNOWN("Unknown"),
    LIT("Lit"),
    BLINKING("Blinking"),
    OFF("Off");

    private String value;

    IndicatorLEDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private IndicatorLEDEnum indicatorLED = null;
  private ComputerSystem100ComputerSystemLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;
  private String manufacturer = null;
  private ComputerSystem100MemorySummary memorySummary = null;
  private String model = null;
  private String name = null;
  private ResourceOem oem = null;
  private String partNumber = null;


  public enum PowerStateEnum {
    ON("On"),
    OFF("Off"),
    UNKNOWN("Unknown"),
    RESET("Reset");

    private String value;

    PowerStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PowerStateEnum powerState = null;
  private ComputerSystem100ProcessorSummary processorSummary = null;
  private ProcessorCollectionProcessorCollection processors = null;
  private String SKU = null;
  private String serialNumber = null;
  private SimpleStorageCollectionSimpleStorageCollection simpleStorage = null;
  private ResourceStatus status = null;


  public enum SystemTypeEnum {
    PHYSICAL("Physical"),
    VIRTUAL("Virtual"),
    OS("OS"),
    PHYSICALLYPARTITIONED("PhysicallyPartitioned"),
    VIRTUALLYPARTITIONED("VirtuallyPartitioned");

    private String value;

    SystemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SystemTypeEnum systemType = null;
  private String UUID = null;

  
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
  public ComputerSystem100ComputerSystemActions getActions() {
    return actions;
  }
  public void setActions(ComputerSystem100ComputerSystemActions actions) {
    this.actions = actions;
  }

  
  /**
   * The user definable tag that can be used to track this computer system for inventory or other client purposes
   **/
  
  @ApiModelProperty(value = "The user definable tag that can be used to track this computer system for inventory or other client purposes")
  @JsonProperty("AssetTag")
  public String getAssetTag() {
    return assetTag;
  }
  public void setAssetTag(String assetTag) {
    this.assetTag = assetTag;
  }

  
  /**
   * The version of the system BIOS or primary system firmware.
   **/
  
  @ApiModelProperty(value = "The version of the system BIOS or primary system firmware.")
  @JsonProperty("BiosVersion")
  public String getBiosVersion() {
    return biosVersion;
  }
  public void setBiosVersion(String biosVersion) {
    this.biosVersion = biosVersion;
  }

  
  /**
   * Information about the boot settings for this system
   **/
  
  @ApiModelProperty(value = "Information about the boot settings for this system")
  @JsonProperty("Boot")
  public ComputerSystem100Boot getBoot() {
    return boot;
  }
  public void setBoot(ComputerSystem100Boot boot) {
    this.boot = boot;
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
   * A reference to the collection of Ethernet interfaces associated with this system
   **/
  
  @ApiModelProperty(value = "A reference to the collection of Ethernet interfaces associated with this system")
  @JsonProperty("EthernetInterfaces")
  public EthernetInterfaceCollectionEthernetInterfaceCollection getEthernetInterfaces() {
    return ethernetInterfaces;
  }
  public void setEthernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
  }

  
  /**
   * The DNS Host Name, without any domain information
   **/
  
  @ApiModelProperty(value = "The DNS Host Name, without any domain information")
  @JsonProperty("HostName")
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
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
   * The state of the indicator LED, used to identify the system
   **/
  
  @ApiModelProperty(value = "The state of the indicator LED, used to identify the system")
  @JsonProperty("IndicatorLED")
  public IndicatorLEDEnum getIndicatorLED() {
    return indicatorLED;
  }
  public void setIndicatorLED(IndicatorLEDEnum indicatorLED) {
    this.indicatorLED = indicatorLED;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Links")
  public ComputerSystem100ComputerSystemLinks getLinks() {
    return links;
  }
  public void setLinks(ComputerSystem100ComputerSystemLinks links) {
    this.links = links;
  }

  
  /**
   * A reference to the collection of Log Services associated with this system
   **/
  
  @ApiModelProperty(value = "A reference to the collection of Log Services associated with this system")
  @JsonProperty("LogServices")
  public LogServiceCollectionLogServiceCollection getLogServices() {
    return logServices;
  }
  public void setLogServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
  }

  
  /**
   * The manufacturer or OEM of this system.
   **/
  
  @ApiModelProperty(value = "The manufacturer or OEM of this system.")
  @JsonProperty("Manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * This object describes the central memory of the system in general detail.
   **/
  
  @ApiModelProperty(value = "This object describes the central memory of the system in general detail.")
  @JsonProperty("MemorySummary")
  public ComputerSystem100MemorySummary getMemorySummary() {
    return memorySummary;
  }
  public void setMemorySummary(ComputerSystem100MemorySummary memorySummary) {
    this.memorySummary = memorySummary;
  }

  
  /**
   * The model number for this system
   **/
  
  @ApiModelProperty(value = "The model number for this system")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
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
   * The part number for this system
   **/
  
  @ApiModelProperty(value = "The part number for this system")
  @JsonProperty("PartNumber")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * This is the current power state of the system
   **/
  
  @ApiModelProperty(value = "This is the current power state of the system")
  @JsonProperty("PowerState")
  public PowerStateEnum getPowerState() {
    return powerState;
  }
  public void setPowerState(PowerStateEnum powerState) {
    this.powerState = powerState;
  }

  
  /**
   * This object describes the central processors of the system in general detail.
   **/
  
  @ApiModelProperty(value = "This object describes the central processors of the system in general detail.")
  @JsonProperty("ProcessorSummary")
  public ComputerSystem100ProcessorSummary getProcessorSummary() {
    return processorSummary;
  }
  public void setProcessorSummary(ComputerSystem100ProcessorSummary processorSummary) {
    this.processorSummary = processorSummary;
  }

  
  /**
   * A reference to the collection of Processors associated with this system
   **/
  
  @ApiModelProperty(value = "A reference to the collection of Processors associated with this system")
  @JsonProperty("Processors")
  public ProcessorCollectionProcessorCollection getProcessors() {
    return processors;
  }
  public void setProcessors(ProcessorCollectionProcessorCollection processors) {
    this.processors = processors;
  }

  
  /**
   * The manufacturer SKU for this system
   **/
  
  @ApiModelProperty(value = "The manufacturer SKU for this system")
  @JsonProperty("SKU")
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  
  /**
   * The serial number for this system
   **/
  
  @ApiModelProperty(value = "The serial number for this system")
  @JsonProperty("SerialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * A reference to the collection of storage devices associated with this system
   **/
  
  @ApiModelProperty(value = "A reference to the collection of storage devices associated with this system")
  @JsonProperty("SimpleStorage")
  public SimpleStorageCollectionSimpleStorageCollection getSimpleStorage() {
    return simpleStorage;
  }
  public void setSimpleStorage(SimpleStorageCollectionSimpleStorageCollection simpleStorage) {
    this.simpleStorage = simpleStorage;
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
   * The type of computer system represented by this resource.
   **/
  
  @ApiModelProperty(value = "The type of computer system represented by this resource.")
  @JsonProperty("SystemType")
  public SystemTypeEnum getSystemType() {
    return systemType;
  }
  public void setSystemType(SystemTypeEnum systemType) {
    this.systemType = systemType;
  }

  
  /**
   * The universal unique identifier (UUID) for this system
   **/
  
  @ApiModelProperty(value = "The universal unique identifier (UUID) for this system")
  @JsonProperty("UUID")
  public String getUUID() {
    return UUID;
  }
  public void setUUID(String UUID) {
    this.UUID = UUID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ComputerSystem computerSystem100ComputerSystem = (ComputerSystem100ComputerSystem) o;
    return Objects.equals(odataContext, computerSystem100ComputerSystem.odataContext) &&
        Objects.equals(odataId, computerSystem100ComputerSystem.odataId) &&
        Objects.equals(odataType, computerSystem100ComputerSystem.odataType) &&
        Objects.equals(actions, computerSystem100ComputerSystem.actions) &&
        Objects.equals(assetTag, computerSystem100ComputerSystem.assetTag) &&
        Objects.equals(biosVersion, computerSystem100ComputerSystem.biosVersion) &&
        Objects.equals(boot, computerSystem100ComputerSystem.boot) &&
        Objects.equals(description, computerSystem100ComputerSystem.description) &&
        Objects.equals(ethernetInterfaces, computerSystem100ComputerSystem.ethernetInterfaces) &&
        Objects.equals(hostName, computerSystem100ComputerSystem.hostName) &&
        Objects.equals(id, computerSystem100ComputerSystem.id) &&
        Objects.equals(indicatorLED, computerSystem100ComputerSystem.indicatorLED) &&
        Objects.equals(links, computerSystem100ComputerSystem.links) &&
        Objects.equals(logServices, computerSystem100ComputerSystem.logServices) &&
        Objects.equals(manufacturer, computerSystem100ComputerSystem.manufacturer) &&
        Objects.equals(memorySummary, computerSystem100ComputerSystem.memorySummary) &&
        Objects.equals(model, computerSystem100ComputerSystem.model) &&
        Objects.equals(name, computerSystem100ComputerSystem.name) &&
        Objects.equals(oem, computerSystem100ComputerSystem.oem) &&
        Objects.equals(partNumber, computerSystem100ComputerSystem.partNumber) &&
        Objects.equals(powerState, computerSystem100ComputerSystem.powerState) &&
        Objects.equals(processorSummary, computerSystem100ComputerSystem.processorSummary) &&
        Objects.equals(processors, computerSystem100ComputerSystem.processors) &&
        Objects.equals(SKU, computerSystem100ComputerSystem.SKU) &&
        Objects.equals(serialNumber, computerSystem100ComputerSystem.serialNumber) &&
        Objects.equals(simpleStorage, computerSystem100ComputerSystem.simpleStorage) &&
        Objects.equals(status, computerSystem100ComputerSystem.status) &&
        Objects.equals(systemType, computerSystem100ComputerSystem.systemType) &&
        Objects.equals(UUID, computerSystem100ComputerSystem.UUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, assetTag, biosVersion, boot, description, ethernetInterfaces, hostName, id, indicatorLED, links, logServices, manufacturer, memorySummary, model, name, oem, partNumber, powerState, processorSummary, processors, SKU, serialNumber, simpleStorage, status, systemType, UUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100ComputerSystem {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    assetTag: ").append(toIndentedString(assetTag)).append("\n");
    sb.append("    biosVersion: ").append(toIndentedString(biosVersion)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ethernetInterfaces: ").append(toIndentedString(ethernetInterfaces)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicatorLED: ").append(toIndentedString(indicatorLED)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    memorySummary: ").append(toIndentedString(memorySummary)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    processorSummary: ").append(toIndentedString(processorSummary)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    simpleStorage: ").append(toIndentedString(simpleStorage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
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

