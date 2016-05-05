package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ChassisCollectionChassisCollection;
import io.swagger.client.model.ComputerSystemCollectionComputerSystemCollection;
import io.swagger.client.model.JsonSchemaFileCollectionJsonSchemaFileCollection;
import io.swagger.client.model.ManagerCollectionManagerCollection;
import io.swagger.client.model.MessageRegistryFileCollectionMessageRegistryFileCollection;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ServiceRoot100ServiceRootLinks;



/**
 * This object represents the root Redfish service.
 **/

@ApiModel(description = "This object represents the root Redfish service.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ServiceRoot100ServiceRoot   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private Odata400IdRef accountService = null;
  private ChassisCollectionChassisCollection chassis = null;
  private String description = null;
  private Odata400IdRef eventService = null;
  private String id = null;
  private JsonSchemaFileCollectionJsonSchemaFileCollection jsonSchemas = null;
  private ServiceRoot100ServiceRootLinks links = null;
  private ManagerCollectionManagerCollection managers = null;
  private String name = null;
  private ResourceOem oem = null;
  private String redfishVersion = null;
  private MessageRegistryFileCollectionMessageRegistryFileCollection registries = null;
  private Odata400IdRef sessionService = null;
  private ComputerSystemCollectionComputerSystemCollection systems = null;
  private Odata400IdRef tasks = null;
  private String UUID = null;

  
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
   * This is a link to the Account Service.
   **/
  
  @ApiModelProperty(value = "This is a link to the Account Service.")
  @JsonProperty("AccountService")
  public Odata400IdRef getAccountService() {
    return accountService;
  }
  public void setAccountService(Odata400IdRef accountService) {
    this.accountService = accountService;
  }

  
  /**
   * This is a link to a collection of Chassis.
   **/
  
  @ApiModelProperty(value = "This is a link to a collection of Chassis.")
  @JsonProperty("Chassis")
  public ChassisCollectionChassisCollection getChassis() {
    return chassis;
  }
  public void setChassis(ChassisCollectionChassisCollection chassis) {
    this.chassis = chassis;
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
   * This is a link to the EventService.
   **/
  
  @ApiModelProperty(value = "This is a link to the EventService.")
  @JsonProperty("EventService")
  public Odata400IdRef getEventService() {
    return eventService;
  }
  public void setEventService(Odata400IdRef eventService) {
    this.eventService = eventService;
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
   * This is a link to a collection of Json-Schema files.
   **/
  
  @ApiModelProperty(value = "This is a link to a collection of Json-Schema files.")
  @JsonProperty("JsonSchemas")
  public JsonSchemaFileCollectionJsonSchemaFileCollection getJsonSchemas() {
    return jsonSchemas;
  }
  public void setJsonSchemas(JsonSchemaFileCollectionJsonSchemaFileCollection jsonSchemas) {
    this.jsonSchemas = jsonSchemas;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "This is a link to a collection of Managers.")
  @JsonProperty("Managers")
  public ManagerCollectionManagerCollection getManagers() {
    return managers;
  }
  public void setManagers(ManagerCollectionManagerCollection managers) {
    this.managers = managers;
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
   * The version of the Redfish service
   **/
  
  @ApiModelProperty(value = "The version of the Redfish service")
  @JsonProperty("RedfishVersion")
  public String getRedfishVersion() {
    return redfishVersion;
  }
  public void setRedfishVersion(String redfishVersion) {
    this.redfishVersion = redfishVersion;
  }

  
  /**
   * This is a link to a collection of Registries.
   **/
  
  @ApiModelProperty(value = "This is a link to a collection of Registries.")
  @JsonProperty("Registries")
  public MessageRegistryFileCollectionMessageRegistryFileCollection getRegistries() {
    return registries;
  }
  public void setRegistries(MessageRegistryFileCollectionMessageRegistryFileCollection registries) {
    this.registries = registries;
  }

  
  /**
   * This is a link to the Sessions Service.
   **/
  
  @ApiModelProperty(value = "This is a link to the Sessions Service.")
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
  
  @ApiModelProperty(value = "This is a link to a collection of Systems.")
  @JsonProperty("Systems")
  public ComputerSystemCollectionComputerSystemCollection getSystems() {
    return systems;
  }
  public void setSystems(ComputerSystemCollectionComputerSystemCollection systems) {
    this.systems = systems;
  }

  
  /**
   * This is a link to the Task Service.
   **/
  
  @ApiModelProperty(value = "This is a link to the Task Service.")
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
  
  @ApiModelProperty(value = "Unique identifier for a service instance. When SSDP is used, this value should be an exact match of the UUID value returned in a 200OK from an SSDP M-SEARCH request during discovery.")
  @JsonProperty("UUID")
  public String getUUID() {
    return UUID;
  }
  public void setUUID(String UUID) {
    this.UUID = UUID;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRoot100ServiceRoot serviceRoot100ServiceRoot = (ServiceRoot100ServiceRoot) o;
    return Objects.equals(odataContext, serviceRoot100ServiceRoot.odataContext) &&
        Objects.equals(odataId, serviceRoot100ServiceRoot.odataId) &&
        Objects.equals(odataType, serviceRoot100ServiceRoot.odataType) &&
        Objects.equals(accountService, serviceRoot100ServiceRoot.accountService) &&
        Objects.equals(chassis, serviceRoot100ServiceRoot.chassis) &&
        Objects.equals(description, serviceRoot100ServiceRoot.description) &&
        Objects.equals(eventService, serviceRoot100ServiceRoot.eventService) &&
        Objects.equals(id, serviceRoot100ServiceRoot.id) &&
        Objects.equals(jsonSchemas, serviceRoot100ServiceRoot.jsonSchemas) &&
        Objects.equals(links, serviceRoot100ServiceRoot.links) &&
        Objects.equals(managers, serviceRoot100ServiceRoot.managers) &&
        Objects.equals(name, serviceRoot100ServiceRoot.name) &&
        Objects.equals(oem, serviceRoot100ServiceRoot.oem) &&
        Objects.equals(redfishVersion, serviceRoot100ServiceRoot.redfishVersion) &&
        Objects.equals(registries, serviceRoot100ServiceRoot.registries) &&
        Objects.equals(sessionService, serviceRoot100ServiceRoot.sessionService) &&
        Objects.equals(systems, serviceRoot100ServiceRoot.systems) &&
        Objects.equals(tasks, serviceRoot100ServiceRoot.tasks) &&
        Objects.equals(UUID, serviceRoot100ServiceRoot.UUID);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

