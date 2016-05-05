package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import java.util.*;



/**
 * This schema defines a user role to be used in conjunction with a manager account.
 **/

@ApiModel(description = "This schema defines a user role to be used in conjunction with a manager account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Role100Role   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;


  public enum AssignedPrivilegesEnum {
    LOGIN("Login"),
    CONFIGUREMANAGER("ConfigureManager"),
    CONFIGUREUSERS("ConfigureUsers"),
    CONFIGURESELF("ConfigureSelf"),
    CONFIGURECOMPONENTS("ConfigureComponents");

    private String value;

    AssignedPrivilegesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<AssignedPrivilegesEnum> assignedPrivileges = new ArrayList<AssignedPrivilegesEnum>();
  private String description = null;
  private String id = null;
  private Boolean isPredefined = null;
  private String name = null;
  private ResourceOem oem = null;
  private List<String> oemPrivileges = new ArrayList<String>();

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.context")
  public String getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.id")
  public String getOdataId() {
    return odataId;
  }
  public void setOdataId(String odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.type")
  public String getOdataType() {
    return odataType;
  }
  public void setOdataType(String odataType) {
    this.odataType = odataType;
  }

  
  /**
   * The redfish privileges that this role includes.
   **/
  
  @ApiModelProperty(value = "The redfish privileges that this role includes.")
  @JsonProperty("AssignedPrivileges")
  public List<AssignedPrivilegesEnum> getAssignedPrivileges() {
    return assignedPrivileges;
  }
  public void setAssignedPrivileges(List<AssignedPrivilegesEnum> assignedPrivileges) {
    this.assignedPrivileges = assignedPrivileges;
  }

  
  /**
   * Provides a description of this resource and is used for commonality  in the schema definitions.
   **/
  
  @ApiModelProperty(value = "Provides a description of this resource and is used for commonality  in the schema definitions.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Uniquely identifies the resource within the collection of like resources.
   **/
  
  @ApiModelProperty(value = "Uniquely identifies the resource within the collection of like resources.")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * This property is used to indicate if the Role is one of the Redfish Predefined Roles vs a Custom role.
   **/
  
  @ApiModelProperty(value = "This property is used to indicate if the Role is one of the Redfish Predefined Roles vs a Custom role.")
  @JsonProperty("IsPredefined")
  public Boolean getIsPredefined() {
    return isPredefined;
  }
  public void setIsPredefined(Boolean isPredefined) {
    this.isPredefined = isPredefined;
  }

  
  /**
   * The name of the resource or array element.
   **/
  
  @ApiModelProperty(value = "The name of the resource or array element.")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  
  @ApiModelProperty(value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
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
  
  @ApiModelProperty(value = "The OEM privileges that this role includes.")
  @JsonProperty("OemPrivileges")
  public List<String> getOemPrivileges() {
    return oemPrivileges;
  }
  public void setOemPrivileges(List<String> oemPrivileges) {
    this.oemPrivileges = oemPrivileges;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role100Role role100Role = (Role100Role) o;
    return Objects.equals(odataContext, role100Role.odataContext) &&
        Objects.equals(odataId, role100Role.odataId) &&
        Objects.equals(odataType, role100Role.odataType) &&
        Objects.equals(assignedPrivileges, role100Role.assignedPrivileges) &&
        Objects.equals(description, role100Role.description) &&
        Objects.equals(id, role100Role.id) &&
        Objects.equals(isPredefined, role100Role.isPredefined) &&
        Objects.equals(name, role100Role.name) &&
        Objects.equals(oem, role100Role.oem) &&
        Objects.equals(oemPrivileges, role100Role.oemPrivileges);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

