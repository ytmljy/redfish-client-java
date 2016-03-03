package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ComputerSystem100Boot;
import io.swagger.client.model.ComputerSystem100ComputerSystemActions;
import io.swagger.client.model.ComputerSystem100ComputerSystemLinks;
import io.swagger.client.model.ComputerSystem100IndicatorLED;
import io.swagger.client.model.ComputerSystem100MemorySummary;
import io.swagger.client.model.ComputerSystem100PowerState;
import io.swagger.client.model.ComputerSystem100ProcessorSummary;
import io.swagger.client.model.ComputerSystem100SystemType;
import io.swagger.client.model.EthernetInterfaceCollectionEthernetInterfaceCollection;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ProcessorCollectionProcessorCollection;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.ResourceUUID;
import io.swagger.client.model.SimpleStorageCollectionSimpleStorageCollection;



/**
 * This schema defines a computer system and its respective properties.  A computer system represents a machine (physical or virtual) and the local resources such as memory, cpu and other devices that can be accessed from that machine.
 **/

@ApiModel(description = "This schema defines a computer system and its respective properties.  A computer system represents a machine (physical or virtual) and the local resources such as memory, cpu and other devices that can be accessed from that machine.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ComputerSystem100ComputerSystem   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ComputerSystem100ComputerSystemActions actions = null;
  private ComputerSystem100Boot boot = null;
  private ResourceDescription description = null;
  private EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces = null;
  private ResourceId id = null;
  private ComputerSystem100IndicatorLED indicatorLED = null;
  private ComputerSystem100ComputerSystemLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;
  private ComputerSystem100MemorySummary memorySummary = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private ComputerSystem100PowerState powerState = null;
  private ComputerSystem100ProcessorSummary processorSummary = null;
  private ProcessorCollectionProcessorCollection processors = null;
  private SimpleStorageCollectionSimpleStorageCollection simpleStorage = null;
  private ResourceStatus status = null;
  private ComputerSystem100SystemType systemType = null;
  private ResourceUUID UUID = null;

  
  /**
   **/
  public ComputerSystem100ComputerSystem odataContext(Odata400Context odataContext) {
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
  public ComputerSystem100ComputerSystem odataId(Odata400Id odataId) {
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
  public ComputerSystem100ComputerSystem odataType(Odata400Type odataType) {
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
  public ComputerSystem100ComputerSystem actions(ComputerSystem100ComputerSystemActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Actions")
  public ComputerSystem100ComputerSystemActions getActions() {
    return actions;
  }
  public void setActions(ComputerSystem100ComputerSystemActions actions) {
    this.actions = actions;
  }

  
  /**
   * Information about the boot settings for this system
   **/
  public ComputerSystem100ComputerSystem boot(ComputerSystem100Boot boot) {
    this.boot = boot;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the boot settings for this system")
  @JsonProperty("Boot")
  public ComputerSystem100Boot getBoot() {
    return boot;
  }
  public void setBoot(ComputerSystem100Boot boot) {
    this.boot = boot;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystem description(ResourceDescription description) {
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
   * A reference to the collection of Ethernet interfaces associated with this system
   **/
  public ComputerSystem100ComputerSystem ethernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the collection of Ethernet interfaces associated with this system")
  @JsonProperty("EthernetInterfaces")
  public EthernetInterfaceCollectionEthernetInterfaceCollection getEthernetInterfaces() {
    return ethernetInterfaces;
  }
  public void setEthernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystem id(ResourceId id) {
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
   * The state of the indicator LED, used to identify the system
   **/
  public ComputerSystem100ComputerSystem indicatorLED(ComputerSystem100IndicatorLED indicatorLED) {
    this.indicatorLED = indicatorLED;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the indicator LED, used to identify the system")
  @JsonProperty("IndicatorLED")
  public ComputerSystem100IndicatorLED getIndicatorLED() {
    return indicatorLED;
  }
  public void setIndicatorLED(ComputerSystem100IndicatorLED indicatorLED) {
    this.indicatorLED = indicatorLED;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystem links(ComputerSystem100ComputerSystemLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ComputerSystem100ComputerSystem logServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the collection of Log Services associated with this system")
  @JsonProperty("LogServices")
  public LogServiceCollectionLogServiceCollection getLogServices() {
    return logServices;
  }
  public void setLogServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
  }

  
  /**
   * This object describes the central memory of the system in general detail.
   **/
  public ComputerSystem100ComputerSystem memorySummary(ComputerSystem100MemorySummary memorySummary) {
    this.memorySummary = memorySummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This object describes the central memory of the system in general detail.")
  @JsonProperty("MemorySummary")
  public ComputerSystem100MemorySummary getMemorySummary() {
    return memorySummary;
  }
  public void setMemorySummary(ComputerSystem100MemorySummary memorySummary) {
    this.memorySummary = memorySummary;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystem name(ResourceName name) {
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
  public ComputerSystem100ComputerSystem oem(ResourceOem oem) {
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
   * This is the current power state of the system
   **/
  public ComputerSystem100ComputerSystem powerState(ComputerSystem100PowerState powerState) {
    this.powerState = powerState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the current power state of the system")
  @JsonProperty("PowerState")
  public ComputerSystem100PowerState getPowerState() {
    return powerState;
  }
  public void setPowerState(ComputerSystem100PowerState powerState) {
    this.powerState = powerState;
  }

  
  /**
   * This object describes the central processors of the system in general detail.
   **/
  public ComputerSystem100ComputerSystem processorSummary(ComputerSystem100ProcessorSummary processorSummary) {
    this.processorSummary = processorSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This object describes the central processors of the system in general detail.")
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
  public ComputerSystem100ComputerSystem processors(ProcessorCollectionProcessorCollection processors) {
    this.processors = processors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the collection of Processors associated with this system")
  @JsonProperty("Processors")
  public ProcessorCollectionProcessorCollection getProcessors() {
    return processors;
  }
  public void setProcessors(ProcessorCollectionProcessorCollection processors) {
    this.processors = processors;
  }

  
  /**
   * A reference to the collection of storage devices associated with this system
   **/
  public ComputerSystem100ComputerSystem simpleStorage(SimpleStorageCollectionSimpleStorageCollection simpleStorage) {
    this.simpleStorage = simpleStorage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the collection of storage devices associated with this system")
  @JsonProperty("SimpleStorage")
  public SimpleStorageCollectionSimpleStorageCollection getSimpleStorage() {
    return simpleStorage;
  }
  public void setSimpleStorage(SimpleStorageCollectionSimpleStorageCollection simpleStorage) {
    this.simpleStorage = simpleStorage;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystem status(ResourceStatus status) {
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

  
  /**
   * The type of computer system represented by this resource.
   **/
  public ComputerSystem100ComputerSystem systemType(ComputerSystem100SystemType systemType) {
    this.systemType = systemType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of computer system represented by this resource.")
  @JsonProperty("SystemType")
  public ComputerSystem100SystemType getSystemType() {
    return systemType;
  }
  public void setSystemType(ComputerSystem100SystemType systemType) {
    this.systemType = systemType;
  }

  
  /**
   * The universal unique identifier (UUID) for this system
   **/
  public ComputerSystem100ComputerSystem UUID(ResourceUUID UUID) {
    this.UUID = UUID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The universal unique identifier (UUID) for this system")
  @JsonProperty("UUID")
  public ResourceUUID getUUID() {
    return UUID;
  }
  public void setUUID(ResourceUUID UUID) {
    this.UUID = UUID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ComputerSystem computerSystem100ComputerSystem = (ComputerSystem100ComputerSystem) o;
    return Objects.equals(this.odataContext, computerSystem100ComputerSystem.odataContext) &&
        Objects.equals(this.odataId, computerSystem100ComputerSystem.odataId) &&
        Objects.equals(this.odataType, computerSystem100ComputerSystem.odataType) &&
        Objects.equals(this.actions, computerSystem100ComputerSystem.actions) &&
        Objects.equals(this.boot, computerSystem100ComputerSystem.boot) &&
        Objects.equals(this.description, computerSystem100ComputerSystem.description) &&
        Objects.equals(this.ethernetInterfaces, computerSystem100ComputerSystem.ethernetInterfaces) &&
        Objects.equals(this.id, computerSystem100ComputerSystem.id) &&
        Objects.equals(this.indicatorLED, computerSystem100ComputerSystem.indicatorLED) &&
        Objects.equals(this.links, computerSystem100ComputerSystem.links) &&
        Objects.equals(this.logServices, computerSystem100ComputerSystem.logServices) &&
        Objects.equals(this.memorySummary, computerSystem100ComputerSystem.memorySummary) &&
        Objects.equals(this.name, computerSystem100ComputerSystem.name) &&
        Objects.equals(this.oem, computerSystem100ComputerSystem.oem) &&
        Objects.equals(this.powerState, computerSystem100ComputerSystem.powerState) &&
        Objects.equals(this.processorSummary, computerSystem100ComputerSystem.processorSummary) &&
        Objects.equals(this.processors, computerSystem100ComputerSystem.processors) &&
        Objects.equals(this.simpleStorage, computerSystem100ComputerSystem.simpleStorage) &&
        Objects.equals(this.status, computerSystem100ComputerSystem.status) &&
        Objects.equals(this.systemType, computerSystem100ComputerSystem.systemType) &&
        Objects.equals(this.UUID, computerSystem100ComputerSystem.UUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, boot, description, ethernetInterfaces, id, indicatorLED, links, logServices, memorySummary, name, oem, powerState, processorSummary, processors, simpleStorage, status, systemType, UUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100ComputerSystem {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ethernetInterfaces: ").append(toIndentedString(ethernetInterfaces)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicatorLED: ").append(toIndentedString(indicatorLED)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    memorySummary: ").append(toIndentedString(memorySummary)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    processorSummary: ").append(toIndentedString(processorSummary)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

