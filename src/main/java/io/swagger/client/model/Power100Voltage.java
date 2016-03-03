package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.PhysicalContext100PhysicalContext;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the base type for addressable members of an array.
 **/

@ApiModel(description = "This is the base type for addressable members of an array.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Power100Voltage   {
  
  private String memberId = null;
  private ResourceOem oem = null;
  private PhysicalContext100PhysicalContext physicalContext = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private Odata400Count relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;

  
  /**
   * This is the identifier for the member within the collection.
   **/
  public Power100Voltage memberId(String memberId) {
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
  public Power100Voltage oem(ResourceOem oem) {
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
   * Describes the area or device to which this voltage measurement applies.
   **/
  public Power100Voltage physicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the area or device to which this voltage measurement applies.")
  @JsonProperty("PhysicalContext")
  public PhysicalContext100PhysicalContext getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * Describes the areas or devices to which this voltage measurement applies.
   **/
  public Power100Voltage relatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the areas or devices to which this voltage measurement applies.")
  @JsonProperty("RelatedItem")
  public List<Odata400IdRef> getRelatedItem() {
    return relatedItem;
  }
  public void setRelatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
  }

  
  /**
   **/
  public Power100Voltage relatedItemodataCount(Odata400Count relatedItemodataCount) {
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
  public Power100Voltage relatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
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
  public Power100Voltage status(ResourceStatus status) {
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
    Power100Voltage power100Voltage = (Power100Voltage) o;
    return Objects.equals(this.memberId, power100Voltage.memberId) &&
        Objects.equals(this.oem, power100Voltage.oem) &&
        Objects.equals(this.physicalContext, power100Voltage.physicalContext) &&
        Objects.equals(this.relatedItem, power100Voltage.relatedItem) &&
        Objects.equals(this.relatedItemodataCount, power100Voltage.relatedItemodataCount) &&
        Objects.equals(this.relatedItemodataNavigationLink, power100Voltage.relatedItemodataNavigationLink) &&
        Objects.equals(this.status, power100Voltage.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, oem, physicalContext, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100Voltage {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
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

