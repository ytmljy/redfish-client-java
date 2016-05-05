package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;
import java.util.*;



/**
 * Details of a power supplies associated with this system or device
 **/

@ApiModel(description = "Details of a power supplies associated with this system or device")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100PowerSupply   {
  
  private String firmwareVersion = null;
  private BigDecimal lastPowerOutputWatts = null;
  private BigDecimal lineInputVoltage = null;


  public enum LineInputVoltageTypeEnum {
    UNKNOWN("Unknown"),
    ACLOWLINE("ACLowLine"),
    ACMIDLINE("ACMidLine"),
    ACHIGHLINE("ACHighLine"),
    DCNEG48V("DCNeg48V"),
    DC480V("DC480V");

    private String value;

    LineInputVoltageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LineInputVoltageTypeEnum lineInputVoltageType = null;
  private String memberId = null;
  private String model = null;
  private String name = null;
  private ResourceOem oem = null;
  private String partNumber = null;
  private BigDecimal powerCapacityWatts = null;


  public enum PowerSupplyTypeEnum {
    UNKNOWN("Unknown"),
    AC("AC"),
    DC("DC");

    private String value;

    PowerSupplyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PowerSupplyTypeEnum powerSupplyType = null;
  private List<Odata400IdRef> redundancy = new ArrayList<Odata400IdRef>();
  private BigDecimal redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private BigDecimal relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private String serialNumber = null;
  private String sparePartNumber = null;
  private ResourceStatus status = null;

  
  /**
   * The firmware version for this Power Supply
   **/
  
  @ApiModelProperty(value = "The firmware version for this Power Supply")
  @JsonProperty("FirmwareVersion")
  public String getFirmwareVersion() {
    return firmwareVersion;
  }
  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }

  
  /**
   * The average power output of this Power Supply
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The average power output of this Power Supply")
  @JsonProperty("LastPowerOutputWatts")
  public BigDecimal getLastPowerOutputWatts() {
    return lastPowerOutputWatts;
  }
  public void setLastPowerOutputWatts(BigDecimal lastPowerOutputWatts) {
    this.lastPowerOutputWatts = lastPowerOutputWatts;
  }

  
  /**
   * The line input voltage at which the Power Supply is operating
   **/
  
  @ApiModelProperty(value = "The line input voltage at which the Power Supply is operating")
  @JsonProperty("LineInputVoltage")
  public BigDecimal getLineInputVoltage() {
    return lineInputVoltage;
  }
  public void setLineInputVoltage(BigDecimal lineInputVoltage) {
    this.lineInputVoltage = lineInputVoltage;
  }

  
  /**
   * The line voltage type supported as an input to this Power Supply
   **/
  
  @ApiModelProperty(value = "The line voltage type supported as an input to this Power Supply")
  @JsonProperty("LineInputVoltageType")
  public LineInputVoltageTypeEnum getLineInputVoltageType() {
    return lineInputVoltageType;
  }
  public void setLineInputVoltageType(LineInputVoltageTypeEnum lineInputVoltageType) {
    this.lineInputVoltageType = lineInputVoltageType;
  }

  
  /**
   * This is the identifier for the member within the collection.
   **/
  
  @ApiModelProperty(value = "This is the identifier for the member within the collection.")
  @JsonProperty("MemberId")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  
  /**
   * The model number for this Power Supply
   **/
  
  @ApiModelProperty(value = "The model number for this Power Supply")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * The name of the Power Supply
   **/
  
  @ApiModelProperty(value = "The name of the Power Supply")
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
   * The part number for this Power Supply
   **/
  
  @ApiModelProperty(value = "The part number for this Power Supply")
  @JsonProperty("PartNumber")
  public String getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(String partNumber) {
    this.partNumber = partNumber;
  }

  
  /**
   * The maximum capacity of this Power Supply
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The maximum capacity of this Power Supply")
  @JsonProperty("PowerCapacityWatts")
  public BigDecimal getPowerCapacityWatts() {
    return powerCapacityWatts;
  }
  public void setPowerCapacityWatts(BigDecimal powerCapacityWatts) {
    this.powerCapacityWatts = powerCapacityWatts;
  }

  
  /**
   * The Power Supply type (AC or DC)
   **/
  
  @ApiModelProperty(value = "The Power Supply type (AC or DC)")
  @JsonProperty("PowerSupplyType")
  public PowerSupplyTypeEnum getPowerSupplyType() {
    return powerSupplyType;
  }
  public void setPowerSupplyType(PowerSupplyTypeEnum powerSupplyType) {
    this.powerSupplyType = powerSupplyType;
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
   * The ID(s) of the resources associated with this Power Limit
   **/
  
  @ApiModelProperty(value = "The ID(s) of the resources associated with this Power Limit")
  @JsonProperty("RelatedItem")
  public List<Odata400IdRef> getRelatedItem() {
    return relatedItem;
  }
  public void setRelatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("RelatedItem@odata.count")
  public BigDecimal getRelatedItemodataCount() {
    return relatedItemodataCount;
  }
  public void setRelatedItemodataCount(BigDecimal relatedItemodataCount) {
    this.relatedItemodataCount = relatedItemodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("RelatedItem@odata.navigationLink")
  public Odata400IdRef getRelatedItemodataNavigationLink() {
    return relatedItemodataNavigationLink;
  }
  public void setRelatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
    this.relatedItemodataNavigationLink = relatedItemodataNavigationLink;
  }

  
  /**
   * The serial number for this Power Supply
   **/
  
  @ApiModelProperty(value = "The serial number for this Power Supply")
  @JsonProperty("SerialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  
  /**
   * The spare part number for this Power Supply
   **/
  
  @ApiModelProperty(value = "The spare part number for this Power Supply")
  @JsonProperty("SparePartNumber")
  public String getSparePartNumber() {
    return sparePartNumber;
  }
  public void setSparePartNumber(String sparePartNumber) {
    this.sparePartNumber = sparePartNumber;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100PowerSupply power100PowerSupply = (Power100PowerSupply) o;
    return Objects.equals(firmwareVersion, power100PowerSupply.firmwareVersion) &&
        Objects.equals(lastPowerOutputWatts, power100PowerSupply.lastPowerOutputWatts) &&
        Objects.equals(lineInputVoltage, power100PowerSupply.lineInputVoltage) &&
        Objects.equals(lineInputVoltageType, power100PowerSupply.lineInputVoltageType) &&
        Objects.equals(memberId, power100PowerSupply.memberId) &&
        Objects.equals(model, power100PowerSupply.model) &&
        Objects.equals(name, power100PowerSupply.name) &&
        Objects.equals(oem, power100PowerSupply.oem) &&
        Objects.equals(partNumber, power100PowerSupply.partNumber) &&
        Objects.equals(powerCapacityWatts, power100PowerSupply.powerCapacityWatts) &&
        Objects.equals(powerSupplyType, power100PowerSupply.powerSupplyType) &&
        Objects.equals(redundancy, power100PowerSupply.redundancy) &&
        Objects.equals(redundancyodataCount, power100PowerSupply.redundancyodataCount) &&
        Objects.equals(redundancyodataNavigationLink, power100PowerSupply.redundancyodataNavigationLink) &&
        Objects.equals(relatedItem, power100PowerSupply.relatedItem) &&
        Objects.equals(relatedItemodataCount, power100PowerSupply.relatedItemodataCount) &&
        Objects.equals(relatedItemodataNavigationLink, power100PowerSupply.relatedItemodataNavigationLink) &&
        Objects.equals(serialNumber, power100PowerSupply.serialNumber) &&
        Objects.equals(sparePartNumber, power100PowerSupply.sparePartNumber) &&
        Objects.equals(status, power100PowerSupply.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareVersion, lastPowerOutputWatts, lineInputVoltage, lineInputVoltageType, memberId, model, name, oem, partNumber, powerCapacityWatts, powerSupplyType, redundancy, redundancyodataCount, redundancyodataNavigationLink, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, serialNumber, sparePartNumber, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerSupply {\n");
    
    sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
    sb.append("    lastPowerOutputWatts: ").append(toIndentedString(lastPowerOutputWatts)).append("\n");
    sb.append("    lineInputVoltage: ").append(toIndentedString(lineInputVoltage)).append("\n");
    sb.append("    lineInputVoltageType: ").append(toIndentedString(lineInputVoltageType)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    powerCapacityWatts: ").append(toIndentedString(powerCapacityWatts)).append("\n");
    sb.append("    powerSupplyType: ").append(toIndentedString(powerSupplyType)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    relatedItem: ").append(toIndentedString(relatedItem)).append("\n");
    sb.append("    relatedItemodataCount: ").append(toIndentedString(relatedItemodataCount)).append("\n");
    sb.append("    relatedItemodataNavigationLink: ").append(toIndentedString(relatedItemodataNavigationLink)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    sparePartNumber: ").append(toIndentedString(sparePartNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

