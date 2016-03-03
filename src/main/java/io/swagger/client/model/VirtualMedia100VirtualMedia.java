package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.VirtualMedia100ConnectedVia;
import io.swagger.client.model.VirtualMedia100MediaType;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the schema definition for the Virtual Media Service.
 **/

@ApiModel(description = "This is the schema definition for the Virtual Media Service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class VirtualMedia100VirtualMedia   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private VirtualMedia100ConnectedVia connectedVia = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private List<VirtualMedia100MediaType> mediaTypes = new ArrayList<VirtualMedia100MediaType>();
  private ResourceName name = null;
  private ResourceOem oem = null;

  
  /**
   **/
  public VirtualMedia100VirtualMedia odataContext(Odata400Context odataContext) {
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
  public VirtualMedia100VirtualMedia odataId(Odata400Id odataId) {
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
  public VirtualMedia100VirtualMedia odataType(Odata400Type odataType) {
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
   * Current virtual media connection methods
   **/
  public VirtualMedia100VirtualMedia connectedVia(VirtualMedia100ConnectedVia connectedVia) {
    this.connectedVia = connectedVia;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current virtual media connection methods")
  @JsonProperty("ConnectedVia")
  public VirtualMedia100ConnectedVia getConnectedVia() {
    return connectedVia;
  }
  public void setConnectedVia(VirtualMedia100ConnectedVia connectedVia) {
    this.connectedVia = connectedVia;
  }

  
  /**
   **/
  public VirtualMedia100VirtualMedia description(ResourceDescription description) {
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
   **/
  public VirtualMedia100VirtualMedia id(ResourceId id) {
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
   * This is the media types supported as virtual media.
   **/
  public VirtualMedia100VirtualMedia mediaTypes(List<VirtualMedia100MediaType> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the media types supported as virtual media.")
  @JsonProperty("MediaTypes")
  public List<VirtualMedia100MediaType> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<VirtualMedia100MediaType> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  /**
   **/
  public VirtualMedia100VirtualMedia name(ResourceName name) {
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
  public VirtualMedia100VirtualMedia oem(ResourceOem oem) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualMedia100VirtualMedia virtualMedia100VirtualMedia = (VirtualMedia100VirtualMedia) o;
    return Objects.equals(this.odataContext, virtualMedia100VirtualMedia.odataContext) &&
        Objects.equals(this.odataId, virtualMedia100VirtualMedia.odataId) &&
        Objects.equals(this.odataType, virtualMedia100VirtualMedia.odataType) &&
        Objects.equals(this.connectedVia, virtualMedia100VirtualMedia.connectedVia) &&
        Objects.equals(this.description, virtualMedia100VirtualMedia.description) &&
        Objects.equals(this.id, virtualMedia100VirtualMedia.id) &&
        Objects.equals(this.mediaTypes, virtualMedia100VirtualMedia.mediaTypes) &&
        Objects.equals(this.name, virtualMedia100VirtualMedia.name) &&
        Objects.equals(this.oem, virtualMedia100VirtualMedia.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, connectedVia, description, id, mediaTypes, name, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualMedia100VirtualMedia {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    connectedVia: ").append(toIndentedString(connectedVia)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

