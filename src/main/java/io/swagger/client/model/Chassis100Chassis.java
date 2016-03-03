package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Chassis100ChassisActions;
import io.swagger.client.model.Chassis100ChassisLinks;
import io.swagger.client.model.Chassis100ChassisType;
import io.swagger.client.model.Chassis100IndicatorLED;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.PowerPower;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.ThermalThermal;



/**
 * This is the schema definition for the Chassis resource.  It represents the properties for physical components for any system.  This one object is intended to represent racks, rackmount servers, blades, standalone, modular systems, enclosures, and all other containers.  The non-cpu/device centric parts of the schema are all accessed either directly or indirectly through this resource.
 **/

@ApiModel(description = "This is the schema definition for the Chassis resource.  It represents the properties for physical components for any system.  This one object is intended to represent racks, rackmount servers, blades, standalone, modular systems, enclosures, and all other containers.  The non-cpu/device centric parts of the schema are all accessed either directly or indirectly through this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Chassis100Chassis   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private Chassis100ChassisActions actions = null;
  private Chassis100ChassisType chassisType = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private Chassis100IndicatorLED indicatorLED = null;
  private Chassis100ChassisLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private PowerPower power = null;
  private ResourceStatus status = null;
  private ThermalThermal thermal = null;

  
  /**
   **/
  public Chassis100Chassis odataContext(Odata400Context odataContext) {
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
  public Chassis100Chassis odataId(Odata400Id odataId) {
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
  public Chassis100Chassis odataType(Odata400Type odataType) {
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
  public Chassis100Chassis actions(Chassis100ChassisActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Actions")
  public Chassis100ChassisActions getActions() {
    return actions;
  }
  public void setActions(Chassis100ChassisActions actions) {
    this.actions = actions;
  }

  
  /**
   * This property indicates the type of physical form factor of this resource.
   **/
  public Chassis100Chassis chassisType(Chassis100ChassisType chassisType) {
    this.chassisType = chassisType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This property indicates the type of physical form factor of this resource.")
  @JsonProperty("ChassisType")
  public Chassis100ChassisType getChassisType() {
    return chassisType;
  }
  public void setChassisType(Chassis100ChassisType chassisType) {
    this.chassisType = chassisType;
  }

  
  /**
   **/
  public Chassis100Chassis description(ResourceDescription description) {
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
  public Chassis100Chassis id(ResourceId id) {
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
   * The state of the indicator LED, used to identify the chassis.
   **/
  public Chassis100Chassis indicatorLED(Chassis100IndicatorLED indicatorLED) {
    this.indicatorLED = indicatorLED;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the indicator LED, used to identify the chassis.")
  @JsonProperty("IndicatorLED")
  public Chassis100IndicatorLED getIndicatorLED() {
    return indicatorLED;
  }
  public void setIndicatorLED(Chassis100IndicatorLED indicatorLED) {
    this.indicatorLED = indicatorLED;
  }

  
  /**
   **/
  public Chassis100Chassis links(Chassis100ChassisLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Links")
  public Chassis100ChassisLinks getLinks() {
    return links;
  }
  public void setLinks(Chassis100ChassisLinks links) {
    this.links = links;
  }

  
  /**
   * A reference to the logs for this chassis.
   **/
  public Chassis100Chassis logServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the logs for this chassis.")
  @JsonProperty("LogServices")
  public LogServiceCollectionLogServiceCollection getLogServices() {
    return logServices;
  }
  public void setLogServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
  }

  
  /**
   **/
  public Chassis100Chassis name(ResourceName name) {
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
  public Chassis100Chassis oem(ResourceOem oem) {
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
   * A reference to the power properties (power supplies, power policies, sensors) for this chassis.
   **/
  public Chassis100Chassis power(PowerPower power) {
    this.power = power;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the power properties (power supplies, power policies, sensors) for this chassis.")
  @JsonProperty("Power")
  public PowerPower getPower() {
    return power;
  }
  public void setPower(PowerPower power) {
    this.power = power;
  }

  
  /**
   **/
  public Chassis100Chassis status(ResourceStatus status) {
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
   * A reference to the thermal properties (fans, cooling, sensors) for this chassis.
   **/
  public Chassis100Chassis thermal(ThermalThermal thermal) {
    this.thermal = thermal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the thermal properties (fans, cooling, sensors) for this chassis.")
  @JsonProperty("Thermal")
  public ThermalThermal getThermal() {
    return thermal;
  }
  public void setThermal(ThermalThermal thermal) {
    this.thermal = thermal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chassis100Chassis chassis100Chassis = (Chassis100Chassis) o;
    return Objects.equals(this.odataContext, chassis100Chassis.odataContext) &&
        Objects.equals(this.odataId, chassis100Chassis.odataId) &&
        Objects.equals(this.odataType, chassis100Chassis.odataType) &&
        Objects.equals(this.actions, chassis100Chassis.actions) &&
        Objects.equals(this.chassisType, chassis100Chassis.chassisType) &&
        Objects.equals(this.description, chassis100Chassis.description) &&
        Objects.equals(this.id, chassis100Chassis.id) &&
        Objects.equals(this.indicatorLED, chassis100Chassis.indicatorLED) &&
        Objects.equals(this.links, chassis100Chassis.links) &&
        Objects.equals(this.logServices, chassis100Chassis.logServices) &&
        Objects.equals(this.name, chassis100Chassis.name) &&
        Objects.equals(this.oem, chassis100Chassis.oem) &&
        Objects.equals(this.power, chassis100Chassis.power) &&
        Objects.equals(this.status, chassis100Chassis.status) &&
        Objects.equals(this.thermal, chassis100Chassis.thermal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, chassisType, description, id, indicatorLED, links, logServices, name, oem, power, status, thermal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chassis100Chassis {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    chassisType: ").append(toIndentedString(chassisType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicatorLED: ").append(toIndentedString(indicatorLED)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thermal: ").append(toIndentedString(thermal)).append("\n");
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

