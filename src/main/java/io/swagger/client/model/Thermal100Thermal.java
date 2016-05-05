package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.Thermal100Fan;
import io.swagger.client.model.Thermal100Temperature;
import java.math.BigDecimal;
import java.util.*;



/**
 * This is the schema definition for the Thermal properties.  It represents the properties for Temperature and Cooling.
 **/

@ApiModel(description = "This is the schema definition for the Thermal properties.  It represents the properties for Temperature and Cooling.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Thermal100Thermal   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private List<Thermal100Fan> fans = new ArrayList<Thermal100Fan>();
  private BigDecimal fansodataCount = null;
  private Odata400IdRef fansodataNavigationLink = null;
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;
  private List<Odata400IdRef> redundancy = new ArrayList<Odata400IdRef>();
  private BigDecimal redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private ResourceStatus status = null;
  private List<Thermal100Temperature> temperatures = new ArrayList<Thermal100Temperature>();
  private BigDecimal temperaturesodataCount = null;
  private Odata400IdRef temperaturesodataNavigationLink = null;

  
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
   * This is the definition for fans.
   **/
  
  @ApiModelProperty(value = "This is the definition for fans.")
  @JsonProperty("Fans")
  public List<Thermal100Fan> getFans() {
    return fans;
  }
  public void setFans(List<Thermal100Fan> fans) {
    this.fans = fans;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Fans@odata.count")
  public BigDecimal getFansodataCount() {
    return fansodataCount;
  }
  public void setFansodataCount(BigDecimal fansodataCount) {
    this.fansodataCount = fansodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Fans@odata.navigationLink")
  public Odata400IdRef getFansodataNavigationLink() {
    return fansodataNavigationLink;
  }
  public void setFansodataNavigationLink(Odata400IdRef fansodataNavigationLink) {
    this.fansodataNavigationLink = fansodataNavigationLink;
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
   * This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.
   **/
  
  @ApiModelProperty(value = "This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.")
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
   * This is the definition for temperature sensors.
   **/
  
  @ApiModelProperty(value = "This is the definition for temperature sensors.")
  @JsonProperty("Temperatures")
  public List<Thermal100Temperature> getTemperatures() {
    return temperatures;
  }
  public void setTemperatures(List<Thermal100Temperature> temperatures) {
    this.temperatures = temperatures;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Temperatures@odata.count")
  public BigDecimal getTemperaturesodataCount() {
    return temperaturesodataCount;
  }
  public void setTemperaturesodataCount(BigDecimal temperaturesodataCount) {
    this.temperaturesodataCount = temperaturesodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Temperatures@odata.navigationLink")
  public Odata400IdRef getTemperaturesodataNavigationLink() {
    return temperaturesodataNavigationLink;
  }
  public void setTemperaturesodataNavigationLink(Odata400IdRef temperaturesodataNavigationLink) {
    this.temperaturesodataNavigationLink = temperaturesodataNavigationLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thermal100Thermal thermal100Thermal = (Thermal100Thermal) o;
    return Objects.equals(odataContext, thermal100Thermal.odataContext) &&
        Objects.equals(odataId, thermal100Thermal.odataId) &&
        Objects.equals(odataType, thermal100Thermal.odataType) &&
        Objects.equals(description, thermal100Thermal.description) &&
        Objects.equals(fans, thermal100Thermal.fans) &&
        Objects.equals(fansodataCount, thermal100Thermal.fansodataCount) &&
        Objects.equals(fansodataNavigationLink, thermal100Thermal.fansodataNavigationLink) &&
        Objects.equals(id, thermal100Thermal.id) &&
        Objects.equals(name, thermal100Thermal.name) &&
        Objects.equals(oem, thermal100Thermal.oem) &&
        Objects.equals(redundancy, thermal100Thermal.redundancy) &&
        Objects.equals(redundancyodataCount, thermal100Thermal.redundancyodataCount) &&
        Objects.equals(redundancyodataNavigationLink, thermal100Thermal.redundancyodataNavigationLink) &&
        Objects.equals(status, thermal100Thermal.status) &&
        Objects.equals(temperatures, thermal100Thermal.temperatures) &&
        Objects.equals(temperaturesodataCount, thermal100Thermal.temperaturesodataCount) &&
        Objects.equals(temperaturesodataNavigationLink, thermal100Thermal.temperaturesodataNavigationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, fans, fansodataCount, fansodataNavigationLink, id, name, oem, redundancy, redundancyodataCount, redundancyodataNavigationLink, status, temperatures, temperaturesodataCount, temperaturesodataNavigationLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thermal100Thermal {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fans: ").append(toIndentedString(fans)).append("\n");
    sb.append("    fansodataCount: ").append(toIndentedString(fansodataCount)).append("\n");
    sb.append("    fansodataNavigationLink: ").append(toIndentedString(fansodataNavigationLink)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    temperatures: ").append(toIndentedString(temperatures)).append("\n");
    sb.append("    temperaturesodataCount: ").append(toIndentedString(temperaturesodataCount)).append("\n");
    sb.append("    temperaturesodataNavigationLink: ").append(toIndentedString(temperaturesodataNavigationLink)).append("\n");
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

