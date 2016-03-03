package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChassisChassis;
import io.swagger.client.model.ManagerManager;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;



/**
 * Contains links to other resources that are related to this resource.
 **/

@ApiModel(description = "Contains links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ComputerSystem100ComputerSystemLinks   {
  
  private List<ManagerManager> managedBy = new ArrayList<ManagerManager>();
  private Odata400IdRef poweredByodataNavigationLink = null;
  private Odata400Count poweredByodataCount = null;
  private List<Odata400IdRef> cooledBy = new ArrayList<Odata400IdRef>();
  private Odata400Count managedByodataCount = null;
  private Odata400Count chassisodataCount = null;
  private List<Odata400IdRef> poweredBy = new ArrayList<Odata400IdRef>();
  private Odata400IdRef cooledByodataNavigationLink = null;
  private Odata400IdRef managedByodataNavigationLink = null;
  private Odata400IdRef chassisodataNavigationLink = null;
  private Odata400Count cooledByodataCount = null;
  private List<ChassisChassis> chassis = new ArrayList<ChassisChassis>();
  private ResourceOem oem = null;

  
  /**
   * An array of references to the Managers responsible for this system
   **/
  public ComputerSystem100ComputerSystemLinks managedBy(List<ManagerManager> managedBy) {
    this.managedBy = managedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of references to the Managers responsible for this system")
  @JsonProperty("ManagedBy")
  public List<ManagerManager> getManagedBy() {
    return managedBy;
  }
  public void setManagedBy(List<ManagerManager> managedBy) {
    this.managedBy = managedBy;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystemLinks poweredByodataNavigationLink(Odata400IdRef poweredByodataNavigationLink) {
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
   **/
  public ComputerSystem100ComputerSystemLinks poweredByodataCount(Odata400Count poweredByodataCount) {
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
   * An array of ID[s] of resources that cool this computer system. Normally the ID will be a chassis or a specific set of fans.
   **/
  public ComputerSystem100ComputerSystemLinks cooledBy(List<Odata400IdRef> cooledBy) {
    this.cooledBy = cooledBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of ID[s] of resources that cool this computer system. Normally the ID will be a chassis or a specific set of fans.")
  @JsonProperty("CooledBy")
  public List<Odata400IdRef> getCooledBy() {
    return cooledBy;
  }
  public void setCooledBy(List<Odata400IdRef> cooledBy) {
    this.cooledBy = cooledBy;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystemLinks managedByodataCount(Odata400Count managedByodataCount) {
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
  public ComputerSystem100ComputerSystemLinks chassisodataCount(Odata400Count chassisodataCount) {
    this.chassisodataCount = chassisodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Chassis@odata.count")
  public Odata400Count getChassisodataCount() {
    return chassisodataCount;
  }
  public void setChassisodataCount(Odata400Count chassisodataCount) {
    this.chassisodataCount = chassisodataCount;
  }

  
  /**
   * An array of ID[s] of resources that power this computer system. Normally the ID will be a chassis or a specific set of powerSupplies
   **/
  public ComputerSystem100ComputerSystemLinks poweredBy(List<Odata400IdRef> poweredBy) {
    this.poweredBy = poweredBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of ID[s] of resources that power this computer system. Normally the ID will be a chassis or a specific set of powerSupplies")
  @JsonProperty("PoweredBy")
  public List<Odata400IdRef> getPoweredBy() {
    return poweredBy;
  }
  public void setPoweredBy(List<Odata400IdRef> poweredBy) {
    this.poweredBy = poweredBy;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystemLinks cooledByodataNavigationLink(Odata400IdRef cooledByodataNavigationLink) {
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
  public ComputerSystem100ComputerSystemLinks managedByodataNavigationLink(Odata400IdRef managedByodataNavigationLink) {
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
   **/
  public ComputerSystem100ComputerSystemLinks chassisodataNavigationLink(Odata400IdRef chassisodataNavigationLink) {
    this.chassisodataNavigationLink = chassisodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Chassis@odata.navigationLink")
  public Odata400IdRef getChassisodataNavigationLink() {
    return chassisodataNavigationLink;
  }
  public void setChassisodataNavigationLink(Odata400IdRef chassisodataNavigationLink) {
    this.chassisodataNavigationLink = chassisodataNavigationLink;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystemLinks cooledByodataCount(Odata400Count cooledByodataCount) {
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
   * An array of references to the chassis in which this system is contained
   **/
  public ComputerSystem100ComputerSystemLinks chassis(List<ChassisChassis> chassis) {
    this.chassis = chassis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of references to the chassis in which this system is contained")
  @JsonProperty("Chassis")
  public List<ChassisChassis> getChassis() {
    return chassis;
  }
  public void setChassis(List<ChassisChassis> chassis) {
    this.chassis = chassis;
  }

  
  /**
   * Oem extension object.
   **/
  public ComputerSystem100ComputerSystemLinks oem(ResourceOem oem) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ComputerSystemLinks computerSystem100ComputerSystemLinks = (ComputerSystem100ComputerSystemLinks) o;
    return Objects.equals(this.managedBy, computerSystem100ComputerSystemLinks.managedBy) &&
        Objects.equals(this.poweredByodataNavigationLink, computerSystem100ComputerSystemLinks.poweredByodataNavigationLink) &&
        Objects.equals(this.poweredByodataCount, computerSystem100ComputerSystemLinks.poweredByodataCount) &&
        Objects.equals(this.cooledBy, computerSystem100ComputerSystemLinks.cooledBy) &&
        Objects.equals(this.managedByodataCount, computerSystem100ComputerSystemLinks.managedByodataCount) &&
        Objects.equals(this.chassisodataCount, computerSystem100ComputerSystemLinks.chassisodataCount) &&
        Objects.equals(this.poweredBy, computerSystem100ComputerSystemLinks.poweredBy) &&
        Objects.equals(this.cooledByodataNavigationLink, computerSystem100ComputerSystemLinks.cooledByodataNavigationLink) &&
        Objects.equals(this.managedByodataNavigationLink, computerSystem100ComputerSystemLinks.managedByodataNavigationLink) &&
        Objects.equals(this.chassisodataNavigationLink, computerSystem100ComputerSystemLinks.chassisodataNavigationLink) &&
        Objects.equals(this.cooledByodataCount, computerSystem100ComputerSystemLinks.cooledByodataCount) &&
        Objects.equals(this.chassis, computerSystem100ComputerSystemLinks.chassis) &&
        Objects.equals(this.oem, computerSystem100ComputerSystemLinks.oem);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

