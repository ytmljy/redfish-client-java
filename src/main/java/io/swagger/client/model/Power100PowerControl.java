package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Power100PowerLimit;
import io.swagger.client.model.Power100PowerMetric;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the base type for addressable members of an array.
 **/

@ApiModel(description = "This is the base type for addressable members of an array.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Power100PowerControl   {
  
  private String memberId = null;
  private ResourceOem oem = null;
  private Power100PowerLimit powerLimit = null;
  private Power100PowerMetric powerMetrics = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private Odata400Count relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;

  
  /**
   * This is the identifier for the member within the collection.
   **/
  public Power100PowerControl memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the identifier for the member within the collection.")
  @JsonProperty("MemberId")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  public Power100PowerControl oem(ResourceOem oem) {
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
   * Power limit status and configuration information for this chassis
   **/
  public Power100PowerControl powerLimit(Power100PowerLimit powerLimit) {
    this.powerLimit = powerLimit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Power limit status and configuration information for this chassis")
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
  public Power100PowerControl powerMetrics(Power100PowerMetric powerMetrics) {
    this.powerMetrics = powerMetrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Power readings for this chassis.")
  @JsonProperty("PowerMetrics")
  public Power100PowerMetric getPowerMetrics() {
    return powerMetrics;
  }
  public void setPowerMetrics(Power100PowerMetric powerMetrics) {
    this.powerMetrics = powerMetrics;
  }

  
  /**
   * The ID(s) of the resources associated with this Power Limit
   **/
  public Power100PowerControl relatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID(s) of the resources associated with this Power Limit")
  @JsonProperty("RelatedItem")
  public List<Odata400IdRef> getRelatedItem() {
    return relatedItem;
  }
  public void setRelatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
  }

  
  /**
   **/
  public Power100PowerControl relatedItemodataCount(Odata400Count relatedItemodataCount) {
    this.relatedItemodataCount = relatedItemodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("RelatedItem@odata.count")
  public Odata400Count getRelatedItemodataCount() {
    return relatedItemodataCount;
  }
  public void setRelatedItemodataCount(Odata400Count relatedItemodataCount) {
    this.relatedItemodataCount = relatedItemodataCount;
  }

  
  /**
   **/
  public Power100PowerControl relatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
    this.relatedItemodataNavigationLink = relatedItemodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("RelatedItem@odata.navigationLink")
  public Odata400IdRef getRelatedItemodataNavigationLink() {
    return relatedItemodataNavigationLink;
  }
  public void setRelatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
    this.relatedItemodataNavigationLink = relatedItemodataNavigationLink;
  }

  
  /**
   **/
  public Power100PowerControl status(ResourceStatus status) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100PowerControl power100PowerControl = (Power100PowerControl) o;
    return Objects.equals(this.memberId, power100PowerControl.memberId) &&
        Objects.equals(this.oem, power100PowerControl.oem) &&
        Objects.equals(this.powerLimit, power100PowerControl.powerLimit) &&
        Objects.equals(this.powerMetrics, power100PowerControl.powerMetrics) &&
        Objects.equals(this.relatedItem, power100PowerControl.relatedItem) &&
        Objects.equals(this.relatedItemodataCount, power100PowerControl.relatedItemodataCount) &&
        Objects.equals(this.relatedItemodataNavigationLink, power100PowerControl.relatedItemodataNavigationLink) &&
        Objects.equals(this.status, power100PowerControl.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, oem, powerLimit, powerMetrics, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerControl {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    powerLimit: ").append(toIndentedString(powerLimit)).append("\n");
    sb.append("    powerMetrics: ").append(toIndentedString(powerMetrics)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

