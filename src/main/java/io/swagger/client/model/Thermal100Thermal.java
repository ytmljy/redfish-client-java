package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.client.model.Thermal100Fan;
import io.swagger.client.model.Thermal100Temperature;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the schema definition for the Thermal properties.  It represents the properties for Temperature and Cooling.
 **/

@ApiModel(description = "This is the schema definition for the Thermal properties.  It represents the properties for Temperature and Cooling.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Thermal100Thermal   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private List<Thermal100Fan> fans = new ArrayList<Thermal100Fan>();
  private Odata400Count fansodataCount = null;
  private Odata400IdRef fansodataNavigationLink = null;
  private ResourceId id = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private List<RedundancyRedundancy> redundancy = new ArrayList<RedundancyRedundancy>();
  private Odata400Count redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private ResourceStatus status = null;
  private List<Thermal100Temperature> temperatures = new ArrayList<Thermal100Temperature>();
  private Odata400Count temperaturesodataCount = null;
  private Odata400IdRef temperaturesodataNavigationLink = null;

  
  /**
   **/
  public Thermal100Thermal odataContext(Odata400Context odataContext) {
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
  public Thermal100Thermal odataId(Odata400Id odataId) {
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
  public Thermal100Thermal odataType(Odata400Type odataType) {
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
  public Thermal100Thermal description(ResourceDescription description) {
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
   * This is the definition for fans.
   **/
  public Thermal100Thermal fans(List<Thermal100Fan> fans) {
    this.fans = fans;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the definition for fans.")
  @JsonProperty("Fans")
  public List<Thermal100Fan> getFans() {
    return fans;
  }
  public void setFans(List<Thermal100Fan> fans) {
    this.fans = fans;
  }

  
  /**
   **/
  public Thermal100Thermal fansodataCount(Odata400Count fansodataCount) {
    this.fansodataCount = fansodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Fans@odata.count")
  public Odata400Count getFansodataCount() {
    return fansodataCount;
  }
  public void setFansodataCount(Odata400Count fansodataCount) {
    this.fansodataCount = fansodataCount;
  }

  
  /**
   **/
  public Thermal100Thermal fansodataNavigationLink(Odata400IdRef fansodataNavigationLink) {
    this.fansodataNavigationLink = fansodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Fans@odata.navigationLink")
  public Odata400IdRef getFansodataNavigationLink() {
    return fansodataNavigationLink;
  }
  public void setFansodataNavigationLink(Odata400IdRef fansodataNavigationLink) {
    this.fansodataNavigationLink = fansodataNavigationLink;
  }

  
  /**
   **/
  public Thermal100Thermal id(ResourceId id) {
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
  public Thermal100Thermal name(ResourceName name) {
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
  public Thermal100Thermal oem(ResourceOem oem) {
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
   * This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.
   **/
  public Thermal100Thermal redundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.")
  @JsonProperty("Redundancy")
  public List<RedundancyRedundancy> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  public Thermal100Thermal redundancyodataCount(Odata400Count redundancyodataCount) {
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
  public Thermal100Thermal redundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
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
   **/
  public Thermal100Thermal status(ResourceStatus status) {
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
   * This is the definition for temperature sensors.
   **/
  public Thermal100Thermal temperatures(List<Thermal100Temperature> temperatures) {
    this.temperatures = temperatures;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the definition for temperature sensors.")
  @JsonProperty("Temperatures")
  public List<Thermal100Temperature> getTemperatures() {
    return temperatures;
  }
  public void setTemperatures(List<Thermal100Temperature> temperatures) {
    this.temperatures = temperatures;
  }

  
  /**
   **/
  public Thermal100Thermal temperaturesodataCount(Odata400Count temperaturesodataCount) {
    this.temperaturesodataCount = temperaturesodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Temperatures@odata.count")
  public Odata400Count getTemperaturesodataCount() {
    return temperaturesodataCount;
  }
  public void setTemperaturesodataCount(Odata400Count temperaturesodataCount) {
    this.temperaturesodataCount = temperaturesodataCount;
  }

  
  /**
   **/
  public Thermal100Thermal temperaturesodataNavigationLink(Odata400IdRef temperaturesodataNavigationLink) {
    this.temperaturesodataNavigationLink = temperaturesodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Temperatures@odata.navigationLink")
  public Odata400IdRef getTemperaturesodataNavigationLink() {
    return temperaturesodataNavigationLink;
  }
  public void setTemperaturesodataNavigationLink(Odata400IdRef temperaturesodataNavigationLink) {
    this.temperaturesodataNavigationLink = temperaturesodataNavigationLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thermal100Thermal thermal100Thermal = (Thermal100Thermal) o;
    return Objects.equals(this.odataContext, thermal100Thermal.odataContext) &&
        Objects.equals(this.odataId, thermal100Thermal.odataId) &&
        Objects.equals(this.odataType, thermal100Thermal.odataType) &&
        Objects.equals(this.description, thermal100Thermal.description) &&
        Objects.equals(this.fans, thermal100Thermal.fans) &&
        Objects.equals(this.fansodataCount, thermal100Thermal.fansodataCount) &&
        Objects.equals(this.fansodataNavigationLink, thermal100Thermal.fansodataNavigationLink) &&
        Objects.equals(this.id, thermal100Thermal.id) &&
        Objects.equals(this.name, thermal100Thermal.name) &&
        Objects.equals(this.oem, thermal100Thermal.oem) &&
        Objects.equals(this.redundancy, thermal100Thermal.redundancy) &&
        Objects.equals(this.redundancyodataCount, thermal100Thermal.redundancyodataCount) &&
        Objects.equals(this.redundancyodataNavigationLink, thermal100Thermal.redundancyodataNavigationLink) &&
        Objects.equals(this.status, thermal100Thermal.status) &&
        Objects.equals(this.temperatures, thermal100Thermal.temperatures) &&
        Objects.equals(this.temperaturesodataCount, thermal100Thermal.temperaturesodataCount) &&
        Objects.equals(this.temperaturesodataNavigationLink, thermal100Thermal.temperaturesodataNavigationLink);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

