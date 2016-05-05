package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Chassis100ChassisActions;
import io.swagger.client.model.Chassis100ChassisLinks;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;



/**
 * This is the schema definition for the Chassis resource.  It represents the properties for physical components for any system.  This one object is intended to represent racks, rackmount servers, blades, standalone, modular systems, enclosures, and all other containers.  The non-cpu/device centric parts of the schema are all accessed either directly or indirectly through this resource.
 **/

@ApiModel(description = "This is the schema definition for the Chassis resource.  It represents the properties for physical components for any system.  This one object is intended to represent racks, rackmount servers, blades, standalone, modular systems, enclosures, and all other containers.  The non-cpu/device centric parts of the schema are all accessed either directly or indirectly through this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Chassis100Chassis   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private Chassis100ChassisActions actions = null;
  private String assetTag = null;


  public enum ChassisTypeEnum {
    RACK("Rack"),
    BLADE("Blade"),
    ENCLOSURE("Enclosure"),
    STANDALONE("StandAlone"),
    RACKMOUNT("RackMount"),
    CARD("Card"),
    CARTRIDGE("Cartridge"),
    ROW("Row"),
    POD("Pod"),
    EXPANSION("Expansion"),
    SIDECAR("Sidecar"),
    ZONE("Zone"),
    SLED("Sled"),
    SHELF("Shelf"),
    DRAWER("Drawer"),
    MODULE("Module"),
    COMPONENT("Component"),
    OTHER("Other");

    private String value;

    ChassisTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ChassisTypeEnum chassisType = null;
  private String description = null;
  private String id = null;


  public enum IndicatorLEDEnum {
    UNKNOWN("Unknown"),
    LIT("Lit"),
    BLINKING("Blinking"),
    OFF("Off");

    private String value;

    IndicatorLEDEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private IndicatorLEDEnum indicatorLED = null;
  private Chassis100ChassisLinks links = null;
  private LogServiceCollectionLogServiceCollection logServices = null;
  private String manufacturer = null;
  private String model = null;
  private String name = null;
  private ResourceOem oem = null;
  private String partNumber = null;
  private Odata400IdRef power = null;
  private String SKU = null;
  private String serialNumber = null;
  private ResourceStatus status = null;
  private Odata400IdRef thermal = null;

  
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Actions")
  public Chassis100ChassisActions getActions() {
    return actions;
  }
  public void setActions(Chassis100ChassisActions actions) {
    this.actions = actions;
  }

  
  /**
   * The user assigned asset tag for this chassis.
   **/
  
  @ApiModelProperty(value = "The user assigned asset tag for this chassis.")
  @JsonProperty("AssetTag")
  public String getAssetTag() {
    return assetTag;
  }
  public void setAssetTag(String assetTag) {
    this.assetTag = assetTag;
  }

  
  /**
   * This property indicates the type of physical form factor of this resource.
   **/
  
  @ApiModelProperty(required = true, value = "This property indicates the type of physical form factor of this resource.")
  @JsonProperty("ChassisType")
  public ChassisTypeEnum getChassisType() {
    return chassisType;
  }
  public void setChassisType(ChassisTypeEnum chassisType) {
    this.chassisType = chassisType;
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
   * The state of the indicator LED, used to identify the chassis.
   **/
  
  @ApiModelProperty(value = "The state of the indicator LED, used to identify the chassis.")
  @JsonProperty("IndicatorLED")
  public IndicatorLEDEnum getIndicatorLED() {
    return indicatorLED;
  }
  public void setIndicatorLED(IndicatorLEDEnum indicatorLED) {
    this.indicatorLED = indicatorLED;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "A reference to the logs for this chassis.")
  @JsonProperty("LogServices")
  public LogServiceCollectionLogServiceCollection getLogServices() {
    return logServices;
  }
  public void setLogServices(LogServiceCollectionLogServiceCollection logServices) {
    this.logServices = logServices;
  }

  
  /**
   * This is the manufacturer of this chassis.
   **/
  
  @ApiModelProperty(value = "This is the manufacturer of this chassis.")
  @JsonProperty("Manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * This is the model number for the chassis.
   **/
  
  @ApiModelProperty(value = "This is the model number for the chassis.")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
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
   * The part number for this chassis.
   **/
  
  @ApiModelProperty(value = "The part number for this chassis.")
  @JsonProperty("PartNumber")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * A reference to the power properties (power supplies, power policies, sensors) for this chassis.
   **/
  
  @ApiModelProperty(value = "A reference to the power properties (power supplies, power policies, sensors) for this chassis.")
  @JsonProperty("Power")
  public Odata400IdRef getPower() {
    return power;
  }
  public void setPower(Odata400IdRef power) {
    this.power = power;
  }

  
  /**
   * This is the SKU for this chassis.
   **/
  
  @ApiModelProperty(value = "This is the SKU for this chassis.")
  @JsonProperty("SKU")
  public String getSKU() {
    return SKU;
  }
  public void setSKU(String SKU) {
    this.SKU = SKU;
  }

  
  /**
   * The serial number for this chassis.
   **/
  
  @ApiModelProperty(value = "The serial number for this chassis.")
  @JsonProperty("SerialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
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
   * A reference to the thermal properties (fans, cooling, sensors) for this chassis.
   **/
  
  @ApiModelProperty(value = "A reference to the thermal properties (fans, cooling, sensors) for this chassis.")
  @JsonProperty("Thermal")
  public Odata400IdRef getThermal() {
    return thermal;
  }
  public void setThermal(Odata400IdRef thermal) {
    this.thermal = thermal;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chassis100Chassis chassis100Chassis = (Chassis100Chassis) o;
    return Objects.equals(odataContext, chassis100Chassis.odataContext) &&
        Objects.equals(odataId, chassis100Chassis.odataId) &&
        Objects.equals(odataType, chassis100Chassis.odataType) &&
        Objects.equals(actions, chassis100Chassis.actions) &&
        Objects.equals(assetTag, chassis100Chassis.assetTag) &&
        Objects.equals(chassisType, chassis100Chassis.chassisType) &&
        Objects.equals(description, chassis100Chassis.description) &&
        Objects.equals(id, chassis100Chassis.id) &&
        Objects.equals(indicatorLED, chassis100Chassis.indicatorLED) &&
        Objects.equals(links, chassis100Chassis.links) &&
        Objects.equals(logServices, chassis100Chassis.logServices) &&
        Objects.equals(manufacturer, chassis100Chassis.manufacturer) &&
        Objects.equals(model, chassis100Chassis.model) &&
        Objects.equals(name, chassis100Chassis.name) &&
        Objects.equals(oem, chassis100Chassis.oem) &&
        Objects.equals(partNumber, chassis100Chassis.partNumber) &&
        Objects.equals(power, chassis100Chassis.power) &&
        Objects.equals(SKU, chassis100Chassis.SKU) &&
        Objects.equals(serialNumber, chassis100Chassis.serialNumber) &&
        Objects.equals(status, chassis100Chassis.status) &&
        Objects.equals(thermal, chassis100Chassis.thermal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, actions, assetTag, chassisType, description, id, indicatorLED, links, logServices, manufacturer, model, name, oem, partNumber, power, SKU, serialNumber, status, thermal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chassis100Chassis {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    assetTag: ").append(toIndentedString(assetTag)).append("\n");
    sb.append("    chassisType: ").append(toIndentedString(chassisType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indicatorLED: ").append(toIndentedString(indicatorLED)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logServices: ").append(toIndentedString(logServices)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    SKU: ").append(toIndentedString(SKU)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thermal: ").append(toIndentedString(thermal)).append("\n");
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

