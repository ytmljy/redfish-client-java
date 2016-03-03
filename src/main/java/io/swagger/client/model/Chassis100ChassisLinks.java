package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChassisChassis;
import io.swagger.client.model.ComputerSystemComputerSystem;
import io.swagger.client.model.ManagerManager;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;



/**
 * The links object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "The links object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Chassis100ChassisLinks   {
  
  private Odata400IdRef containsodataNavigationLink = null;
  private List<ManagerManager> managedBy = new ArrayList<ManagerManager>();
  private Odata400IdRef poweredByodataNavigationLink = null;
  private ChassisChassis containedBy = null;
  private Odata400Count poweredByodataCount = null;
  private List<Odata400IdRef> cooledBy = new ArrayList<Odata400IdRef>();
  private Odata400Count managedByodataCount = null;
  private Odata400Count computerSystemsodataCount = null;
  private List<ChassisChassis> contains = new ArrayList<ChassisChassis>();
  private List<Odata400IdRef> poweredBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef cooledByodataNavigationLink = null;
  private Odata400IdRef managedByodataNavigationLink = null;
  private List<ComputerSystemComputerSystem> computerSystems = new ArrayList<ComputerSystemComputerSystem>();
  private Odata400Count containsodataCount = null;
  private Odata400Count cooledByodataCount = null;
  private ResourceOem oem = null;
  private Odata400IdRef computerSystemsodataNavigationLink = null;

  
  /**
   **/
  public Chassis100ChassisLinks containsodataNavigationLink(Odata400IdRef containsodataNavigationLink) {
    this.containsodataNavigationLink = containsodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Chassis100ChassisLinks managedBy(List<ManagerManager> managedBy) {
    this.managedBy = managedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of references to the managers contained in this chassis.")
  @JsonProperty("ManagedBy")
  public List<ManagerManager> getManagedBy() {
    return managedBy;
  }
  public void setManagedBy(List<ManagerManager> managedBy) {
    this.managedBy = managedBy;
  }

  
  /**
   **/
  public Chassis100ChassisLinks poweredByodataNavigationLink(Odata400IdRef poweredByodataNavigationLink) {
    this.poweredByodataNavigationLink = poweredByodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Chassis100ChassisLinks containedBy(ChassisChassis containedBy) {
    this.containedBy = containedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the chassis that this chassis is contained by.")
  @JsonProperty("ContainedBy")
  public ChassisChassis getContainedBy() {
    return containedBy;
  }
  public void setContainedBy(ChassisChassis containedBy) {
    this.containedBy = containedBy;
  }

  
  /**
   **/
  public Chassis100ChassisLinks poweredByodataCount(Odata400Count poweredByodataCount) {
    this.poweredByodataCount = poweredByodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("PoweredBy@odata.count")
  public Odata400Count getPoweredByodataCount() {
    return poweredByodataCount;
  }
  public void setPoweredByodataCount(Odata400Count poweredByodataCount) {
    this.poweredByodataCount = poweredByodataCount;
  }

  
  /**
   * An array of ID[s] of resources that cool this chassis. Normally the ID will be a chassis or a specific set of fans.
   **/
  public Chassis100ChassisLinks cooledBy(List<Odata400IdRef> cooledBy) {
    this.cooledBy = cooledBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of ID[s] of resources that cool this chassis. Normally the ID will be a chassis or a specific set of fans.")
  @JsonProperty("CooledBy")
  public List<Odata400IdRef> getCooledBy() {
    return cooledBy;
  }
  public void setCooledBy(List<Odata400IdRef> cooledBy) {
    this.cooledBy = cooledBy;
  }

  
  /**
   **/
  public Chassis100ChassisLinks managedByodataCount(Odata400Count managedByodataCount) {
    this.managedByodataCount = managedByodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ManagedBy@odata.count")
  public Odata400Count getManagedByodataCount() {
    return managedByodataCount;
  }
  public void setManagedByodataCount(Odata400Count managedByodataCount) {
    this.managedByodataCount = managedByodataCount;
  }

  
  /**
   **/
  public Chassis100ChassisLinks computerSystemsodataCount(Odata400Count computerSystemsodataCount) {
    this.computerSystemsodataCount = computerSystemsodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ComputerSystems@odata.count")
  public Odata400Count getComputerSystemsodataCount() {
    return computerSystemsodataCount;
  }
  public void setComputerSystemsodataCount(Odata400Count computerSystemsodataCount) {
    this.computerSystemsodataCount = computerSystemsodataCount;
  }

  
  /**
   * An array of references to any other chassis that this chassis has in it.
   **/
  public Chassis100ChassisLinks contains(List<ChassisChassis> contains) {
    this.contains = contains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of references to any other chassis that this chassis has in it.")
  @JsonProperty("Contains")
  public List<ChassisChassis> getContains() {
    return contains;
  }
  public void setContains(List<ChassisChassis> contains) {
    this.contains = contains;
  }

  
  /**
   * An array of ID[s] of resources that power this chassis. Normally the ID will be a chassis or a specific set of powerSupplies
   **/
  public Chassis100ChassisLinks poweredBy(List<Odata400IdRef> poweredBy) {
    this.poweredBy = poweredBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of ID[s] of resources that power this chassis. Normally the ID will be a chassis or a specific set of powerSupplies")
  @JsonProperty("PoweredBy")
  public List<Odata400IdRef> getPoweredBy() {
    return poweredBy;
  }
  public void setPoweredBy(List<Odata400IdRef> poweredBy) {
    this.poweredBy = poweredBy;
  }

  
  /**
   **/
  public Chassis100ChassisLinks cooledByodataNavigationLink(Odata400IdRef cooledByodataNavigationLink) {
    this.cooledByodataNavigationLink = cooledByodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("CooledBy@odata.navigationLink")
  public Odata400IdRef getCooledByodataNavigationLink() {
    return cooledByodataNavigationLink;
  }
  public void setCooledByodataNavigationLink(Odata400IdRef cooledByodataNavigationLink) {
    this.cooledByodataNavigationLink = cooledByodataNavigationLink;
  }

  
  /**
   **/
  public Chassis100ChassisLinks managedByodataNavigationLink(Odata400IdRef managedByodataNavigationLink) {
    this.managedByodataNavigationLink = managedByodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Chassis100ChassisLinks computerSystems(List<ComputerSystemComputerSystem> computerSystems) {
    this.computerSystems = computerSystems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of references to the computer systems contained in this chassis.  This will only reference ComputerSystems that are directly and wholly contained in this chassis.")
  @JsonProperty("ComputerSystems")
  public List<ComputerSystemComputerSystem> getComputerSystems() {
    return computerSystems;
  }
  public void setComputerSystems(List<ComputerSystemComputerSystem> computerSystems) {
    this.computerSystems = computerSystems;
  }

  
  /**
   **/
  public Chassis100ChassisLinks containsodataCount(Odata400Count containsodataCount) {
    this.containsodataCount = containsodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Contains@odata.count")
  public Odata400Count getContainsodataCount() {
    return containsodataCount;
  }
  public void setContainsodataCount(Odata400Count containsodataCount) {
    this.containsodataCount = containsodataCount;
  }

  
  /**
   **/
  public Chassis100ChassisLinks cooledByodataCount(Odata400Count cooledByodataCount) {
    this.cooledByodataCount = cooledByodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("CooledBy@odata.count")
  public Odata400Count getCooledByodataCount() {
    return cooledByodataCount;
  }
  public void setCooledByodataCount(Odata400Count cooledByodataCount) {
    this.cooledByodataCount = cooledByodataCount;
  }

  
  /**
   * Oem extension object.
   **/
  public Chassis100ChassisLinks oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Oem extension object.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   **/
  public Chassis100ChassisLinks computerSystemsodataNavigationLink(Odata400IdRef computerSystemsodataNavigationLink) {
    this.computerSystemsodataNavigationLink = computerSystemsodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ComputerSystems@odata.navigationLink")
  public Odata400IdRef getComputerSystemsodataNavigationLink() {
    return computerSystemsodataNavigationLink;
  }
  public void setComputerSystemsodataNavigationLink(Odata400IdRef computerSystemsodataNavigationLink) {
    this.computerSystemsodataNavigationLink = computerSystemsodataNavigationLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chassis100ChassisLinks chassis100ChassisLinks = (Chassis100ChassisLinks) o;
    return Objects.equals(this.containsodataNavigationLink, chassis100ChassisLinks.containsodataNavigationLink) &&
        Objects.equals(this.managedBy, chassis100ChassisLinks.managedBy) &&
        Objects.equals(this.poweredByodataNavigationLink, chassis100ChassisLinks.poweredByodataNavigationLink) &&
        Objects.equals(this.containedBy, chassis100ChassisLinks.containedBy) &&
        Objects.equals(this.poweredByodataCount, chassis100ChassisLinks.poweredByodataCount) &&
        Objects.equals(this.cooledBy, chassis100ChassisLinks.cooledBy) &&
        Objects.equals(this.managedByodataCount, chassis100ChassisLinks.managedByodataCount) &&
        Objects.equals(this.computerSystemsodataCount, chassis100ChassisLinks.computerSystemsodataCount) &&
        Objects.equals(this.contains, chassis100ChassisLinks.contains) &&
        Objects.equals(this.poweredBy, chassis100ChassisLinks.poweredBy) &&
        Objects.equals(this.cooledByodataNavigationLink, chassis100ChassisLinks.cooledByodataNavigationLink) &&
        Objects.equals(this.managedByodataNavigationLink, chassis100ChassisLinks.managedByodataNavigationLink) &&
        Objects.equals(this.computerSystems, chassis100ChassisLinks.computerSystems) &&
        Objects.equals(this.containsodataCount, chassis100ChassisLinks.containsodataCount) &&
        Objects.equals(this.cooledByodataCount, chassis100ChassisLinks.cooledByodataCount) &&
        Objects.equals(this.oem, chassis100ChassisLinks.oem) &&
        Objects.equals(this.computerSystemsodataNavigationLink, chassis100ChassisLinks.computerSystemsodataNavigationLink);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

