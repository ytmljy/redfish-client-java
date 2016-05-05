package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import java.math.BigDecimal;
import java.util.*;



/**
 * The links object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "The links object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Chassis100ChassisLinks   {
  
  private Odata400IdRef containsodataNavigationLink = null;
  private List<Odata400IdRef> managedBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef poweredByodataNavigationLink = null;
  private Odata400IdRef containedBy = null;
  private BigDecimal poweredByodataCount = null;
  private List<Odata400IdRef> cooledBy = new ArrayList<Odata400IdRef>();
  private BigDecimal managedByodataCount = null;
  private BigDecimal computerSystemsodataCount = null;
  private List<Odata400IdRef> contains = new ArrayList<Odata400IdRef>();
  private List<Odata400IdRef> poweredBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef cooledByodataNavigationLink = null;
  private Odata400IdRef managedByodataNavigationLink = null;
  private List<Odata400IdRef> computerSystems = new ArrayList<Odata400IdRef>();
  private BigDecimal containsodataCount = null;
  private BigDecimal cooledByodataCount = null;
  private ResourceOem oem = null;
  private Odata400IdRef computerSystemsodataNavigationLink = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Contains@odata.navigationLink")
  public Odata400IdRef getContainsodataNavigationLink() {
    return containsodataNavigationLink;
  }
  public void setContainsodataNavigationLink(Odata400IdRef containsodataNavigationLink) {
    this.containsodataNavigationLink = containsodataNavigationLink;
  }

  
  /**
   * An array of references to the managers contained in this chassis.
   **/
  
  @ApiModelProperty(value = "An array of references to the managers contained in this chassis.")
  @JsonProperty("ManagedBy")
  public List<Odata400IdRef> getManagedBy() {
    return managedBy;
  }
  public void setManagedBy(List<Odata400IdRef> managedBy) {
    this.managedBy = managedBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PoweredBy@odata.navigationLink")
  public Odata400IdRef getPoweredByodataNavigationLink() {
    return poweredByodataNavigationLink;
  }
  public void setPoweredByodataNavigationLink(Odata400IdRef poweredByodataNavigationLink) {
    this.poweredByodataNavigationLink = poweredByodataNavigationLink;
  }

  
  /**
   * A reference to the chassis that this chassis is contained by.
   **/
  
  @ApiModelProperty(value = "A reference to the chassis that this chassis is contained by.")
  @JsonProperty("ContainedBy")
  public Odata400IdRef getContainedBy() {
    return containedBy;
  }
  public void setContainedBy(Odata400IdRef containedBy) {
    this.containedBy = containedBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PoweredBy@odata.count")
  public BigDecimal getPoweredByodataCount() {
    return poweredByodataCount;
  }
  public void setPoweredByodataCount(BigDecimal poweredByodataCount) {
    this.poweredByodataCount = poweredByodataCount;
  }

  
  /**
   * An array of ID[s] of resources that cool this chassis. Normally the ID will be a chassis or a specific set of fans.
   **/
  
  @ApiModelProperty(value = "An array of ID[s] of resources that cool this chassis. Normally the ID will be a chassis or a specific set of fans.")
  @JsonProperty("CooledBy")
  public List<Odata400IdRef> getCooledBy() {
    return cooledBy;
  }
  public void setCooledBy(List<Odata400IdRef> cooledBy) {
    this.cooledBy = cooledBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ManagedBy@odata.count")
  public BigDecimal getManagedByodataCount() {
    return managedByodataCount;
  }
  public void setManagedByodataCount(BigDecimal managedByodataCount) {
    this.managedByodataCount = managedByodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ComputerSystems@odata.count")
  public BigDecimal getComputerSystemsodataCount() {
    return computerSystemsodataCount;
  }
  public void setComputerSystemsodataCount(BigDecimal computerSystemsodataCount) {
    this.computerSystemsodataCount = computerSystemsodataCount;
  }

  
  /**
   * An array of references to any other chassis that this chassis has in it.
   **/
  
  @ApiModelProperty(value = "An array of references to any other chassis that this chassis has in it.")
  @JsonProperty("Contains")
  public List<Odata400IdRef> getContains() {
    return contains;
  }
  public void setContains(List<Odata400IdRef> contains) {
    this.contains = contains;
  }

  
  /**
   * An array of ID[s] of resources that power this chassis. Normally the ID will be a chassis or a specific set of powerSupplies
   **/
  
  @ApiModelProperty(value = "An array of ID[s] of resources that power this chassis. Normally the ID will be a chassis or a specific set of powerSupplies")
  @JsonProperty("PoweredBy")
  public List<Odata400IdRef> getPoweredBy() {
    return poweredBy;
  }
  public void setPoweredBy(List<Odata400IdRef> poweredBy) {
    this.poweredBy = poweredBy;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CooledBy@odata.navigationLink")
  public Odata400IdRef getCooledByodataNavigationLink() {
    return cooledByodataNavigationLink;
  }
  public void setCooledByodataNavigationLink(Odata400IdRef cooledByodataNavigationLink) {
    this.cooledByodataNavigationLink = cooledByodataNavigationLink;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ManagedBy@odata.navigationLink")
  public Odata400IdRef getManagedByodataNavigationLink() {
    return managedByodataNavigationLink;
  }
  public void setManagedByodataNavigationLink(Odata400IdRef managedByodataNavigationLink) {
    this.managedByodataNavigationLink = managedByodataNavigationLink;
  }

  
  /**
   * An array of references to the computer systems contained in this chassis.  This will only reference ComputerSystems that are directly and wholly contained in this chassis.
   **/
  
  @ApiModelProperty(value = "An array of references to the computer systems contained in this chassis.  This will only reference ComputerSystems that are directly and wholly contained in this chassis.")
  @JsonProperty("ComputerSystems")
  public List<Odata400IdRef> getComputerSystems() {
    return computerSystems;
  }
  public void setComputerSystems(List<Odata400IdRef> computerSystems) {
    this.computerSystems = computerSystems;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Contains@odata.count")
  public BigDecimal getContainsodataCount() {
    return containsodataCount;
  }
  public void setContainsodataCount(BigDecimal containsodataCount) {
    this.containsodataCount = containsodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CooledBy@odata.count")
  public BigDecimal getCooledByodataCount() {
    return cooledByodataCount;
  }
  public void setCooledByodataCount(BigDecimal cooledByodataCount) {
    this.cooledByodataCount = cooledByodataCount;
  }

  
  /**
   * Oem extension object.
   **/
  
  @ApiModelProperty(value = "Oem extension object.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ComputerSystems@odata.navigationLink")
  public Odata400IdRef getComputerSystemsodataNavigationLink() {
    return computerSystemsodataNavigationLink;
  }
  public void setComputerSystemsodataNavigationLink(Odata400IdRef computerSystemsodataNavigationLink) {
    this.computerSystemsodataNavigationLink = computerSystemsodataNavigationLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chassis100ChassisLinks chassis100ChassisLinks = (Chassis100ChassisLinks) o;
    return Objects.equals(containsodataNavigationLink, chassis100ChassisLinks.containsodataNavigationLink) &&
        Objects.equals(managedBy, chassis100ChassisLinks.managedBy) &&
        Objects.equals(poweredByodataNavigationLink, chassis100ChassisLinks.poweredByodataNavigationLink) &&
        Objects.equals(containedBy, chassis100ChassisLinks.containedBy) &&
        Objects.equals(poweredByodataCount, chassis100ChassisLinks.poweredByodataCount) &&
        Objects.equals(cooledBy, chassis100ChassisLinks.cooledBy) &&
        Objects.equals(managedByodataCount, chassis100ChassisLinks.managedByodataCount) &&
        Objects.equals(computerSystemsodataCount, chassis100ChassisLinks.computerSystemsodataCount) &&
        Objects.equals(contains, chassis100ChassisLinks.contains) &&
        Objects.equals(poweredBy, chassis100ChassisLinks.poweredBy) &&
        Objects.equals(cooledByodataNavigationLink, chassis100ChassisLinks.cooledByodataNavigationLink) &&
        Objects.equals(managedByodataNavigationLink, chassis100ChassisLinks.managedByodataNavigationLink) &&
        Objects.equals(computerSystems, chassis100ChassisLinks.computerSystems) &&
        Objects.equals(containsodataCount, chassis100ChassisLinks.containsodataCount) &&
        Objects.equals(cooledByodataCount, chassis100ChassisLinks.cooledByodataCount) &&
        Objects.equals(oem, chassis100ChassisLinks.oem) &&
        Objects.equals(computerSystemsodataNavigationLink, chassis100ChassisLinks.computerSystemsodataNavigationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containsodataNavigationLink, managedBy, poweredByodataNavigationLink, containedBy, poweredByodataCount, cooledBy, managedByodataCount, computerSystemsodataCount, contains, poweredBy, cooledByodataNavigationLink, managedByodataNavigationLink, computerSystems, containsodataCount, cooledByodataCount, oem, computerSystemsodataNavigationLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chassis100ChassisLinks {\n");
    
    sb.append("    containsodataNavigationLink: ").append(toIndentedString(containsodataNavigationLink)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    poweredByodataNavigationLink: ").append(toIndentedString(poweredByodataNavigationLink)).append("\n");
    sb.append("    containedBy: ").append(toIndentedString(containedBy)).append("\n");
    sb.append("    poweredByodataCount: ").append(toIndentedString(poweredByodataCount)).append("\n");
    sb.append("    cooledBy: ").append(toIndentedString(cooledBy)).append("\n");
    sb.append("    managedByodataCount: ").append(toIndentedString(managedByodataCount)).append("\n");
    sb.append("    computerSystemsodataCount: ").append(toIndentedString(computerSystemsodataCount)).append("\n");
    sb.append("    contains: ").append(toIndentedString(contains)).append("\n");
    sb.append("    poweredBy: ").append(toIndentedString(poweredBy)).append("\n");
    sb.append("    cooledByodataNavigationLink: ").append(toIndentedString(cooledByodataNavigationLink)).append("\n");
    sb.append("    managedByodataNavigationLink: ").append(toIndentedString(managedByodataNavigationLink)).append("\n");
    sb.append("    computerSystems: ").append(toIndentedString(computerSystems)).append("\n");
    sb.append("    containsodataCount: ").append(toIndentedString(containsodataCount)).append("\n");
    sb.append("    cooledByodataCount: ").append(toIndentedString(cooledByodataCount)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    computerSystemsodataNavigationLink: ").append(toIndentedString(computerSystemsodataNavigationLink)).append("\n");
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

