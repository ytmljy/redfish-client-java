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
public class Thermal100Fan   {
  
  private String fanName = null;
  private BigDecimal lowerThresholdCritical = null;
  private BigDecimal lowerThresholdFatal = null;
  private BigDecimal lowerThresholdNonCritical = null;
  private BigDecimal maxReadingRange = null;
  private String memberId = null;
  private BigDecimal minReadingRange = null;
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
  private BigDecimal readingRPM = null;
  private List<Odata400IdRef> redundancy = new ArrayList<Odata400IdRef>();
  private BigDecimal redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private BigDecimal relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;
  private BigDecimal upperThresholdCritical = null;
  private BigDecimal upperThresholdFatal = null;
  private BigDecimal upperThresholdNonCritical = null;

  
  /**
   * Name of the fan
   **/
  
  @ApiModelProperty(value = "Name of the fan")
  @JsonProperty("FanName")
  public String getFanName() {
    return fanName;
  }
  public void setFanName(String fanName) {
    this.fanName = fanName;
  }

  
  /**
   * Below normal range but not yet fatal
   **/
  
  @ApiModelProperty(value = "Below normal range but not yet fatal")
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
   * Maximum value for ReadingRPM
   **/
  
  @ApiModelProperty(value = "Maximum value for ReadingRPM")
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
   * Minimum value for ReadingRPM
   **/
  
  @ApiModelProperty(value = "Minimum value for ReadingRPM")
  @JsonProperty("MinReadingRange")
  public BigDecimal getMinReadingRange() {
    return minReadingRange;
  }
  public void setMinReadingRange(BigDecimal minReadingRange) {
    this.minReadingRange = minReadingRange;
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
   * Describes the area or device associated with this fan.
   **/
  
  @ApiModelProperty(value = "Describes the area or device associated with this fan.")
  @JsonProperty("PhysicalContext")
  public PhysicalContextEnum getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContextEnum physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * Current fan speed in RPM
   **/
  
  @ApiModelProperty(value = "Current fan speed in RPM")
  @JsonProperty("ReadingRPM")
  public BigDecimal getReadingRPM() {
    return readingRPM;
  }
  public void setReadingRPM(BigDecimal readingRPM) {
    this.readingRPM = readingRPM;
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
   * The ID(s) of the resources serviced with this fan
   **/
  
  @ApiModelProperty(value = "The ID(s) of the resources serviced with this fan")
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
   * Above normal range but not yet fatal
   **/
  
  @ApiModelProperty(value = "Above normal range but not yet fatal")
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
    Thermal100Fan thermal100Fan = (Thermal100Fan) o;
    return Objects.equals(fanName, thermal100Fan.fanName) &&
        Objects.equals(lowerThresholdCritical, thermal100Fan.lowerThresholdCritical) &&
        Objects.equals(lowerThresholdFatal, thermal100Fan.lowerThresholdFatal) &&
        Objects.equals(lowerThresholdNonCritical, thermal100Fan.lowerThresholdNonCritical) &&
        Objects.equals(maxReadingRange, thermal100Fan.maxReadingRange) &&
        Objects.equals(memberId, thermal100Fan.memberId) &&
        Objects.equals(minReadingRange, thermal100Fan.minReadingRange) &&
        Objects.equals(oem, thermal100Fan.oem) &&
        Objects.equals(physicalContext, thermal100Fan.physicalContext) &&
        Objects.equals(readingRPM, thermal100Fan.readingRPM) &&
        Objects.equals(redundancy, thermal100Fan.redundancy) &&
        Objects.equals(redundancyodataCount, thermal100Fan.redundancyodataCount) &&
        Objects.equals(redundancyodataNavigationLink, thermal100Fan.redundancyodataNavigationLink) &&
        Objects.equals(relatedItem, thermal100Fan.relatedItem) &&
        Objects.equals(relatedItemodataCount, thermal100Fan.relatedItemodataCount) &&
        Objects.equals(relatedItemodataNavigationLink, thermal100Fan.relatedItemodataNavigationLink) &&
        Objects.equals(status, thermal100Fan.status) &&
        Objects.equals(upperThresholdCritical, thermal100Fan.upperThresholdCritical) &&
        Objects.equals(upperThresholdFatal, thermal100Fan.upperThresholdFatal) &&
        Objects.equals(upperThresholdNonCritical, thermal100Fan.upperThresholdNonCritical);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fanName, lowerThresholdCritical, lowerThresholdFatal, lowerThresholdNonCritical, maxReadingRange, memberId, minReadingRange, oem, physicalContext, readingRPM, redundancy, redundancyodataCount, redundancyodataNavigationLink, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status, upperThresholdCritical, upperThresholdFatal, upperThresholdNonCritical);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thermal100Fan {\n");
    
    sb.append("    fanName: ").append(toIndentedString(fanName)).append("\n");
    sb.append("    lowerThresholdCritical: ").append(toIndentedString(lowerThresholdCritical)).append("\n");
    sb.append("    lowerThresholdFatal: ").append(toIndentedString(lowerThresholdFatal)).append("\n");
    sb.append("    lowerThresholdNonCritical: ").append(toIndentedString(lowerThresholdNonCritical)).append("\n");
    sb.append("    maxReadingRange: ").append(toIndentedString(maxReadingRange)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    minReadingRange: ").append(toIndentedString(minReadingRange)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
    sb.append("    readingRPM: ").append(toIndentedString(readingRPM)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    relatedItem: ").append(toIndentedString(relatedItem)).append("\n");
    sb.append("    relatedItemodataCount: ").append(toIndentedString(relatedItemodataCount)).append("\n");
    sb.append("    relatedItemodataNavigationLink: ").append(toIndentedString(relatedItemodataNavigationLink)).append("\n");
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

