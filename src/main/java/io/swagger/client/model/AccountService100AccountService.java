package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerAccountCollectionManagerAccountCollection;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.RoleCollectionRoleCollection;
import java.math.BigDecimal;



/**
 * This is the schema definition for the Account Service.  It represents the properties for the service itself and has links to the actual list of accounts.
 **/

@ApiModel(description = "This is the schema definition for the Account Service.  It represents the properties for the service itself and has links to the actual list of accounts.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class AccountService100AccountService   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private BigDecimal accountLockoutCounterResetAfter = null;
  private ManagerAccountCollectionManagerAccountCollection accounts = null;
  private BigDecimal authFailureLoggingThreshold = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private BigDecimal maxPasswordLength = null;
  private BigDecimal minPasswordLength = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private RoleCollectionRoleCollection roles = null;
  private ResourceStatus status = null;

  
  /**
   **/
  public AccountService100AccountService odataContext(Odata400Context odataContext) {
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
  public AccountService100AccountService odataId(Odata400Id odataId) {
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
  public AccountService100AccountService odataType(Odata400Type odataType) {
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
   * The interval of time since the last failed login attempt at which point the lockout threshold counter for the account is reset to zero. Must be less than or equal to AccountLockoutDuration
   * minimum: 0.0
   **/
  public AccountService100AccountService accountLockoutCounterResetAfter(BigDecimal accountLockoutCounterResetAfter) {
    this.accountLockoutCounterResetAfter = accountLockoutCounterResetAfter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interval of time since the last failed login attempt at which point the lockout threshold counter for the account is reset to zero. Must be less than or equal to AccountLockoutDuration")
  @JsonProperty("AccountLockoutCounterResetAfter")
  public BigDecimal getAccountLockoutCounterResetAfter() {
    return accountLockoutCounterResetAfter;
  }
  public void setAccountLockoutCounterResetAfter(BigDecimal accountLockoutCounterResetAfter) {
    this.accountLockoutCounterResetAfter = accountLockoutCounterResetAfter;
  }

  
  /**
   * Link to a collection of Manager Accounts
   **/
  public AccountService100AccountService accounts(ManagerAccountCollectionManagerAccountCollection accounts) {
    this.accounts = accounts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to a collection of Manager Accounts")
  @JsonProperty("Accounts")
  public ManagerAccountCollectionManagerAccountCollection getAccounts() {
    return accounts;
  }
  public void setAccounts(ManagerAccountCollectionManagerAccountCollection accounts) {
    this.accounts = accounts;
  }

  
  /**
   * This is the number of authorization failures that need to occur before the failure attempt is logged to the manager log.
   * minimum: 0.0
   **/
  public AccountService100AccountService authFailureLoggingThreshold(BigDecimal authFailureLoggingThreshold) {
    this.authFailureLoggingThreshold = authFailureLoggingThreshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the number of authorization failures that need to occur before the failure attempt is logged to the manager log.")
  @JsonProperty("AuthFailureLoggingThreshold")
  public BigDecimal getAuthFailureLoggingThreshold() {
    return authFailureLoggingThreshold;
  }
  public void setAuthFailureLoggingThreshold(BigDecimal authFailureLoggingThreshold) {
    this.authFailureLoggingThreshold = authFailureLoggingThreshold;
  }

  
  /**
   **/
  public AccountService100AccountService description(ResourceDescription description) {
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
  public AccountService100AccountService id(ResourceId id) {
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

  
  @ApiModelProperty(example = "null", value = "This is the maximum password length for this service.")
  @JsonProperty("MaxPasswordLength")
  public BigDecimal getMaxPasswordLength() {
    return maxPasswordLength;
  }

  
  @ApiModelProperty(example = "null", value = "This is the minimum password length for this service.")
  @JsonProperty("MinPasswordLength")
  public BigDecimal getMinPasswordLength() {
    return minPasswordLength;
  }

  
  /**
   **/
  public AccountService100AccountService name(ResourceName name) {
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
  public AccountService100AccountService oem(ResourceOem oem) {
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
   * Link to a collection of Roles
   **/
  public AccountService100AccountService roles(RoleCollectionRoleCollection roles) {
    this.roles = roles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to a collection of Roles")
  @JsonProperty("Roles")
  public RoleCollectionRoleCollection getRoles() {
    return roles;
  }
  public void setRoles(RoleCollectionRoleCollection roles) {
    this.roles = roles;
  }

  
  /**
   **/
  public AccountService100AccountService status(ResourceStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountService100AccountService accountService100AccountService = (AccountService100AccountService) o;
    return Objects.equals(this.odataContext, accountService100AccountService.odataContext) &&
        Objects.equals(this.odataId, accountService100AccountService.odataId) &&
        Objects.equals(this.odataType, accountService100AccountService.odataType) &&
        Objects.equals(this.accountLockoutCounterResetAfter, accountService100AccountService.accountLockoutCounterResetAfter) &&
        Objects.equals(this.accounts, accountService100AccountService.accounts) &&
        Objects.equals(this.authFailureLoggingThreshold, accountService100AccountService.authFailureLoggingThreshold) &&
        Objects.equals(this.description, accountService100AccountService.description) &&
        Objects.equals(this.id, accountService100AccountService.id) &&
        Objects.equals(this.maxPasswordLength, accountService100AccountService.maxPasswordLength) &&
        Objects.equals(this.minPasswordLength, accountService100AccountService.minPasswordLength) &&
        Objects.equals(this.name, accountService100AccountService.name) &&
        Objects.equals(this.oem, accountService100AccountService.oem) &&
        Objects.equals(this.roles, accountService100AccountService.roles) &&
        Objects.equals(this.status, accountService100AccountService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, accountLockoutCounterResetAfter, accounts, authFailureLoggingThreshold, description, id, maxPasswordLength, minPasswordLength, name, oem, roles, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountService100AccountService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    accountLockoutCounterResetAfter: ").append(toIndentedString(accountLockoutCounterResetAfter)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    authFailureLoggingThreshold: ").append(toIndentedString(authFailureLoggingThreshold)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxPasswordLength: ").append(toIndentedString(maxPasswordLength)).append("\n");
    sb.append("    minPasswordLength: ").append(toIndentedString(minPasswordLength)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

