package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChassisChassis;
import io.swagger.client.model.ComputerSystemComputerSystem;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;



/**
 * This object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "This object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Manager100ManagerLinks   {
  
  private Odata400Count managerForServersodataCount = null;
  private List<ComputerSystemComputerSystem> managerForServers = new ArrayList<ComputerSystemComputerSystem>();
  private Odata400IdRef managerForChassisodataNavigationLink = null;
  private ResourceOem oem = null;
  private List<ChassisChassis> managerForChassis = new ArrayList<ChassisChassis>();
  private Odata400Count managerForChassisodataCount = null;
  private Odata400IdRef managerForServersodataNavigationLink = null;

  
  /**
   **/
  public Manager100ManagerLinks managerForServersodataCount(Odata400Count managerForServersodataCount) {
    this.managerForServersodataCount = managerForServersodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ManagerForServers@odata.count")
  public Odata400Count getManagerForServersodataCount() {
    return managerForServersodataCount;
  }
  public void setManagerForServersodataCount(Odata400Count managerForServersodataCount) {
    this.managerForServersodataCount = managerForServersodataCount;
  }

  
  /**
   * This property is an array of references to the systems that this manager has control over.
   **/
  public Manager100ManagerLinks managerForServers(List<ComputerSystemComputerSystem> managerForServers) {
    this.managerForServers = managerForServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property is an array of references to the systems that this manager has control over.")
  @JsonProperty("ManagerForServers")
  public List<ComputerSystemComputerSystem> getManagerForServers() {
    return managerForServers;
  }
  public void setManagerForServers(List<ComputerSystemComputerSystem> managerForServers) {
    this.managerForServers = managerForServers;
  }

  
  /**
   **/
  public Manager100ManagerLinks managerForChassisodataNavigationLink(Odata400IdRef managerForChassisodataNavigationLink) {
    this.managerForChassisodataNavigationLink = managerForChassisodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ManagerForChassis@odata.navigationLink")
  public Odata400IdRef getManagerForChassisodataNavigationLink() {
    return managerForChassisodataNavigationLink;
  }
  public void setManagerForChassisodataNavigationLink(Odata400IdRef managerForChassisodataNavigationLink) {
    this.managerForChassisodataNavigationLink = managerForChassisodataNavigationLink;
  }

  
  /**
   * Oem extension object.
   **/
  public Manager100ManagerLinks oem(ResourceOem oem) {
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
   * This property is an array of references to the chasis that this manager has control over.
   **/
  public Manager100ManagerLinks managerForChassis(List<ChassisChassis> managerForChassis) {
    this.managerForChassis = managerForChassis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property is an array of references to the chasis that this manager has control over.")
  @JsonProperty("ManagerForChassis")
  public List<ChassisChassis> getManagerForChassis() {
    return managerForChassis;
  }
  public void setManagerForChassis(List<ChassisChassis> managerForChassis) {
    this.managerForChassis = managerForChassis;
  }

  
  /**
   **/
  public Manager100ManagerLinks managerForChassisodataCount(Odata400Count managerForChassisodataCount) {
    this.managerForChassisodataCount = managerForChassisodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ManagerForChassis@odata.count")
  public Odata400Count getManagerForChassisodataCount() {
    return managerForChassisodataCount;
  }
  public void setManagerForChassisodataCount(Odata400Count managerForChassisodataCount) {
    this.managerForChassisodataCount = managerForChassisodataCount;
  }

  
  /**
   **/
  public Manager100ManagerLinks managerForServersodataNavigationLink(Odata400IdRef managerForServersodataNavigationLink) {
    this.managerForServersodataNavigationLink = managerForServersodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ManagerForServers@odata.navigationLink")
  public Odata400IdRef getManagerForServersodataNavigationLink() {
    return managerForServersodataNavigationLink;
  }
  public void setManagerForServersodataNavigationLink(Odata400IdRef managerForServersodataNavigationLink) {
    this.managerForServersodataNavigationLink = managerForServersodataNavigationLink;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100ManagerLinks manager100ManagerLinks = (Manager100ManagerLinks) o;
    return Objects.equals(this.managerForServersodataCount, manager100ManagerLinks.managerForServersodataCount) &&
        Objects.equals(this.managerForServers, manager100ManagerLinks.managerForServers) &&
        Objects.equals(this.managerForChassisodataNavigationLink, manager100ManagerLinks.managerForChassisodataNavigationLink) &&
        Objects.equals(this.oem, manager100ManagerLinks.oem) &&
        Objects.equals(this.managerForChassis, manager100ManagerLinks.managerForChassis) &&
        Objects.equals(this.managerForChassisodataCount, manager100ManagerLinks.managerForChassisodataCount) &&
        Objects.equals(this.managerForServersodataNavigationLink, manager100ManagerLinks.managerForServersodataNavigationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerForServersodataCount, managerForServers, managerForChassisodataNavigationLink, oem, managerForChassis, managerForChassisodataCount, managerForServersodataNavigationLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100ManagerLinks {\n");
    
    sb.append("    managerForServersodataCount: ").append(toIndentedString(managerForServersodataCount)).append("\n");
    sb.append("    managerForServers: ").append(toIndentedString(managerForServers)).append("\n");
    sb.append("    managerForChassisodataNavigationLink: ").append(toIndentedString(managerForChassisodataNavigationLink)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    managerForChassis: ").append(toIndentedString(managerForChassis)).append("\n");
    sb.append("    managerForChassisodataCount: ").append(toIndentedString(managerForChassisodataCount)).append("\n");
    sb.append("    managerForServersodataNavigationLink: ").append(toIndentedString(managerForServersodataNavigationLink)).append("\n");
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

