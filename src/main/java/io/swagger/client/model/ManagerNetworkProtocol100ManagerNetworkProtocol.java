package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerNetworkProtocol100Protocol;
import io.swagger.client.model.ManagerNetworkProtocol100SSDProtocol;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;



/**
 * This resource is used to obtain or modify the network services managed by a given manager.
 **/

@ApiModel(description = "This resource is used to obtain or modify the network services managed by a given manager.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ManagerNetworkProtocol100ManagerNetworkProtocol   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String FQDN = null;
  private ManagerNetworkProtocol100Protocol HTTP = null;
  private ManagerNetworkProtocol100Protocol HTTPS = null;
  private String hostName = null;
  private ManagerNetworkProtocol100Protocol IPMI = null;
  private String id = null;
  private ManagerNetworkProtocol100Protocol KVMIP = null;
  private String name = null;
  private ResourceOem oem = null;
  private ManagerNetworkProtocol100Protocol SNMP = null;
  private ManagerNetworkProtocol100SSDProtocol SSDP = null;
  private ManagerNetworkProtocol100Protocol SSH = null;
  private ResourceStatus status = null;
  private ManagerNetworkProtocol100Protocol telnet = null;
  private ManagerNetworkProtocol100Protocol virtualMedia = null;

  
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
   * This is the fully qualified domain name for the manager obtained by DNS including the host name and top-level domain name.
   **/
  
  @ApiModelProperty(value = "This is the fully qualified domain name for the manager obtained by DNS including the host name and top-level domain name.")
  @JsonProperty("FQDN")
  public String getFQDN() {
    return FQDN;
  }
  public void setFQDN(String FQDN) {
    this.FQDN = FQDN;
  }

  
  /**
   * Settings for this Manager's HTTP protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's HTTP protocol support")
  @JsonProperty("HTTP")
  public ManagerNetworkProtocol100Protocol getHTTP() {
    return HTTP;
  }
  public void setHTTP(ManagerNetworkProtocol100Protocol HTTP) {
    this.HTTP = HTTP;
  }

  
  /**
   * Settings for this Manager's HTTPS protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's HTTPS protocol support")
  @JsonProperty("HTTPS")
  public ManagerNetworkProtocol100Protocol getHTTPS() {
    return HTTPS;
  }
  public void setHTTPS(ManagerNetworkProtocol100Protocol HTTPS) {
    this.HTTPS = HTTPS;
  }

  
  /**
   * The DNS Host Name of this manager, without any domain information
   **/
  
  @ApiModelProperty(value = "The DNS Host Name of this manager, without any domain information")
  @JsonProperty("HostName")
  public String getHostName() {
    return hostName;
  }
  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  
  /**
   * Settings for this Manager's IPMI-over-LAN protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's IPMI-over-LAN protocol support")
  @JsonProperty("IPMI")
  public ManagerNetworkProtocol100Protocol getIPMI() {
    return IPMI;
  }
  public void setIPMI(ManagerNetworkProtocol100Protocol IPMI) {
    this.IPMI = IPMI;
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
   * Settings for this Manager's KVM-IP protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's KVM-IP protocol support")
  @JsonProperty("KVMIP")
  public ManagerNetworkProtocol100Protocol getKVMIP() {
    return KVMIP;
  }
  public void setKVMIP(ManagerNetworkProtocol100Protocol KVMIP) {
    this.KVMIP = KVMIP;
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
   * Settings for this Manager's SNMP support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's SNMP support")
  @JsonProperty("SNMP")
  public ManagerNetworkProtocol100Protocol getSNMP() {
    return SNMP;
  }
  public void setSNMP(ManagerNetworkProtocol100Protocol SNMP) {
    this.SNMP = SNMP;
  }

  
  /**
   * Settings for this Manager's SSDP support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's SSDP support")
  @JsonProperty("SSDP")
  public ManagerNetworkProtocol100SSDProtocol getSSDP() {
    return SSDP;
  }
  public void setSSDP(ManagerNetworkProtocol100SSDProtocol SSDP) {
    this.SSDP = SSDP;
  }

  
  /**
   * Settings for this Manager's SSH (Secure Shell) protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's SSH (Secure Shell) protocol support")
  @JsonProperty("SSH")
  public ManagerNetworkProtocol100Protocol getSSH() {
    return SSH;
  }
  public void setSSH(ManagerNetworkProtocol100Protocol SSH) {
    this.SSH = SSH;
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
   * Settings for this Manager's Telnet protocol support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's Telnet protocol support")
  @JsonProperty("Telnet")
  public ManagerNetworkProtocol100Protocol getTelnet() {
    return telnet;
  }
  public void setTelnet(ManagerNetworkProtocol100Protocol telnet) {
    this.telnet = telnet;
  }

  
  /**
   * Settings for this Manager's Virtual Media support
   **/
  
  @ApiModelProperty(value = "Settings for this Manager's Virtual Media support")
  @JsonProperty("VirtualMedia")
  public ManagerNetworkProtocol100Protocol getVirtualMedia() {
    return virtualMedia;
  }
  public void setVirtualMedia(ManagerNetworkProtocol100Protocol virtualMedia) {
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
    ManagerNetworkProtocol100ManagerNetworkProtocol managerNetworkProtocol100ManagerNetworkProtocol = (ManagerNetworkProtocol100ManagerNetworkProtocol) o;
    return Objects.equals(odataContext, managerNetworkProtocol100ManagerNetworkProtocol.odataContext) &&
        Objects.equals(odataId, managerNetworkProtocol100ManagerNetworkProtocol.odataId) &&
        Objects.equals(odataType, managerNetworkProtocol100ManagerNetworkProtocol.odataType) &&
        Objects.equals(description, managerNetworkProtocol100ManagerNetworkProtocol.description) &&
        Objects.equals(FQDN, managerNetworkProtocol100ManagerNetworkProtocol.FQDN) &&
        Objects.equals(HTTP, managerNetworkProtocol100ManagerNetworkProtocol.HTTP) &&
        Objects.equals(HTTPS, managerNetworkProtocol100ManagerNetworkProtocol.HTTPS) &&
        Objects.equals(hostName, managerNetworkProtocol100ManagerNetworkProtocol.hostName) &&
        Objects.equals(IPMI, managerNetworkProtocol100ManagerNetworkProtocol.IPMI) &&
        Objects.equals(id, managerNetworkProtocol100ManagerNetworkProtocol.id) &&
        Objects.equals(KVMIP, managerNetworkProtocol100ManagerNetworkProtocol.KVMIP) &&
        Objects.equals(name, managerNetworkProtocol100ManagerNetworkProtocol.name) &&
        Objects.equals(oem, managerNetworkProtocol100ManagerNetworkProtocol.oem) &&
        Objects.equals(SNMP, managerNetworkProtocol100ManagerNetworkProtocol.SNMP) &&
        Objects.equals(SSDP, managerNetworkProtocol100ManagerNetworkProtocol.SSDP) &&
        Objects.equals(SSH, managerNetworkProtocol100ManagerNetworkProtocol.SSH) &&
        Objects.equals(status, managerNetworkProtocol100ManagerNetworkProtocol.status) &&
        Objects.equals(telnet, managerNetworkProtocol100ManagerNetworkProtocol.telnet) &&
        Objects.equals(virtualMedia, managerNetworkProtocol100ManagerNetworkProtocol.virtualMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, FQDN, HTTP, HTTPS, hostName, IPMI, id, KVMIP, name, oem, SNMP, SSDP, SSH, status, telnet, virtualMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerNetworkProtocol100ManagerNetworkProtocol {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    FQDN: ").append(toIndentedString(FQDN)).append("\n");
    sb.append("    HTTP: ").append(toIndentedString(HTTP)).append("\n");
    sb.append("    HTTPS: ").append(toIndentedString(HTTPS)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    IPMI: ").append(toIndentedString(IPMI)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    KVMIP: ").append(toIndentedString(KVMIP)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    SNMP: ").append(toIndentedString(SNMP)).append("\n");
    sb.append("    SSDP: ").append(toIndentedString(SSDP)).append("\n");
    sb.append("    SSH: ").append(toIndentedString(SSH)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    telnet: ").append(toIndentedString(telnet)).append("\n");
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

