package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.EthernetInterface100IPv6AddressPolicyEntry;
import io.swagger.client.model.IPAddresses100IPv4Address;
import io.swagger.client.model.IPAddresses100IPv6Address;
import io.swagger.client.model.IPAddresses100IPv6StaticAddress;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.VLanNetworkInterface100VLAN;
import io.swagger.client.model.VLanNetworkInterfaceCollectionVLanNetworkInterfaceCollection;
import java.math.BigDecimal;
import java.util.*;



/**
 * This schema defines a simple ethernet NIC resource.
 **/

@ApiModel(description = "This schema defines a simple ethernet NIC resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class EthernetInterface100EthernetInterface   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private Boolean autoNeg = null;
  private String description = null;
  private String FQDN = null;
  private Boolean fullDuplex = null;
  private String hostName = null;
  private List<IPAddresses100IPv4Address> iPv4Addresses = new ArrayList<IPAddresses100IPv4Address>();
  private List<EthernetInterface100IPv6AddressPolicyEntry> iPv6AddressPolicyTable = new ArrayList<EthernetInterface100IPv6AddressPolicyEntry>();
  private List<IPAddresses100IPv6Address> iPv6Addresses = new ArrayList<IPAddresses100IPv6Address>();
  private String iPv6DefaultGateway = null;
  private List<IPAddresses100IPv6StaticAddress> iPv6StaticAddresses = new ArrayList<IPAddresses100IPv6StaticAddress>();
  private String id = null;
  private Boolean interfaceEnabled = null;
  private String mACAddress = null;
  private BigDecimal mTUSize = null;
  private BigDecimal maxIPv6StaticAddresses = null;
  private String name = null;
  private List<String> nameServers = new ArrayList<String>();
  private ResourceOem oem = null;
  private String permanentMACAddress = null;
  private BigDecimal speedMbps = null;
  private ResourceStatus status = null;
  private String uefiDevicePath = null;
  private VLanNetworkInterface100VLAN VLAN = null;
  private VLanNetworkInterfaceCollectionVLanNetworkInterfaceCollection vLANs = null;

  
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
   * This indicates if the speed and duplex are automatically negotiated and configured on this interface.
   **/
  
  @ApiModelProperty(value = "This indicates if the speed and duplex are automatically negotiated and configured on this interface.")
  @JsonProperty("AutoNeg")
  public Boolean getAutoNeg() {
    return autoNeg;
  }
  public void setAutoNeg(Boolean autoNeg) {
    this.autoNeg = autoNeg;
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
   * This is the complete, fully qualified domain name obtained by DNS for this interface.
   **/
  
  @ApiModelProperty(value = "This is the complete, fully qualified domain name obtained by DNS for this interface.")
  @JsonProperty("FQDN")
  public String getFQDN() {
    return FQDN;
  }
  public void setFQDN(String FQDN) {
    this.FQDN = FQDN;
  }

  
  /**
   * This indicates if the interface is in Full Duplex mode or not.
   **/
  
  @ApiModelProperty(value = "This indicates if the interface is in Full Duplex mode or not.")
  @JsonProperty("FullDuplex")
  public Boolean getFullDuplex() {
    return fullDuplex;
  }
  public void setFullDuplex(Boolean fullDuplex) {
    this.fullDuplex = fullDuplex;
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
   * The IPv4 addresses assigned to this interface
   **/
  
  @ApiModelProperty(value = "The IPv4 addresses assigned to this interface")
  @JsonProperty("IPv4Addresses")
  public List<IPAddresses100IPv4Address> getIPv4Addresses() {
    return iPv4Addresses;
  }
  public void setIPv4Addresses(List<IPAddresses100IPv4Address> iPv4Addresses) {
    this.iPv4Addresses = iPv4Addresses;
  }

  
  /**
   * An array representing the RFC3484 Address Selection Policy Table.
   **/
  
  @ApiModelProperty(value = "An array representing the RFC3484 Address Selection Policy Table.")
  @JsonProperty("IPv6AddressPolicyTable")
  public List<EthernetInterface100IPv6AddressPolicyEntry> getIPv6AddressPolicyTable() {
    return iPv6AddressPolicyTable;
  }
  public void setIPv6AddressPolicyTable(List<EthernetInterface100IPv6AddressPolicyEntry> iPv6AddressPolicyTable) {
    this.iPv6AddressPolicyTable = iPv6AddressPolicyTable;
  }

  
  /**
   * This array of objects enumerates all of the currently assigned IPv6 addresses on this interface.
   **/
  
  @ApiModelProperty(value = "This array of objects enumerates all of the currently assigned IPv6 addresses on this interface.")
  @JsonProperty("IPv6Addresses")
  public List<IPAddresses100IPv6Address> getIPv6Addresses() {
    return iPv6Addresses;
  }
  public void setIPv6Addresses(List<IPAddresses100IPv6Address> iPv6Addresses) {
    this.iPv6Addresses = iPv6Addresses;
  }

  
  /**
   * This is the IPv6 default gateway address that is currently in use on this interface.
   **/
  
  @ApiModelProperty(value = "This is the IPv6 default gateway address that is currently in use on this interface.")
  @JsonProperty("IPv6DefaultGateway")
  public String getIPv6DefaultGateway() {
    return iPv6DefaultGateway;
  }
  public void setIPv6DefaultGateway(String iPv6DefaultGateway) {
    this.iPv6DefaultGateway = iPv6DefaultGateway;
  }

  
  /**
   * This array of objects represents all of the IPv6 static addresses to be assigned on this interface.
   **/
  
  @ApiModelProperty(value = "This array of objects represents all of the IPv6 static addresses to be assigned on this interface.")
  @JsonProperty("IPv6StaticAddresses")
  public List<IPAddresses100IPv6StaticAddress> getIPv6StaticAddresses() {
    return iPv6StaticAddresses;
  }
  public void setIPv6StaticAddresses(List<IPAddresses100IPv6StaticAddress> iPv6StaticAddresses) {
    this.iPv6StaticAddresses = iPv6StaticAddresses;
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
   * This indicates whether this interface is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates whether this interface is enabled.")
  @JsonProperty("InterfaceEnabled")
  public Boolean getInterfaceEnabled() {
    return interfaceEnabled;
  }
  public void setInterfaceEnabled(Boolean interfaceEnabled) {
    this.interfaceEnabled = interfaceEnabled;
  }

  
  /**
   * This is the currently configured MAC address of the (logical port) interface.
   **/
  
  @ApiModelProperty(value = "This is the currently configured MAC address of the (logical port) interface.")
  @JsonProperty("MACAddress")
  public String getMACAddress() {
    return mACAddress;
  }
  public void setMACAddress(String mACAddress) {
    this.mACAddress = mACAddress;
  }

  
  /**
   * This is the currently configured Maximum Transmission Unit (MTU) in bytes on this interface.
   **/
  
  @ApiModelProperty(value = "This is the currently configured Maximum Transmission Unit (MTU) in bytes on this interface.")
  @JsonProperty("MTUSize")
  public BigDecimal getMTUSize() {
    return mTUSize;
  }
  public void setMTUSize(BigDecimal mTUSize) {
    this.mTUSize = mTUSize;
  }

  
  /**
   * This indicates the maximum number of Static IPv6 addresses that can be configured on this interface.
   **/
  
  @ApiModelProperty(value = "This indicates the maximum number of Static IPv6 addresses that can be configured on this interface.")
  @JsonProperty("MaxIPv6StaticAddresses")
  public BigDecimal getMaxIPv6StaticAddresses() {
    return maxIPv6StaticAddresses;
  }
  public void setMaxIPv6StaticAddresses(BigDecimal maxIPv6StaticAddresses) {
    this.maxIPv6StaticAddresses = maxIPv6StaticAddresses;
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
   * This represents DNS name servers that are currently in use on this interface.
   **/
  
  @ApiModelProperty(value = "This represents DNS name servers that are currently in use on this interface.")
  @JsonProperty("NameServers")
  public List<String> getNameServers() {
    return nameServers;
  }
  public void setNameServers(List<String> nameServers) {
    this.nameServers = nameServers;
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
   * This is the permanent MAC address assigned to this interface (port)
   **/
  
  @ApiModelProperty(value = "This is the permanent MAC address assigned to this interface (port)")
  @JsonProperty("PermanentMACAddress")
  public String getPermanentMACAddress() {
    return permanentMACAddress;
  }
  public void setPermanentMACAddress(String permanentMACAddress) {
    this.permanentMACAddress = permanentMACAddress;
  }

  
  /**
   * This is the current speed in Mbps of this interface.
   **/
  
  @ApiModelProperty(value = "This is the current speed in Mbps of this interface.")
  @JsonProperty("SpeedMbps")
  public BigDecimal getSpeedMbps() {
    return speedMbps;
  }
  public void setSpeedMbps(BigDecimal speedMbps) {
    this.speedMbps = speedMbps;
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
   * The UEFI device path for this interface
   **/
  
  @ApiModelProperty(value = "The UEFI device path for this interface")
  @JsonProperty("UefiDevicePath")
  public String getUefiDevicePath() {
    return uefiDevicePath;
  }
  public void setUefiDevicePath(String uefiDevicePath) {
    this.uefiDevicePath = uefiDevicePath;
  }

  
  /**
   * If this Network Interface supports more than one VLAN, this property will not be present and the client should look for VLANs collection in the link section of this resource.
   **/
  
  @ApiModelProperty(value = "If this Network Interface supports more than one VLAN, this property will not be present and the client should look for VLANs collection in the link section of this resource.")
  @JsonProperty("VLAN")
  public VLanNetworkInterface100VLAN getVLAN() {
    return VLAN;
  }
  public void setVLAN(VLanNetworkInterface100VLAN VLAN) {
    this.VLAN = VLAN;
  }

  
  /**
   * This is a reference to a collection of VLANs and is only used if the interface supports more than one VLANs.
   **/
  
  @ApiModelProperty(value = "This is a reference to a collection of VLANs and is only used if the interface supports more than one VLANs.")
  @JsonProperty("VLANs")
  public VLanNetworkInterfaceCollectionVLanNetworkInterfaceCollection getVLANs() {
    return vLANs;
  }
  public void setVLANs(VLanNetworkInterfaceCollectionVLanNetworkInterfaceCollection vLANs) {
    this.vLANs = vLANs;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EthernetInterface100EthernetInterface ethernetInterface100EthernetInterface = (EthernetInterface100EthernetInterface) o;
    return Objects.equals(odataContext, ethernetInterface100EthernetInterface.odataContext) &&
        Objects.equals(odataId, ethernetInterface100EthernetInterface.odataId) &&
        Objects.equals(odataType, ethernetInterface100EthernetInterface.odataType) &&
        Objects.equals(autoNeg, ethernetInterface100EthernetInterface.autoNeg) &&
        Objects.equals(description, ethernetInterface100EthernetInterface.description) &&
        Objects.equals(FQDN, ethernetInterface100EthernetInterface.FQDN) &&
        Objects.equals(fullDuplex, ethernetInterface100EthernetInterface.fullDuplex) &&
        Objects.equals(hostName, ethernetInterface100EthernetInterface.hostName) &&
        Objects.equals(iPv4Addresses, ethernetInterface100EthernetInterface.iPv4Addresses) &&
        Objects.equals(iPv6AddressPolicyTable, ethernetInterface100EthernetInterface.iPv6AddressPolicyTable) &&
        Objects.equals(iPv6Addresses, ethernetInterface100EthernetInterface.iPv6Addresses) &&
        Objects.equals(iPv6DefaultGateway, ethernetInterface100EthernetInterface.iPv6DefaultGateway) &&
        Objects.equals(iPv6StaticAddresses, ethernetInterface100EthernetInterface.iPv6StaticAddresses) &&
        Objects.equals(id, ethernetInterface100EthernetInterface.id) &&
        Objects.equals(interfaceEnabled, ethernetInterface100EthernetInterface.interfaceEnabled) &&
        Objects.equals(mACAddress, ethernetInterface100EthernetInterface.mACAddress) &&
        Objects.equals(mTUSize, ethernetInterface100EthernetInterface.mTUSize) &&
        Objects.equals(maxIPv6StaticAddresses, ethernetInterface100EthernetInterface.maxIPv6StaticAddresses) &&
        Objects.equals(name, ethernetInterface100EthernetInterface.name) &&
        Objects.equals(nameServers, ethernetInterface100EthernetInterface.nameServers) &&
        Objects.equals(oem, ethernetInterface100EthernetInterface.oem) &&
        Objects.equals(permanentMACAddress, ethernetInterface100EthernetInterface.permanentMACAddress) &&
        Objects.equals(speedMbps, ethernetInterface100EthernetInterface.speedMbps) &&
        Objects.equals(status, ethernetInterface100EthernetInterface.status) &&
        Objects.equals(uefiDevicePath, ethernetInterface100EthernetInterface.uefiDevicePath) &&
        Objects.equals(VLAN, ethernetInterface100EthernetInterface.VLAN) &&
        Objects.equals(vLANs, ethernetInterface100EthernetInterface.vLANs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, autoNeg, description, FQDN, fullDuplex, hostName, iPv4Addresses, iPv6AddressPolicyTable, iPv6Addresses, iPv6DefaultGateway, iPv6StaticAddresses, id, interfaceEnabled, mACAddress, mTUSize, maxIPv6StaticAddresses, name, nameServers, oem, permanentMACAddress, speedMbps, status, uefiDevicePath, VLAN, vLANs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthernetInterface100EthernetInterface {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    autoNeg: ").append(toIndentedString(autoNeg)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    FQDN: ").append(toIndentedString(FQDN)).append("\n");
    sb.append("    fullDuplex: ").append(toIndentedString(fullDuplex)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    iPv4Addresses: ").append(toIndentedString(iPv4Addresses)).append("\n");
    sb.append("    iPv6AddressPolicyTable: ").append(toIndentedString(iPv6AddressPolicyTable)).append("\n");
    sb.append("    iPv6Addresses: ").append(toIndentedString(iPv6Addresses)).append("\n");
    sb.append("    iPv6DefaultGateway: ").append(toIndentedString(iPv6DefaultGateway)).append("\n");
    sb.append("    iPv6StaticAddresses: ").append(toIndentedString(iPv6StaticAddresses)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interfaceEnabled: ").append(toIndentedString(interfaceEnabled)).append("\n");
    sb.append("    mACAddress: ").append(toIndentedString(mACAddress)).append("\n");
    sb.append("    mTUSize: ").append(toIndentedString(mTUSize)).append("\n");
    sb.append("    maxIPv6StaticAddresses: ").append(toIndentedString(maxIPv6StaticAddresses)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    permanentMACAddress: ").append(toIndentedString(permanentMACAddress)).append("\n");
    sb.append("    speedMbps: ").append(toIndentedString(speedMbps)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uefiDevicePath: ").append(toIndentedString(uefiDevicePath)).append("\n");
    sb.append("    VLAN: ").append(toIndentedString(VLAN)).append("\n");
    sb.append("    vLANs: ").append(toIndentedString(vLANs)).append("\n");
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

