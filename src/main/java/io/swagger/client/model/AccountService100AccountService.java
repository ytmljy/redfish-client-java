package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerAccountCollectionManagerAccountCollection;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.RoleCollectionRoleCollection;
import java.math.BigDecimal;



/**
 * This is the schema definition for the Account Service.  It represents the properties for the service itself and has links to the actual list of accounts.
 **/

@ApiModel(description = "This is the schema definition for the Account Service.  It represents the properties for the service itself and has links to the actual list of accounts.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class AccountService100AccountService   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private BigDecimal accountLockoutCounterResetAfter = null;
  private BigDecimal accountLockoutDuration = null;
  private BigDecimal accountLockoutThreshold = null;
  private ManagerAccountCollectionManagerAccountCollection accounts = null;
  private BigDecimal authFailureLoggingThreshold = null;
  private String description = null;
  private String id = null;
  private BigDecimal maxPasswordLength = null;
  private BigDecimal minPasswordLength = null;
  private String name = null;
  private ResourceOem oem = null;
  private RoleCollectionRoleCollection roles = null;
  private Boolean serviceEnabled = null;
  private ResourceStatus status = null;

  
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
   * The interval of time since the last failed login attempt at which point the lockout threshold counter for the account is reset to zero. Must be less than or equal to AccountLockoutDuration
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The interval of time since the last failed login attempt at which point the lockout threshold counter for the account is reset to zero. Must be less than or equal to AccountLockoutDuration")
  @JsonProperty("AccountLockoutCounterResetAfter")
  public BigDecimal getAccountLockoutCounterResetAfter() {
    return accountLockoutCounterResetAfter;
  }
  public void setAccountLockoutCounterResetAfter(BigDecimal accountLockoutCounterResetAfter) {
    this.accountLockoutCounterResetAfter = accountLockoutCounterResetAfter;
  }

  
  /**
   * The time an account is locked after the account lockout threshold is met. Must be >= AccountLockoutResetAfter. If set to 0, no lockout will occur.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The time an account is locked after the account lockout threshold is met. Must be >= AccountLockoutResetAfter. If set to 0, no lockout will occur.")
  @JsonProperty("AccountLockoutDuration")
  public BigDecimal getAccountLockoutDuration() {
    return accountLockoutDuration;
  }
  public void setAccountLockoutDuration(BigDecimal accountLockoutDuration) {
    this.accountLockoutDuration = accountLockoutDuration;
  }

  
  /**
   * The number of failed login attempts before a user account is locked for a specified duration. (0=never locked)
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The number of failed login attempts before a user account is locked for a specified duration. (0=never locked)")
  @JsonProperty("AccountLockoutThreshold")
  public BigDecimal getAccountLockoutThreshold() {
    return accountLockoutThreshold;
  }
  public void setAccountLockoutThreshold(BigDecimal accountLockoutThreshold) {
    this.accountLockoutThreshold = accountLockoutThreshold;
  }

  
  /**
   * Link to a collection of Manager Accounts
   **/
  
  @ApiModelProperty(value = "Link to a collection of Manager Accounts")
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
  
  @ApiModelProperty(value = "This is the number of authorization failures that need to occur before the failure attempt is logged to the manager log.")
  @JsonProperty("AuthFailureLoggingThreshold")
  public BigDecimal getAuthFailureLoggingThreshold() {
    return authFailureLoggingThreshold;
  }
  public void setAuthFailureLoggingThreshold(BigDecimal authFailureLoggingThreshold) {
    this.authFailureLoggingThreshold = authFailureLoggingThreshold;
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
   * This is the maximum password length for this service.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "This is the maximum password length for this service.")
  @JsonProperty("MaxPasswordLength")
  public BigDecimal getMaxPasswordLength() {
    return maxPasswordLength;
  }
  public void setMaxPasswordLength(BigDecimal maxPasswordLength) {
    this.maxPasswordLength = maxPasswordLength;
  }

  
  /**
   * This is the minimum password length for this service.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "This is the minimum password length for this service.")
  @JsonProperty("MinPasswordLength")
  public BigDecimal getMinPasswordLength() {
    return minPasswordLength;
  }
  public void setMinPasswordLength(BigDecimal minPasswordLength) {
    this.minPasswordLength = minPasswordLength;
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
   * Link to a collection of Roles
   **/
  
  @ApiModelProperty(value = "Link to a collection of Roles")
  @JsonProperty("Roles")
  public RoleCollectionRoleCollection getRoles() {
    return roles;
  }
  public void setRoles(RoleCollectionRoleCollection roles) {
    this.roles = roles;
  }

  
  /**
   * This indicates whether this service is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates whether this service is enabled.")
  @JsonProperty("ServiceEnabled")
  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountService100AccountService accountService100AccountService = (AccountService100AccountService) o;
    return Objects.equals(odataContext, accountService100AccountService.odataContext) &&
        Objects.equals(odataId, accountService100AccountService.odataId) &&
        Objects.equals(odataType, accountService100AccountService.odataType) &&
        Objects.equals(accountLockoutCounterResetAfter, accountService100AccountService.accountLockoutCounterResetAfter) &&
        Objects.equals(accountLockoutDuration, accountService100AccountService.accountLockoutDuration) &&
        Objects.equals(accountLockoutThreshold, accountService100AccountService.accountLockoutThreshold) &&
        Objects.equals(accounts, accountService100AccountService.accounts) &&
        Objects.equals(authFailureLoggingThreshold, accountService100AccountService.authFailureLoggingThreshold) &&
        Objects.equals(description, accountService100AccountService.description) &&
        Objects.equals(id, accountService100AccountService.id) &&
        Objects.equals(maxPasswordLength, accountService100AccountService.maxPasswordLength) &&
        Objects.equals(minPasswordLength, accountService100AccountService.minPasswordLength) &&
        Objects.equals(name, accountService100AccountService.name) &&
        Objects.equals(oem, accountService100AccountService.oem) &&
        Objects.equals(roles, accountService100AccountService.roles) &&
        Objects.equals(serviceEnabled, accountService100AccountService.serviceEnabled) &&
        Objects.equals(status, accountService100AccountService.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, accountLockoutCounterResetAfter, accountLockoutDuration, accountLockoutThreshold, accounts, authFailureLoggingThreshold, description, id, maxPasswordLength, minPasswordLength, name, oem, roles, serviceEnabled, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountService100AccountService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    accountLockoutCounterResetAfter: ").append(toIndentedString(accountLockoutCounterResetAfter)).append("\n");
    sb.append("    accountLockoutDuration: ").append(toIndentedString(accountLockoutDuration)).append("\n");
    sb.append("    accountLockoutThreshold: ").append(toIndentedString(accountLockoutThreshold)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    authFailureLoggingThreshold: ").append(toIndentedString(authFailureLoggingThreshold)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxPasswordLength: ").append(toIndentedString(maxPasswordLength)).append("\n");
    sb.append("    minPasswordLength: ").append(toIndentedString(minPasswordLength)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

