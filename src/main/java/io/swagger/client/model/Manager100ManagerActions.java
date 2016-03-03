package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Manager100ForceFailover;
import io.swagger.client.model.Manager100ModifyRedundancySet;
import io.swagger.client.model.Manager100Reset;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Manager100ManagerActions   {
  
  private Manager100ModifyRedundancySet managerModifyRedundancySet = null;
  private Manager100Reset managerReset = null;
  private Object oem = null;
  private Manager100ForceFailover managerForceFailover = null;

  
  /**
   **/
  public Manager100ManagerActions managerModifyRedundancySet(Manager100ModifyRedundancySet managerModifyRedundancySet) {
    this.managerModifyRedundancySet = managerModifyRedundancySet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("#Manager.ModifyRedundancySet")
  public Manager100ModifyRedundancySet getManagerModifyRedundancySet() {
    return managerModifyRedundancySet;
  }
  public void setManagerModifyRedundancySet(Manager100ModifyRedundancySet managerModifyRedundancySet) {
    this.managerModifyRedundancySet = managerModifyRedundancySet;
  }

  
  /**
   **/
  public Manager100ManagerActions managerReset(Manager100Reset managerReset) {
    this.managerReset = managerReset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("#Manager.Reset")
  public Manager100Reset getManagerReset() {
    return managerReset;
  }
  public void setManagerReset(Manager100Reset managerReset) {
    this.managerReset = managerReset;
  }

  
  /**
   **/
  public Manager100ManagerActions oem(Object oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
    this.oem = oem;
  }

  
  /**
   **/
  public Manager100ManagerActions managerForceFailover(Manager100ForceFailover managerForceFailover) {
    this.managerForceFailover = managerForceFailover;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("#Manager.ForceFailover")
  public Manager100ForceFailover getManagerForceFailover() {
    return managerForceFailover;
  }
  public void setManagerForceFailover(Manager100ForceFailover managerForceFailover) {
    this.managerForceFailover = managerForceFailover;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100ManagerActions manager100ManagerActions = (Manager100ManagerActions) o;
    return Objects.equals(this.managerModifyRedundancySet, manager100ManagerActions.managerModifyRedundancySet) &&
        Objects.equals(this.managerReset, manager100ManagerActions.managerReset) &&
        Objects.equals(this.oem, manager100ManagerActions.oem) &&
        Objects.equals(this.managerForceFailover, manager100ManagerActions.managerForceFailover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managerModifyRedundancySet, managerReset, oem, managerForceFailover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100ManagerActions {\n");
    
    sb.append("    managerModifyRedundancySet: ").append(toIndentedString(managerModifyRedundancySet)).append("\n");
    sb.append("    managerReset: ").append(toIndentedString(managerReset)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    managerForceFailover: ").append(toIndentedString(managerForceFailover)).append("\n");
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

