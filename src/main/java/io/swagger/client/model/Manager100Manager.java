package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EthernetInterfaceCollectionEthernetInterfaceCollection;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.Manager100CommandShell;
import io.swagger.client.model.Manager100GraphicalConsole;
import io.swagger.client.model.Manager100ManagerActions;
import io.swagger.client.model.Manager100ManagerLinks;
import io.swagger.client.model.Manager100SerialConsole;
import io.swagger.client.model.ManagerNetworkProtocol100ManagerNetworkProtocol;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.SerialInterfaceCollectionSerialInterfaceCollection;
import io.swagger.client.model.VirtualMediaCollectionVirtualMediaCollection;
import java.math.BigDecimal;
import java.util.*;
import java.util.Date;



/**
 * This is the schema definition for a Manager.  Examples of managers are BMCs, Enclosure Managers, Management Controllers and other subsystems assigned managability functions.
 **/

@ApiModel(description = "This is the schema definition for a Manager.  Examples of managers are BMCs, Enclosure Managers, Management Controllers and other subsystems assigned managability functions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Manager100Manager   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private Manager100ManagerActions actions = null;
  private Manager100CommandShell commandShell = null;
  private Date dateTime = null;
  private String dateTimeLocalOffset = null;
  private String description = null;
  private EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces = null;
  private String firmwareVersion = null;
  private Manager100GraphicalConsole graphicalConsole = null;
  private String id = null;
  private Manager100ManagerLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;


  public enum ManagerTypeEnum {
    MANAGEMENTCONTROLLER("ManagementController"),
    ENCLOSUREMANAGER("EnclosureManager"),
    BMC("BMC"),
    RACKMANAGER("RackManager"),
    AUXILIARYCONTROLLER("AuxiliaryController");

    private String value;

    ManagerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ManagerTypeEnum managerType = null;
  private String model = null;
  private String name = null;
  private ManagerNetworkProtocol100ManagerNetworkProtocol networkProtocol = null;
  private ResourceOem oem = null;
  private List<Odata400IdRef> redundancy = new ArrayList<Odata400IdRef>();
  private BigDecimal redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private Manager100SerialConsole serialConsole = null;
  private SerialInterfaceCollectionSerialInterfaceCollection serialInterfaces = null;
  private String serviceEntryPointUUID = null;
  private ResourceStatus status = null;
  private String UUID = null;
  private VirtualMediaCollectionVirtualMediaCollection virtualMedia = null;

  
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
  public Manager100ManagerActions getActions() {
    return actions;
  }
  public void setActions(Manager100ManagerActions actions) {
    this.actions = actions;
  }

  
  /**
   * Information about the Command Shell service provided by this manager.
   **/
  
  @ApiModelProperty(value = "Information about the Command Shell service provided by this manager.")
  @JsonProperty("CommandShell")
  public Manager100CommandShell getCommandShell() {
    return commandShell;
  }
  public void setCommandShell(Manager100CommandShell commandShell) {
    this.commandShell = commandShell;
  }

  
  /**
   * The current DateTime (with offset) for the manager, used to set or read time.
   **/
  
  @ApiModelProperty(value = "The current DateTime (with offset) for the manager, used to set or read time.")
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
   * This is a reference to a collection of NICs that this manager uses for network communication.  It is here that clients will find NIC configuration options and settings.
   **/
  
  @ApiModelProperty(value = "This is a reference to a collection of NICs that this manager uses for network communication.  It is here that clients will find NIC configuration options and settings.")
  @JsonProperty("EthernetInterfaces")
  public EthernetInterfaceCollectionEthernetInterfaceCollection getEthernetInterfaces() {
    return ethernetInterfaces;
  }
  public void setEthernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
  }

  
  /**
   * The firmware version of this Manager
   **/
  
  @ApiModelProperty(value = "The firmware version of this Manager")
  @JsonProperty("FirmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   * The value of this property shall contain the information about the Graphical Console (KVM-IP) service of this manager.
   **/
  
  @ApiModelProperty(value = "The value of this property shall contain the information about the Graphical Console (KVM-IP) service of this manager.")
  @JsonProperty("GraphicalConsole")
  public Manager100GraphicalConsole getGraphicalConsole() {
    return graphicalConsole;
  }
  public void setGraphicalConsole(Manager100GraphicalConsole graphicalConsole) {
    this.graphicalConsole = graphicalConsole;
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
  public Manager100ManagerLinks getLinks() {
    return links;
  }
  public void setLinks(Manager100ManagerLinks links) {
    this.links = links;
  }

  
  /**
   * This is a reference to a collection of Logs used by the manager.
   **/
  
  @ApiModelProperty(value = "This is a reference to a collection of Logs used by the manager.")
  @JsonProperty("LogServices")
  public LogServiceCollectionLogServiceCollection getLogServices() {
    return logServices;
  }
  public void setLogServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
  }

  
  /**
   * This property represents the type of manager that this resource represents.
   **/
  
  @ApiModelProperty(value = "This property represents the type of manager that this resource represents.")
  @JsonProperty("ManagerType")
  public ManagerTypeEnum getManagerType() {
    return managerType;
  }
  public void setManagerType(ManagerTypeEnum managerType) {
    this.managerType = managerType;
  }

  
  /**
   * The model information of this Manager as defined by the manufacturer
   **/
  
  @ApiModelProperty(value = "The model information of this Manager as defined by the manufacturer")
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
   * This is a reference to the network services and their settings that the manager controls.  It is here that clients will find network configuration options as well as network services.
   **/
  
  @ApiModelProperty(value = "This is a reference to the network services and their settings that the manager controls.  It is here that clients will find network configuration options as well as network services.")
  @JsonProperty("NetworkProtocol")
  public ManagerNetworkProtocol100ManagerNetworkProtocol getNetworkProtocol() {
    return networkProtocol;
  }
  public void setNetworkProtocol(ManagerNetworkProtocol100ManagerNetworkProtocol networkProtocol) {
    this.networkProtocol = networkProtocol;
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
   * Redundancy information for the managers of this system
   **/
  
  @ApiModelProperty(value = "Redundancy information for the managers of this system")
  @JsonProperty("Redundancy")
  public List<Odata400IdRef> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<Odata400IdRef> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Redundancy@odata.count")
  public BigDecimal getRedundancyodataCount() {
    return redundancyodataCount;
  }
  public void setRedundancyodataCount(BigDecimal redundancyodataCount) {
    this.redundancyodataCount = redundancyodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Redundancy@odata.navigationLink")
  public Odata400IdRef getRedundancyodataNavigationLink() {
    return redundancyodataNavigationLink;
  }
  public void setRedundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
    this.redundancyodataNavigationLink = redundancyodataNavigationLink;
  }

  
  /**
   * Information about the Serial Console service provided by this manager.
   **/
  
  @ApiModelProperty(value = "Information about the Serial Console service provided by this manager.")
  @JsonProperty("SerialConsole")
  public Manager100SerialConsole getSerialConsole() {
    return serialConsole;
  }
  public void setSerialConsole(Manager100SerialConsole serialConsole) {
    this.serialConsole = serialConsole;
  }

  
  /**
   * This is a reference to a collection of serial interfaces that this manager uses for serial and console communication.  It is here that clients will find serial configuration options and settings.
   **/
  
  @ApiModelProperty(value = "This is a reference to a collection of serial interfaces that this manager uses for serial and console communication.  It is here that clients will find serial configuration options and settings.")
  @JsonProperty("SerialInterfaces")
  public SerialInterfaceCollectionSerialInterfaceCollection getSerialInterfaces() {
    return serialInterfaces;
  }
  public void setSerialInterfaces(SerialInterfaceCollectionSerialInterfaceCollection serialInterfaces) {
    this.serialInterfaces = serialInterfaces;
  }

  
  /**
   * The UUID of the Redfish Service Entry Point provided by this manager
   **/
  
  @ApiModelProperty(value = "The UUID of the Redfish Service Entry Point provided by this manager")
  @JsonProperty("ServiceEntryPointUUID")
  public String getServiceEntryPointUUID() {
    return serviceEntryPointUUID;
  }
  public void setServiceEntryPointUUID(String serviceEntryPointUUID) {
    this.serviceEntryPointUUID = serviceEntryPointUUID;
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
   * The Universal Unique Identifier (UUID) for this Manager
   **/
  
  @ApiModelProperty(value = "The Universal Unique Identifier (UUID) for this Manager")
  @JsonProperty("UUID")
  public String getUUID() {
    return UUID;
  }
  public void setUUID(String UUID) {
    this.UUID = UUID;
  }

  
  /**
   * This is a reference to the Virtual Media services for this particular manager.
   **/
  
  @ApiModelProperty(value = "This is a reference to the Virtual Media services for this particular manager.")
  @JsonProperty("VirtualMedia")
  public VirtualMediaCollectionVirtualMediaCollection getVirtualMedia() {
    return virtualMedia;
  }
  public void setVirtualMedia(VirtualMediaCollectionVirtualMediaCollection virtualMedia) {
    this.virtualMedia = virtualMedia;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100Manager manager100Manager = (Manager100Manager) o;
    return Objects.equals(odataContext, manager100Manager.odataContext) &&
        Objects.equals(odataId, manager100Manager.odataId) &&
        Objects.equals(odataType, manager100Manager.odataType) &&
        Objects.equals(actions, manager100Manager.actions) &&
        Objects.equals(commandShell, manager100Manager.commandShell) &&
        Objects.equals(dateTime, manager100Manager.dateTime) &&
        Objects.equals(dateTimeLocalOffset, manager100Manager.dateTimeLocalOffset) &&
        Objects.equals(description, manager100Manager.description) &&
        Objects.equals(ethernetInterfaces, manager100Manager.ethernetInterfaces) &&
        Objects.equals(firmwareVersion, manager100Manager.firmwareVersion) &&
        Objects.equals(graphicalConsole, manager100Manager.graphicalConsole) &&
        Objects.equals(id, manager100Manager.id) &&
        Objects.equals(links, manager100Manager.links) &&
        Objects.equals(logServices, manager100Manager.logServices) &&
        Objects.equals(managerType, manager100Manager.managerType) &&
        Objects.equals(model, manager100Manager.model) &&
        Objects.equals(name, manager100Manager.name) &&
        Objects.equals(networkProtocol, manager100Manager.networkProtocol) &&
        Objects.equals(oem, manager100Manager.oem) &&
        Objects.equals(redundancy, manager100Manager.redundancy) &&
        Objects.equals(redundancyodataCount, manager100Manager.redundancyodataCount) &&
        Objects.equals(redundancyodataNavigationLink, manager100Manager.redundancyodataNavigationLink) &&
        Objects.equals(serialConsole, manager100Manager.serialConsole) &&
        Objects.equals(serialInterfaces, manager100Manager.serialInterfaces) &&
        Objects.equals(serviceEntryPointUUID, manager100Manager.serviceEntryPointUUID) &&
        Objects.equals(status, manager100Manager.status) &&
        Objects.equals(UUID, manager100Manager.UUID) &&
        Objects.equals(virtualMedia, manager100Manager.virtualMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, commandShell, dateTime, dateTimeLocalOffset, description, ethernetInterfaces, firmwareVersion, graphicalConsole, id, links, logServices, managerType, model, name, networkProtocol, oem, redundancy, redundancyodataCount, redundancyodataNavigationLink, serialConsole, serialInterfaces, serviceEntryPointUUID, status, UUID, virtualMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100Manager {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    commandShell: ").append(toIndentedString(commandShell)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    dateTimeLocalOffset: ").append(toIndentedString(dateTimeLocalOffset)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ethernetInterfaces: ").append(toIndentedString(ethernetInterfaces)).append("\n");
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    graphicalConsole: ").append(toIndentedString(graphicalConsole)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkProtocol: ").append(toIndentedString(networkProtocol)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    serialConsole: ").append(toIndentedString(serialConsole)).append("\n");
    sb.append("    serialInterfaces: ").append(toIndentedString(serialInterfaces)).append("\n");
    sb.append("    serviceEntryPointUUID: ").append(toIndentedString(serviceEntryPointUUID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    virtualMedia: ").append(toIndentedString(virtualMedia)).append("\n");
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

