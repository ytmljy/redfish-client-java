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
public class Thermal100Temperature   {
  
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
  public Thermal100Temperature memberId(String memberId) {
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
  public Thermal100Temperature oem(ResourceOem oem) {
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
   * Describes the area or device to which this temperature measurement applies.
   **/
  public Thermal100Temperature physicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the area or device to which this temperature measurement applies.")
  @JsonProperty("PhysicalContext")
  public PhysicalContext100PhysicalContext getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * Describes the areas or devices to which this temperature measurement applies.
   **/
  public Thermal100Temperature relatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the areas or devices to which this temperature measurement applies.")
  @JsonProperty("RelatedItem")
  public List<Odata400IdRef> getRelatedItem() {
    return relatedItem;
  }
  public void setRelatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
  }

  
  /**
   **/
  public Thermal100Temperature relatedItemodataCount(Odata400Count relatedItemodataCount) {
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
  public Thermal100Temperature relatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
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
  public Thermal100Temperature status(ResourceStatus status) {
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
    Thermal100Temperature thermal100Temperature = (Thermal100Temperature) o;
    return Objects.equals(this.memberId, thermal100Temperature.memberId) &&
        Objects.equals(this.oem, thermal100Temperature.oem) &&
        Objects.equals(this.physicalContext, thermal100Temperature.physicalContext) &&
        Objects.equals(this.relatedItem, thermal100Temperature.relatedItem) &&
        Objects.equals(this.relatedItemodataCount, thermal100Temperature.relatedItemodataCount) &&
        Objects.equals(this.relatedItemodataNavigationLink, thermal100Temperature.relatedItemodataNavigationLink) &&
        Objects.equals(this.status, thermal100Temperature.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, oem, physicalContext, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thermal100Temperature {\n");
    
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

