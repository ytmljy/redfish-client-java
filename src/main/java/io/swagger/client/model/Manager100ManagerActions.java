package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Manager100ForceFailover;
import io.swagger.client.model.Manager100ModifyRedundancySet;
import io.swagger.client.model.Manager100Reset;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Manager100ManagerActions   {
  
  private Manager100ModifyRedundancySet managerModifyRedundancySet = null;
  private Manager100Reset managerReset = null;
  private Object oem = null;
  private Manager100ForceFailover managerForceFailover = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#Manager.ModifyRedundancySet")
  public Manager100ModifyRedundancySet getManagerModifyRedundancySet() {
    return managerModifyRedundancySet;
  }
  public void setManagerModifyRedundancySet(Manager100ModifyRedundancySet managerModifyRedundancySet) {
    this.managerModifyRedundancySet = managerModifyRedundancySet;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#Manager.Reset")
  public Manager100Reset getManagerReset() {
    return managerReset;
  }
  public void setManagerReset(Manager100Reset managerReset) {
    this.managerReset = managerReset;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
    this.oem = oem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#Manager.ForceFailover")
  public Manager100ForceFailover getManagerForceFailover() {
    return managerForceFailover;
  }
  public void setManagerForceFailover(Manager100ForceFailover managerForceFailover) {
    this.managerForceFailover = managerForceFailover;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100ManagerActions manager100ManagerActions = (Manager100ManagerActions) o;
    return Objects.equals(managerModifyRedundancySet, manager100ManagerActions.managerModifyRedundancySet) &&
        Objects.equals(managerReset, manager100ManagerActions.managerReset) &&
        Objects.equals(oem, manager100ManagerActions.oem) &&
        Objects.equals(managerForceFailover, manager100ManagerActions.managerForceFailover);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

