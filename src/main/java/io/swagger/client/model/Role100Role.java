package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.Privileges100PrivilegeType;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;



/**
 * This schema defines a user role to be used in conjunction with a manager account.
 **/

@ApiModel(description = "This schema defines a user role to be used in conjunction with a manager account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Role100Role   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private List<Privileges100PrivilegeType> assignedPrivileges = new ArrayList<Privileges100PrivilegeType>();
  private ResourceDescription description = null;
  private ResourceId id = null;
  private Boolean isPredefined = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private List<String> oemPrivileges = new ArrayList<String>();

  
  /**
   **/
  public Role100Role odataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.context")
  public Odata400Context getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  public Role100Role odataId(Odata400Id odataId) {
    this.odataId = odataId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.id")
  public Odata400Id getOdataId() {
    return odataId;
  }
  public void setOdataId(Odata400Id odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  public Role100Role odataType(Odata400Type odataType) {
    this.odataType = odataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.type")
  public Odata400Type getOdataType() {
    return odataType;
  }
  public void setOdataType(Odata400Type odataType) {
    this.odataType = odataType;
  }

  
  /**
   * The redfish privileges that this role includes.
   **/
  public Role100Role assignedPrivileges(List<Privileges100PrivilegeType> assignedPrivileges) {
    this.assignedPrivileges = assignedPrivileges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The redfish privileges that this role includes.")
  @JsonProperty("AssignedPrivileges")
  public List<Privileges100PrivilegeType> getAssignedPrivileges() {
    return assignedPrivileges;
  }
  public void setAssignedPrivileges(List<Privileges100PrivilegeType> assignedPrivileges) {
    this.assignedPrivileges = assignedPrivileges;
  }

  
  /**
   **/
  public Role100Role description(ResourceDescription description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Description")
  public ResourceDescription getDescription() {
    return description;
  }
  public void setDescription(ResourceDescription description) {
    this.description = description;
  }

  
  /**
   **/
  public Role100Role id(ResourceId id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Id")
  public ResourceId getId() {
    return id;
  }
  public void setId(ResourceId id) {
    this.id = id;
  }

  
  @ApiModelProperty(example = "null", value = "This property is used to indicate if the Role is one of the Redfish Predefined Roles vs a Custom role.")
  @JsonProperty("IsPredefined")
  public Boolean getIsPredefined() {
    return isPredefined;
  }

  
  /**
   **/
  public Role100Role name(ResourceName name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Name")
  public ResourceName getName() {
    return name;
  }
  public void setName(ResourceName name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  public Role100Role oem(ResourceOem oem) {
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
   * The OEM privileges that this role includes.
   **/
  public Role100Role oemPrivileges(List<String> oemPrivileges) {
    this.oemPrivileges = oemPrivileges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The OEM privileges that this role includes.")
  @JsonProperty("OemPrivileges")
  public List<String> getOemPrivileges() {
    return oemPrivileges;
  }
  public void setOemPrivileges(List<String> oemPrivileges) {
    this.oemPrivileges = oemPrivileges;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role100Role role100Role = (Role100Role) o;
    return Objects.equals(this.odataContext, role100Role.odataContext) &&
        Objects.equals(this.odataId, role100Role.odataId) &&
        Objects.equals(this.odataType, role100Role.odataType) &&
        Objects.equals(this.assignedPrivileges, role100Role.assignedPrivileges) &&
        Objects.equals(this.description, role100Role.description) &&
        Objects.equals(this.id, role100Role.id) &&
        Objects.equals(this.isPredefined, role100Role.isPredefined) &&
        Objects.equals(this.name, role100Role.name) &&
        Objects.equals(this.oem, role100Role.oem) &&
        Objects.equals(this.oemPrivileges, role100Role.oemPrivileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, assignedPrivileges, description, id, isPredefined, name, oem, oemPrivileges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role100Role {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    assignedPrivileges: ").append(toIndentedString(assignedPrivileges)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPredefined: ").append(toIndentedString(isPredefined)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    oemPrivileges: ").append(toIndentedString(oemPrivileges)).append("\n");
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

