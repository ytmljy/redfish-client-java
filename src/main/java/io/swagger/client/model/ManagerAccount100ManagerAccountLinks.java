package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.RoleRole;



/**
 * The links object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "The links object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ManagerAccount100ManagerAccountLinks   {
  
  private RoleRole role = null;
  private ResourceOem oem = null;

  
  /**
   * A reference to the Role object defining Privileges for this account--returned when the resource is read. The ID of the role is the same as property RoleId.
   **/
  public ManagerAccount100ManagerAccountLinks role(RoleRole role) {
    this.role = role;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A reference to the Role object defining Privileges for this account--returned when the resource is read. The ID of the role is the same as property RoleId.")
  @JsonProperty("Role")
  public RoleRole getRole() {
    return role;
  }
  public void setRole(RoleRole role) {
    this.role = role;
  }

  
  /**
   * Oem extension object.
   **/
  public ManagerAccount100ManagerAccountLinks oem(ResourceOem oem) {
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
    ManagerAccount100ManagerAccountLinks managerAccount100ManagerAccountLinks = (ManagerAccount100ManagerAccountLinks) o;
    return Objects.equals(this.role, managerAccount100ManagerAccountLinks.role) &&
        Objects.equals(this.oem, managerAccount100ManagerAccountLinks.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccount100ManagerAccountLinks {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

