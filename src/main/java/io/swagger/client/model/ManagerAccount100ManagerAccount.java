package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerAccount100ManagerAccountLinks;
import io.swagger.client.model.ResourceOem;



/**
 * This schema defines a user account to be used in conjunction with a manager.  This will affect the Redfish service connection if this manager is responsible for the Redfish service.
 **/

@ApiModel(description = "This schema defines a user account to be used in conjunction with a manager.  This will affect the Redfish service connection if this manager is responsible for the Redfish service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ManagerAccount100ManagerAccount   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private Boolean enabled = null;
  private String id = null;
  private ManagerAccount100ManagerAccountLinks links = null;
  private Boolean locked = null;
  private String name = null;
  private ResourceOem oem = null;
  private String password = null;
  private String roleId = null;
  private String userName = null;

  
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
   * This property is used by a User Administrator to disable an account w/o having to delet the user information.  When set to true, the user can login.  When set to false, the account is administratively disabled and the user cannot login.
   **/
  
  @ApiModelProperty(value = "This property is used by a User Administrator to disable an account w/o having to delet the user information.  When set to true, the user can login.  When set to false, the account is administratively disabled and the user cannot login.")
  @JsonProperty("Enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Links")
  public ManagerAccount100ManagerAccountLinks getLinks() {
    return links;
  }
  public void setLinks(ManagerAccount100ManagerAccountLinks links) {
    this.links = links;
  }

  
  /**
   * This property indicates that the account has been auto-locked by the account service because the lockout threshold has been exceeded.  When set to true, the account is locked. A user admin can write the property to false to manually unlock, or the account service will unlock it once the lockout duration period has passed.
   **/
  
  @ApiModelProperty(value = "This property indicates that the account has been auto-locked by the account service because the lockout threshold has been exceeded.  When set to true, the account is locked. A user admin can write the property to false to manually unlock, or the account service will unlock it once the lockout duration period has passed.")
  @JsonProperty("Locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
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
   * This property is used with a PATCH or PUT to write the password for the account.  This property is null on a GET.
   **/
  
  @ApiModelProperty(value = "This property is used with a PATCH or PUT to write the password for the account.  This property is null on a GET.")
  @JsonProperty("Password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * This property contains the Role for this account.
   **/
  
  @ApiModelProperty(value = "This property contains the Role for this account.")
  @JsonProperty("RoleId")
  public String getRoleId() {
    return roleId;
  }
  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  
  /**
   * This property contains the user name for the account.
   **/
  
  @ApiModelProperty(value = "This property contains the user name for the account.")
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerAccount100ManagerAccount managerAccount100ManagerAccount = (ManagerAccount100ManagerAccount) o;
    return Objects.equals(odataContext, managerAccount100ManagerAccount.odataContext) &&
        Objects.equals(odataId, managerAccount100ManagerAccount.odataId) &&
        Objects.equals(odataType, managerAccount100ManagerAccount.odataType) &&
        Objects.equals(description, managerAccount100ManagerAccount.description) &&
        Objects.equals(enabled, managerAccount100ManagerAccount.enabled) &&
        Objects.equals(id, managerAccount100ManagerAccount.id) &&
        Objects.equals(links, managerAccount100ManagerAccount.links) &&
        Objects.equals(locked, managerAccount100ManagerAccount.locked) &&
        Objects.equals(name, managerAccount100ManagerAccount.name) &&
        Objects.equals(oem, managerAccount100ManagerAccount.oem) &&
        Objects.equals(password, managerAccount100ManagerAccount.password) &&
        Objects.equals(roleId, managerAccount100ManagerAccount.roleId) &&
        Objects.equals(userName, managerAccount100ManagerAccount.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, enabled, id, links, locked, name, oem, password, roleId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerAccount100ManagerAccount {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

