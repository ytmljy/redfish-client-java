package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.MessageRegistryFile100Location;
import io.swagger.client.model.ResourceOem;
import java.util.*;



/**
 * This is the schema definition for the Schema File locator resource.
 **/

@ApiModel(description = "This is the schema definition for the Schema File locator resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class MessageRegistryFile100MessageRegistryFile   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;
  private List<String> languages = new ArrayList<String>();
  private List<MessageRegistryFile100Location> location = new ArrayList<MessageRegistryFile100Location>();
  private String name = null;
  private ResourceOem oem = null;
  private String registry = null;

  
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
   * Language codes for the schemas available.
   **/
  
  @ApiModelProperty(required = true, value = "Language codes for the schemas available.")
  @JsonProperty("Languages")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  
  /**
   * Location information for this schema file.
   **/
  
  @ApiModelProperty(required = true, value = "Location information for this schema file.")
  @JsonProperty("Location")
  public List<MessageRegistryFile100Location> getLocation() {
    return location;
  }
  public void setLocation(List<MessageRegistryFile100Location> location) {
    this.location = location;
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
   * The Registry Name, Major and Minor version used in MessageID construction.
   **/
  
  @ApiModelProperty(required = true, value = "The Registry Name, Major and Minor version used in MessageID construction.")
  @JsonProperty("Registry")
  public String getRegistry() {
    return registry;
  }
  public void setRegistry(String registry) {
    this.registry = registry;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRegistryFile100MessageRegistryFile messageRegistryFile100MessageRegistryFile = (MessageRegistryFile100MessageRegistryFile) o;
    return Objects.equals(odataContext, messageRegistryFile100MessageRegistryFile.odataContext) &&
        Objects.equals(odataId, messageRegistryFile100MessageRegistryFile.odataId) &&
        Objects.equals(odataType, messageRegistryFile100MessageRegistryFile.odataType) &&
        Objects.equals(description, messageRegistryFile100MessageRegistryFile.description) &&
        Objects.equals(id, messageRegistryFile100MessageRegistryFile.id) &&
        Objects.equals(languages, messageRegistryFile100MessageRegistryFile.languages) &&
        Objects.equals(location, messageRegistryFile100MessageRegistryFile.location) &&
        Objects.equals(name, messageRegistryFile100MessageRegistryFile.name) &&
        Objects.equals(oem, messageRegistryFile100MessageRegistryFile.oem) &&
        Objects.equals(registry, messageRegistryFile100MessageRegistryFile.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, languages, location, name, oem, registry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRegistryFile100MessageRegistryFile {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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

