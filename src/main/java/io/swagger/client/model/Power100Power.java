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
import io.swagger.client.model.Power100PowerControl;
import io.swagger.client.model.Power100PowerSupply;
import io.swagger.client.model.Power100Voltage;
import io.swagger.client.model.RedundancyRedundancy;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the schema definition for the Power Metrics.  It represents the properties for Power Consumption and Power Limiting.
 **/

@ApiModel(description = "This is the schema definition for the Power Metrics.  It represents the properties for Power Consumption and Power Limiting.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Power100Power   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private List<Power100PowerControl> powerControl = new ArrayList<Power100PowerControl>();
  private Odata400Count powerControlodataCount = null;
  private Odata400IdRef powerControlodataNavigationLink = null;
  private List<Power100PowerSupply> powerSupplies = new ArrayList<Power100PowerSupply>();
  private Odata400Count powerSuppliesodataCount = null;
  private Odata400IdRef powerSuppliesodataNavigationLink = null;
  private List<RedundancyRedundancy> redundancy = new ArrayList<RedundancyRedundancy>();
  private Odata400Count redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Power100Voltage> voltages = new ArrayList<Power100Voltage>();
  private Odata400Count voltagesodataCount = null;
  private Odata400IdRef voltagesodataNavigationLink = null;

  
  /**
   **/
  public Power100Power odataContext(Odata400Context odataContext) {
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
  public Power100Power odataId(Odata400Id odataId) {
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
  public Power100Power odataType(Odata400Type odataType) {
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
  public Power100Power description(ResourceDescription description) {
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
  public Power100Power id(ResourceId id) {
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
  public Power100Power name(ResourceName name) {
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
  public Power100Power oem(ResourceOem oem) {
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
   * This is the definition for power control function (power reading/limiting).
   **/
  public Power100Power powerControl(List<Power100PowerControl> powerControl) {
    this.powerControl = powerControl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the definition for power control function (power reading/limiting).")
  @JsonProperty("PowerControl")
  public List<Power100PowerControl> getPowerControl() {
    return powerControl;
  }
  public void setPowerControl(List<Power100PowerControl> powerControl) {
    this.powerControl = powerControl;
  }

  
  /**
   **/
  public Power100Power powerControlodataCount(Odata400Count powerControlodataCount) {
    this.powerControlodataCount = powerControlodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PowerControl@odata.count")
  public Odata400Count getPowerControlodataCount() {
    return powerControlodataCount;
  }
  public void setPowerControlodataCount(Odata400Count powerControlodataCount) {
    this.powerControlodataCount = powerControlodataCount;
  }

  
  /**
   **/
  public Power100Power powerControlodataNavigationLink(Odata400IdRef powerControlodataNavigationLink) {
    this.powerControlodataNavigationLink = powerControlodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PowerControl@odata.navigationLink")
  public Odata400IdRef getPowerControlodataNavigationLink() {
    return powerControlodataNavigationLink;
  }
  public void setPowerControlodataNavigationLink(Odata400IdRef powerControlodataNavigationLink) {
    this.powerControlodataNavigationLink = powerControlodataNavigationLink;
  }

  
  /**
   * Details of the power supplies associated with this system or device
   **/
  public Power100Power powerSupplies(List<Power100PowerSupply> powerSupplies) {
    this.powerSupplies = powerSupplies;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details of the power supplies associated with this system or device")
  @JsonProperty("PowerSupplies")
  public List<Power100PowerSupply> getPowerSupplies() {
    return powerSupplies;
  }
  public void setPowerSupplies(List<Power100PowerSupply> powerSupplies) {
    this.powerSupplies = powerSupplies;
  }

  
  /**
   **/
  public Power100Power powerSuppliesodataCount(Odata400Count powerSuppliesodataCount) {
    this.powerSuppliesodataCount = powerSuppliesodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PowerSupplies@odata.count")
  public Odata400Count getPowerSuppliesodataCount() {
    return powerSuppliesodataCount;
  }
  public void setPowerSuppliesodataCount(Odata400Count powerSuppliesodataCount) {
    this.powerSuppliesodataCount = powerSuppliesodataCount;
  }

  
  /**
   **/
  public Power100Power powerSuppliesodataNavigationLink(Odata400IdRef powerSuppliesodataNavigationLink) {
    this.powerSuppliesodataNavigationLink = powerSuppliesodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PowerSupplies@odata.navigationLink")
  public Odata400IdRef getPowerSuppliesodataNavigationLink() {
    return powerSuppliesodataNavigationLink;
  }
  public void setPowerSuppliesodataNavigationLink(Odata400IdRef powerSuppliesodataNavigationLink) {
    this.powerSuppliesodataNavigationLink = powerSuppliesodataNavigationLink;
  }

  
  /**
   * Redundancy information for the power subsystem of this system or device
   **/
  public Power100Power redundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Redundancy information for the power subsystem of this system or device")
  @JsonProperty("Redundancy")
  public List<RedundancyRedundancy> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  public Power100Power redundancyodataCount(Odata400Count redundancyodataCount) {
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
  public Power100Power redundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
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
   * This is the definition for voltage sensors.
   **/
  public Power100Power voltages(List<Power100Voltage> voltages) {
    this.voltages = voltages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the definition for voltage sensors.")
  @JsonProperty("Voltages")
  public List<Power100Voltage> getVoltages() {
    return voltages;
  }
  public void setVoltages(List<Power100Voltage> voltages) {
    this.voltages = voltages;
  }

  
  /**
   **/
  public Power100Power voltagesodataCount(Odata400Count voltagesodataCount) {
    this.voltagesodataCount = voltagesodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Voltages@odata.count")
  public Odata400Count getVoltagesodataCount() {
    return voltagesodataCount;
  }
  public void setVoltagesodataCount(Odata400Count voltagesodataCount) {
    this.voltagesodataCount = voltagesodataCount;
  }

  
  /**
   **/
  public Power100Power voltagesodataNavigationLink(Odata400IdRef voltagesodataNavigationLink) {
    this.voltagesodataNavigationLink = voltagesodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Voltages@odata.navigationLink")
  public Odata400IdRef getVoltagesodataNavigationLink() {
    return voltagesodataNavigationLink;
  }
  public void setVoltagesodataNavigationLink(Odata400IdRef voltagesodataNavigationLink) {
    this.voltagesodataNavigationLink = voltagesodataNavigationLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100Power power100Power = (Power100Power) o;
    return Objects.equals(this.odataContext, power100Power.odataContext) &&
        Objects.equals(this.odataId, power100Power.odataId) &&
        Objects.equals(this.odataType, power100Power.odataType) &&
        Objects.equals(this.description, power100Power.description) &&
        Objects.equals(this.id, power100Power.id) &&
        Objects.equals(this.name, power100Power.name) &&
        Objects.equals(this.oem, power100Power.oem) &&
        Objects.equals(this.powerControl, power100Power.powerControl) &&
        Objects.equals(this.powerControlodataCount, power100Power.powerControlodataCount) &&
        Objects.equals(this.powerControlodataNavigationLink, power100Power.powerControlodataNavigationLink) &&
        Objects.equals(this.powerSupplies, power100Power.powerSupplies) &&
        Objects.equals(this.powerSuppliesodataCount, power100Power.powerSuppliesodataCount) &&
        Objects.equals(this.powerSuppliesodataNavigationLink, power100Power.powerSuppliesodataNavigationLink) &&
        Objects.equals(this.redundancy, power100Power.redundancy) &&
        Objects.equals(this.redundancyodataCount, power100Power.redundancyodataCount) &&
        Objects.equals(this.redundancyodataNavigationLink, power100Power.redundancyodataNavigationLink) &&
        Objects.equals(this.voltages, power100Power.voltages) &&
        Objects.equals(this.voltagesodataCount, power100Power.voltagesodataCount) &&
        Objects.equals(this.voltagesodataNavigationLink, power100Power.voltagesodataNavigationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, name, oem, powerControl, powerControlodataCount, powerControlodataNavigationLink, powerSupplies, powerSuppliesodataCount, powerSuppliesodataNavigationLink, redundancy, redundancyodataCount, redundancyodataNavigationLink, voltages, voltagesodataCount, voltagesodataNavigationLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100Power {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    powerControl: ").append(toIndentedString(powerControl)).append("\n");
    sb.append("    powerControlodataCount: ").append(toIndentedString(powerControlodataCount)).append("\n");
    sb.append("    powerControlodataNavigationLink: ").append(toIndentedString(powerControlodataNavigationLink)).append("\n");
    sb.append("    powerSupplies: ").append(toIndentedString(powerSupplies)).append("\n");
    sb.append("    powerSuppliesodataCount: ").append(toIndentedString(powerSuppliesodataCount)).append("\n");
    sb.append("    powerSuppliesodataNavigationLink: ").append(toIndentedString(powerSuppliesodataNavigationLink)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    voltages: ").append(toIndentedString(voltages)).append("\n");
    sb.append("    voltagesodataCount: ").append(toIndentedString(voltagesodataCount)).append("\n");
    sb.append("    voltagesodataNavigationLink: ").append(toIndentedString(voltagesodataNavigationLink)).append("\n");
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

