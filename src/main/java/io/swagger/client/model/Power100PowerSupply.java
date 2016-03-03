package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Power100LineInputVoltageType;
import io.swagger.client.model.Power100PowerSupplyType;
import io.swagger.client.model.RedundancyRedundancy;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.util.ArrayList;
import java.util.List;



/**
 * Details of a power supplies associated with this system or device
 **/

@ApiModel(description = "Details of a power supplies associated with this system or device")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Power100PowerSupply   {
  
  private Power100LineInputVoltageType lineInputVoltageType = null;
  private String memberId = null;
  private ResourceOem oem = null;
  private Power100PowerSupplyType powerSupplyType = null;
  private List<RedundancyRedundancy> redundancy = new ArrayList<RedundancyRedundancy>();
  private Odata400Count redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private Odata400Count relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;

  
  /**
   * The line voltage type supported as an input to this Power Supply
   **/
  public Power100PowerSupply lineInputVoltageType(Power100LineInputVoltageType lineInputVoltageType) {
    this.lineInputVoltageType = lineInputVoltageType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The line voltage type supported as an input to this Power Supply")
  @JsonProperty("LineInputVoltageType")
  public Power100LineInputVoltageType getLineInputVoltageType() {
    return lineInputVoltageType;
  }
  public void setLineInputVoltageType(Power100LineInputVoltageType lineInputVoltageType) {
    this.lineInputVoltageType = lineInputVoltageType;
  }

  
  /**
   * This is the identifier for the member within the collection.
   **/
  public Power100PowerSupply memberId(String memberId) {
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
  public Power100PowerSupply oem(ResourceOem oem) {
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
   * The Power Supply type (AC or DC)
   **/
  public Power100PowerSupply powerSupplyType(Power100PowerSupplyType powerSupplyType) {
    this.powerSupplyType = powerSupplyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Power Supply type (AC or DC)")
  @JsonProperty("PowerSupplyType")
  public Power100PowerSupplyType getPowerSupplyType() {
    return powerSupplyType;
  }
  public void setPowerSupplyType(Power100PowerSupplyType powerSupplyType) {
    this.powerSupplyType = powerSupplyType;
  }

  
  /**
   * This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.
   **/
  public Power100PowerSupply redundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.")
  @JsonProperty("Redundancy")
  public List<RedundancyRedundancy> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  public Power100PowerSupply redundancyodataCount(Odata400Count redundancyodataCount) {
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
  public Power100PowerSupply redundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
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
   * The ID(s) of the resources associated with this Power Limit
   **/
  public Power100PowerSupply relatedItem(List<Odata400IdRef> relatedItem) {
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
  public Power100PowerSupply relatedItemodataCount(Odata400Count relatedItemodataCount) {
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
  public Power100PowerSupply relatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
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
  public Power100PowerSupply status(ResourceStatus status) {
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
    Power100PowerSupply power100PowerSupply = (Power100PowerSupply) o;
    return Objects.equals(this.lineInputVoltageType, power100PowerSupply.lineInputVoltageType) &&
        Objects.equals(this.memberId, power100PowerSupply.memberId) &&
        Objects.equals(this.oem, power100PowerSupply.oem) &&
        Objects.equals(this.powerSupplyType, power100PowerSupply.powerSupplyType) &&
        Objects.equals(this.redundancy, power100PowerSupply.redundancy) &&
        Objects.equals(this.redundancyodataCount, power100PowerSupply.redundancyodataCount) &&
        Objects.equals(this.redundancyodataNavigationLink, power100PowerSupply.redundancyodataNavigationLink) &&
        Objects.equals(this.relatedItem, power100PowerSupply.relatedItem) &&
        Objects.equals(this.relatedItemodataCount, power100PowerSupply.relatedItemodataCount) &&
        Objects.equals(this.relatedItemodataNavigationLink, power100PowerSupply.relatedItemodataNavigationLink) &&
        Objects.equals(this.status, power100PowerSupply.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineInputVoltageType, memberId, oem, powerSupplyType, redundancy, redundancyodataCount, redundancyodataNavigationLink, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerSupply {\n");
    
    sb.append("    lineInputVoltageType: ").append(toIndentedString(lineInputVoltageType)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    powerSupplyType: ").append(toIndentedString(powerSupplyType)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
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

