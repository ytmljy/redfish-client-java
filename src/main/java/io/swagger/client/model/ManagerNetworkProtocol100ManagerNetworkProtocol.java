package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerNetworkProtocol100Protocol;
import io.swagger.client.model.ManagerNetworkProtocol100SSDProtocol;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;



/**
 * This resource is used to obtain or modify the network services managed by a given manager.
 **/

@ApiModel(description = "This resource is used to obtain or modify the network services managed by a given manager.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ManagerNetworkProtocol100ManagerNetworkProtocol   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private ManagerNetworkProtocol100Protocol HTTP = null;
  private ManagerNetworkProtocol100Protocol HTTPS = null;
  private ManagerNetworkProtocol100Protocol IPMI = null;
  private ResourceId id = null;
  private ManagerNetworkProtocol100Protocol KVMIP = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private ManagerNetworkProtocol100Protocol SNMP = null;
  private ManagerNetworkProtocol100SSDProtocol SSDP = null;
  private ManagerNetworkProtocol100Protocol SSH = null;
  private ResourceStatus status = null;
  private ManagerNetworkProtocol100Protocol telnet = null;
  private ManagerNetworkProtocol100Protocol virtualMedia = null;

  
  /**
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol odataContext(Odata400Context odataContext) {
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol odataId(Odata400Id odataId) {
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol odataType(Odata400Type odataType) {
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol description(ResourceDescription description) {
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
   * Settings for this Manager's HTTP protocol support
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol HTTP(ManagerNetworkProtocol100Protocol HTTP) {
    this.HTTP = HTTP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's HTTP protocol support")
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol HTTPS(ManagerNetworkProtocol100Protocol HTTPS) {
    this.HTTPS = HTTPS;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's HTTPS protocol support")
  @JsonProperty("HTTPS")
  public ManagerNetworkProtocol100Protocol getHTTPS() {
    return HTTPS;
  }
  public void setHTTPS(ManagerNetworkProtocol100Protocol HTTPS) {
    this.HTTPS = HTTPS;
  }

  
  /**
   * Settings for this Manager's IPMI-over-LAN protocol support
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol IPMI(ManagerNetworkProtocol100Protocol IPMI) {
    this.IPMI = IPMI;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's IPMI-over-LAN protocol support")
  @JsonProperty("IPMI")
  public ManagerNetworkProtocol100Protocol getIPMI() {
    return IPMI;
  }
  public void setIPMI(ManagerNetworkProtocol100Protocol IPMI) {
    this.IPMI = IPMI;
  }

  
  /**
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol id(ResourceId id) {
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
   * Settings for this Manager's KVM-IP protocol support
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol KVMIP(ManagerNetworkProtocol100Protocol KVMIP) {
    this.KVMIP = KVMIP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's KVM-IP protocol support")
  @JsonProperty("KVMIP")
  public ManagerNetworkProtocol100Protocol getKVMIP() {
    return KVMIP;
  }
  public void setKVMIP(ManagerNetworkProtocol100Protocol KVMIP) {
    this.KVMIP = KVMIP;
  }

  
  /**
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol name(ResourceName name) {
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol oem(ResourceOem oem) {
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
   * Settings for this Manager's SNMP support
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol SNMP(ManagerNetworkProtocol100Protocol SNMP) {
    this.SNMP = SNMP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's SNMP support")
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol SSDP(ManagerNetworkProtocol100SSDProtocol SSDP) {
    this.SSDP = SSDP;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's SSDP support")
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol SSH(ManagerNetworkProtocol100Protocol SSH) {
    this.SSH = SSH;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's SSH (Secure Shell) protocol support")
  @JsonProperty("SSH")
  public ManagerNetworkProtocol100Protocol getSSH() {
    return SSH;
  }
  public void setSSH(ManagerNetworkProtocol100Protocol SSH) {
    this.SSH = SSH;
  }

  
  /**
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol status(ResourceStatus status) {
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
   * Settings for this Manager's Telnet protocol support
   **/
  public ManagerNetworkProtocol100ManagerNetworkProtocol telnet(ManagerNetworkProtocol100Protocol telnet) {
    this.telnet = telnet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's Telnet protocol support")
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
  public ManagerNetworkProtocol100ManagerNetworkProtocol virtualMedia(ManagerNetworkProtocol100Protocol virtualMedia) {
    this.virtualMedia = virtualMedia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for this Manager's Virtual Media support")
  @JsonProperty("VirtualMedia")
  public ManagerNetworkProtocol100Protocol getVirtualMedia() {
    return virtualMedia;
  }
  public void setVirtualMedia(ManagerNetworkProtocol100Protocol virtualMedia) {
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
    ManagerNetworkProtocol100ManagerNetworkProtocol managerNetworkProtocol100ManagerNetworkProtocol = (ManagerNetworkProtocol100ManagerNetworkProtocol) o;
    return Objects.equals(this.odataContext, managerNetworkProtocol100ManagerNetworkProtocol.odataContext) &&
        Objects.equals(this.odataId, managerNetworkProtocol100ManagerNetworkProtocol.odataId) &&
        Objects.equals(this.odataType, managerNetworkProtocol100ManagerNetworkProtocol.odataType) &&
        Objects.equals(this.description, managerNetworkProtocol100ManagerNetworkProtocol.description) &&
        Objects.equals(this.HTTP, managerNetworkProtocol100ManagerNetworkProtocol.HTTP) &&
        Objects.equals(this.HTTPS, managerNetworkProtocol100ManagerNetworkProtocol.HTTPS) &&
        Objects.equals(this.IPMI, managerNetworkProtocol100ManagerNetworkProtocol.IPMI) &&
        Objects.equals(this.id, managerNetworkProtocol100ManagerNetworkProtocol.id) &&
        Objects.equals(this.KVMIP, managerNetworkProtocol100ManagerNetworkProtocol.KVMIP) &&
        Objects.equals(this.name, managerNetworkProtocol100ManagerNetworkProtocol.name) &&
        Objects.equals(this.oem, managerNetworkProtocol100ManagerNetworkProtocol.oem) &&
        Objects.equals(this.SNMP, managerNetworkProtocol100ManagerNetworkProtocol.SNMP) &&
        Objects.equals(this.SSDP, managerNetworkProtocol100ManagerNetworkProtocol.SSDP) &&
        Objects.equals(this.SSH, managerNetworkProtocol100ManagerNetworkProtocol.SSH) &&
        Objects.equals(this.status, managerNetworkProtocol100ManagerNetworkProtocol.status) &&
        Objects.equals(this.telnet, managerNetworkProtocol100ManagerNetworkProtocol.telnet) &&
        Objects.equals(this.virtualMedia, managerNetworkProtocol100ManagerNetworkProtocol.virtualMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, HTTP, HTTPS, IPMI, id, KVMIP, name, oem, SNMP, SSDP, SSH, status, telnet, virtualMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerNetworkProtocol100ManagerNetworkProtocol {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    HTTP: ").append(toIndentedString(HTTP)).append("\n");
    sb.append("    HTTPS: ").append(toIndentedString(HTTPS)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

