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
 * This object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "This object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Manager100ManagerLinks   {
  
  private BigDecimal managerForServersodataCount = null;
  private List<Odata400IdRef> managerForServers = new ArrayList<Odata400IdRef>();
  private Odata400IdRef managerForChassisodataNavigationLink = null;
  private ResourceOem oem = null;
  private List<Odata400IdRef> managerForChassis = new ArrayList<Odata400IdRef>();
  private BigDecimal managerForChassisodataCount = null;
  private Odata400IdRef managerForServersodataNavigationLink = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ManagerForServers@odata.count")
  public BigDecimal getManagerForServersodataCount() {
    return managerForServersodataCount;
  }
  public void setManagerForServersodataCount(BigDecimal managerForServersodataCount) {
    this.managerForServersodataCount = managerForServersodataCount;
  }

  
  /**
   * This property is an array of references to the systems that this manager has control over.
   **/
  
  @ApiModelProperty(value = "This property is an array of references to the systems that this manager has control over.")
  @JsonProperty("ManagerForServers")
  public List<Odata400IdRef> getManagerForServers() {
    return managerForServers;
  }
  public void setManagerForServers(List<Odata400IdRef> managerForServers) {
    this.managerForServers = managerForServers;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "Oem extension object.")
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
  
  @ApiModelProperty(value = "This property is an array of references to the chasis that this manager has control over.")
  @JsonProperty("ManagerForChassis")
  public List<Odata400IdRef> getManagerForChassis() {
    return managerForChassis;
  }
  public void setManagerForChassis(List<Odata400IdRef> managerForChassis) {
    this.managerForChassis = managerForChassis;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ManagerForChassis@odata.count")
  public BigDecimal getManagerForChassisodataCount() {
    return managerForChassisodataCount;
  }
  public void setManagerForChassisodataCount(BigDecimal managerForChassisodataCount) {
    this.managerForChassisodataCount = managerForChassisodataCount;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ManagerForServers@odata.navigationLink")
  public Odata400IdRef getManagerForServersodataNavigationLink() {
    return managerForServersodataNavigationLink;
  }
  public void setManagerForServersodataNavigationLink(Odata400IdRef managerForServersodataNavigationLink) {
    this.managerForServersodataNavigationLink = managerForServersodataNavigationLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100ManagerLinks manager100ManagerLinks = (Manager100ManagerLinks) o;
    return Objects.equals(managerForServersodataCount, manager100ManagerLinks.managerForServersodataCount) &&
        Objects.equals(managerForServers, manager100ManagerLinks.managerForServers) &&
        Objects.equals(managerForChassisodataNavigationLink, manager100ManagerLinks.managerForChassisodataNavigationLink) &&
        Objects.equals(oem, manager100ManagerLinks.oem) &&
        Objects.equals(managerForChassis, manager100ManagerLinks.managerForChassis) &&
        Objects.equals(managerForChassisodataCount, manager100ManagerLinks.managerForChassisodataCount) &&
        Objects.equals(managerForServersodataNavigationLink, manager100ManagerLinks.managerForServersodataNavigationLink);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

