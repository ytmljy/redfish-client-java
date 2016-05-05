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
 * Contains links to other resources that are related to this resource.
 **/

@ApiModel(description = "Contains links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ComputerSystem100ComputerSystemLinks   {
  
  private List<Odata400IdRef> managedBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef poweredByodataNavigationLink = null;
  private BigDecimal poweredByodataCount = null;
  private List<Odata400IdRef> cooledBy = new ArrayList<Odata400IdRef>();
  private BigDecimal managedByodataCount = null;
  private BigDecimal chassisodataCount = null;
  private List<Odata400IdRef> poweredBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef cooledByodataNavigationLink = null;
  private Odata400IdRef managedByodataNavigationLink = null;
  private Odata400IdRef chassisodataNavigationLink = null;
  private BigDecimal cooledByodataCount = null;
  private List<Odata400IdRef> chassis = new ArrayList<Odata400IdRef>();
  private ResourceOem oem = null;

  
  /**
   * An array of references to the Managers responsible for this system
   **/
  
  @ApiModelProperty(value = "An array of references to the Managers responsible for this system")
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
   * An array of ID[s] of resources that cool this computer system. Normally the ID will be a chassis or a specific set of fans.
   **/
  
  @ApiModelProperty(value = "An array of ID[s] of resources that cool this computer system. Normally the ID will be a chassis or a specific set of fans.")
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
  @JsonProperty("Chassis@odata.count")
  public BigDecimal getChassisodataCount() {
    return chassisodataCount;
  }
  public void setChassisodataCount(BigDecimal chassisodataCount) {
    this.chassisodataCount = chassisodataCount;
  }

  
  /**
   * An array of ID[s] of resources that power this computer system. Normally the ID will be a chassis or a specific set of powerSupplies
   **/
  
  @ApiModelProperty(value = "An array of ID[s] of resources that power this computer system. Normally the ID will be a chassis or a specific set of powerSupplies")
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Chassis@odata.navigationLink")
  public Odata400IdRef getChassisodataNavigationLink() {
    return chassisodataNavigationLink;
  }
  public void setChassisodataNavigationLink(Odata400IdRef chassisodataNavigationLink) {
    this.chassisodataNavigationLink = chassisodataNavigationLink;
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
   * An array of references to the chassis in which this system is contained
   **/
  
  @ApiModelProperty(value = "An array of references to the chassis in which this system is contained")
  @JsonProperty("Chassis")
  public List<Odata400IdRef> getChassis() {
    return chassis;
  }
  public void setChassis(List<Odata400IdRef> chassis) {
    this.chassis = chassis;
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

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ComputerSystemLinks computerSystem100ComputerSystemLinks = (ComputerSystem100ComputerSystemLinks) o;
    return Objects.equals(managedBy, computerSystem100ComputerSystemLinks.managedBy) &&
        Objects.equals(poweredByodataNavigationLink, computerSystem100ComputerSystemLinks.poweredByodataNavigationLink) &&
        Objects.equals(poweredByodataCount, computerSystem100ComputerSystemLinks.poweredByodataCount) &&
        Objects.equals(cooledBy, computerSystem100ComputerSystemLinks.cooledBy) &&
        Objects.equals(managedByodataCount, computerSystem100ComputerSystemLinks.managedByodataCount) &&
        Objects.equals(chassisodataCount, computerSystem100ComputerSystemLinks.chassisodataCount) &&
        Objects.equals(poweredBy, computerSystem100ComputerSystemLinks.poweredBy) &&
        Objects.equals(cooledByodataNavigationLink, computerSystem100ComputerSystemLinks.cooledByodataNavigationLink) &&
        Objects.equals(managedByodataNavigationLink, computerSystem100ComputerSystemLinks.managedByodataNavigationLink) &&
        Objects.equals(chassisodataNavigationLink, computerSystem100ComputerSystemLinks.chassisodataNavigationLink) &&
        Objects.equals(cooledByodataCount, computerSystem100ComputerSystemLinks.cooledByodataCount) &&
        Objects.equals(chassis, computerSystem100ComputerSystemLinks.chassis) &&
        Objects.equals(oem, computerSystem100ComputerSystemLinks.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedBy, poweredByodataNavigationLink, poweredByodataCount, cooledBy, managedByodataCount, chassisodataCount, poweredBy, cooledByodataNavigationLink, managedByodataNavigationLink, chassisodataNavigationLink, cooledByodataCount, chassis, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100ComputerSystemLinks {\n");
    
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    poweredByodataNavigationLink: ").append(toIndentedString(poweredByodataNavigationLink)).append("\n");
    sb.append("    poweredByodataCount: ").append(toIndentedString(poweredByodataCount)).append("\n");
    sb.append("    cooledBy: ").append(toIndentedString(cooledBy)).append("\n");
    sb.append("    managedByodataCount: ").append(toIndentedString(managedByodataCount)).append("\n");
    sb.append("    chassisodataCount: ").append(toIndentedString(chassisodataCount)).append("\n");
    sb.append("    poweredBy: ").append(toIndentedString(poweredBy)).append("\n");
    sb.append("    cooledByodataNavigationLink: ").append(toIndentedString(cooledByodataNavigationLink)).append("\n");
    sb.append("    managedByodataNavigationLink: ").append(toIndentedString(managedByodataNavigationLink)).append("\n");
    sb.append("    chassisodataNavigationLink: ").append(toIndentedString(chassisodataNavigationLink)).append("\n");
    sb.append("    cooledByodataCount: ").append(toIndentedString(cooledByodataCount)).append("\n");
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

