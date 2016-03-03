package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerAccount100ManagerAccountLinks;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;



/**
 * This schema defines a user account to be used in conjunction with a manager.  This will affect the Redfish service connection if this manager is responsible for the Redfish service.
 **/

@ApiModel(description = "This schema defines a user account to be used in conjunction with a manager.  This will affect the Redfish service connection if this manager is responsible for the Redfish service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ManagerAccount100ManagerAccount   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private Boolean enabled = null;
  private ResourceId id = null;
  private ManagerAccount100ManagerAccountLinks links = null;
  private Boolean locked = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private String roleId = null;
  private String userName = null;

  
  /**
   **/
  public ManagerAccount100ManagerAccount odataContext(Odata400Context odataContext) {
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
  public ManagerAccount100ManagerAccount odataId(Odata400Id odataId) {
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
  public ManagerAccount100ManagerAccount odataType(Odata400Type odataType) {
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
   **/
  public ManagerAccount100ManagerAccount description(ResourceDescription description) {
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
   * This property is used by a User Administrator to disable an account w/o having to delet the user information.  When set to true, the user can login.  When set to false, the account is administratively disabled and the user cannot login.
   **/
  public ManagerAccount100ManagerAccount enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property is used by a User Administrator to disable an account w/o having to delet the user information.  When set to true, the user can login.  When set to false, the account is administratively disabled and the user cannot login.")
  @JsonProperty("Enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  
  /**
   **/
  public ManagerAccount100ManagerAccount id(ResourceId id) {
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

  
  /**
   **/
  public ManagerAccount100ManagerAccount links(ManagerAccount100ManagerAccountLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public ManagerAccount100ManagerAccount locked(Boolean locked) {
    this.locked = locked;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property indicates that the account has been auto-locked by the account service because the lockout threshold has been exceeded.  When set to true, the account is locked. A user admin can write the property to false to manually unlock, or the account service will unlock it once the lockout duration period has passed.")
  @JsonProperty("Locked")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  
  /**
   **/
  public ManagerAccount100ManagerAccount name(ResourceName name) {
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
  public ManagerAccount100ManagerAccount oem(ResourceOem oem) {
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
   * This property contains the Role for this account.
   **/
  public ManagerAccount100ManagerAccount roleId(String roleId) {
    this.roleId = roleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property contains the Role for this account.")
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
  public ManagerAccount100ManagerAccount userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This property contains the user name for the account.")
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerAccount100ManagerAccount managerAccount100ManagerAccount = (ManagerAccount100ManagerAccount) o;
    return Objects.equals(this.odataContext, managerAccount100ManagerAccount.odataContext) &&
        Objects.equals(this.odataId, managerAccount100ManagerAccount.odataId) &&
        Objects.equals(this.odataType, managerAccount100ManagerAccount.odataType) &&
        Objects.equals(this.description, managerAccount100ManagerAccount.description) &&
        Objects.equals(this.enabled, managerAccount100ManagerAccount.enabled) &&
        Objects.equals(this.id, managerAccount100ManagerAccount.id) &&
        Objects.equals(this.links, managerAccount100ManagerAccount.links) &&
        Objects.equals(this.locked, managerAccount100ManagerAccount.locked) &&
        Objects.equals(this.name, managerAccount100ManagerAccount.name) &&
        Objects.equals(this.oem, managerAccount100ManagerAccount.oem) &&
        Objects.equals(this.roleId, managerAccount100ManagerAccount.roleId) &&
        Objects.equals(this.userName, managerAccount100ManagerAccount.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, enabled, id, links, locked, name, oem, roleId, userName);
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
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

