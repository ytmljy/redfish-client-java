package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AccountServiceAccountService;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceUUID;
import io.swagger.client.model.ServiceRoot100ServiceRootLinks;



/**
 * This object represents the root Redfish service.
 **/

@ApiModel(description = "This object represents the root Redfish service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ServiceRoot100ServiceRoot   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private AccountServiceAccountService accountService = null;
  private Odata400IdRef chassis = null;
  private ResourceDescription description = null;
  private Odata400IdRef eventService = null;
  private ResourceId id = null;
  private Odata400IdRef jsonSchemas = null;
  private ServiceRoot100ServiceRootLinks links = null;
  private Odata400IdRef managers = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private String redfishVersion = null;
  private Odata400IdRef registries = null;
  private Odata400IdRef sessionService = null;
  private Odata400IdRef systems = null;
  private Odata400IdRef tasks = null;
  private ResourceUUID UUID = null;

  
  /**
   **/
  public ServiceRoot100ServiceRoot odataContext(Odata400Context odataContext) {
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
  public ServiceRoot100ServiceRoot odataId(Odata400Id odataId) {
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
  public ServiceRoot100ServiceRoot odataType(Odata400Type odataType) {
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
   * This is a link to the Account Service.
   **/
  public ServiceRoot100ServiceRoot accountService(AccountServiceAccountService accountService) {
    this.accountService = accountService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to the Account Service.")
  @JsonProperty("AccountService")
  public AccountServiceAccountService getAccountService() {
    return accountService;
  }
  public void setAccountService(AccountServiceAccountService accountService) {
    this.accountService = accountService;
  }

  
  /**
   * This is a link to a collection of Chassis.
   **/
  public ServiceRoot100ServiceRoot chassis(Odata400IdRef chassis) {
    this.chassis = chassis;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to a collection of Chassis.")
  @JsonProperty("Chassis")
  public Odata400IdRef getChassis() {
    return chassis;
  }
  public void setChassis(Odata400IdRef chassis) {
    this.chassis = chassis;
  }

  
  /**
   **/
  public ServiceRoot100ServiceRoot description(ResourceDescription description) {
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
   * This is a link to the EventService.
   **/
  public ServiceRoot100ServiceRoot eventService(Odata400IdRef eventService) {
    this.eventService = eventService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to the EventService.")
  @JsonProperty("EventService")
  public Odata400IdRef getEventService() {
    return eventService;
  }
  public void setEventService(Odata400IdRef eventService) {
    this.eventService = eventService;
  }

  
  /**
   **/
  public ServiceRoot100ServiceRoot id(ResourceId id) {
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
   * This is a link to a collection of Json-Schema files.
   **/
  public ServiceRoot100ServiceRoot jsonSchemas(Odata400IdRef jsonSchemas) {
    this.jsonSchemas = jsonSchemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to a collection of Json-Schema files.")
  @JsonProperty("JsonSchemas")
  public Odata400IdRef getJsonSchemas() {
    return jsonSchemas;
  }
  public void setJsonSchemas(Odata400IdRef jsonSchemas) {
    this.jsonSchemas = jsonSchemas;
  }

  
  /**
   **/
  public ServiceRoot100ServiceRoot links(ServiceRoot100ServiceRootLinks links) {
    this.links = links;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Links")
  public ServiceRoot100ServiceRootLinks getLinks() {
    return links;
  }
  public void setLinks(ServiceRoot100ServiceRootLinks links) {
    this.links = links;
  }

  
  /**
   * This is a link to a collection of Managers.
   **/
  public ServiceRoot100ServiceRoot managers(Odata400IdRef managers) {
    this.managers = managers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to a collection of Managers.")
  @JsonProperty("Managers")
  public Odata400IdRef getManagers() {
    return managers;
  }
  public void setManagers(Odata400IdRef managers) {
    this.managers = managers;
  }

  
  /**
   **/
  public ServiceRoot100ServiceRoot name(ResourceName name) {
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
  public ServiceRoot100ServiceRoot oem(ResourceOem oem) {
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

  
  @ApiModelProperty(example = "null", value = "The version of the Redfish service")
  @JsonProperty("RedfishVersion")
  public String getRedfishVersion() {
    return redfishVersion;
  }

  
  /**
   * This is a link to a collection of Registries.
   **/
  public ServiceRoot100ServiceRoot registries(Odata400IdRef registries) {
    this.registries = registries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to a collection of Registries.")
  @JsonProperty("Registries")
  public Odata400IdRef getRegistries() {
    return registries;
  }
  public void setRegistries(Odata400IdRef registries) {
    this.registries = registries;
  }

  
  /**
   * This is a link to the Sessions Service.
   **/
  public ServiceRoot100ServiceRoot sessionService(Odata400IdRef sessionService) {
    this.sessionService = sessionService;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to the Sessions Service.")
  @JsonProperty("SessionService")
  public Odata400IdRef getSessionService() {
    return sessionService;
  }
  public void setSessionService(Odata400IdRef sessionService) {
    this.sessionService = sessionService;
  }

  
  /**
   * This is a link to a collection of Systems.
   **/
  public ServiceRoot100ServiceRoot systems(Odata400IdRef systems) {
    this.systems = systems;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to a collection of Systems.")
  @JsonProperty("Systems")
  public Odata400IdRef getSystems() {
    return systems;
  }
  public void setSystems(Odata400IdRef systems) {
    this.systems = systems;
  }

  
  /**
   * This is a link to the Task Service.
   **/
  public ServiceRoot100ServiceRoot tasks(Odata400IdRef tasks) {
    this.tasks = tasks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a link to the Task Service.")
  @JsonProperty("Tasks")
  public Odata400IdRef getTasks() {
    return tasks;
  }
  public void setTasks(Odata400IdRef tasks) {
    this.tasks = tasks;
  }

  
  /**
   * Unique identifier for a service instance. When SSDP is used, this value should be an exact match of the UUID value returned in a 200OK from an SSDP M-SEARCH request during discovery.
   **/
  public ServiceRoot100ServiceRoot UUID(ResourceUUID UUID) {
    this.UUID = UUID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for a service instance. When SSDP is used, this value should be an exact match of the UUID value returned in a 200OK from an SSDP M-SEARCH request during discovery.")
  @JsonProperty("UUID")
  public ResourceUUID getUUID() {
    return UUID;
  }
  public void setUUID(ResourceUUID UUID) {
    this.UUID = UUID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRoot100ServiceRoot serviceRoot100ServiceRoot = (ServiceRoot100ServiceRoot) o;
    return Objects.equals(this.odataContext, serviceRoot100ServiceRoot.odataContext) &&
        Objects.equals(this.odataId, serviceRoot100ServiceRoot.odataId) &&
        Objects.equals(this.odataType, serviceRoot100ServiceRoot.odataType) &&
        Objects.equals(this.accountService, serviceRoot100ServiceRoot.accountService) &&
        Objects.equals(this.chassis, serviceRoot100ServiceRoot.chassis) &&
        Objects.equals(this.description, serviceRoot100ServiceRoot.description) &&
        Objects.equals(this.eventService, serviceRoot100ServiceRoot.eventService) &&
        Objects.equals(this.id, serviceRoot100ServiceRoot.id) &&
        Objects.equals(this.jsonSchemas, serviceRoot100ServiceRoot.jsonSchemas) &&
        Objects.equals(this.links, serviceRoot100ServiceRoot.links) &&
        Objects.equals(this.managers, serviceRoot100ServiceRoot.managers) &&
        Objects.equals(this.name, serviceRoot100ServiceRoot.name) &&
        Objects.equals(this.oem, serviceRoot100ServiceRoot.oem) &&
        Objects.equals(this.redfishVersion, serviceRoot100ServiceRoot.redfishVersion) &&
        Objects.equals(this.registries, serviceRoot100ServiceRoot.registries) &&
        Objects.equals(this.sessionService, serviceRoot100ServiceRoot.sessionService) &&
        Objects.equals(this.systems, serviceRoot100ServiceRoot.systems) &&
        Objects.equals(this.tasks, serviceRoot100ServiceRoot.tasks) &&
        Objects.equals(this.UUID, serviceRoot100ServiceRoot.UUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, accountService, chassis, description, eventService, id, jsonSchemas, links, managers, name, oem, redfishVersion, registries, sessionService, systems, tasks, UUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRoot100ServiceRoot {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    accountService: ").append(toIndentedString(accountService)).append("\n");
    sb.append("    chassis: ").append(toIndentedString(chassis)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventService: ").append(toIndentedString(eventService)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jsonSchemas: ").append(toIndentedString(jsonSchemas)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    redfishVersion: ").append(toIndentedString(redfishVersion)).append("\n");
    sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
    sb.append("    sessionService: ").append(toIndentedString(sessionService)).append("\n");
    sb.append("    systems: ").append(toIndentedString(systems)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
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

