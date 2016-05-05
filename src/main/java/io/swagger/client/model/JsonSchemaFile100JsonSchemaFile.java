package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.JsonSchemaFile100Location;
import io.swagger.client.model.ResourceOem;
import java.util.*;



/**
 * This is the schema definition for the Schema File locator resource.
 **/

@ApiModel(description = "This is the schema definition for the Schema File locator resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class JsonSchemaFile100JsonSchemaFile   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;
  private List<String> languages = new ArrayList<String>();
  private List<JsonSchemaFile100Location> location = new ArrayList<JsonSchemaFile100Location>();
  private String name = null;
  private ResourceOem oem = null;
  private String schema = null;

  
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
  public List<JsonSchemaFile100Location> getLocation() {
    return location;
  }
  public void setLocation(List<JsonSchemaFile100Location> location) {
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
   * The type name this schema describes.
   **/
  
  @ApiModelProperty(required = true, value = "The type name this schema describes.")
  @JsonProperty("Schema")
  public String getSchema() {
    return schema;
  }
  public void setSchema(String schema) {
    this.schema = schema;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaFile100JsonSchemaFile jsonSchemaFile100JsonSchemaFile = (JsonSchemaFile100JsonSchemaFile) o;
    return Objects.equals(odataContext, jsonSchemaFile100JsonSchemaFile.odataContext) &&
        Objects.equals(odataId, jsonSchemaFile100JsonSchemaFile.odataId) &&
        Objects.equals(odataType, jsonSchemaFile100JsonSchemaFile.odataType) &&
        Objects.equals(description, jsonSchemaFile100JsonSchemaFile.description) &&
        Objects.equals(id, jsonSchemaFile100JsonSchemaFile.id) &&
        Objects.equals(languages, jsonSchemaFile100JsonSchemaFile.languages) &&
        Objects.equals(location, jsonSchemaFile100JsonSchemaFile.location) &&
        Objects.equals(name, jsonSchemaFile100JsonSchemaFile.name) &&
        Objects.equals(oem, jsonSchemaFile100JsonSchemaFile.oem) &&
        Objects.equals(schema, jsonSchemaFile100JsonSchemaFile.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, languages, location, name, oem, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaFile100JsonSchemaFile {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

