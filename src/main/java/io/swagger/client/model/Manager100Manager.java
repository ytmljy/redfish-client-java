package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EthernetInterfaceCollectionEthernetInterfaceCollection;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.Manager100CommandShell;
import io.swagger.client.model.Manager100GraphicalConsole;
import io.swagger.client.model.Manager100ManagerActions;
import io.swagger.client.model.Manager100ManagerLinks;
import io.swagger.client.model.Manager100ManagerType;
import io.swagger.client.model.Manager100SerialConsole;
import io.swagger.client.model.ManagerNetworkProtocol100ManagerNetworkProtocol;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.RedundancyRedundancy;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.ResourceUUID;
import io.swagger.client.model.SerialInterfaceCollectionSerialInterfaceCollection;
import io.swagger.client.model.VirtualMediaCollectionVirtualMediaCollection;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the schema definition for a Manager.  Examples of managers are BMCs, Enclosure Managers, Management Controllers and other subsystems assigned managability functions.
 **/

@ApiModel(description = "This is the schema definition for a Manager.  Examples of managers are BMCs, Enclosure Managers, Management Controllers and other subsystems assigned managability functions.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Manager100Manager   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private Manager100ManagerActions actions = null;
  private Manager100CommandShell commandShell = null;
  private ResourceDescription description = null;
  private EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces = null;
  private Manager100GraphicalConsole graphicalConsole = null;
  private ResourceId id = null;
  private Manager100ManagerLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;
  private Manager100ManagerType managerType = null;
  private ResourceName name = null;
  private ManagerNetworkProtocol100ManagerNetworkProtocol networkProtocol = null;
  private ResourceOem oem = null;
  private List<RedundancyRedundancy> redundancy = new ArrayList<RedundancyRedundancy>();
  private Odata400Count redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private Manager100SerialConsole serialConsole = null;
  private SerialInterfaceCollectionSerialInterfaceCollection serialInterfaces = null;
  private ResourceUUID serviceEntryPointUUID = null;
  private ResourceStatus status = null;
  private ResourceUUID UUID = null;
  private VirtualMediaCollectionVirtualMediaCollection virtualMedia = null;

  
  /**
   **/
  public Manager100Manager odataContext(Odata400Context odataContext) {
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
  public Manager100Manager odataId(Odata400Id odataId) {
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
  public Manager100Manager odataType(Odata400Type odataType) {
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
  public Manager100Manager actions(Manager100ManagerActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Manager100Manager commandShell(Manager100CommandShell commandShell) {
    this.commandShell = commandShell;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the Command Shell service provided by this manager.")
  @JsonProperty("CommandShell")
  public Manager100CommandShell getCommandShell() {
    return commandShell;
  }
  public void setCommandShell(Manager100CommandShell commandShell) {
    this.commandShell = commandShell;
  }

  
  /**
   **/
  public Manager100Manager description(ResourceDescription description) {
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
   * This is a reference to a collection of NICs that this manager uses for network communication.  It is here that clients will find NIC configuration options and settings.
   **/
  public Manager100Manager ethernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a reference to a collection of NICs that this manager uses for network communication.  It is here that clients will find NIC configuration options and settings.")
  @JsonProperty("EthernetInterfaces")
  public EthernetInterfaceCollectionEthernetInterfaceCollection getEthernetInterfaces() {
    return ethernetInterfaces;
  }
  public void setEthernetInterfaces(EthernetInterfaceCollectionEthernetInterfaceCollection ethernetInterfaces) {
    this.ethernetInterfaces = ethernetInterfaces;
  }

  
  /**
   * The value of this property shall contain the information about the Graphical Console (KVM-IP) service of this manager.
   **/
  public Manager100Manager graphicalConsole(Manager100GraphicalConsole graphicalConsole) {
    this.graphicalConsole = graphicalConsole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of this property shall contain the information about the Graphical Console (KVM-IP) service of this manager.")
  @JsonProperty("GraphicalConsole")
  public Manager100GraphicalConsole getGraphicalConsole() {
    return graphicalConsole;
  }
  public void setGraphicalConsole(Manager100GraphicalConsole graphicalConsole) {
    this.graphicalConsole = graphicalConsole;
  }

  
  /**
   **/
  public Manager100Manager id(ResourceId id) {
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
  public Manager100Manager links(Manager100ManagerLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Manager100Manager logServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a reference to a collection of Logs used by the manager.")
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
  public Manager100Manager managerType(Manager100ManagerType managerType) {
    this.managerType = managerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property represents the type of manager that this resource represents.")
  @JsonProperty("ManagerType")
  public Manager100ManagerType getManagerType() {
    return managerType;
  }
  public void setManagerType(Manager100ManagerType managerType) {
    this.managerType = managerType;
  }

  
  /**
   **/
  public Manager100Manager name(ResourceName name) {
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
   * This is a reference to the network services and their settings that the manager controls.  It is here that clients will find network configuration options as well as network services.
   **/
  public Manager100Manager networkProtocol(ManagerNetworkProtocol100ManagerNetworkProtocol networkProtocol) {
    this.networkProtocol = networkProtocol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a reference to the network services and their settings that the manager controls.  It is here that clients will find network configuration options as well as network services.")
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
  public Manager100Manager oem(ResourceOem oem) {
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
   * Redundancy information for the managers of this system
   **/
  public Manager100Manager redundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Redundancy information for the managers of this system")
  @JsonProperty("Redundancy")
  public List<RedundancyRedundancy> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  public Manager100Manager redundancyodataCount(Odata400Count redundancyodataCount) {
    this.redundancyodataCount = redundancyodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Redundancy@odata.count")
  public Odata400Count getRedundancyodataCount() {
    return redundancyodataCount;
  }
  public void setRedundancyodataCount(Odata400Count redundancyodataCount) {
    this.redundancyodataCount = redundancyodataCount;
  }

  
  /**
   **/
  public Manager100Manager redundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
    this.redundancyodataNavigationLink = redundancyodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Manager100Manager serialConsole(Manager100SerialConsole serialConsole) {
    this.serialConsole = serialConsole;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Information about the Serial Console service provided by this manager.")
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
  public Manager100Manager serialInterfaces(SerialInterfaceCollectionSerialInterfaceCollection serialInterfaces) {
    this.serialInterfaces = serialInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a reference to a collection of serial interfaces that this manager uses for serial and console communication.  It is here that clients will find serial configuration options and settings.")
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
  public Manager100Manager serviceEntryPointUUID(ResourceUUID serviceEntryPointUUID) {
    this.serviceEntryPointUUID = serviceEntryPointUUID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UUID of the Redfish Service Entry Point provided by this manager")
  @JsonProperty("ServiceEntryPointUUID")
  public ResourceUUID getServiceEntryPointUUID() {
    return serviceEntryPointUUID;
  }
  public void setServiceEntryPointUUID(ResourceUUID serviceEntryPointUUID) {
    this.serviceEntryPointUUID = serviceEntryPointUUID;
  }

  
  /**
   **/
  public Manager100Manager status(ResourceStatus status) {
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
   * The Universal Unique Identifier (UUID) for this Manager
   **/
  public Manager100Manager UUID(ResourceUUID UUID) {
    this.UUID = UUID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Universal Unique Identifier (UUID) for this Manager")
  @JsonProperty("UUID")
  public ResourceUUID getUUID() {
    return UUID;
  }
  public void setUUID(ResourceUUID UUID) {
    this.UUID = UUID;
  }

  
  /**
   * This is a reference to the Virtual Media services for this particular manager.
   **/
  public Manager100Manager virtualMedia(VirtualMediaCollectionVirtualMediaCollection virtualMedia) {
    this.virtualMedia = virtualMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a reference to the Virtual Media services for this particular manager.")
  @JsonProperty("VirtualMedia")
  public VirtualMediaCollectionVirtualMediaCollection getVirtualMedia() {
    return virtualMedia;
  }
  public void setVirtualMedia(VirtualMediaCollectionVirtualMediaCollection virtualMedia) {
    this.virtualMedia = virtualMedia;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100Manager manager100Manager = (Manager100Manager) o;
    return Objects.equals(this.odataContext, manager100Manager.odataContext) &&
        Objects.equals(this.odataId, manager100Manager.odataId) &&
        Objects.equals(this.odataType, manager100Manager.odataType) &&
        Objects.equals(this.actions, manager100Manager.actions) &&
        Objects.equals(this.commandShell, manager100Manager.commandShell) &&
        Objects.equals(this.description, manager100Manager.description) &&
        Objects.equals(this.ethernetInterfaces, manager100Manager.ethernetInterfaces) &&
        Objects.equals(this.graphicalConsole, manager100Manager.graphicalConsole) &&
        Objects.equals(this.id, manager100Manager.id) &&
        Objects.equals(this.links, manager100Manager.links) &&
        Objects.equals(this.logServices, manager100Manager.logServices) &&
        Objects.equals(this.managerType, manager100Manager.managerType) &&
        Objects.equals(this.name, manager100Manager.name) &&
        Objects.equals(this.networkProtocol, manager100Manager.networkProtocol) &&
        Objects.equals(this.oem, manager100Manager.oem) &&
        Objects.equals(this.redundancy, manager100Manager.redundancy) &&
        Objects.equals(this.redundancyodataCount, manager100Manager.redundancyodataCount) &&
        Objects.equals(this.redundancyodataNavigationLink, manager100Manager.redundancyodataNavigationLink) &&
        Objects.equals(this.serialConsole, manager100Manager.serialConsole) &&
        Objects.equals(this.serialInterfaces, manager100Manager.serialInterfaces) &&
        Objects.equals(this.serviceEntryPointUUID, manager100Manager.serviceEntryPointUUID) &&
        Objects.equals(this.status, manager100Manager.status) &&
        Objects.equals(this.UUID, manager100Manager.UUID) &&
        Objects.equals(this.virtualMedia, manager100Manager.virtualMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, commandShell, description, ethernetInterfaces, graphicalConsole, id, links, logServices, managerType, name, networkProtocol, oem, redundancy, redundancyodataCount, redundancyodataNavigationLink, serialConsole, serialInterfaces, serviceEntryPointUUID, status, UUID, virtualMedia);
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
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ethernetInterfaces: ").append(toIndentedString(ethernetInterfaces)).append("\n");
    sb.append("    graphicalConsole: ").append(toIndentedString(graphicalConsole)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

