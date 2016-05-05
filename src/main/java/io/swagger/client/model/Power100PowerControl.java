package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Power100PowerLimit;
import io.swagger.client.model.Power100PowerMetric;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;
import java.util.*;



/**
 * This is the base type for addressable members of an array.
 **/

@ApiModel(description = "This is the base type for addressable members of an array.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100PowerControl   {
  
  private String memberId = null;
  private String name = null;
  private ResourceOem oem = null;
  private BigDecimal powerAllocatedWatts = null;
  private BigDecimal powerAvailableWatts = null;
  private BigDecimal powerCapacityWatts = null;
  private BigDecimal powerConsumedWatts = null;
  private Power100PowerLimit powerLimit = null;
  private Power100PowerMetric powerMetrics = null;
  private BigDecimal powerRequestedWatts = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private BigDecimal relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;

  
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
   * Power Control Function name.
   **/
  
  @ApiModelProperty(value = "Power Control Function name.")
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
   * The total amount of power that has been allocated (or budegeted)to  chassis resources.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The total amount of power that has been allocated (or budegeted)to  chassis resources.")
  @JsonProperty("PowerAllocatedWatts")
  public BigDecimal getPowerAllocatedWatts() {
    return powerAllocatedWatts;
  }
  public void setPowerAllocatedWatts(BigDecimal powerAllocatedWatts) {
    this.powerAllocatedWatts = powerAllocatedWatts;
  }

  
  /**
   * The amount of power not already budgeted and therefore available for additional allocation. (powerCapacity - powerAllocated).  This indicates how much reserve power capacity is left.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The amount of power not already budgeted and therefore available for additional allocation. (powerCapacity - powerAllocated).  This indicates how much reserve power capacity is left.")
  @JsonProperty("PowerAvailableWatts")
  public BigDecimal getPowerAvailableWatts() {
    return powerAvailableWatts;
  }
  public void setPowerAvailableWatts(BigDecimal powerAvailableWatts) {
    this.powerAvailableWatts = powerAvailableWatts;
  }

  
  /**
   * The total amount of power available to the chassis for allocation. This may the power supply capacity, or power budget assigned to the chassis from an up-stream chassis.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The total amount of power available to the chassis for allocation. This may the power supply capacity, or power budget assigned to the chassis from an up-stream chassis.")
  @JsonProperty("PowerCapacityWatts")
  public BigDecimal getPowerCapacityWatts() {
    return powerCapacityWatts;
  }
  public void setPowerCapacityWatts(BigDecimal powerCapacityWatts) {
    this.powerCapacityWatts = powerCapacityWatts;
  }

  
  /**
   * The actual power being consumed by the chassis.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The actual power being consumed by the chassis.")
  @JsonProperty("PowerConsumedWatts")
  public BigDecimal getPowerConsumedWatts() {
    return powerConsumedWatts;
  }
  public void setPowerConsumedWatts(BigDecimal powerConsumedWatts) {
    this.powerConsumedWatts = powerConsumedWatts;
  }

  
  /**
   * Power limit status and configuration information for this chassis
   **/
  
  @ApiModelProperty(value = "Power limit status and configuration information for this chassis")
  @JsonProperty("PowerLimit")
  public Power100PowerLimit getPowerLimit() {
    return powerLimit;
  }
  public void setPowerLimit(Power100PowerLimit powerLimit) {
    this.powerLimit = powerLimit;
  }

  
  /**
   * Power readings for this chassis.
   **/
  
  @ApiModelProperty(value = "Power readings for this chassis.")
  @JsonProperty("PowerMetrics")
  public Power100PowerMetric getPowerMetrics() {
    return powerMetrics;
  }
  public void setPowerMetrics(Power100PowerMetric powerMetrics) {
    this.powerMetrics = powerMetrics;
  }

  
  /**
   * The potential power that the chassis resources are requesting which may be higher than the current level being consumed since requested power includes budget that the chassis resource wants for future use.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The potential power that the chassis resources are requesting which may be higher than the current level being consumed since requested power includes budget that the chassis resource wants for future use.")
  @JsonProperty("PowerRequestedWatts")
  public BigDecimal getPowerRequestedWatts() {
    return powerRequestedWatts;
  }
  public void setPowerRequestedWatts(BigDecimal powerRequestedWatts) {
    this.powerRequestedWatts = powerRequestedWatts;
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
    Power100PowerControl power100PowerControl = (Power100PowerControl) o;
    return Objects.equals(memberId, power100PowerControl.memberId) &&
        Objects.equals(name, power100PowerControl.name) &&
        Objects.equals(oem, power100PowerControl.oem) &&
        Objects.equals(powerAllocatedWatts, power100PowerControl.powerAllocatedWatts) &&
        Objects.equals(powerAvailableWatts, power100PowerControl.powerAvailableWatts) &&
        Objects.equals(powerCapacityWatts, power100PowerControl.powerCapacityWatts) &&
        Objects.equals(powerConsumedWatts, power100PowerControl.powerConsumedWatts) &&
        Objects.equals(powerLimit, power100PowerControl.powerLimit) &&
        Objects.equals(powerMetrics, power100PowerControl.powerMetrics) &&
        Objects.equals(powerRequestedWatts, power100PowerControl.powerRequestedWatts) &&
        Objects.equals(relatedItem, power100PowerControl.relatedItem) &&
        Objects.equals(relatedItemodataCount, power100PowerControl.relatedItemodataCount) &&
        Objects.equals(relatedItemodataNavigationLink, power100PowerControl.relatedItemodataNavigationLink) &&
        Objects.equals(status, power100PowerControl.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, name, oem, powerAllocatedWatts, powerAvailableWatts, powerCapacityWatts, powerConsumedWatts, powerLimit, powerMetrics, powerRequestedWatts, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerControl {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    powerAllocatedWatts: ").append(toIndentedString(powerAllocatedWatts)).append("\n");
    sb.append("    powerAvailableWatts: ").append(toIndentedString(powerAvailableWatts)).append("\n");
    sb.append("    powerCapacityWatts: ").append(toIndentedString(powerCapacityWatts)).append("\n");
    sb.append("    powerConsumedWatts: ").append(toIndentedString(powerConsumedWatts)).append("\n");
    sb.append("    powerLimit: ").append(toIndentedString(powerLimit)).append("\n");
    sb.append("    powerMetrics: ").append(toIndentedString(powerMetrics)).append("\n");
    sb.append("    powerRequestedWatts: ").append(toIndentedString(powerRequestedWatts)).append("\n");
    sb.append("    relatedItem: ").append(toIndentedString(relatedItem)).append("\n");
    sb.append("    relatedItemodataCount: ").append(toIndentedString(relatedItemodataCount)).append("\n");
    sb.append("    relatedItemodataNavigationLink: ").append(toIndentedString(relatedItemodataNavigationLink)).append("\n");
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

