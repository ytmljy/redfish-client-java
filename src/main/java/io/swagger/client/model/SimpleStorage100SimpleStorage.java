package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.SimpleStorage100Device;
import java.util.*;



/**
 * This is the schema definition for the Simple Storage resource.  It represents the properties of a storage controller and its directly-attached devices.
 **/

@ApiModel(description = "This is the schema definition for the Simple Storage resource.  It represents the properties of a storage controller and its directly-attached devices.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class SimpleStorage100SimpleStorage   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private List<SimpleStorage100Device> devices = new ArrayList<SimpleStorage100Device>();
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;
  private ResourceStatus status = null;
  private String uefiDevicePath = null;

  
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
   * The storage devices associated with this resource
   **/
  
  @ApiModelProperty(value = "The storage devices associated with this resource")
  @JsonProperty("Devices")
  public List<SimpleStorage100Device> getDevices() {
    return devices;
  }
  public void setDevices(List<SimpleStorage100Device> devices) {
    this.devices = devices;
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
   * The UEFI device path used to access this storage controller.
   **/
  
  @ApiModelProperty(value = "The UEFI device path used to access this storage controller.")
  @JsonProperty("UefiDevicePath")
  public String getUefiDevicePath() {
    return uefiDevicePath;
  }
  public void setUefiDevicePath(String uefiDevicePath) {
    this.uefiDevicePath = uefiDevicePath;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleStorage100SimpleStorage simpleStorage100SimpleStorage = (SimpleStorage100SimpleStorage) o;
    return Objects.equals(odataContext, simpleStorage100SimpleStorage.odataContext) &&
        Objects.equals(odataId, simpleStorage100SimpleStorage.odataId) &&
        Objects.equals(odataType, simpleStorage100SimpleStorage.odataType) &&
        Objects.equals(description, simpleStorage100SimpleStorage.description) &&
        Objects.equals(devices, simpleStorage100SimpleStorage.devices) &&
        Objects.equals(id, simpleStorage100SimpleStorage.id) &&
        Objects.equals(name, simpleStorage100SimpleStorage.name) &&
        Objects.equals(oem, simpleStorage100SimpleStorage.oem) &&
        Objects.equals(status, simpleStorage100SimpleStorage.status) &&
        Objects.equals(uefiDevicePath, simpleStorage100SimpleStorage.uefiDevicePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, devices, id, name, oem, status, uefiDevicePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleStorage100SimpleStorage {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uefiDevicePath: ").append(toIndentedString(uefiDevicePath)).append("\n");
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

