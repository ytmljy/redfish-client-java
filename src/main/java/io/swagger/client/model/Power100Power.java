package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Power100PowerControl;
import io.swagger.client.model.Power100PowerSupply;
import io.swagger.client.model.Power100Voltage;
import io.swagger.client.model.ResourceOem;
import java.math.BigDecimal;
import java.util.*;



/**
 * This is the schema definition for the Power Metrics.  It represents the properties for Power Consumption and Power Limiting.
 **/

@ApiModel(description = "This is the schema definition for the Power Metrics.  It represents the properties for Power Consumption and Power Limiting.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100Power   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;
  private String name = null;
  private ResourceOem oem = null;
  private List<Power100PowerControl> powerControl = new ArrayList<Power100PowerControl>();
  private BigDecimal powerControlodataCount = null;
  private Odata400IdRef powerControlodataNavigationLink = null;
  private List<Power100PowerSupply> powerSupplies = new ArrayList<Power100PowerSupply>();
  private BigDecimal powerSuppliesodataCount = null;
  private Odata400IdRef powerSuppliesodataNavigationLink = null;
  private List<Odata400IdRef> redundancy = new ArrayList<Odata400IdRef>();
  private BigDecimal redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Power100Voltage> voltages = new ArrayList<Power100Voltage>();
  private BigDecimal voltagesodataCount = null;
  private Odata400IdRef voltagesodataNavigationLink = null;

  
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
   * This is the definition for power control function (power reading/limiting).
   **/
  
  @ApiModelProperty(value = "This is the definition for power control function (power reading/limiting).")
  @JsonProperty("PowerControl")
  public List<Power100PowerControl> getPowerControl() {
    return powerControl;
  }
  public void setPowerControl(List<Power100PowerControl> powerControl) {
    this.powerControl = powerControl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PowerControl@odata.count")
  public BigDecimal getPowerControlodataCount() {
    return powerControlodataCount;
  }
  public void setPowerControlodataCount(BigDecimal powerControlodataCount) {
    this.powerControlodataCount = powerControlodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "Details of the power supplies associated with this system or device")
  @JsonProperty("PowerSupplies")
  public List<Power100PowerSupply> getPowerSupplies() {
    return powerSupplies;
  }
  public void setPowerSupplies(List<Power100PowerSupply> powerSupplies) {
    this.powerSupplies = powerSupplies;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PowerSupplies@odata.count")
  public BigDecimal getPowerSuppliesodataCount() {
    return powerSuppliesodataCount;
  }
  public void setPowerSuppliesodataCount(BigDecimal powerSuppliesodataCount) {
    this.powerSuppliesodataCount = powerSuppliesodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "Redundancy information for the power subsystem of this system or device")
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
   * This is the definition for voltage sensors.
   **/
  
  @ApiModelProperty(value = "This is the definition for voltage sensors.")
  @JsonProperty("Voltages")
  public List<Power100Voltage> getVoltages() {
    return voltages;
  }
  public void setVoltages(List<Power100Voltage> voltages) {
    this.voltages = voltages;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Voltages@odata.count")
  public BigDecimal getVoltagesodataCount() {
    return voltagesodataCount;
  }
  public void setVoltagesodataCount(BigDecimal voltagesodataCount) {
    this.voltagesodataCount = voltagesodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Voltages@odata.navigationLink")
  public Odata400IdRef getVoltagesodataNavigationLink() {
    return voltagesodataNavigationLink;
  }
  public void setVoltagesodataNavigationLink(Odata400IdRef voltagesodataNavigationLink) {
    this.voltagesodataNavigationLink = voltagesodataNavigationLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100Power power100Power = (Power100Power) o;
    return Objects.equals(odataContext, power100Power.odataContext) &&
        Objects.equals(odataId, power100Power.odataId) &&
        Objects.equals(odataType, power100Power.odataType) &&
        Objects.equals(description, power100Power.description) &&
        Objects.equals(id, power100Power.id) &&
        Objects.equals(name, power100Power.name) &&
        Objects.equals(oem, power100Power.oem) &&
        Objects.equals(powerControl, power100Power.powerControl) &&
        Objects.equals(powerControlodataCount, power100Power.powerControlodataCount) &&
        Objects.equals(powerControlodataNavigationLink, power100Power.powerControlodataNavigationLink) &&
        Objects.equals(powerSupplies, power100Power.powerSupplies) &&
        Objects.equals(powerSuppliesodataCount, power100Power.powerSuppliesodataCount) &&
        Objects.equals(powerSuppliesodataNavigationLink, power100Power.powerSuppliesodataNavigationLink) &&
        Objects.equals(redundancy, power100Power.redundancy) &&
        Objects.equals(redundancyodataCount, power100Power.redundancyodataCount) &&
        Objects.equals(redundancyodataNavigationLink, power100Power.redundancyodataNavigationLink) &&
        Objects.equals(voltages, power100Power.voltages) &&
        Objects.equals(voltagesodataCount, power100Power.voltagesodataCount) &&
        Objects.equals(voltagesodataNavigationLink, power100Power.voltagesodataNavigationLink);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

