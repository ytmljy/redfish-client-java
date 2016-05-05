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
 * This is the base type for addressable members of an array.
 **/

@ApiModel(description = "This is the base type for addressable members of an array.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100Voltage   {
  
  private BigDecimal lowerThresholdCritical = null;
  private BigDecimal lowerThresholdFatal = null;
  private BigDecimal lowerThresholdNonCritical = null;
  private BigDecimal maxReadingRange = null;
  private String memberId = null;
  private BigDecimal minReadingRange = null;
  private String name = null;
  private ResourceOem oem = null;


  public enum PhysicalContextEnum {
    ROOM("Room"),
    INTAKE("Intake"),
    EXHAUST("Exhaust"),
    FRONT("Front"),
    BACK("Back"),
    UPPER("Upper"),
    LOWER("Lower"),
    CPU("CPU"),
    GPU("GPU"),
    BACKPLANE("Backplane"),
    SYSTEMBOARD("SystemBoard"),
    POWERSUPPLY("PowerSupply"),
    VOLTAGEREGULATOR("VoltageRegulator"),
    STORAGEDEVICE("StorageDevice"),
    NETWORKINGDEVICE("NetworkingDevice"),
    COMPUTEBAY("ComputeBay"),
    STORAGEBAY("StorageBay"),
    NETWORKBAY("NetworkBay"),
    EXPANSIONBAY("ExpansionBay"),
    POWERSUPPLYBAY("PowerSupplyBay");

    private String value;

    PhysicalContextEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PhysicalContextEnum physicalContext = null;
  private BigDecimal readingVolts = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private BigDecimal relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private BigDecimal sensorNumber = null;
  private ResourceStatus status = null;
  private BigDecimal upperThresholdCritical = null;
  private BigDecimal upperThresholdFatal = null;
  private BigDecimal upperThresholdNonCritical = null;

  
  /**
   * Below normal range but not yet fatal.
   **/
  
  @ApiModelProperty(value = "Below normal range but not yet fatal.")
  @JsonProperty("LowerThresholdCritical")
  public BigDecimal getLowerThresholdCritical() {
    return lowerThresholdCritical;
  }
  public void setLowerThresholdCritical(BigDecimal lowerThresholdCritical) {
    this.lowerThresholdCritical = lowerThresholdCritical;
  }

  
  /**
   * Below normal range and is fatal
   **/
  
  @ApiModelProperty(value = "Below normal range and is fatal")
  @JsonProperty("LowerThresholdFatal")
  public BigDecimal getLowerThresholdFatal() {
    return lowerThresholdFatal;
  }
  public void setLowerThresholdFatal(BigDecimal lowerThresholdFatal) {
    this.lowerThresholdFatal = lowerThresholdFatal;
  }

  
  /**
   * Below normal range
   **/
  
  @ApiModelProperty(value = "Below normal range")
  @JsonProperty("LowerThresholdNonCritical")
  public BigDecimal getLowerThresholdNonCritical() {
    return lowerThresholdNonCritical;
  }
  public void setLowerThresholdNonCritical(BigDecimal lowerThresholdNonCritical) {
    this.lowerThresholdNonCritical = lowerThresholdNonCritical;
  }

  
  /**
   * Maximum value for CurrentReading
   **/
  
  @ApiModelProperty(value = "Maximum value for CurrentReading")
  @JsonProperty("MaxReadingRange")
  public BigDecimal getMaxReadingRange() {
    return maxReadingRange;
  }
  public void setMaxReadingRange(BigDecimal maxReadingRange) {
    this.maxReadingRange = maxReadingRange;
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
   * Minimum value for CurrentReading
   **/
  
  @ApiModelProperty(value = "Minimum value for CurrentReading")
  @JsonProperty("MinReadingRange")
  public BigDecimal getMinReadingRange() {
    return minReadingRange;
  }
  public void setMinReadingRange(BigDecimal minReadingRange) {
    this.minReadingRange = minReadingRange;
  }

  
  /**
   * Voltage sensor name.
   **/
  
  @ApiModelProperty(value = "Voltage sensor name.")
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
   * Describes the area or device to which this voltage measurement applies.
   **/
  
  @ApiModelProperty(value = "Describes the area or device to which this voltage measurement applies.")
  @JsonProperty("PhysicalContext")
  public PhysicalContextEnum getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContextEnum physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * The current value of the voltage sensor.
   **/
  
  @ApiModelProperty(value = "The current value of the voltage sensor.")
  @JsonProperty("ReadingVolts")
  public BigDecimal getReadingVolts() {
    return readingVolts;
  }
  public void setReadingVolts(BigDecimal readingVolts) {
    this.readingVolts = readingVolts;
  }

  
  /**
   * Describes the areas or devices to which this voltage measurement applies.
   **/
  
  @ApiModelProperty(value = "Describes the areas or devices to which this voltage measurement applies.")
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
   * A numerical identifier to represent the voltage sensor
   **/
  
  @ApiModelProperty(value = "A numerical identifier to represent the voltage sensor")
  @JsonProperty("SensorNumber")
  public BigDecimal getSensorNumber() {
    return sensorNumber;
  }
  public void setSensorNumber(BigDecimal sensorNumber) {
    this.sensorNumber = sensorNumber;
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
   * Above normal range but not yet fatal.
   **/
  
  @ApiModelProperty(value = "Above normal range but not yet fatal.")
  @JsonProperty("UpperThresholdCritical")
  public BigDecimal getUpperThresholdCritical() {
    return upperThresholdCritical;
  }
  public void setUpperThresholdCritical(BigDecimal upperThresholdCritical) {
    this.upperThresholdCritical = upperThresholdCritical;
  }

  
  /**
   * Above normal range and is fatal
   **/
  
  @ApiModelProperty(value = "Above normal range and is fatal")
  @JsonProperty("UpperThresholdFatal")
  public BigDecimal getUpperThresholdFatal() {
    return upperThresholdFatal;
  }
  public void setUpperThresholdFatal(BigDecimal upperThresholdFatal) {
    this.upperThresholdFatal = upperThresholdFatal;
  }

  
  /**
   * Above normal range
   **/
  
  @ApiModelProperty(value = "Above normal range")
  @JsonProperty("UpperThresholdNonCritical")
  public BigDecimal getUpperThresholdNonCritical() {
    return upperThresholdNonCritical;
  }
  public void setUpperThresholdNonCritical(BigDecimal upperThresholdNonCritical) {
    this.upperThresholdNonCritical = upperThresholdNonCritical;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100Voltage power100Voltage = (Power100Voltage) o;
    return Objects.equals(lowerThresholdCritical, power100Voltage.lowerThresholdCritical) &&
        Objects.equals(lowerThresholdFatal, power100Voltage.lowerThresholdFatal) &&
        Objects.equals(lowerThresholdNonCritical, power100Voltage.lowerThresholdNonCritical) &&
        Objects.equals(maxReadingRange, power100Voltage.maxReadingRange) &&
        Objects.equals(memberId, power100Voltage.memberId) &&
        Objects.equals(minReadingRange, power100Voltage.minReadingRange) &&
        Objects.equals(name, power100Voltage.name) &&
        Objects.equals(oem, power100Voltage.oem) &&
        Objects.equals(physicalContext, power100Voltage.physicalContext) &&
        Objects.equals(readingVolts, power100Voltage.readingVolts) &&
        Objects.equals(relatedItem, power100Voltage.relatedItem) &&
        Objects.equals(relatedItemodataCount, power100Voltage.relatedItemodataCount) &&
        Objects.equals(relatedItemodataNavigationLink, power100Voltage.relatedItemodataNavigationLink) &&
        Objects.equals(sensorNumber, power100Voltage.sensorNumber) &&
        Objects.equals(status, power100Voltage.status) &&
        Objects.equals(upperThresholdCritical, power100Voltage.upperThresholdCritical) &&
        Objects.equals(upperThresholdFatal, power100Voltage.upperThresholdFatal) &&
        Objects.equals(upperThresholdNonCritical, power100Voltage.upperThresholdNonCritical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowerThresholdCritical, lowerThresholdFatal, lowerThresholdNonCritical, maxReadingRange, memberId, minReadingRange, name, oem, physicalContext, readingVolts, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, sensorNumber, status, upperThresholdCritical, upperThresholdFatal, upperThresholdNonCritical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100Voltage {\n");
    
    sb.append("    lowerThresholdCritical: ").append(toIndentedString(lowerThresholdCritical)).append("\n");
    sb.append("    lowerThresholdFatal: ").append(toIndentedString(lowerThresholdFatal)).append("\n");
    sb.append("    lowerThresholdNonCritical: ").append(toIndentedString(lowerThresholdNonCritical)).append("\n");
    sb.append("    maxReadingRange: ").append(toIndentedString(maxReadingRange)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    minReadingRange: ").append(toIndentedString(minReadingRange)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
    sb.append("    readingVolts: ").append(toIndentedString(readingVolts)).append("\n");
    sb.append("    relatedItem: ").append(toIndentedString(relatedItem)).append("\n");
    sb.append("    relatedItemodataCount: ").append(toIndentedString(relatedItemodataCount)).append("\n");
    sb.append("    relatedItemodataNavigationLink: ").append(toIndentedString(relatedItemodataNavigationLink)).append("\n");
    sb.append("    sensorNumber: ").append(toIndentedString(sensorNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    upperThresholdCritical: ").append(toIndentedString(upperThresholdCritical)).append("\n");
    sb.append("    upperThresholdFatal: ").append(toIndentedString(upperThresholdFatal)).append("\n");
    sb.append("    upperThresholdNonCritical: ").append(toIndentedString(upperThresholdNonCritical)).append("\n");
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

