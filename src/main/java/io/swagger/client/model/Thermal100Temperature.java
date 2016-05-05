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
public class Thermal100Temperature   {
  
  private BigDecimal lowerThresholdCritical = null;
  private BigDecimal lowerThresholdFatal = null;
  private BigDecimal lowerThresholdNonCritical = null;
  private BigDecimal maxReadingRangeTemp = null;
  private String memberId = null;
  private BigDecimal minReadingRangeTemp = null;
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
  private BigDecimal readingCelsius = null;
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
   * Maximum value for ReadingCelsius
   **/
  
  @ApiModelProperty(value = "Maximum value for ReadingCelsius")
  @JsonProperty("MaxReadingRangeTemp")
  public BigDecimal getMaxReadingRangeTemp() {
    return maxReadingRangeTemp;
  }
  public void setMaxReadingRangeTemp(BigDecimal maxReadingRangeTemp) {
    this.maxReadingRangeTemp = maxReadingRangeTemp;
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
   * Minimum value for ReadingCelsius
   **/
  
  @ApiModelProperty(value = "Minimum value for ReadingCelsius")
  @JsonProperty("MinReadingRangeTemp")
  public BigDecimal getMinReadingRangeTemp() {
    return minReadingRangeTemp;
  }
  public void setMinReadingRangeTemp(BigDecimal minReadingRangeTemp) {
    this.minReadingRangeTemp = minReadingRangeTemp;
  }

  
  /**
   * Temperature sensor name.
   **/
  
  @ApiModelProperty(value = "Temperature sensor name.")
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
   * Describes the area or device to which this temperature measurement applies.
   **/
  
  @ApiModelProperty(value = "Describes the area or device to which this temperature measurement applies.")
  @JsonProperty("PhysicalContext")
  public PhysicalContextEnum getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContextEnum physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * Temperature
   **/
  
  @ApiModelProperty(value = "Temperature")
  @JsonProperty("ReadingCelsius")
  public BigDecimal getReadingCelsius() {
    return readingCelsius;
  }
  public void setReadingCelsius(BigDecimal readingCelsius) {
    this.readingCelsius = readingCelsius;
  }

  
  /**
   * Describes the areas or devices to which this temperature measurement applies.
   **/
  
  @ApiModelProperty(value = "Describes the areas or devices to which this temperature measurement applies.")
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
   * A numerical identifier to represent the temperature sensor
   **/
  
  @ApiModelProperty(value = "A numerical identifier to represent the temperature sensor")
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
    Thermal100Temperature thermal100Temperature = (Thermal100Temperature) o;
    return Objects.equals(lowerThresholdCritical, thermal100Temperature.lowerThresholdCritical) &&
        Objects.equals(lowerThresholdFatal, thermal100Temperature.lowerThresholdFatal) &&
        Objects.equals(lowerThresholdNonCritical, thermal100Temperature.lowerThresholdNonCritical) &&
        Objects.equals(maxReadingRangeTemp, thermal100Temperature.maxReadingRangeTemp) &&
        Objects.equals(memberId, thermal100Temperature.memberId) &&
        Objects.equals(minReadingRangeTemp, thermal100Temperature.minReadingRangeTemp) &&
        Objects.equals(name, thermal100Temperature.name) &&
        Objects.equals(oem, thermal100Temperature.oem) &&
        Objects.equals(physicalContext, thermal100Temperature.physicalContext) &&
        Objects.equals(readingCelsius, thermal100Temperature.readingCelsius) &&
        Objects.equals(relatedItem, thermal100Temperature.relatedItem) &&
        Objects.equals(relatedItemodataCount, thermal100Temperature.relatedItemodataCount) &&
        Objects.equals(relatedItemodataNavigationLink, thermal100Temperature.relatedItemodataNavigationLink) &&
        Objects.equals(sensorNumber, thermal100Temperature.sensorNumber) &&
        Objects.equals(status, thermal100Temperature.status) &&
        Objects.equals(upperThresholdCritical, thermal100Temperature.upperThresholdCritical) &&
        Objects.equals(upperThresholdFatal, thermal100Temperature.upperThresholdFatal) &&
        Objects.equals(upperThresholdNonCritical, thermal100Temperature.upperThresholdNonCritical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowerThresholdCritical, lowerThresholdFatal, lowerThresholdNonCritical, maxReadingRangeTemp, memberId, minReadingRangeTemp, name, oem, physicalContext, readingCelsius, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, sensorNumber, status, upperThresholdCritical, upperThresholdFatal, upperThresholdNonCritical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thermal100Temperature {\n");
    
    sb.append("    lowerThresholdCritical: ").append(toIndentedString(lowerThresholdCritical)).append("\n");
    sb.append("    lowerThresholdFatal: ").append(toIndentedString(lowerThresholdFatal)).append("\n");
    sb.append("    lowerThresholdNonCritical: ").append(toIndentedString(lowerThresholdNonCritical)).append("\n");
    sb.append("    maxReadingRangeTemp: ").append(toIndentedString(maxReadingRangeTemp)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    minReadingRangeTemp: ").append(toIndentedString(minReadingRangeTemp)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
    sb.append("    readingCelsius: ").append(toIndentedString(readingCelsius)).append("\n");
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

