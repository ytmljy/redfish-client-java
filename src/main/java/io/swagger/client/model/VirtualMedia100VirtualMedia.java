package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.util.*;



/**
 * This is the schema definition for the Virtual Media Service.
 **/

@ApiModel(description = "This is the schema definition for the Virtual Media Service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class VirtualMedia100VirtualMedia   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;


  public enum ConnectedViaEnum {
    NOTCONNECTED("NotConnected"),
    URI("URI"),
    APPLET("Applet"),
    OEM("Oem");

    private String value;

    ConnectedViaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ConnectedViaEnum connectedVia = null;
  private String description = null;
  private String id = null;
  private String image = null;
  private String imageName = null;
  private Boolean inserted = null;


  public enum MediaTypesEnum {
    CD("CD"),
    FLOPPY("Floppy"),
    USBSTICK("USBStick"),
    DVD("DVD");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private String name = null;
  private ResourceOem oem = null;
  private Boolean writeProtected = null;

  
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
   * Current virtual media connection methods
   **/
  
  @ApiModelProperty(value = "Current virtual media connection methods")
  @JsonProperty("ConnectedVia")
  public ConnectedViaEnum getConnectedVia() {
    return connectedVia;
  }
  public void setConnectedVia(ConnectedViaEnum connectedVia) {
    this.connectedVia = connectedVia;
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
   * A URI providing the location of the selected image
   **/
  
  @ApiModelProperty(value = "A URI providing the location of the selected image")
  @JsonProperty("Image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * The current image name
   **/
  
  @ApiModelProperty(value = "The current image name")
  @JsonProperty("ImageName")
  public String getImageName() {
    return imageName;
  }
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  
  /**
   * Indicates if virtual media is inserted in the virtual device.
   **/
  
  @ApiModelProperty(value = "Indicates if virtual media is inserted in the virtual device.")
  @JsonProperty("Inserted")
  public Boolean getInserted() {
    return inserted;
  }
  public void setInserted(Boolean inserted) {
    this.inserted = inserted;
  }

  
  /**
   * This is the media types supported as virtual media.
   **/
  
  @ApiModelProperty(value = "This is the media types supported as virtual media.")
  @JsonProperty("MediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
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
   * Indicates the media is write protected.
   **/
  
  @ApiModelProperty(value = "Indicates the media is write protected.")
  @JsonProperty("WriteProtected")
  public Boolean getWriteProtected() {
    return writeProtected;
  }
  public void setWriteProtected(Boolean writeProtected) {
    this.writeProtected = writeProtected;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualMedia100VirtualMedia virtualMedia100VirtualMedia = (VirtualMedia100VirtualMedia) o;
    return Objects.equals(odataContext, virtualMedia100VirtualMedia.odataContext) &&
        Objects.equals(odataId, virtualMedia100VirtualMedia.odataId) &&
        Objects.equals(odataType, virtualMedia100VirtualMedia.odataType) &&
        Objects.equals(connectedVia, virtualMedia100VirtualMedia.connectedVia) &&
        Objects.equals(description, virtualMedia100VirtualMedia.description) &&
        Objects.equals(id, virtualMedia100VirtualMedia.id) &&
        Objects.equals(image, virtualMedia100VirtualMedia.image) &&
        Objects.equals(imageName, virtualMedia100VirtualMedia.imageName) &&
        Objects.equals(inserted, virtualMedia100VirtualMedia.inserted) &&
        Objects.equals(mediaTypes, virtualMedia100VirtualMedia.mediaTypes) &&
        Objects.equals(name, virtualMedia100VirtualMedia.name) &&
        Objects.equals(oem, virtualMedia100VirtualMedia.oem) &&
        Objects.equals(writeProtected, virtualMedia100VirtualMedia.writeProtected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, connectedVia, description, id, image, imageName, inserted, mediaTypes, name, oem, writeProtected);
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
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    inserted: ").append(toIndentedString(inserted)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    writeProtected: ").append(toIndentedString(writeProtected)).append("\n");
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

